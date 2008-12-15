/**
 * Copyright (c) 2008 Borland Software Corporation
 *   
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *      Borland Software Corporation - initial API and implementation
 *
 * $Id: BuildItemProvider.java,v 1.4 2008/12/15 16:59:03 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.amalgam.releng.build.Build;
import org.eclipse.amalgam.releng.build.BuildFactory;
import org.eclipse.amalgam.releng.build.BuildPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.amalgam.releng.build.Build} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BuildItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypePropertyDescriptor(object);
			addBuildRootPropertyDescriptor(object);
			addFetchTagPropertyDescriptor(object);
			addProductPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addBasePropertyDescriptor(object);
			addBuilderPropertyDescriptor(object);
			addDatePropertyDescriptor(object);
			addTimePropertyDescriptor(object);
			addLaunchVMPropertyDescriptor(object);
			addDeltapackPropertyDescriptor(object);
			addBuilderURLPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_type_feature"),
				 getString("_UI_Build_type_description"),
				 BuildPackage.Literals.BUILD__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Build Root feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuildRootPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_buildRoot_feature"),
				 getString("_UI_Build_buildRoot_description"),
				 BuildPackage.Literals.BUILD__BUILD_ROOT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fetch Tag feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFetchTagPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_fetchTag_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_fetchTag_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__FETCH_TAG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Product feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProductPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_product_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_product_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__PRODUCT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_label_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_base_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_base_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__BASE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Builder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuilderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_builder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_builder_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__BUILDER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Date feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_date_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_date_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__DATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_time_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_time_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Launch VM feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLaunchVMPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_launchVM_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_launchVM_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__LAUNCH_VM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deltapack feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeltapackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_deltapack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_deltapack_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__DELTAPACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Builder URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBuilderURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Build_builderURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Build_builderURL_feature", "_UI_Build_type"),
				 BuildPackage.Literals.BUILD__BUILDER_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BuildPackage.Literals.BUILD__PLATFORMS);
			childrenFeatures.add(BuildPackage.Literals.BUILD__CONFIGS);
			childrenFeatures.add(BuildPackage.Literals.BUILD__MAP);
			childrenFeatures.add(BuildPackage.Literals.BUILD__CATEGORIES);
			childrenFeatures.add(BuildPackage.Literals.BUILD__CONTRIBUTIONS);
			childrenFeatures.add(BuildPackage.Literals.BUILD__COMPILER);
			childrenFeatures.add(BuildPackage.Literals.BUILD__PROMOTION);
			childrenFeatures.add(BuildPackage.Literals.BUILD__BUILDMASTER);
			childrenFeatures.add(BuildPackage.Literals.BUILD__DEFAULT_MAIL_LIST);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Build.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Build"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Build)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_Build_type") :
			getString("_UI_Build_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Build.class)) {
			case BuildPackage.BUILD__TYPE:
			case BuildPackage.BUILD__BUILD_ROOT:
			case BuildPackage.BUILD__FETCH_TAG:
			case BuildPackage.BUILD__LABEL:
			case BuildPackage.BUILD__DATE:
			case BuildPackage.BUILD__TIME:
			case BuildPackage.BUILD__LAUNCH_VM:
			case BuildPackage.BUILD__DELTAPACK:
			case BuildPackage.BUILD__BUILDER_URL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case BuildPackage.BUILD__PLATFORMS:
			case BuildPackage.BUILD__CONFIGS:
			case BuildPackage.BUILD__MAP:
			case BuildPackage.BUILD__CATEGORIES:
			case BuildPackage.BUILD__CONTRIBUTIONS:
			case BuildPackage.BUILD__COMPILER:
			case BuildPackage.BUILD__PROMOTION:
			case BuildPackage.BUILD__BUILDMASTER:
			case BuildPackage.BUILD__DEFAULT_MAIL_LIST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD__PLATFORMS,
				 BuildFactory.eINSTANCE.createPlatform()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD__CONFIGS,
				 BuildFactory.eINSTANCE.createConfig()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD__MAP,
				 BuildFactory.eINSTANCE.createMap()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD__CATEGORIES,
				 BuildFactory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD__CONTRIBUTIONS,
				 BuildFactory.eINSTANCE.createContribution()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD__COMPILER,
				 BuildFactory.eINSTANCE.createCompiler()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD__PROMOTION,
				 BuildFactory.eINSTANCE.createPromotion()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD__BUILDMASTER,
				 BuildFactory.eINSTANCE.createContact()));

		newChildDescriptors.add
			(createChildParameter
				(BuildPackage.Literals.BUILD__DEFAULT_MAIL_LIST,
				 BuildFactory.eINSTANCE.createContact()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == BuildPackage.Literals.BUILD__BUILDMASTER ||
			childFeature == BuildPackage.Literals.BUILD__DEFAULT_MAIL_LIST;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return BuildEditPlugin.INSTANCE;
	}

}
