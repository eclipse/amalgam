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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.jface.viewers.ITreeContentProvider;

public abstract class NotifiedContentProviderFactory extends DefaultContentProviderFactory {
	
	public abstract boolean isListeningToPageSelectionEvents(Notification notification_p);

	public NotifiedContentProviderFactory(AdapterFactory adapterFactory_p) {
		super(adapterFactory_p);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ITreeContentProvider getCurrentContentProvider() {

		return new CurrentElementCP(getAdapterFactory(), model) {

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void notifyChanged(Notification notification_p) {
				if (isListeningToPageSelectionEvents(notification_p)) {
					super.notifyChanged(notification_p);
				}
			}
		};
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ITreeContentProvider getReferencedContentProvider() {
		return new ReferencedElementCP(getAdapterFactory(), model) {

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void notifyChanged(Notification notification_p) {
				if (isListeningToPageSelectionEvents(notification_p)) {
					super.notifyChanged(notification_p);
				}
			}
		};
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ITreeContentProvider getReferencingContentProvider() {
		return new ReferencingElementCP(getAdapterFactory(), model) {

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void notifyChanged(Notification notification_p) {
				if (isListeningToPageSelectionEvents(notification_p)) {
					super.notifyChanged(notification_p);
				}
			}
		};
	}
}
