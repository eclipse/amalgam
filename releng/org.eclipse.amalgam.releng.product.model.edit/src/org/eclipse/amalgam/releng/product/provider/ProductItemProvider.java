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
 * $Id: ProductItemProvider.java,v 1.1 2008/11/24 20:38:54 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.amalgam.releng.product.Product;
import org.eclipse.amalgam.releng.product.ProductFactory;
import org.eclipse.amalgam.releng.product.ProductPackage;

import org.eclipse.amalgam.releng.product.product.provider.ProductEditPlugin;

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
 * This is the item provider adapter for a {@link org.eclipse.amalgam.releng.product.Product} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductItemProvider
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
	public ProductItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addIdPropertyDescriptor(object);
			addApplicationPropertyDescriptor(object);
			addUseFeaturesPropertyDescriptor(object);
			addVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Product_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Product_name_feature", "_UI_Product_type"),
				 ProductPackage.Literals.PRODUCT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Product_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Product_id_feature", "_UI_Product_type"),
				 ProductPackage.Literals.PRODUCT__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Application feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addApplicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Product_application_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Product_application_feature", "_UI_Product_type"),
				 ProductPackage.Literals.PRODUCT__APPLICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Features feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseFeaturesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Product_useFeatures_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Product_useFeatures_feature", "_UI_Product_type"),
				 ProductPackage.Literals.PRODUCT__USE_FEATURES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Product_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Product_version_feature", "_UI_Product_type"),
				 ProductPackage.Literals.PRODUCT__VERSION,
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
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__CONFIG_INI);
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__LAUNCHER_ARGS);
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__VM);
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__LAUNCHER);
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__SPLASH);
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__WINDOW_IMAGES);
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__ABOUT_INFO);
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__INTRO);
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__PLUGINS);
			childrenFeatures.add(ProductPackage.Literals.PRODUCT__FEATURES);
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
	 * This returns Product.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Product"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Product)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Product_type") :
			getString("_UI_Product_type") + " " + label;
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

		switch (notification.getFeatureID(Product.class)) {
			case ProductPackage.PRODUCT__NAME:
			case ProductPackage.PRODUCT__ID:
			case ProductPackage.PRODUCT__APPLICATION:
			case ProductPackage.PRODUCT__USE_FEATURES:
			case ProductPackage.PRODUCT__VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProductPackage.PRODUCT__CONFIG_INI:
			case ProductPackage.PRODUCT__LAUNCHER_ARGS:
			case ProductPackage.PRODUCT__VM:
			case ProductPackage.PRODUCT__LAUNCHER:
			case ProductPackage.PRODUCT__SPLASH:
			case ProductPackage.PRODUCT__WINDOW_IMAGES:
			case ProductPackage.PRODUCT__ABOUT_INFO:
			case ProductPackage.PRODUCT__INTRO:
			case ProductPackage.PRODUCT__PLUGINS:
			case ProductPackage.PRODUCT__FEATURES:
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
				(ProductPackage.Literals.PRODUCT__CONFIG_INI,
				 ProductFactory.eINSTANCE.createConfigIni()));

		newChildDescriptors.add
			(createChildParameter
				(ProductPackage.Literals.PRODUCT__LAUNCHER_ARGS,
				 ProductFactory.eINSTANCE.createLauncherArgs()));

		newChildDescriptors.add
			(createChildParameter
				(ProductPackage.Literals.PRODUCT__VM,
				 ProductFactory.eINSTANCE.createVirtualMachine()));

		newChildDescriptors.add
			(createChildParameter
				(ProductPackage.Literals.PRODUCT__LAUNCHER,
				 ProductFactory.eINSTANCE.createLauncher()));

		newChildDescriptors.add
			(createChildParameter
				(ProductPackage.Literals.PRODUCT__SPLASH,
				 ProductFactory.eINSTANCE.createSplash()));

		newChildDescriptors.add
			(createChildParameter
				(ProductPackage.Literals.PRODUCT__WINDOW_IMAGES,
				 ProductFactory.eINSTANCE.createWindowImage()));

		newChildDescriptors.add
			(createChildParameter
				(ProductPackage.Literals.PRODUCT__ABOUT_INFO,
				 ProductFactory.eINSTANCE.createAboutInfo()));

		newChildDescriptors.add
			(createChildParameter
				(ProductPackage.Literals.PRODUCT__INTRO,
				 ProductFactory.eINSTANCE.createIntro()));

		newChildDescriptors.add
			(createChildParameter
				(ProductPackage.Literals.PRODUCT__PLUGINS,
				 ProductFactory.eINSTANCE.createPlugins()));

		newChildDescriptors.add
			(createChildParameter
				(ProductPackage.Literals.PRODUCT__FEATURES,
				 ProductFactory.eINSTANCE.createFeatures()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ProductEditPlugin.INSTANCE;
	}

}
