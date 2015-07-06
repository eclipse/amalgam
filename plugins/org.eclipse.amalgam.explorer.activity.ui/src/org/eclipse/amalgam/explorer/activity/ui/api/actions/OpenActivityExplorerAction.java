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
package org.eclipse.amalgam.explorer.activity.ui.api.actions;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.IImageKeys;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.helper.SiriusUtil;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

/**
 * Open Activity Explorer for current aird file (if related session is open).
 * 
 */
public class OpenActivityExplorerAction extends BaseSelectionListenerAction {
	/**
	 * Constructor.
	 */

	protected OpenActivityExplorerAction() {
		super(Messages.OpenActivityExplorerAction_Title);
		ActivityExplorerActivator.getDefault().getImage(IImageKeys.IMG_MENU_OVERVIEW);
		setImageDescriptor(ActivityExplorerActivator.getDefault().getImageRegistry()
				.getDescriptor(IImageKeys.IMG_MENU_OVERVIEW));
	}

	/**
	 * Get session from given selection.
	 * 
	 * @return
	 */
	protected Session getSession() {
		IStructuredSelection selection = getStructuredSelection();
		Session session = null;
		if (!selection.isEmpty()) {
			Object selectedElement = selection.getFirstElement();
			// Ensure given selection is aird file with an open session.
			if ((selectedElement instanceof IFile)
					&& SiriusUtil.SESSION_RESOURCE_EXTENSION.equals(((IFile) selectedElement).getFileExtension())) { //$NON-NLS-1$
				session = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper
						.getSessionForDiagramFile((IFile) selectedElement);
				// if selected is IProject
			} else if (selectedElement instanceof IProject) {
				Option<ModelingProject> modelingProjectOption = ModelingProject
						.asModelingProject((IProject) selectedElement);
				if (modelingProjectOption.some()) {

					ModelingProject p = modelingProjectOption.get();
					if (p.isValid()) {
						session = p.getSession();
					}
				}
			}
		}
		return session;
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		Session session = getSession();
		if (null != session) {
			OpenSessionAction.openActivityExplorer(session);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected boolean updateSelection(IStructuredSelection selection_p) {
		return null != getSession();
	}

	/**
	 * Test if the selection is a ModelingProject or a AIRD File and if the
	 * session is open and if its editor is not open.
	 * 
	 * @return boolean
	 */
	public boolean canAddedToMenu() {
		boolean result = false;
		Session session = getSession();
		if (session != null) {
			ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(session);
			result = editor == null ? true : false;
		}

		return result;
	}

}
