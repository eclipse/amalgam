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
import org.eclipse.amalgam.explorer.contextual.core.model.IExplorerContextualModel;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.jface.viewers.ITreeContentProvider;

/**
 * Provide an interface for a content provider factory.
 */
public abstract class AbstractContentProviderFactory extends AbstractExtensionPointManager{
  /**
   * Singleton.
   */
  protected static AbstractContentProviderFactory _instance = null;
  protected IExplorerContextualModel model;
  private static final String CONTENT_PROVIDER_FACTORY = "contentProviderFactory"; //$NON-NLS-1$

  public abstract ITreeContentProvider getCurrentContentProvider();

  public abstract ITreeContentProvider getReferencedContentProvider();

  public abstract ITreeContentProvider getReferencingContentProvider();

  /**
   * Singleton accessor.
   * @return
   */
  public static AbstractContentProviderFactory getInstance() {
	  if (null == _instance) 
	  {
		  IConfigurationElement[] configurationElements = 
				  getConfigurationElementsFor(ExplorerActivator.PLUGIN_ID, CONTENT_PROVIDER_FACTORY);
		  
		  for (IConfigurationElement configurationElement : configurationElements) 
		  {
			  AbstractContentProviderFactory contentProvider =
					  createTypedInstance(configurationElement, DEFAULT_CLASS_ATTRIBUTE, AbstractContentProviderFactory.class);
			  if (null != contentProvider) 
			  {
				  _instance = contentProvider;
				  break;
			  }
		  }
		  
		  if (null == _instance)
		  {
			  _instance = new DefaultContentProviderFactory(new ComposedAdapterFactory());
		  }
	  }
	  return _instance;
  }
  
  public void setModel(IExplorerContextualModel model_p) {
    model = model_p;
  }

}
