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
package org.eclipse.amalgam.explorer.contextual.core.provider;

import org.eclipse.amalgam.explorer.contextual.core.ExplorerActivator;
import org.eclipse.amalgam.explorer.contextual.core.ext.AbstractExtensionPointManager;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.ILabelProvider;

/**
 */
public abstract class AbstractLabelProviderFactory extends AbstractExtensionPointManager{

	/**
	 * Singleton.
	 */
	protected static AbstractLabelProviderFactory _instance = null;
	
	private static final String LABEL_PROVIDER_FACTORY = "labelProviderFactory"; //$NON-NLS-1$

	protected abstract ILabelProvider getLabelProvider();
	
	/**
	 * Singleton accessor.
	 * @return
	 */
	public static AbstractLabelProviderFactory getInstance() {
		if (null == _instance) 
		{
			IConfigurationElement[] configurationElements = getConfigurationElementsFor(ExplorerActivator.PLUGIN_ID, LABEL_PROVIDER_FACTORY);
			for (IConfigurationElement configurationElement : configurationElements) 
			{
				AbstractLabelProviderFactory labelProvider = createTypedInstance(configurationElement, DEFAULT_CLASS_ATTRIBUTE, AbstractLabelProviderFactory.class);
				if (null != labelProvider) 
				{
					_instance = labelProvider;
				}
			}
			
			if (null == _instance)
			{
				_instance = new DefaultLabelProviderFactory();
			}
		}
		return _instance;
	}
	
	public ILabelProvider getCurrentLabelProvider() {
		return getLabelProvider();
	}

	public ILabelProvider getReferencedLabelProvider() {
		return getLabelProvider();
	}

	public ILabelProvider getReferencingLabelProvider() {
		return getLabelProvider();
	}

}
