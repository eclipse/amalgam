/*******************************************************************************
 * Copyright (c)  2006, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.query.IdentifiedElementQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.tools.api.interpreter.EvaluationException;
import org.eclipse.sirius.common.tools.api.interpreter.IInterpreter;
import org.eclipse.sirius.common.tools.api.util.MessageTranslator;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.description.Layer;
import org.eclipse.sirius.diagram.description.filter.FilterDescription;
import org.eclipse.sirius.tools.api.interpreter.IInterpreterMessages;
import org.eclipse.sirius.tools.api.interpreter.InterpreterUtil;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.SiriusPlugin;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

/**
 * The action allowing to create new representations.
 */
public class NewRepresentationAction extends BaseSelectionListenerAction {
	private EObject selectedEObject;
	protected RepresentationDescription description;
	protected Session session;

	protected boolean forceDefaultName;
	protected boolean openRepresentation;
  protected final Collection<Layer> extraLayers;
  private Collection<FilterDescription> extraFilters;

	/**
	 * Constructs an action allowing to create new representations.
	 * 
	 * @param description
	 *            The representation description.
	 * @param selectedEObject
	 *            The selected EObject.
	 * @param session
	 *            The current session.
	 */
	public NewRepresentationAction(RepresentationDescription description, EObject selectedEObject, Session session) {
		this(description, selectedEObject, session, false, true);
	}

	public NewRepresentationAction(RepresentationDescription description, EObject selectedEObject,
      Session session, boolean forceDefaultName, boolean openRepresentation) {
	  this(description, selectedEObject, session, forceDefaultName, openRepresentation, Collections.emptyList(), Collections.emptyList());
	}
	
	/**
	 * Constructs an action allowing to create new representations.
	 * 
	 * @param description
	 *            The representation description.
	 * @param selectedEObject
	 *            The selected EObject.
	 * @param session
	 *            The current session.
	 * @param forceDefaultName
	 * @param openRepresentation
	 * @param extraLayers
	 * @param extraFilters
	 */
	public NewRepresentationAction(RepresentationDescription description, EObject selectedEObject,
			Session session, boolean forceDefaultName, boolean openRepresentation, Collection<Layer> extraLayers, Collection<FilterDescription> extraFilters) {
	  super(description.getName());
	  
		// Registers local fields.
		this.selectedEObject = selectedEObject;
		this.description = description;
		this.session = session;
		this.forceDefaultName = forceDefaultName;
		this.openRepresentation = openRepresentation;
		this.extraLayers = extraLayers;
		this.extraFilters = extraFilters;
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		// 1 - Computes the default representation name.
		String defaultName = computeDefaultName(selectedEObject, description);

		if (!forceDefaultName) {
		  String label = MessageTranslator.INSTANCE.getMessage(description, new IdentifiedElementQuery(description).getLabel());
		  
		  if (label == null || label.isEmpty()) {
	      label = description.getName();
	    }
		  
		  String dialogTitle = "New "+label; //$NON-NLS-1$
      String dialogMessage = "Name:"; //$NON-NLS-1$
			Shell activeShell = Display.getDefault().getActiveShell();
			InputDialog representationNameDlg = new InputDialog(activeShell, dialogTitle, dialogMessage, defaultName,
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
		NewRepresentationCommand command = new NewRepresentationCommand(defaultName, selectedEObject, description,
				session, extraLayers, extraFilters);
		TransactionUtil.getEditingDomain(selectedEObject).getCommandStack().execute(command);

		if (null != command.getRepresentation()) {
			SessionManager.INSTANCE.notifyRepresentationCreated(session);
			if (openRepresentation) {
				DialectUIManager.INSTANCE.openEditor(session, command.getRepresentation(), new NullProgressMonitor());
			}
		}
	}

	// Gets the default representation name.
	protected String computeDefaultName(EObject eObject, RepresentationDescription repDescription) {
		// Gets the interpreter.
		IInterpreter interpreter = InterpreterUtil.getInterpreter(eObject);

		// Computes new representation name.
		String newName = ""; //$NON-NLS-1$

		String titleExpression = repDescription.getTitleExpression();
		if (!StringUtil.isEmpty(titleExpression)) {
			try {
				newName = interpreter.evaluateString(eObject, titleExpression);
			} catch (EvaluationException e) {
				SiriusPlugin.getDefault().error(IInterpreterMessages.EVALUATION_ERROR_ON_MODEL_MODIFICATION, e);
			}
		} else if (!StringUtil.isEmpty(repDescription.getLabel())) {
      newName = "New " + MessageTranslator.INSTANCE.getMessage(description, new IdentifiedElementQuery(repDescription).getLabel());
    } else {
      newName = "New " + repDescription.getName();
    }

		return newName;
	}

	// The command allowing to create a new representation.
	private class NewRepresentationCommand extends RecordingCommand {
		// The representation name.
		private String newName;
		// The new representation.
		private DRepresentation representation;

		// Fields.
		private EObject eObject;
		private RepresentationDescription repDescription;
		private Session currentSession;
    private Collection<Layer> extraLayers;
    private Collection<FilterDescription> extraFilters;

		/**
		 * Constructs the command allowing to create a new representation.
		 * 
		 * @param newName
		 *            The new representation name.
		 * @param eObject
		 *            The selected EObject.
		 * @param repDescription
		 *            The current representation description.
		 * @param session
		 *            The current session.
		 * @param extraLayers
		 *            Extra layers to activate on the new representation
		 */
		public NewRepresentationCommand(String newName, EObject eObject,
				RepresentationDescription repDescription, Session session, Collection<Layer> extraLayers, Collection<FilterDescription> extraFilters) {
			super(TransactionUtil.getEditingDomain(eObject));
			this.newName = newName;
			this.eObject = eObject;
			this.repDescription = repDescription;
			this.currentSession = session;
			this.extraLayers = extraLayers;
			this.extraFilters = extraFilters;
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
			representation = null;
		}

		/**
		 * Gets the new representation.
		 * 
		 * @return The new representation.
		 */
		public DRepresentation getRepresentation() {
			return representation;
		}

		public void doExecute() {
			NullProgressMonitor monitor = new NullProgressMonitor();

			representation = DialectManager.INSTANCE.createRepresentation(newName, eObject, repDescription,
					currentSession, monitor);

			if (representation instanceof DDiagram) {
			  ((DDiagram) representation).getActivatedLayers().addAll(extraLayers);
			  ((DDiagram) representation).getActivatedFilters().addAll(extraFilters);
			}

		}
	}
}