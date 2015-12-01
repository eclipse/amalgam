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
package org.eclipse.amalgam.explorer.activity.ui.api.manager;

import java.util.List;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.CommonActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.OverviewActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Manage the Activity Explorer Editor.
 * 
 * 
 */
public class ActivityExplorerManager {

	public static final ActivityExplorerManager INSTANCE = new ActivityExplorerManager();

	//FIXME to remove: these 3 attributs serve only to check if there are contribution
	//to the session.
	private static boolean checkContribution = false;
	private static Session session = null;
	private static EObject rootModel = null;
	//END Hack

	private ActivityExplorerManager() {
	}

	/**
	 * Get the Activity Explorer editor.
	 * 
	 * @return ActivityExplorerEditor
	 */
	public ActivityExplorerEditor getEditor() {

		return editor;
	}

	public ISelection getCurrentSelection() {
		ISelection selection = null;
		Object sObject = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getService(ISelectionService.class);
		if (sObject != null && sObject instanceof ISelectionService) {
			ISelectionService service = (ISelectionService) sObject;
			selection = service.getSelection();
		}
		return selection;
	}

	/**
	 * Get the current session managed by the ActivityExplorerEditor.
	 * 
	 * @return Session
	 */
	public Session getSession() {
		//FIXME remove when deeply work well be done
		if (checkContribution){
			return ActivityExplorerManager.session;
		}
		//END hack
		Session session = null;
		ActivityExplorerEditor editor = getEditor();
		if (editor != null) {
			ActivityExplorerEditorInput input = editor.getEditorInput();
			if (input != null) {
				session = input.getSession();
			}
		}
		return session;
	}

	/**
	 * Get the root semantic of the main semantic model attached to current
	 * session.
	 * 
	 * @return EObject
	 */
	public EObject getRootSemanticModel() {
		//FIXME remove when deeply work will be done
		if (checkContribution){
			return ActivityExplorerManager.rootModel;
		}
		
		ActivityExplorerEditor editor = getEditor();
		if (editor  !=null){
			ActivityExplorerEditorInput input = editor.getEditorInput();
			return input.getRootSemanticElement();
		}
		return null;
	}

	private ActivityExplorerEditor editor;

	public void setEditor(ActivityExplorerEditor activityEditor) {
		editor = activityEditor;

	}

	public ActivityExplorerEditor getEditorFromSession(final Session session) {

		ActivityExplorerEditor current = null;

		if (session != null) {
			URunnable runnable = new URunnable(session);
			PlatformUI.getWorkbench().getDisplay().syncExec(runnable);
			//Display.getDefault().syncExec(runnable);
			current = runnable.getEditor();
		}

		return current;
	}

	private class URunnable implements Runnable {
		ActivityExplorerEditor ed = null;
		Session session = null;

		public URunnable(Session session) {
			this.session = session;
		}

		public void run() {
			try {
				IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

				if (window != null) {
					IWorkbenchPage activePage = window.getActivePage();
					if (activePage != null) {
						IEditorReference[] references = activePage.getEditorReferences();
						for (IEditorReference ref : references) {
							if (ref.getId().equals(ActivityExplorerEditor.ID)) {
								IEditorInput input = ref.getEditorInput();
								if (input instanceof ActivityExplorerEditorInput) {
									ActivityExplorerEditorInput dinput = (ActivityExplorerEditorInput) input;
									Session current = dinput.getSession();

									if (session.equals(current))
										ed = (ActivityExplorerEditor) ref.getEditor(false);
								}
							}
						}
					}
				}
			} catch (Exception ex) {
				ActivityExplorerActivator.getDefault().sentToLogger(ex);
			}
		}

		public ActivityExplorerEditor getEditor() {
			return ed;
		}
	}

	public IEditorPart getCurrentEditor() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	}

	//Very bad hack.
	//FIXME remove this code when deeply work well be done.
	public boolean containsContributions(Session session){
		ActivityExplorerManager.checkContribution = true;
		boolean result = false;
		EObject semanticModel = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper.getRootSemanticModel(session);
		ActivityExplorerManager.session = session;
		ActivityExplorerManager.rootModel = semanticModel;
		List<CommonActivityExplorerPage> allPages = ActivityExplorerExtensionManager.getAllPages();

		for (CommonActivityExplorerPage page : allPages) {
			result |= (!(page instanceof OverviewActivityExplorerPage || page.getPosition() == 0) 
					&& page.isVisible());
		}

		ActivityExplorerManager.checkContribution = false;
		ActivityExplorerManager.session = null;
		ActivityExplorerManager.rootModel = null;
		
		return result;
	}
	//END Hack

}
