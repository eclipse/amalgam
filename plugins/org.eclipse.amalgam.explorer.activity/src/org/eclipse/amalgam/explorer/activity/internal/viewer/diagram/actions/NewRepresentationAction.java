/*******************************************************************************
 * Copyright (c)  2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.internal.viewer.diagram.actions;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.table.metamodel.table.description.CrossTableDescription;
import org.eclipse.sirius.table.metamodel.table.description.EditionTableDescription;
import org.eclipse.sirius.table.metamodel.table.provider.TableUIPlugin;
import org.eclipse.sirius.tools.api.interpreter.IInterpreterMessages;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * The action allowing to create new representations.
 * 
 */
public class NewRepresentationAction extends BaseSelectionListenerAction {
	private EObject _selectedEObject;
	protected RepresentationDescription _description;
	protected Session _session;

	protected boolean _forceDefaultName;
	protected boolean _openRepresentation;

	/**
	 * Constructs an action allowing to create new representations.
	 * 
	 * @param description_p
	 *            The representation description.
	 * @param selectedEObject_p
	 *            The selected EObject.
	 * @param session_p
	 *            The current session.
	 */
	public NewRepresentationAction(RepresentationDescription description_p, EObject selectedEObject_p, Session session_p) {
		this(description_p, selectedEObject_p, session_p, false, true);
	}

	/**
	 * Constructs an action allowing to create new representations.
	 * 
	 * @param description_p
	 *            The representation description.
	 * @param selectedEObject_p
	 *            The selected EObject.
	 * @param session_p
	 *            The current session.
	 * @param forceDefaultName_p
	 * @param openRepresentation_p
	 */
	public NewRepresentationAction(RepresentationDescription description_p, EObject selectedEObject_p,
			Session session_p, boolean forceDefaultName_p, boolean openRepresentation_p) {
		super(description_p.getName());
		String label = description_p.getLabel();
		if ((null != label) && (label.length() > 1)) {
			setText(label);
		}
		ImageDescriptor imageDescriptor = null;
		// Handle specific diagrams : Table ones.
		if (description_p instanceof CrossTableDescription) {
			imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(TableUIPlugin.ID,
					"/icons/full/obj16/CrossTableDescription.gif"); //$NON-NLS-1$
		} else if (description_p instanceof EditionTableDescription) {
			imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(TableUIPlugin.ID,
					"/icons/full/obj16/DTable.gif"); //$NON-NLS-1$
		} else {
			// Standard diagram.
			imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(SiriusEditPlugin.ID,
					"/icons/full/obj16/DAnalysis.gif"); //$NON-NLS-1$
		}
		if (null == imageDescriptor) {
			imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
		}
		setImageDescriptor(imageDescriptor);

		// Registers local fields.
		_selectedEObject = selectedEObject_p;
		_description = description_p;
		_session = session_p;
		_forceDefaultName = forceDefaultName_p;
		_openRepresentation = openRepresentation_p;
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		// 1 - Computes the default representation name.
		String defaultName = computeDefaultName(_selectedEObject, _description);

		if (!_forceDefaultName) {
			String dialogTitle = "Type representation name"; //$NON-NLS-1$
			Shell activeShell = Display.getDefault().getActiveShell();
			InputDialog representationNameDlg = new InputDialog(activeShell, dialogTitle, dialogTitle, defaultName,
					null);
			if (Window.OK == representationNameDlg.open()) {
				defaultName = representationNameDlg.getValue();
			} else {
				// roll back (works even for nested command)
				throw new OperationCanceledException();
			}
		}

		// Do not call ToggleCanonicalRefresh anymore since DoReMi 4.18.
		// Executes the NewRepresentationCommand.
		NewRepresentationCommand command = new NewRepresentationCommand(defaultName, _selectedEObject, _description,
				_session);
		TransactionUtil.getEditingDomain(_selectedEObject).getCommandStack().execute(command);

		if (null != command.getRepresentation()) {
			SessionManager.INSTANCE.notifyRepresentationCreated(_session);
			if (_openRepresentation) {
				DialectUIManager.INSTANCE.openEditor(_session, command.getRepresentation(), new NullProgressMonitor());
			}
		}
	}

	// Gets the default representation name.
	protected String computeDefaultName(EObject eObject_p, RepresentationDescription repDescription_p) {
		// Gets the interpreter.
		IInterpreter interpreter = InterpreterUtil.getInterpreter(eObject_p);

		// Computes new representation name.
		String newName = "New "; //$NON-NLS-1$
		if (!StringUtil.isEmpty(repDescription_p.getLabel())) {
			newName += repDescription_p.getLabel();
		} else {
			newName += repDescription_p.getName();
		}

		String titleExpression = repDescription_p.getTitleExpression();
		if (!StringUtil.isEmpty(titleExpression)) {
			try {
				newName = interpreter.evaluateString(eObject_p, titleExpression);
			} catch (EvaluationException e) {
				SiriusPlugin.getDefault().error(IInterpreterMessages.EVALUATION_ERROR_ON_MODEL_MODIFICATION, e);
			}
		}

		return newName;
	}

	// The command allowing to create a new representation.
	private class NewRepresentationCommand extends RecordingCommand {
		// The representation name.
		private String _newName;
		// The new representation.
		private DRepresentation _representation;

		// Fields.
		private EObject _eObject;
		private RepresentationDescription _repDescription;
		private Session _currentSession;

		/**
		 * Constructs the command allowing to create a new representation.
		 * 
		 * @param newName_p
		 *            The new representation name.
		 * @param eObject_p
		 *            The selected EObject.
		 * @param repDescription_p
		 *            The current representation description.
		 * @param session_p
		 *            The current session.
		 */
		public NewRepresentationCommand(String newName_p, EObject eObject_p,
				RepresentationDescription repDescription_p, Session session_p) {
			super(TransactionUtil.getEditingDomain(eObject_p));
			_newName = newName_p;
			_eObject = eObject_p;
			_repDescription = repDescription_p;
			_currentSession = session_p;
		}

		/**
		 * {@inheritDoc}
		 */

		@SuppressWarnings("unused")
		public void commandInterrupted() {
			commandRolledBack();
		}

		/**
		 * {@inheritDoc}
		 */

		public void commandRolledBack() {
			_representation = null;
		}

		/**
		 * Gets the new representation.
		 * 
		 * @return The new representation.
		 */
		public DRepresentation getRepresentation() {
			return _representation;
		}

		/**
		 * {@inheritDoc}
		 */
		@SuppressWarnings("synthetic-access")
		public void doExecute() {
			NullProgressMonitor monitor = new NullProgressMonitor();
			/*
			 * if (_selectedEObject instanceof Scenario) { Scenario scenario =
			 * (Scenario) _selectedEObject; scenario.setName(_newName); }
			 */

			_representation = DialectManager.INSTANCE.createRepresentation(_newName, _eObject, _repDescription,
					_currentSession, monitor);
		}
	}
}