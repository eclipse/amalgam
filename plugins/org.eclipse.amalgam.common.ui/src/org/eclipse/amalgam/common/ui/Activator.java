/*******************************************************************************
 * Copyright (c) 2008 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.common.ui;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	private static Activator plugin;

	public static final String PLUGIN_ID = "org.eclipse.amalgam.common.ui"; //$NON-NLS-1$

	public Activator() {
	}

	/**
	 * Returns the image for the given image ID. Returns <code>null</code> if
	 * there is no such image.
	 * 
	 * @param id
	 *            the identifier for the image to retrieve
	 * @return the image associated with the given ID
	 */
	public static Image getImage(String id) {
		return Activator.getDefault().getImageRegistry().get(id);
	}

	/**
	 * Returns the image descriptor for the given image ID. Returns
	 * <code>null</code> if there is no such image.
	 * 
	 * @param id
	 *            the identifier for the image to retrieve
	 * @return the image descriptor associated with the given ID
	 */
	public static ImageDescriptor getImageDescriptor(String id) {
		return Activator.getDefault().getImageRegistry().getDescriptor(id);
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}
	
	public static Shell getActiveWorkbenchShell() {
		IWorkbenchWindow window = getActiveWorkbenchWindow();
		if (window != null) {
			return window.getShell();
		}
		return null;
	}
	
	public static IWorkbenchWindow getActiveWorkbenchWindow() {
		return getDefault().getWorkbench().getActiveWorkbenchWindow();
	}
	
	public static IWorkspace getWorkspace() {
		return ResourcesPlugin.getWorkspace();
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static void log(Throwable e) {
		log(new Status(IStatus.ERROR, PLUGIN_ID, 0, "Unexpected error caught", e)); //$NON-NLS-1$
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

}
