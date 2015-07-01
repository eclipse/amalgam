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
package org.eclipse.amalgam.explorer.activity.api.editor.input;

import java.lang.ref.WeakReference;
import java.util.Iterator;

import org.eclipse.amalgam.explorer.activity.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.EObjectLabelProviderHelper;
import org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.SessionHelper;
import org.eclipse.amalgam.explorer.activity.internal.ActivityExplorerEditorInputFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
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
 *  ActivityExplorer editor input(based on Sirius Session).
 * 
 */
public class ActivityExplorerEditorInput implements IEditorInput, IPersistableElement {
	// private static final Logger __logger = null;
	// ReportManagerRegistry.getInstance().subscribe(IReportManagerDefaultComponents.UI);
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
	 * Constructor.<br>
	 * This constructor is used to restore an Activity Explorer editor.
	 * 
	 * @param memento
	 * @throws Exception
	 */
	ActivityExplorerEditorInput(IMemento memento_p) throws Exception {
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
		String result = ""; //$NON-NLS-1$
		if (null != _projectReference) {
			EObject project = _projectReference.get();
			if (null != project) {
				result = EObjectLabelProviderHelper.getText(project);
			}
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
	protected void loadState(IMemento memento_p) throws Exception {
		// Get from the memento the diagram file associated to session to
		// restore.
		String firstAnalysisFile = memento_p.getString(FIRST_ANALYSIS_FILE_TAG);
		IFile diagramFile = (IFile) getPlatformResource(new Path(firstAnalysisFile));
		Session session = org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.SessionHelper
				.getSession(diagramFile);

		// don't open session if already opened (bad performance)
		if (null == session) {
			// Instantiate the action responsible for opening a session.
			org.eclipse.amalgam.explorer.activity.api.actions.OpenSessionAction openSessionAction = new org.eclipse.amalgam.explorer.activity.api.actions.OpenSessionAction();

			// Disable to open the Activity Explorer as we are already restoring
			// a Activity Explorer editor input i.e a Activity Explorer editor.
			openSessionAction.setUnAvailableOpenActivityExplorer();
			openSessionAction.setRunInProgressService(false);
			openSessionAction.selectionChanged(new StructuredSelection(diagramFile));

			// Open the session.
			openSessionAction.run();
			session = org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.SessionHelper
					.getSession(diagramFile);

			// restore Activity Explorer User Preference
			openSessionAction.restoreAvailableOpenActivityExplorer();
		}

		// Get the session.
		_sessionReference = new WeakReference<Session>(session);
		session = null;

		if (null != _sessionReference) {
			_projectReference = new WeakReference<EObject>(SessionHelper.getRootSemanticModel(_sessionReference.get()));
		} else {
			throw new Exception("Failed to instantiate the session for " + firstAnalysisFile); //$NON-NLS-1$
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
		IFile firstAnalysisFile = org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.SessionHelper
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
		ActivityExplorerEditorInput result = null;
		try {
			result = new ActivityExplorerEditorInput(memento_p);
		} catch (Exception exception_p) {
			StringBuilder loggerMessage = new StringBuilder("Error while trying to restore a ActivityExplorerEditorInput - "); //$NON-NLS-1$
			loggerMessage.append(exception_p.getMessage());
			ActivityExplorerActivator.getDefault().sentToLogger(loggerMessage.toString(), IStatus.ERROR);
			// TODO:__logger.error(new EmbeddedMessage(loggerMessage.toString(),
			// IReportManagerDefaultComponents.UI), exception_p);
		}
		return result;
	}

	public static EObject getRootSemanticElement(Session session_p) {
		EObject result = null;
		Iterator<Resource> semanticResources = session_p.getSemanticResources().iterator();
		// Iterate over semantic resources to search for a project.
		while (semanticResources.hasNext()) {
			Resource semanticResource = semanticResources.next();
			EObject object = semanticResource.getContents().get(0);
			if (object instanceof EObject) {
				result = (EObject) object;
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
