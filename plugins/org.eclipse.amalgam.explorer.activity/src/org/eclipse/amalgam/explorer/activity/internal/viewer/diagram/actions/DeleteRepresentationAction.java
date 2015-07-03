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

/*
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.StringHelper;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.dialect.command.DeleteRepresentationCommand;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

/**
 * The actions allowing to delete representation from selection.
 * 
 */
public class DeleteRepresentationAction extends BaseSelectionListenerAction {
	/**
	 * Constructs the actions allowing to delete representation from selection.
	 */
	public DeleteRepresentationAction() {
		super("Delete"); //$NON-NLS-1$
		setActionDefinitionId("org.eclipse.ui.edit.delete"); //$NON-NLS-1$
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		// Gets selected representations from the current selection.
		Set<DRepresentation> selectedRepresentations = getRepresentationsFromSelection();
		if (!selectedRepresentations.isEmpty()) {
			int deletedDiagramCount = selectedRepresentations.size();
			String contextualMessage = null;
			if (deletedDiagramCount == 1) {
				contextualMessage = StringHelper.formatMessage(
						" diagram?", new String[] { selectedRepresentations.iterator().next().getName() }); //$NON-NLS-1$
			} else {
				contextualMessage = StringHelper.formatMessage(
						" these diagrams ?", new String[] { String.valueOf(deletedDiagramCount) }); //$NON-NLS-1$
			}
			if (MessageDialog.openConfirm(null, Messages.DeleteRepresentationAction_2,
					Messages.DeleteRepresentationAction_3 + contextualMessage)) {

				TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(getRepresentationsFromSelection()
						.iterator().next());
				if (domain != null) {
					SessionManager.INSTANCE.getSessions();
					Session session = SessionManager.INSTANCE
							.getSession(((DSemanticDecorator) getRepresentationsFromSelection().iterator().next())
									.getTarget());
					DeleteRepresentationCommand command = new DeleteRepresentationCommand(session,
							selectedRepresentations);
					domain.getCommandStack().execute(command);
				}
			}
		}
	}

	// Gets the selected representations from the current selection.
	private Set<DRepresentation> getRepresentationsFromSelection() {
		Set<DRepresentation> representations = new HashSet<DRepresentation>();

		IStructuredSelection structuredSelection = getStructuredSelection();
		for (Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();) {
			Object selectedObject = iterator.next();

			// Builds representations list with representation which are
			// semantic decorators.
			// Semantic decorators allow to retrieve the parent session of each
			// representation.
			if ((selectedObject instanceof DRepresentation) && (selectedObject instanceof DSemanticDecorator)) {
				DRepresentation selectedRepresentation = (DRepresentation) selectedObject;
				representations.add(selectedRepresentation);
			}
		}
		return representations;
	}
}
