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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.api.preferences.PreferenceConstants;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.session.IEditingSession;
import org.eclipse.sirius.ui.business.api.session.SessionUIManager;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

/**
 * The action allowing to open new sessions.
 * 
 */
public class OpenSessionAction extends BaseSelectionListenerAction {

  /**
   * Whether or not this action should be ran within a progress service runnable ?
   */
  private boolean _shouldRunInProgressService;

  private IStatus _status;

  /**
   * @return the _status
   */
  public IStatus getStatus() {
    return _status;
  }

  /**
   * List of files that a session cannot be opened.
   */
  private List<IFile> _failedOpeningSessions;

  /**
   * Constructor.<br>
   * Default behavior open the Activity Explorer as soon the session is open.
   */
  public OpenSessionAction() {
    super(Messages.OpenSessionAction_0);
    _shouldRunInProgressService = true;
    _status = Status.OK_STATUS;
  }

  /**
   * Open sessions.
   */
  protected void doOpenSessions() {
    _failedOpeningSessions = new ArrayList<IFile>();
    _status = new MultiStatus(ActivityExplorerActivator.ID, Status.OK_STATUS.getCode(),
        org.eclipse.amalgam.explorer.activity.ui.api.editor.Messages.ActivityExplorerEditor_Error_Message, null);

    Iterator<?> iterator = getStructuredSelection().iterator();
    while (iterator.hasNext()) {
      Object selectedElement = iterator.next();
      if (selectedElement instanceof IFile) {
        // don't open session if already opened (bad performance)
        IFile file = (IFile) selectedElement;
        try {
          if (org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper.getSession(file) != null) {
            continue;
          }

          URI selectedUri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
          Session session = SessionManager.INSTANCE.getSession(selectedUri, new NullProgressMonitor());
          if (null != session) {
            if (!session.isOpen()) {
              session.open(new NullProgressMonitor());
            }
            // Open the editing session.
            IEditingSession editingSession = SessionUIManager.INSTANCE.getOrCreateUISession(session);
            if (!editingSession.isOpen()) {
              editingSession.open();
            }
            if (getActivityExplorerPreference()) {
              openActivityExplorer(session);
            }
          }
        } catch (Exception ex) {
          _failedOpeningSessions.add(file);
          ((MultiStatus) _status).add(new Status(IStatus.ERROR, ActivityExplorerActivator.ID, ex.getMessage(), ex));
        }
      }
    }
  }

  /**
   * Get files that a session cannot be open for.
   * 
   * @return a not <code>null</code> collection.
   */
  public List<IFile> getFailedOpeningSessions() {
    if (null == _failedOpeningSessions) {
      _failedOpeningSessions = Collections.emptyList();
    }
    return _failedOpeningSessions;
  }

  /**
   * @see org.eclipse.jface.action.Action#run()
   */
  @Override
  public void run() {
    // Checks the selection content.
    if (getStructuredSelection().isEmpty()) {
      return;
    }
    try {
      IRunnableWithProgress runnable = new IRunnableWithProgress() {
        public void run(IProgressMonitor monitor) {
          doOpenSessions();
        }
      };
      if (_shouldRunInProgressService) {
        // The open session action is launched in a dedicated thread
        // (fork = true)
        // if this runnable is not forked,
        // we will get a deadlock on the thread UI in case the user
        // restart its application without saving his password
        PlatformUI.getWorkbench().getProgressService().run(true, false, runnable);
      } else {
        runnable.run(new NullProgressMonitor());
      }
    } catch (Exception ex) {
      _status = new Status(IStatus.ERROR, ActivityExplorerActivator.ID, ex.getMessage(), ex);
    }
  }

  /**
   * Get ActivityExplorer should be open when running this action.
   * 
   * @param open
   *          <code>true</code> means the Activity Explorer will be open after session open operation.
   */
  public static boolean getActivityExplorerPreference() {
    return ActivityExplorerActivator.getDefault().getPreferenceStore()
        .getBoolean(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER);
  }

  /**
   * Set if this action should be ran within a progress service runnable.
   * 
   * @param runInProgressService
   *          <code>true</code> means this action should be ran within a progress service runnable.
   */
  public void setRunInProgressService(boolean runInProgressService) {
    _shouldRunInProgressService = runInProgressService;
  }

  /**
   * Open the Activity Explorer for specified session.
   * 
   * @param session
   * @return
   */
  public static boolean openActivityExplorer(final Session session) {
    final boolean[] welcomeOpen = { false };
    if (null == session) {
      return welcomeOpen[0];
    }
    // Create a runnable that open the Activity Explorer.
    Runnable runnable = new Runnable() {
      @SuppressWarnings("synthetic-access")
      public void run() {
        try {
          IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
          if ((activePage != null) && session.isOpen()) {
            activePage.openEditor(
                new ActivityExplorerEditorInput(session,
                    org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper
                        .getRootSemanticModel(session)), ActivityExplorerEditor.ID);
            welcomeOpen[0] = true;
          }
        } catch (PartInitException exception) {
          StringBuilder loggerMessage = new StringBuilder(".run(..) _ Activity Explorer not Found."); //$NON-NLS-1$
          loggerMessage.append(exception.getMessage());
          // __logger.warn(new
          // EmbeddedMessage(loggerMessage.toString(),
          // IReportManagerDefaultComponents.UI), exception);
        }
      }
    };
    Display display = Display.getCurrent();
    if (null == display) {
      PlatformUI.getWorkbench().getDisplay().asyncExec(runnable);
    } else {
      runnable.run();
    }
    return welcomeOpen[0];
  }

  // user prefreence value
  boolean userValue = false;

  public void setUnAvailableOpenActivityExplorer() {
    userValue = getActivityExplorerPreference();
    ActivityExplorerActivator.getDefault().getPreferenceStore()
        .setValue(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, false);

  }

  public void restoreAvailableOpenActivityExplorer() {
    ActivityExplorerActivator.getDefault().getPreferenceStore()
        .setValue(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, userValue);
  }
}