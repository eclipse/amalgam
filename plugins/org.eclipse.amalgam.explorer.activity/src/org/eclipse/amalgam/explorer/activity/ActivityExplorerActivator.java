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
package org.eclipse.amalgam.explorer.activity;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.FormColors;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ActivityExplorerActivator extends AbstractUIPlugin {

	public static String ID = "org.eclipse.amalgam.explorer.activity"; //$NON-NLS-1$

	/**
	 * The shared instance
	 */
	private static ActivityExplorerActivator __plugin;
	/**
	 * Shared Form colors.
	 */
	private FormColors _formColors;

	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		__plugin = this;
	}

	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		try {
			if (null != _formColors) {
				_formColors.dispose();
				_formColors = null;
			}
		} finally {
			__plugin = null;
			super.stop(context);
		}
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static ActivityExplorerActivator getDefault() {
		return __plugin;
	}

	/**
	 * Get shared form colors.
	 * 
	 * @param display
	 * @return
	 */
	public FormColors getFormColors(Display display) {
		if (null == _formColors) {
			_formColors = new FormColors(display);
			_formColors.markShared();
		}
		return _formColors;
	}

	/**
	 * Get Image.
	 * 
	 * @param key_p
	 * @return Image
	 */
	public Image getImage(String key_p) {
		return getImage(ID, key_p);
	}

	/**
	 * Create the Image Descriptor.
	 * 
	 * @param key_p
	 * @return ImageDescriptor
	 */
	protected ImageDescriptor createImageDescriptor(String key_p) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(ID, key_p);
		return imageDescriptor;
	}

	/**
	 * 
	 * Get the Image.
	 * 
	 * @param plugin_id
	 * @param key_p
	 * @return image
	 */
	public Image getImage(String plugin_id, String key_p) {
		ImageRegistry imageRegistry = getImageRegistry();

		Image image = imageRegistry.get(key_p);
		if (null == image) {
			// Create an image descriptor for given id.
			ImageDescriptor imageDescriptor = createImageDescriptor(key_p, plugin_id);
			// Store the (id, imageDescriptor) rather than (id,image)
			// because with storing (id,image) the getDescriptor method will
			// return null in later usage
			// this way, everything is correctly initialized.
			imageRegistry.put(key_p, imageDescriptor);

			// Everything is all right at this step, let's get the real image
			image = imageRegistry.get(key_p);
		}
		return image;

	}

	/**
	 * Get the image Descriptor.
	 * 
	 * @param key_p
	 * @return ImageDescriptor
	 */
	public ImageDescriptor getImageDescriptor(String key_p) {
		getImage(ID, key_p);
		return getImageRegistry().getDescriptor(key_p);
	}

	public ImageDescriptor getImageDescriptor(String id, String key_p) {
		getImage(id, key_p);
		return getImageRegistry().getDescriptor(key_p);
	}

	protected ImageDescriptor createImageDescriptor(String key_p, String id) {
		ImageDescriptor imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(id, key_p);
		return imageDescriptor;
	}

	/**
	 * Send Exception to ErrorLog View
	 * 
	 * @param e
	 */
	public void sentToLogger(Exception exception) {
		sendToLogger(exception.getMessage(), exception, IStatus.ERROR);
	}

	/**
	 * Send Message to ErrorLog View
	 * 
	 * @param msg
	 * @param severity
	 */
	public void sentToLogger(String msg, int severity) {
		sendToLogger(msg, null, severity);
	}

	/**
	 * Send message or exception to ErrorLog View
	 * 
	 * @param msg
	 * @param e
	 * @param severity
	 */
	private void sendToLogger(String msg, Exception e, int severity) {
		Status status = null;

		if (e != null) {
			status = new Status(IStatus.ERROR, ID, msg, e);
		} else {
			status = new Status(severity, ID, msg);
		}
		getLog().log(status);
	}
}