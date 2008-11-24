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
 * $Id: LauncherArgsItemProvider.java,v 1.1 2008/11/24 20:38:53 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.amalgam.releng.product.LauncherArgs;
import org.eclipse.amalgam.releng.product.ProductPackage;

import org.eclipse.amalgam.releng.product.product.provider.ProductEditPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link org.eclipse.amalgam.releng.product.LauncherArgs} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LauncherArgsItemProvider
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
	public LauncherArgsItemProvider(AdapterFactory adapterFactory) {
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

			addProgramArgsPropertyDescriptor(object);
			addProgramArgsLinPropertyDescriptor(object);
			addProgramArgsMacPropertyDescriptor(object);
			addProgramArgsSolPropertyDescriptor(object);
			addProgramArgsWinPropertyDescriptor(object);
			addVmArgsPropertyDescriptor(object);
			addVmArgsLinPropertyDescriptor(object);
			addVmArgsMacPropertyDescriptor(object);
			addVmArgsSolPropertyDescriptor(object);
			addVmArgsWinPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Program Args feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgramArgsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_programArgs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_programArgs_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__PROGRAM_ARGS,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Program Args Lin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgramArgsLinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_programArgsLin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_programArgsLin_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__PROGRAM_ARGS_LIN,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Program Args Mac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgramArgsMacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_programArgsMac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_programArgsMac_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__PROGRAM_ARGS_MAC,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Program Args Sol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgramArgsSolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_programArgsSol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_programArgsSol_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__PROGRAM_ARGS_SOL,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Program Args Win feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProgramArgsWinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_programArgsWin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_programArgsWin_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__PROGRAM_ARGS_WIN,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vm Args feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVmArgsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_vmArgs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_vmArgs_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__VM_ARGS,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vm Args Lin feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVmArgsLinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_vmArgsLin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_vmArgsLin_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__VM_ARGS_LIN,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vm Args Mac feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVmArgsMacPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_vmArgsMac_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_vmArgsMac_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__VM_ARGS_MAC,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vm Args Sol feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVmArgsSolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_vmArgsSol_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_vmArgsSol_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__VM_ARGS_SOL,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vm Args Win feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVmArgsWinPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LauncherArgs_vmArgsWin_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LauncherArgs_vmArgsWin_feature", "_UI_LauncherArgs_type"),
				 ProductPackage.Literals.LAUNCHER_ARGS__VM_ARGS_WIN,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LauncherArgs.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LauncherArgs"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = crop(((LauncherArgs)object).getProgramArgs());
		return label == null || label.length() == 0 ?
			getString("_UI_LauncherArgs_type") :
			getString("_UI_LauncherArgs_type") + " " + label;
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

		switch (notification.getFeatureID(LauncherArgs.class)) {
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS:
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_LIN:
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_MAC:
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_SOL:
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_WIN:
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS:
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_LIN:
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_MAC:
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_SOL:
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_WIN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
