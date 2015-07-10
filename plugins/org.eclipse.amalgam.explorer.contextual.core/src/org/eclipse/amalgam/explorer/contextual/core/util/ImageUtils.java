/******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.util;

import org.eclipse.amalgam.explorer.contextual.core.ExplorerActivator;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class ImageUtils {

	/** Category image id used in Contextual Explorer.<br> **/
	public final static String IMG_CATEGORY = "packd_obj.gif"; //$NON-NLS-1$

	/** Default Image path. **/
	public static final String ICONS_FOLDER_PATH = "icons/"; //$NON-NLS-1$
	
	/**
	 * @param imagePath path of the image file
	 * @return{@link Image} object
	 */
	public static Image getImage(String imagePath) {
		ImageRegistry imageRegistry = ExplorerActivator.getDefault().getImageRegistry();
		Image image = imageRegistry.get(imagePath);
		if (null == image) 
		{
			ImageDescriptor imageDescriptor = 
					AbstractUIPlugin.imageDescriptorFromPlugin(ExplorerActivator.PLUGIN_ID, ICONS_FOLDER_PATH + imagePath);
			
			imageRegistry.put(imagePath, imageDescriptor);
			image = imageRegistry.get(imagePath);
		}
		return image;
	}
}
