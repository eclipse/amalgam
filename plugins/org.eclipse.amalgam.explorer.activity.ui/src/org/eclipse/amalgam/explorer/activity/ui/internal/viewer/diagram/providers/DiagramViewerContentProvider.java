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
package org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.description.concern.provider.ConcernItemProviderAdapterFactory;
import org.eclipse.sirius.diagram.description.filter.provider.FilterItemProviderAdapterFactory;
import org.eclipse.sirius.ui.tools.api.views.common.item.ItemWrapper;
import org.eclipse.sirius.ui.tools.api.views.common.item.RepresentationDescriptionItem;
import org.eclipse.sirius.ui.tools.api.views.common.item.ViewpointItem;
import org.eclipse.sirius.ui.tools.api.views.common.item.ViewpointsFolderItem;
import org.eclipse.sirius.ui.tools.internal.views.common.item.RepresentationItemImpl;
import org.eclipse.sirius.ui.tools.internal.views.common.item.ViewpointsFolderItemImpl;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.audit.provider.AuditItemProviderAdapterFactory;
import org.eclipse.sirius.viewpoint.description.provider.DescriptionItemProviderAdapterFactory;
import org.eclipse.sirius.viewpoint.description.style.provider.StyleItemProviderAdapterFactory;
import org.eclipse.sirius.viewpoint.description.tool.provider.ToolItemProviderAdapterFactory;
import org.eclipse.sirius.viewpoint.description.validation.provider.ValidationItemProviderAdapterFactory;
import org.eclipse.sirius.viewpoint.provider.ViewpointItemProviderAdapterFactory;

/**
 * Content provider used to display diagrams in the {@link TreeViewer} of
 * Architecture pages.
 * 
 */
public class DiagramViewerContentProvider extends AdapterFactoryContentProvider {

	/**
	 * No Child constant.
	 */
	private static final Object[] NO_CHILD = new Object[0];

	/**
	 * Handled viewpoint.
	 */
	private Set<String> _handledViewpoint;

	/**
	 * Constructor.
	 * 
	 * @param handledViewpoint_p
	 *            name of the viewpoint displayed here.
	 * @param filteringMetaClassForCommonViewpoint_p
	 *            EClass used to filter Common viewpoint.
	 */
	public DiagramViewerContentProvider(Set<String> handledViewpoint_p) {

		super(createAdapterFactory());
		_handledViewpoint = handledViewpoint_p;

	}

	protected static ComposedAdapterFactory createAdapterFactory() {
		List<ComposedAdapterFactory> factories = new ArrayList<ComposedAdapterFactory>();
		factories.add(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
		fillItemProviderFactories(factories);
		return new ComposedAdapterFactory(factories);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected static void fillItemProviderFactories(List factories) {
		factories.add(new ViewpointItemProviderAdapterFactory());
		factories.add(new DescriptionItemProviderAdapterFactory());
		factories.add(new StyleItemProviderAdapterFactory());
		factories.add(new ToolItemProviderAdapterFactory());
		factories.add(new FilterItemProviderAdapterFactory());
		factories.add(new ValidationItemProviderAdapterFactory());
		factories.add(new AuditItemProviderAdapterFactory());
		factories.add(new ConcernItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getChildren(java.lang.Object)
	 */
	@Override
	public Object[] getChildren(Object parentElement_p) {
		Object[] result = NO_CHILD;
		// Handle Session.
		if (parentElement_p instanceof Session) {
			result = getSessionChildren((Session) parentElement_p);
		}
		// Handle ViewpointItem.
		else if (parentElement_p instanceof ViewpointItem) {
			ViewpointItem viewpointItem = (ViewpointItem) parentElement_p;
			result = handleViewPointItem(parentElement_p, viewpointItem.getChildren());
		}
		// Handle all wrapped objects
		else if (parentElement_p instanceof RepresentationDescriptionItem) {
			RepresentationDescriptionItem representationDescriptionItem = (RepresentationDescriptionItem) parentElement_p;
			// Get children for current representation description item.
			Collection<?> representationItems = representationDescriptionItem.getChildren();
			// Check thate the children are not empty
			if (!representationItems.isEmpty()) {

				RepresentationDescription representationDescription = (RepresentationDescription) representationDescriptionItem
						.getWrappedObject();
				if (_handledViewpoint.contains(representationDescription.getName())) {
					Iterator<?> it = representationItems.iterator();
					Collection<DRepresentation> desc = new ArrayList<DRepresentation>();
					while (it.hasNext()) {
						RepresentationItemImpl item = (RepresentationItemImpl) it.next();
						desc.add(item.getRepresentation());
					}
					result = desc.toArray();
				}
			}

		}
		return result;
	}

	/**
	 * @see org.eclipse.jface.viewers.IStructuredContentProvider#getElements(java.lang.Object)
	 */
	@Override
	public Object[] getElements(Object inputElement_p) {
		return getChildren(inputElement_p);
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(Object element_p) {
		return null;
	}

	/**
	 * Get session children.<br>
	 * Only not empty {@link ViewpointItem} are considered.
	 * 
	 * @param session
	 * @return a not <code>null</code> array.
	 */
	private Object[] getSessionChildren(final Session session) {
		ViewpointsFolderItem viewpointsFolderItem = new ViewpointsFolderItemImpl(session, session);
		Collection<?> viewpointItems = viewpointsFolderItem.getChildren();
		Iterator<?> iterator = viewpointItems.iterator();
		while (iterator.hasNext()) {
			Object item = iterator.next();
			if (item instanceof ViewpointItem) {
				ViewpointItem viewpointItem = (ViewpointItem) item;
				if (getChildren(viewpointItem).length <= 0)
					// Remove non handled viewpoint diagram
					iterator.remove();
			}
		}
		return viewpointItems.toArray();
	}

	/**
	 * Handle ViewPointItem case.
	 * 
	 * @param element_p
	 * @param children_p
	 * @return
	 */
	private Object[] handleViewPointItem(Object element_p, Collection<? extends Object> children_p) {
		List<Object> result = new ArrayList<Object>(children_p);
		// Add a specific handling on DoReMi
		// org.eclipse.amalgam.explorer.activity.ui.internal type ViewpointItem .
		// Model Content view handles that case with a filter. The disadvantage
		// of the filter is : an expandable icon is displayed because
		// hasChildren is based
		// on doGetChildren().length. Thus, after clicking on the expandable
		// nothing is displayed, this is a weird behavior for the end-user.
		if (element_p instanceof ViewpointItem) {
			ArrayList<Object> selectedChildren = new ArrayList<Object>(0);
			// Only RepresentationDescriptionItem with children are considered.
			for (Object representationDescriptionItem : result) {
				ItemWrapper item = (ItemWrapper) representationDescriptionItem;
				Collection<?> itemChildren = item.getChildren();
				if (!itemChildren.isEmpty()) {
					// In addition, check its children are not filtered out.
					if (getChildren(representationDescriptionItem).length > 0) {
						selectedChildren.add(representationDescriptionItem);
					}
				}
			}
			result = selectedChildren;
		}
		return result.toArray();
	}

	/**
	 * @see org.eclipse.jface.viewers.ITreeContentProvider#hasChildren(java.lang.Object)
	 */
	@Override
	public boolean hasChildren(Object element_p) {
		return getChildren(element_p).length > 0;
	}
}
