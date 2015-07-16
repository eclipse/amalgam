/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.ext;

import org.eclipse.amalgam.explorer.contextual.core.ExplorerActivator;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;

/**
 *
 */
public abstract class AbstractExtensionPointManager {
	
	public static final String DEFAULT_CLASS_ATTRIBUTE = "class"; //$NON-NLS-1$

	public static final String DEFAULT_NAME_ATTRIBUTE = "name"; //$NON-NLS-1$

	public static final String DEFAULT_ID_ATTRIBUTE = "id"; //$NON-NLS-1$

	public static IConfigurationElement[] getConfigurationElementsFor(String pluginId_p, String extensionPointId_p) {
		IExtensionRegistry extensionRegistry = Platform.getExtensionRegistry();
		IConfigurationElement[] configElements = extensionRegistry.getConfigurationElementsFor(pluginId_p, extensionPointId_p);
		return configElements;
	}
	
	public static <T extends Object> T createTypedInstance(IConfigurationElement configurationElement_p, 
													  String attributeName_p, 
													  Class<T> type_p) {
		T typedInstance = null;
		Object instance = null;
		// create an executable extension.
		try {
			instance = configurationElement_p.createExecutableExtension(attributeName_p);
		} catch (CoreException e) {
			String message = "Unable to create instance of class :"; //$NON-NLS-1$
			message.concat(configurationElement_p.getAttribute(attributeName_p));
			IStatus status = new Status(IStatus.ERROR, ExplorerActivator.PLUGIN_ID, message, e);
			ExplorerActivator.getDefault().getLog().log(status);
		}
		
		// Cast it to the passed generic type.
		try {
			typedInstance = type_p.cast(instance);
		} catch (ClassCastException e) {
			String message = "Unable to cast class "; //$NON-NLS-1$
			message.concat(configurationElement_p.getAttribute(attributeName_p));
			IStatus status = new Status(IStatus.ERROR, ExplorerActivator.PLUGIN_ID, message, e);
			message.concat(" To ");
			message.concat(type_p.getName());
			ExplorerActivator.getDefault().getLog().log(status);
		}
		
		return typedInstance;
	}
	
	public static Object createInstance(IConfigurationElement configurationElement_p, String attributeName_p) {
		return createTypedInstance(configurationElement_p, attributeName_p, Object.class);
	}
}
