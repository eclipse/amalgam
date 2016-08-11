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

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.Messages;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.EObjectLabelProviderHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper;
import org.eclipse.amalgam.explorer.activity.ui.internal.ActivityExplorerEditorInputFactory;
import org.eclipse.amalgam.explorer.activity.ui.internal.util.ActivityExplorerLoggerService;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.eclipse.ui.part.FileEditorInput;

/**
 * ActivityExplorer editor input.
 * 
 */
public class ActivityExplorerEditorInput extends FileEditorInput implements IEditorInput, IPersistableElement {

	/**
	 * File linked to this activity explorer.
	 */
	private static final String ACTIVITY_EXPLORER_FILE = "activityExplorerFile"; //$NON-NLS-1$

	/**
	 * status of the input FIXME why this is added here?
	 */
	@Deprecated
	private IStatus _status;

	public ActivityExplorerEditorInput(IFile file) {
		super(file);
		loadState(getFile());
	}

	@Deprecated
	public ActivityExplorerEditorInput(Session session, EObject eObject) {
		this(SessionHelper.getFirstAnalysisFile((DAnalysisSession) session));
	}

	/**
	 * Dispose.
	 */
	public void dispose() {
		// Nothing to do
	}

	/**
	 * @see org.eclipse.ui.IEditorInput#exists()
	 */
	@Override
	public boolean exists() {
		Session session = this.getSession();
		return super.exists() && (session != null) && (session.isOpen());
	}

	/**
	 * @see org.eclipse.core.runtime.IAdaptable#getAdapter(java.lang.Class)
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object getAdapter(Class adapter_p) {
		if (adapter_p == Session.class) {
			IPath path = getFile().getFullPath();
			URI uri = URI.createPlatformResourceURI(path.toString(), true);
			Session session = SessionManager.INSTANCE.getExistingSession(uri);
			return session;
		}
		if ((null != _status) && (adapter_p == IStatus.class)) {
			return _status;
		}
		return super.getAdapter(adapter_p);
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
	@Deprecated
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
	@Deprecated
	public EObject getRootSemanticElement() {
		EObject result = null;
		String path = null;
		try {
			IFile file = getFile();
			path = file.getFullPath().toString();
			String defaultCharset = null;
			defaultCharset = System.getProperty("file.encoding"); //$NON-NLS-1$
			defaultCharset = defaultCharset != null && defaultCharset.isEmpty()? defaultCharset:"UTF-8"; //$NON-NLS-1$
			path = URLDecoder.decode(path, defaultCharset);
			URI uri = URI.createPlatformResourceURI(path, true);
			Session session = SessionManager.INSTANCE.getExistingSession(uri);
			result = getRootSemanticElement(session);
		} catch (UnsupportedEncodingException e) {
			ActivityExplorerLoggerService.getInstance().log(new Status(IStatus.ERROR, ActivityExplorerActivator.ID, 
					"Could not find the resource " + path + ". See the error log for more details", e)); //$NON-NLS-1$
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
	// TODO
	@Deprecated
	public Session getSession() {
		return (Session) getAdapter(Session.class);
	}

	@Deprecated
	public IStatus getStatus() {
		return (IStatus) getAdapter(IStatus.class);
	}

	/**
	 * @see org.eclipse.ui.IEditorInput#getToolTipText()
	 */
	public String getToolTipText() {
		return getModelUiName();
	}

	// FIXME be contributive
	private void loadState(IFile file) {
		try {
			Session session = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper
					.getSession(file);

			// don't open session if already opened (bad performance)
			if (null == session) {
				// Instantiate the action responsible for opening a session.
				org.eclipse.amalgam.explorer.activity.ui.api.actions.OpenSessionAction openSessionAction = new org.eclipse.amalgam.explorer.activity.ui.api.actions.OpenSessionAction();
				openSessionAction.setRunInProgressService(false);
				openSessionAction.selectionChanged(new StructuredSelection(file));

				// Open the session.
				openSessionAction.run();
				_status = openSessionAction.getStatus();
				if (_status == null) {
					_status = Status.OK_STATUS;
				}

				if (_status.isOK()) {
					session = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SessionHelper
							.getSession(file);
				}
			}
			if (null == getRootSemanticElement()) {
				_status = new Status(IStatus.WARNING, ActivityExplorerActivator.ID, Messages.ActivityExplorerEditor_1);
			}
		} catch (Exception e) {
			_status = new Status(IStatus.ERROR, ActivityExplorerActivator.ID, e.getMessage(), e);
		}
	}

	/**
	 * @see org.eclipse.ui.IPersistable#saveState(org.eclipse.ui.IMemento)
	 */
	public void saveState(IMemento memento_p) {
		memento_p.putString(ACTIVITY_EXPLORER_FILE, getFile().getFullPath().toString());
	}

	@Deprecated
	public static EObject getRootSemanticElement(Session session_p) {
		EObject result = null;
		if (session_p != null) {
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
		}
		return result;
	}
}
