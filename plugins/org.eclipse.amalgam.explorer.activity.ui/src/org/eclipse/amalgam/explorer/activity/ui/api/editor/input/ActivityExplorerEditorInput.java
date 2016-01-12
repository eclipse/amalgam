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
package org.eclipse.amalgam.explorer.activity.ui.api.editor.input;

import java.lang.ref.WeakReference;
import java.util.Iterator;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.Messages;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.EObjectLabelProviderHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper;
import org.eclipse.amalgam.explorer.activity.ui.internal.ActivityExplorerEditorInputFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;

/**
 * ActivityExplorer editor input(based on Sirius Session).
 * 
 */
public class ActivityExplorerEditorInput implements IEditorInput, IPersistableElement {
  /**
   * First Analysis File tag.
   */
  private static final String FIRST_ANALYSIS_FILE_TAG = "firstAnalysisFile"; //$NON-NLS-1$
  
  /**
   * Session used in this editor input.
   */
  private WeakReference<Session> _sessionReference;
  /**
   * project.
   */
  private WeakReference<EObject> _projectReference;

  /**
   * status of the input
   */
  private IStatus _status;

  /**
   * Constructor.<br>
   * This constructor is used to restore an Activity Explorer editor.
   * 
   * @param memento
   * @throws Exception
   */
  ActivityExplorerEditorInput(IMemento memento_p) {
    _status = Status.OK_STATUS;
    loadState(memento_p);
  }

  /**
   * Constructor.
   * 
   * @param session_p
   * @param project_p
   */
  public ActivityExplorerEditorInput(Session session_p, EObject project_p) {
    _sessionReference = new WeakReference<Session>(session_p);
    _projectReference = new WeakReference<EObject>(project_p);
    _status = Status.OK_STATUS;
  }

  /**
   * Dispose.
   */
  public void dispose() {
    _projectReference.clear();
    _projectReference = null;
    _sessionReference.clear();
    _sessionReference = null;
  }

  /**
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj_p) {
    boolean result = this == obj_p;
    if (!result && (null != _sessionReference) && (obj_p instanceof ActivityExplorerEditorInput)) {
      Session session = _sessionReference.get();
      if (null != session) {
        WeakReference<Session> sessionReferenceToCompare = ((ActivityExplorerEditorInput) obj_p)._sessionReference;
        if (null != sessionReferenceToCompare) {
          result = session.equals(sessionReferenceToCompare.get());
        }
      }
    }
    return result;
  }

  /**
   * @see org.eclipse.ui.IEditorInput#exists()
   */
  public boolean exists() {
    boolean result = false;
    if (null != _sessionReference) {
      Session session = _sessionReference.get();
      result = (null != session) && session.isOpen();
    }
    return result;
  }

  /**
   * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
   */

  @SuppressWarnings("rawtypes")
  public Object getAdapter(Class adapter_p) {
    if ((null != _sessionReference) && (adapter_p == Session.class)) {
      return _sessionReference.get();
    }
    if ((null != _status) && (adapter_p == IStatus.class)) {
      return _status;
    }
    return null;
  }

  /**
   * @see org.eclipse.ui.IPersistableElement#getFactoryId()
   */
  public String getFactoryId() {
    return ActivityExplorerEditorInputFactory.ID;
  }

  /**
   * @see org.eclipse.ui.IEditorInput#getImageDescriptor()
   */
  public ImageDescriptor getImageDescriptor() {
    return null;
  }

  /**
   * Return the UI representation of current handled model.
   * 
   * @return
   */
  public String getModelUiName() {
    String result = Messages.ActivityExplorerEditor_Title;
    EObject project = getRootSemanticElement();
    if (null != project) {
      result = EObjectLabelProviderHelper.getText(project);
    }
    return result;
  }

  /**
   * Get the underlying project.
   * 
   * @return the project
   */
  public EObject getRootSemanticElement() {
    EObject result = null;
    if (null != _projectReference) {
      result = _projectReference.get();
    }
    return result;
  }

  /**
   * @see org.eclipse.ui.IEditorInput#getName()
   */
  public String getName() {
    return getModelUiName();
  }

  /**
   * @see org.eclipse.ui.IEditorInput#getPersistable()
   */
  public IPersistableElement getPersistable() {
    return this;
  }

