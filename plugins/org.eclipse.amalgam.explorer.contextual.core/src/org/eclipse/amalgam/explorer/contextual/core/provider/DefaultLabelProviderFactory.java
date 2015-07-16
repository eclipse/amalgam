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
package org.eclipse.amalgam.explorer.contextual.core.provider;

import org.eclipse.amalgam.explorer.contextual.core.category.CategoryImpl;
import org.eclipse.amalgam.explorer.contextual.core.provider.wrapper.CategoryWrapper;
import org.eclipse.amalgam.explorer.contextual.core.provider.wrapper.EObjectWrapper;
import org.eclipse.amalgam.explorer.contextual.core.util.ImageUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

/**
 *
 */
public class DefaultLabelProviderFactory extends AbstractLabelProviderFactory {

	@Override
	protected ILabelProvider getLabelProvider() {
		return new ILabelProvider() {

			private IItemLabelProvider getItemProvider(Object object_p){
				if (null == object_p) {
					return null;
				}
				AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(object_p);
				// Precondition.
				if (null == editingDomain) {
					return null;
				}
				IItemLabelProvider provider = (IItemLabelProvider) editingDomain.getAdapterFactory().adapt(object_p, IItemLabelProvider.class);
				return provider;
			}

			@Override
			public void removeListener(ILabelProviderListener listener) {
			}

			@Override
			public boolean isLabelProperty(Object element, String property) {
				return false;
			}

			@Override
			public void dispose() {
			}

			@Override
			public void addListener(ILabelProviderListener listener) {
			}

			@Override
			public String getText(Object element) {
				String result = "<Unknown>";

				if (element instanceof CategoryWrapper)
				{
					CategoryImpl category = (CategoryImpl)((CategoryWrapper) element).getElement();
					return category.getName();
				}

				if (element instanceof EObjectWrapper)
				{
					element = ((EObjectWrapper) element).getElement();
				}

				if (null != element)
				{
					IItemLabelProvider itemProvider = getItemProvider(element);
					if (null != itemProvider)
						result = itemProvider.getText(element);
				}

				return result;
			}

			@Override
			public Image getImage(Object element_p) {
				// Precondition.
				if (null == element_p) {
					return null;
				}
				// Initialize with the category image.
				Image result = ImageUtils.getImage(ImageUtils.IMG_CATEGORY);
				EObject eObject = null;
				// Find out a model element from given element.
				if (element_p instanceof EObjectWrapper) 
				{
					eObject = (EObject) ((EObjectWrapper) element_p).getElement();
				} 
				else 
				{
					if (element_p instanceof EObject) 
					{
						eObject = (EObject) element_p;
					}
				}

				// If an eobject was found, get its image.
				if (null != eObject)
				{
					IItemLabelProvider itemProvider = getItemProvider(eObject);
					if (null != itemProvider)
					{
						Object image = itemProvider.getImage(eObject);
						result = ExtendedImageRegistry.getInstance().getImage(image);
					}
					
				}

				return result;
			}
		};
	}

}
