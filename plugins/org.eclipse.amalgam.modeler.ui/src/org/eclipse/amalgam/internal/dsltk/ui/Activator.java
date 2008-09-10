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
package org.eclipse.amalgam.internal.dsltk.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {

	public final static String ICONS_PATH = "$nl$/icons/full/";//$NON-NLS-1$

	private final static String PATH_OBJECT = ICONS_PATH + "wizban/"; //$NON-NLS-1$

	public final static String IMG_OBJ_DSL_PROJECT = "IMG_OBJ_DSL_PROJECT"; //$NON-NLS-1$

	private static Activator plugin;

	public static final String PLUGIN_ID = "org.eclipse.amalgam.dsltk.ui"; //$NON-NLS-1$

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	@Override
	protected void initializeImageRegistry(ImageRegistry reg) {
		super.initializeImageRegistry(reg);
		loadImage(reg, IMG_OBJ_DSL_PROJECT, PATH_OBJECT + "DSLProjectWizard.gif"); //$NON-NLS-1$
	}

	private void loadImage(ImageRegistry registry, String id, String filePath) {
		ImageDescriptor descriptor = imageDescriptorFromPlugin(Activator.PLUGIN_ID, filePath);
		if (descriptor != null) {
			registry.put(id, descriptor);
		}
	}

	public static void log(Throwable e) {
		log(new Status(IStatus.ERROR, PLUGIN_ID, 0, "Unexpected error caught", e)); //$NON-NLS-1$
	}

	public static void log(IStatus status) {
		getDefault().getLog().log(status);
	}

}
