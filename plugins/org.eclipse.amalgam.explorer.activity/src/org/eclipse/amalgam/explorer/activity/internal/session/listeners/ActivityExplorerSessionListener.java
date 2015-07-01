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
package org.eclipse.amalgam.explorer.activity.internal.session.listeners;

import org.eclipse.amalgam.explorer.activity.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.api.preferences.PreferenceConstants;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;

/**
 * 
 */
public class ActivityExplorerSessionListener implements SessionManagerListener {
	public Session session = null;

	@Override
	public void notify(Session session_p, int notification_p) {
		// Filter on event for other sessions.
		session = session_p;
		final ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(session_p);

		Runnable runnable = null;
		switch (notification_p) {
		case SessionListener.CLOSING: /*
									 * Closing event is used to have a chance to
									 * persist the editor input at workbench
									 * shutdown
									 */

			runnable = new Runnable() {
				/**
				 * @see java.lang.Runnable#run()
				 */
				public void run() {
					if (editor != null)
						// Close this editor.
						editor.close(false);
				}
			};
			break;
		case SessionListener.REPRESENTATION_CHANGE:
			runnable = new Runnable() {
				/**
				 * @see java.lang.Runnable#run()
				 */
				@SuppressWarnings("synthetic-access")
				public void run() {
					// Handle fpages to mark them as dirty.
					if (editor != null) {
						IManagedForm headerForm = editor.getHeaderForm();
						if (null != headerForm) {
							headerForm.dirtyStateChanged();
						}
					}
				}
			};
			break;

		case SessionListener.OPENED:
			if (!(session.getSemanticResources().isEmpty())) {
				runnable = new Runnable() {
					@SuppressWarnings("synthetic-access")
					public void run() {
						try {

							final boolean open = ActivityExplorerActivator.getDefault().getPreferenceStore()
									.getBoolean(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER);

							if (open) {

								IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
										.getActivePage();
								if (activePage != null) {
									activePage
											.openEditor(
													new ActivityExplorerEditorInput(
															session,
															org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.SessionHelper
																	.getRootSemanticModel(session)), ActivityExplorerEditor.ID);
								}
							}
						} catch (Exception exception_p) {
							StringBuilder loggerMessage = new StringBuilder(".run(..) _ ActivityExplorer not Found."); //$NON-NLS-1$
							loggerMessage.append(exception_p.getMessage());
							ActivityExplorerActivator.getDefault().sentToLogger(loggerMessage.toString(), IStatus.ERROR);
							// __logger.warn(new
							// EmbeddedMessage(loggerMessage.toString(),
							// IReportManagerDefaultComponents.UI),
							// exception_p);
						}
					}
				};
			}
			break;
		case SessionListener.DIRTY:
		case SessionListener.SYNC:
		case SessionListener.SEMANTIC_CHANGE: // Listening to changes to mark
												// the ActivityExplorerEditor editor dirty
												// hence saveable.
			runnable = new Runnable() {
				/**
				 * {@inheritDoc}
				 */
				public void run() {
					if (editor != null) {
						if (editor.getEditorInput() != null && !session.equals(editor.getEditorInput().getSession())) {
							return;
						}
						IManagedForm headerForm = editor.getHeaderForm();
						if (null != headerForm) {
							headerForm.dirtyStateChanged();
						}
					}
				}
			};
			break;
		}
		if (null != runnable) {
			Display display = Display.getCurrent();
			if (null == display) {
				PlatformUI.getWorkbench().getDisplay().asyncExec(runnable);
			} else {
				runnable.run();
			}
		}
	}

	public void notifyAddSession(Session newSession_p) {
		// Do nothing.
	}

	public void notifyRemoveSession(Session removedSession_p) {
		// Do nothing.
	}

	public void notifyUpdatedSession(Session updatedSession_p) {
		// Fake a representation change
		notify(updatedSession_p, SessionListener.REPRESENTATION_CHANGE);
	}

	@Override
	public void viewpointSelected(Viewpoint selectedViewpoint) {
		update(selectedViewpoint);

	}

	@Override
	public void viewpointDeselected(Viewpoint deselectedViewpoint) {
		update(deselectedViewpoint);
	}

	/**
	 * Update the ActivityExplorer Editor.
	 * 
	 * @param selectedViewpoint
	 */
	private void update(Viewpoint selectedViewpoint) {
		if (selectedViewpoint != null && session != null) {

			Runnable refresh = new Runnable() {

				@Override
				public void run() {
					ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(session);
					if (editor != null) {
						editor.updateEditorPages(0);
					}
				}
			};
			Display.getDefault().syncExec(refresh);
		}
	}

}
