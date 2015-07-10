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

import org.eclipse.amalgam.explorer.contextual.core.provider.impl.CurrentElementCP;
import org.eclipse.amalgam.explorer.contextual.core.provider.impl.ReferencedElementCP;
import org.eclipse.amalgam.explorer.contextual.core.provider.impl.ReferencingElementCP;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.jface.viewers.ITreeContentProvider;

/**
 * Default implementation of a ContentProvideFactory for ExplorerContextual.
 */
public class DefaultContentProviderFactory extends AbstractContentProviderFactory {

	private AdapterFactory _adapterFactory;

	/**
	 * Constructor.
	 */
	public DefaultContentProviderFactory(AdapterFactory adapterFactory_p) {
		_adapterFactory = adapterFactory_p;
	}

	/**
	 * Get the adapter factory.
	 * @return the adapterFactory
	 */
	protected AdapterFactory getAdapterFactory() {
		return _adapterFactory;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ITreeContentProvider getCurrentContentProvider() {
		return new CurrentElementCP(getAdapterFactory(), model);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ITreeContentProvider getReferencedContentProvider() {
		return new ReferencedElementCP(getAdapterFactory(), model);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ITreeContentProvider getReferencingContentProvider() {
		return new ReferencingElementCP(getAdapterFactory(), model);
	}
}
