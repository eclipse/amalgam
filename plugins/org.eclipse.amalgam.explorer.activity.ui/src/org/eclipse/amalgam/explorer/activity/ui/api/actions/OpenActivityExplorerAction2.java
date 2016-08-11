/*******************************************************************************
 * Copyright (c)  2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.actions;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.EObjectLabelProviderHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.util.ActivityExplorerLoggerService;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

/**
 * 
 */
public class OpenActivityExplorerAction2 extends OpenActivityExplorerAction {

	private Session session;

	public OpenActivityExplorerAction2(Session session) {
		this.session = session;
	}

	@Override
	public Session getSession() {
		return session;
	}

	@Override
	public String getText() {
		EObject root = SessionHelper.getRootSemanticModel(session);
		return EObjectLabelProviderHelper.getText(root);
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		ActivityExplorerEditor current = null;
		Session selectedSession = getSession();
		IEditorPart part = ActivityExplorerManager.INSTANCE.getCurrentEditor();
		if (part instanceof ActivityExplorerEditor) {
			current = (ActivityExplorerEditor) part;
		}
		if (null != selectedSession && selectedSession != current.getEditorInput().getSession()) {
			ActivityExplorerEditor editor = current;
			IFile file = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.
					SessionHelper.getFirstAnalysisFile((DAnalysisSession)selectedSession);
			ActivityExplorerEditorInput input = new ActivityExplorerEditorInput(file);

			IEditorSite site = editor.getEditorSite();
			try {
				editor.init(site, input);
				
				//Update page 0 (we are sure that it exists). if the target
				//session has less contributions than the current, it leads
				//to an exception
				editor.updateEditorPages(0);
			} catch (PartInitException e) {
				ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, e.getMessage(), e);
			}
		}
	}
}
