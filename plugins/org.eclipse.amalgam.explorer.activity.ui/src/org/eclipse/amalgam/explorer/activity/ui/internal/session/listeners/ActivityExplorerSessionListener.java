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

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.api.preferences.PreferenceConstants;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.ide.IDE;

/**
 * 
 */
public class ActivityExplorerSessionListener implements SessionManagerListener {

  protected void run(Runnable runnable) {
    if (null != runnable) {
        PlatformUI.getWorkbench().getDisplay().asyncExec(runnable);
    }
  }

  @Override
  public void notify(Session sessionp, int notification) {

	  Session session = sessionp;

	  Runnable runnable = null;
	  switch (notification) {
	  case SessionListener.CLOSING:
		  notifyClosingSession(session);
		  break;
	  case SessionListener.SELECTED_VIEWS_CHANGE_KIND:
		  update(session);
		  break;
	  case SessionListener.REPRESENTATION_CHANGE:
		  notifyRepresentationChange(session);
		  break;
	  case SessionListener.OPENED:
		  notifyOpenedSession(session);
		  break;
	  case SessionListener.DIRTY:
		  break;
	  case SessionListener.SYNC:
		  break;
	  case SessionListener.SEMANTIC_CHANGE: // Listening to changes to mark
		  notifySemanticChange(session);
		  break;
	  case SessionListener.REPLACED:
		  notifyReplacedSession(session);
		  break;
	  }
	  run(runnable);

  }

  /**
   * @param session
   */
  protected void notifyReplacedSession(Session session) {
    notifyRepresentationChange(session);
  }

  protected void notifySemanticChange(final Session session2) {
    // the ActivityExplorerEditor editor dirty
    // hence saveable.
    Runnable runnable = new Runnable() {

      public void run() {
        Session currentSession = session2;
        if (currentSession != null) {
          ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(currentSession);
          if (editor == null) {
            return;
          }
          if (editor.getEditorInput() == null) {
            return;
          }
          if (!currentSession.equals(editor.getEditorInput().getSession())) {
            return;
          }
          IManagedForm headerForm = editor.getHeaderForm();
          if (null != headerForm) {
            headerForm.dirtyStateChanged();
          }
        }
      }
    };
    run(runnable);
  }

  protected void notifyOpenedSession(final Session session2) {
    if ((session2 != null) && !(session2.getSemanticResources().isEmpty())) {
      Runnable runnable = new Runnable() {
        @SuppressWarnings("synthetic-access")
        public void run() {
          try {
        	  openEditor(session2);
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

        private void openEditor(final Session session2) throws PartInitException {
        	if (canOpen()) {
        		IWorkbench workbench = PlatformUI.getWorkbench();
        		if (!workbench.isStarting()){
        			IWorkbenchPage activePage = workbench.getActiveWorkbenchWindow().getActivePage();
        			if (activePage != null && activePage.isEditorAreaVisible()){
        				EObject semanticModel = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper.getRootSemanticModel(session2);
        				ActivityExplorerEditorInput editorInput = new ActivityExplorerEditorInput(session2, semanticModel);
        				IDE.openEditor(activePage, editorInput, ActivityExplorerEditor.ID);
        			}
        		}
        	}
		}

		private boolean canOpen() {
			final boolean open = ActivityExplorerActivator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER);
			return open && ActivityExplorerManager.INSTANCE.containsContributions(session2); //right hand is hack!;
		}
      };
      run(runnable);
    }
  }

  protected void notifyRepresentationChange(final Session session2) {

    Runnable runnable = new Runnable() {

      public void run() {
        Session currentSession = session2;
        if (currentSession != null) {
          final ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(currentSession);
          if (editor != null) {
            // Handle fpages to mark them as dirty.
            IManagedForm headerForm = editor.getHeaderForm();
            if (null != headerForm) {
              headerForm.dirtyStateChanged();
            }
          }
        }

      }
    };
    run(runnable);
  }

  /**
   * Closing event is used to have a chance to persist the editor input at workbench shutdown
   */
  protected void notifyClosingSession(final Session session2) {

    Runnable runnable = new Runnable() {

      public void run() {
        Session currentSession = session2;
        if (currentSession != null) {
          final ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(currentSession);
          if (editor != null) {
            // Close this editor.
            editor.close(false);
          }
        }
      }
    };
    run(runnable);
  }

  /**
   * Update the ActivityExplorer Editor.
   * @param selectedViewpoint
   */
  protected void update(final Session session) {
    Runnable runnable = new Runnable() {

      public void run() {
        Session currentSession = session;
        if (currentSession != null && currentSession.isOpen()) {
          ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditorFromSession(currentSession);
          if (editor != null) {
            editor.updateEditorPages(0);
          }
        }
      }
    };
    run(runnable);

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
    // Do nothing.
  }

  @Override
  public void viewpointDeselected(Viewpoint deselectedViewpoint) {
    // Do nothing.
  }

}