  /**
   * Get the underlying session.
   * 
   * @return a not <code>null</code> instance.
   */
  public Session getSession() {
    return (Session) getAdapter(Session.class);
  }

  public IStatus getStatus() {
    return (IStatus) getAdapter(IStatus.class);
  }

  /**
   * @see org.eclipse.ui.IEditorInput#getToolTipText()
   */
  public String getToolTipText() {
    return getName();
  }

  /**
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    int hashCode = super.hashCode();
    if (null != _sessionReference) {
      Session session = _sessionReference.get();
      hashCode = (null != session) ? session.hashCode() : hashCode;
    }
    return hashCode;
  }

  /**
   * Load this editor input from the memento.
   * 
   * @param memento_p
   * @throws Exception
   */
  protected void loadState(IMemento memento_p) {
    try {
      // Get from the memento the diagram file associated to session to
      // restore.
      String firstAnalysisFile = memento_p.getString(FIRST_ANALYSIS_FILE_TAG);
      IFile diagramFile = (IFile) getPlatformResource(new Path(firstAnalysisFile));
      Session session = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper
          .getSession(diagramFile);

      // don't open session if already opened (bad performance)
      if (null == session) {
        // Instantiate the action responsible for opening a session.
        org.eclipse.amalgam.explorer.activity.ui.api.actions.OpenSessionAction openSessionAction = new org.eclipse.amalgam.explorer.activity.ui.api.actions.OpenSessionAction();
        // Disable to open the Activity Explorer as we are already restoring
        // a Activity Explorer editor input i.e a Activity Explorer editor.
        openSessionAction.setUnAvailableOpenActivityExplorer();
        openSessionAction.setRunInProgressService(false);
        openSessionAction.selectionChanged(new StructuredSelection(diagramFile));

        // Open the session.
        openSessionAction.run();
        _status = openSessionAction.getStatus();
        if (_status == null) {
          _status = Status.OK_STATUS;
        }

        if (_status.isOK()) {
          session = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper
              .getSession(diagramFile);

          // restore Activity Explorer User Preference
          openSessionAction.restoreAvailableOpenActivityExplorer();
        }
      }

      // Get the session.
      _sessionReference = new WeakReference<Session>(session);
      if (_status.isOK()) {
        if ((null != _sessionReference) && (_sessionReference.get() != null)) {
          _projectReference = new WeakReference<EObject>(SessionHelper.getRootSemanticModel(_sessionReference.get()));
        } else {
          throw new Exception("Failed to instantiate the session for " + firstAnalysisFile); //$NON-NLS-1$
        }

        if (null == getRootSemanticElement()) {
          _status = new Status(IStatus.WARNING, ActivityExplorerActivator.ID, Messages.ActivityExplorerEditor_1);
        }
      }

    } catch (Exception e) {
      _status = new Status(IStatus.ERROR, ActivityExplorerActivator.ID, e.getMessage(), e);
    }

  }

  /**
   * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
   */
  public void saveState(IMemento memento_p) {
    // Precondition.
    if ((null == _sessionReference) || (null == _sessionReference.get())) {
      return;
    }
    IFile firstAnalysisFile = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper
        .getFirstAnalysisFile((DAnalysisSession) _sessionReference.get());
    if (null != firstAnalysisFile) {
      memento_p.putString(FIRST_ANALYSIS_FILE_TAG, firstAnalysisFile.getFullPath().toString());
    }
  }

  /**
   * Instantiate a {@link ActivityExplorerEditorInput} from specified memento.
   * 
   * @param memento_p
   * @return
   */
  public static ActivityExplorerEditorInput create(IMemento memento_p) {
    return new ActivityExplorerEditorInput(memento_p);
  }

  public static EObject getRootSemanticElement(Session session_p) {
    EObject result = null;
    Iterator<Resource> semanticResources = session_p.getSemanticResources().iterator();
    // Iterate over semantic resources to search for a project.
    while (semanticResources.hasNext()) {
      Resource semanticResource = semanticResources.next();
      EObject object = semanticResource.getContents().get(0);
      if (object instanceof EObject) {
        result = object;
        break;
      }
    }
    return result;
  }

  private static IResource getPlatformResource(IPath path) {
    // Precondition.
    if (path == null) {
      return null;
    }
    return ResourcesPlugin.getWorkspace().getRoot().findMember(path);
  }

}
