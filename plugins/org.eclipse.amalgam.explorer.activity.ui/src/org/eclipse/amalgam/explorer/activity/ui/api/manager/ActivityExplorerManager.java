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
package org.eclipse.amalgam.explorer.activity.ui.api.manager;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IActivityExplorerEditorSessionListener;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.INotifier;
import org.eclipse.amalgam.explorer.activity.ui.internal.util.ActivityExplorerLoggerService;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.swt.widgets.Display;
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
public class ActivityExplorerManager implements INotifier {

	public static final ActivityExplorerManager INSTANCE = new ActivityExplorerManager();

	private static final ListenerList editorListeners = new ListenerList();

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
		ActivityExplorerEditor editor = getEditor();
		if (editor != null) {
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
			Display.getDefault().syncExec(runnable);
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
				ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, ex.getMessage(), ex);
			}
		}

		public ActivityExplorerEditor getEditor() {
			return ed;
		}
	}

	public IEditorPart getCurrentEditor() {
		return PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
	}

	public void openEditor(final Session session) {
		Runnable runnable = new Runnable() {
			public void run() {
				try {
					Session currentSession = session;
					if ((currentSession != null) && currentSession.isOpen()) {
						IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
								.getActivePage();
						if (activePage != null) {
							IFile file = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper
									.getFirstAnalysisFile((DAnalysisSession) currentSession);
							ActivityExplorerEditorInput input = new ActivityExplorerEditorInput(file);

							IEditorPart part = activePage.findEditor(input);
							if (part == null) {
								activePage.openEditor(input, ActivityExplorerEditor.ID);
							}
						}
					}
				} catch (Exception exception) {
					StringBuilder loggerMessage = new StringBuilder(".run(..) _ ActivityExplorer not Found."); //$NON-NLS-1$
					loggerMessage.append(exception.getMessage());

					ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, loggerMessage.toString(), null);
				}
			}
		};
		run(runnable);
	}

	@Override
	public void dispatchEvent(int notification, Session session) {
		Object[] listeners = editorListeners.getListeners();
		for (int i = 0; i < listeners.length; ++i) {
			((IActivityExplorerEditorSessionListener) listeners[i]).executeRequest(notification, session);
		}
	}

	@Override
	public void addActivityExplorerEditorListener(IActivityExplorerEditorSessionListener observer) {
		editorListeners.add(observer);
	}

	@Override
	public void removeActivityExplorerEditorListener(IActivityExplorerEditorSessionListener observer) {
		editorListeners.remove(observer);
	}

	protected void run(Runnable runnable) {
		if (null != runnable) {
			Display display = Display.getCurrent();
			if (null == display) {
				PlatformUI.getWorkbench().getDisplay().asyncExec(runnable);
			} else {
				runnable.run();
			}
		}
	}
}
