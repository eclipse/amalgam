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
 * $Id: ProductItemProviderAdapterFactory.java,v 1.1 2008/11/24 20:38:53 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.amalgam.releng.product.util.ProductAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductItemProviderAdapterFactory extends ProductAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if (productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.ConfigIni} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigIniItemProvider configIniItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.ConfigIni}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigIniAdapter() {
		if (configIniItemProvider == null) {
			configIniItemProvider = new ConfigIniItemProvider(this);
		}

		return configIniItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.LauncherArgs} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LauncherArgsItemProvider launcherArgsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.LauncherArgs}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLauncherArgsAdapter() {
		if (launcherArgsItemProvider == null) {
			launcherArgsItemProvider = new LauncherArgsItemProvider(this);
		}

		return launcherArgsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Plugin} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginItemProvider pluginItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Plugin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPluginAdapter() {
		if (pluginItemProvider == null) {
			pluginItemProvider = new PluginItemProvider(this);
		}

		return pluginItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Feature} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureItemProvider featureItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeatureAdapter() {
		if (featureItemProvider == null) {
			featureItemProvider = new FeatureItemProvider(this);
		}

		return featureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.VirtualMachine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineItemProvider virtualMachineItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.VirtualMachine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVirtualMachineAdapter() {
		if (virtualMachineItemProvider == null) {
			virtualMachineItemProvider = new VirtualMachineItemProvider(this);
		}

		return virtualMachineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Launcher} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LauncherItemProvider launcherItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Launcher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLauncherAdapter() {
		if (launcherItemProvider == null) {
			launcherItemProvider = new LauncherItemProvider(this);
		}

		return launcherItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.LinuxIcon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinuxIconItemProvider linuxIconItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.LinuxIcon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLinuxIconAdapter() {
		if (linuxIconItemProvider == null) {
			linuxIconItemProvider = new LinuxIconItemProvider(this);
		}

		return linuxIconItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.MacIcon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MacIconItemProvider macIconItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.MacIcon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMacIconAdapter() {
		if (macIconItemProvider == null) {
			macIconItemProvider = new MacIconItemProvider(this);
		}

		return macIconItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.SolarisIcon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolarisIconItemProvider solarisIconItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.SolarisIcon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSolarisIconAdapter() {
		if (solarisIconItemProvider == null) {
			solarisIconItemProvider = new SolarisIconItemProvider(this);
		}

		return solarisIconItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Bitmap} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitmapItemProvider bitmapItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Bitmap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBitmapAdapter() {
		if (bitmapItemProvider == null) {
			bitmapItemProvider = new BitmapItemProvider(this);
		}

		return bitmapItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.WinIcon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WinIconItemProvider winIconItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.WinIcon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWinIconAdapter() {
		if (winIconItemProvider == null) {
			winIconItemProvider = new WinIconItemProvider(this);
		}

		return winIconItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Icon} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IconItemProvider iconItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Icon}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIconAdapter() {
		if (iconItemProvider == null) {
			iconItemProvider = new IconItemProvider(this);
		}

		return iconItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Splash} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplashItemProvider splashItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Splash}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSplashAdapter() {
		if (splashItemProvider == null) {
			splashItemProvider = new SplashItemProvider(this);
		}

		return splashItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.WindowImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowImageItemProvider windowImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.WindowImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWindowImageAdapter() {
		if (windowImageItemProvider == null) {
			windowImageItemProvider = new WindowImageItemProvider(this);
		}

		return windowImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.AboutInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AboutInfoItemProvider aboutInfoItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.AboutInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAboutInfoAdapter() {
		if (aboutInfoItemProvider == null) {
			aboutInfoItemProvider = new AboutInfoItemProvider(this);
		}

		return aboutInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter() {
		if (imageItemProvider == null) {
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Intro} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntroItemProvider introItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Intro}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIntroAdapter() {
		if (introItemProvider == null) {
			introItemProvider = new IntroItemProvider(this);
		}

		return introItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Plugins} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PluginsItemProvider pluginsItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Plugins}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPluginsAdapter() {
		if (pluginsItemProvider == null) {
			pluginsItemProvider = new PluginsItemProvider(this);
		}

		return pluginsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.amalgam.releng.product.Features} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturesItemProvider featuresItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.amalgam.releng.product.Features}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFeaturesAdapter() {
		if (featuresItemProvider == null) {
			featuresItemProvider = new FeaturesItemProvider(this);
		}

		return featuresItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (productItemProvider != null) productItemProvider.dispose();
		if (configIniItemProvider != null) configIniItemProvider.dispose();
		if (launcherArgsItemProvider != null) launcherArgsItemProvider.dispose();
		if (pluginItemProvider != null) pluginItemProvider.dispose();
		if (featureItemProvider != null) featureItemProvider.dispose();
		if (virtualMachineItemProvider != null) virtualMachineItemProvider.dispose();
		if (launcherItemProvider != null) launcherItemProvider.dispose();
		if (linuxIconItemProvider != null) linuxIconItemProvider.dispose();
		if (macIconItemProvider != null) macIconItemProvider.dispose();
		if (solarisIconItemProvider != null) solarisIconItemProvider.dispose();
		if (bitmapItemProvider != null) bitmapItemProvider.dispose();
		if (winIconItemProvider != null) winIconItemProvider.dispose();
		if (iconItemProvider != null) iconItemProvider.dispose();
		if (splashItemProvider != null) splashItemProvider.dispose();
		if (windowImageItemProvider != null) windowImageItemProvider.dispose();
		if (aboutInfoItemProvider != null) aboutInfoItemProvider.dispose();
		if (imageItemProvider != null) imageItemProvider.dispose();
		if (introItemProvider != null) introItemProvider.dispose();
		if (pluginsItemProvider != null) pluginsItemProvider.dispose();
		if (featuresItemProvider != null) featuresItemProvider.dispose();
	}

}