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
package org.eclipse.amalgam.explorer.activity.api.actions;

import org.eclipse.amalgam.explorer.activity.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.IImageKeys;
import org.eclipse.amalgam.explorer.activity.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.api.manager.ActivityExplorerManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.modelingproject.ModelingProject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.ext.base.Option;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

/**
 * 
 */
public class GoToActivityExplorerAction extends BaseSelectionListenerAction {

	private Session session;

	public GoToActivityExplorerAction() {
		this("Go To Activity Explorer");
	}

	protected GoToActivityExplorerAction(String text) {
		super(text);
		ActivityExplorerActivator.getDefault().getImage(IImageKeys.IMG_MENU_OVERVIEW);
		setImageDescriptor(ActivityExplorerActivator.getDefault().getImageRegistry()
				.getDescriptor(IImageKeys.IMG_MENU_OVERVIEW));
	}

	@Override
	public void run() {
		if (session == null)
			session = getSession();
		if (session != null) {
			IEditorPart part = ActivityExplorerManager.INSTANCE.getEditorFromSession(session);
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().activate(part);
		}
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
			// if selected is a IFile
			if ((selectedElement instanceof IFile) && "aird".equals(((IFile) selectedElement).getFileExtension())) { //$NON-NLS-1$
				session = org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.SessionHelper
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
	 * Test if the Project is a ModelingProject and if the session is open.
	 * 
	 * @return boolean
	 */
	public boolean canAddedToMenu() {
		boolean result = false;
		session = getSession();
		if (session != null) {
			ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(session);
			result = editor != null ? true : false;
		}
		return result;
	}
}
