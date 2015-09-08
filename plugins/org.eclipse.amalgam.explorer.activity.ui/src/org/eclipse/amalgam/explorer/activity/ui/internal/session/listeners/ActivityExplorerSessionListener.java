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
package org.eclipse.amalgam.explorer.activity.ui.internal.session.listeners;

import java.lang.ref.WeakReference;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.api.preferences.PreferenceConstants;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
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
  public WeakReference<Session> session = null;

  @Override
  public void notify(Session sessionp, int notification) {
    // Filter on event for other sessions.
    session = new WeakReference<Session>(sessionp);
    final ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(sessionp);

    Runnable runnable = null;
    switch (notification) {
    case SessionListener.CLOSING: /*
                                   * Closing event is used to have a chance to persist the editor input at workbench
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
      if (!(session.get().getSemanticResources().isEmpty())) {
        runnable = new Runnable() {
          @SuppressWarnings("synthetic-access")
          public void run() {
            try {

              final boolean open = ActivityExplorerActivator.getDefault().getPreferenceStore()
                  .getBoolean(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER);

              if (open) {

                IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                if (activePage != null) {
                  activePage.openEditor(
                      new ActivityExplorerEditorInput(session.get(),
                          org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper
                              .getRootSemanticModel(session.get())), ActivityExplorerEditor.ID);
                }
              }
            } catch (Exception exception) {
              StringBuilder loggerMessage = new StringBuilder(".run(..) _ ActivityExplorer not Found."); //$NON-NLS-1$
              loggerMessage.append(exception.getMessage());
              ActivityExplorerActivator.getDefault().sentToLogger(loggerMessage.toString(), IStatus.ERROR);
              // __logger.warn(new
              // EmbeddedMessage(loggerMessage.toString(),
              // IReportManagerDefaultComponents.UI),
              // exception);
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
            if (editor.getEditorInput() != null && !session.get().equals(editor.getEditorInput().getSession())) {
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

  public void notifyAddSession(Session newSession) {
    // Do nothing.
  }

  public void notifyRemoveSession(Session removedSession) {
    // Do nothing.
  }

  public void notifyUpdatedSession(Session updatedSession) {
    // Fake a representation change
    notify(updatedSession, SessionListener.REPRESENTATION_CHANGE);
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
    final Session currentSession = SessionManager.INSTANCE.getSession(selectedViewpoint);

    if (selectedViewpoint != null && currentSession != null && currentSession.isOpen()) {

      Runnable refresh = new Runnable() {

        @Override
        public void run() {
          ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(currentSession);
          if (editor != null) {
            editor.updateEditorPages(0);
          }
        }
      };
      Display.getDefault().syncExec(refresh);
    }
  }

}
