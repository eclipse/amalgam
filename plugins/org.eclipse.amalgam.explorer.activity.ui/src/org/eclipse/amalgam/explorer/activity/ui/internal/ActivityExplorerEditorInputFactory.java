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
package org.eclipse.amalgam.explorer.activity.ui.internal;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.internal.util.ActivityExplorerLoggerService;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;

/**
 * Activity Explorer editor input factory.
 * 
 */
public class ActivityExplorerEditorInputFactory implements IElementFactory {
	/**
	 * Id of the factory used to create {@link ActivityExplorerEditorInput}
	 */
	public static final String ID = ActivityExplorerEditorInputFactory.class.getName();
	private static final String ACTIVITY_EXPLORER_FILE = "activityExplorerFile"; //$NON-NLS-1$

	/**
	 * @see org.eclipse.ui.IElementFactory#createElement(org.eclipse.ui.IMemento)
	 */
	public IAdaptable createElement(IMemento memento_p) {
		String path = memento_p.getString(ACTIVITY_EXPLORER_FILE);
		if (path == null || path.isEmpty()) {
			IStatus status = new Status(IStatus.ERROR, ActivityExplorerActivator.ID,
					"Activity Explorer cannot find the path of file to restaure"); //$NON-NLS-1$
			ActivityExplorerLoggerService.getInstance().log(status);
			return null;
		}

		IResource file = getPlatformResource(new Path(path));
		if (file != null && file instanceof IFile) {
			ActivityExplorerEditorInput input = new ActivityExplorerEditorInput((IFile) file);
			return input;
		} else {
			IStatus status = new Status(IStatus.ERROR, ActivityExplorerActivator.ID,
					"Cannot load state of Activity Explorer for " + path); //$NON-NLS-1$
			ActivityExplorerLoggerService.getInstance().log(status);
		}
		return null;
	}

	private IResource getPlatformResource(IPath path) {
		// Precondition.
		if (path == null) {
			return null;
		}
		return ResourcesPlugin.getWorkspace().getRoot().findMember(path);
	}
}
