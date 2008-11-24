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
 * $Id: ProductFactoryImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductFactoryImpl extends EFactoryImpl implements ProductFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProductFactory init() {
		try {
			ProductFactory theProductFactory = (ProductFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/amalgam/2008/product"); 
			if (theProductFactory != null) {
				return theProductFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProductFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ProductPackage.PRODUCT: return createProduct();
			case ProductPackage.CONFIG_INI: return createConfigIni();
			case ProductPackage.LAUNCHER_ARGS: return createLauncherArgs();
			case ProductPackage.PLUGIN: return createPlugin();
			case ProductPackage.FEATURE: return createFeature();
			case ProductPackage.VIRTUAL_MACHINE: return createVirtualMachine();
			case ProductPackage.LAUNCHER: return createLauncher();
			case ProductPackage.LINUX_ICON: return createLinuxIcon();
			case ProductPackage.MAC_ICON: return createMacIcon();
			case ProductPackage.SOLARIS_ICON: return createSolarisIcon();
			case ProductPackage.BITMAP: return createBitmap();
			case ProductPackage.WIN_ICON: return createWinIcon();
			case ProductPackage.ICON: return createIcon();
			case ProductPackage.SPLASH: return createSplash();
			case ProductPackage.WINDOW_IMAGE: return createWindowImage();
			case ProductPackage.ABOUT_INFO: return createAboutInfo();
			case ProductPackage.IMAGE: return createImage();
			case ProductPackage.INTRO: return createIntro();
			case ProductPackage.PLUGINS: return createPlugins();
			case ProductPackage.FEATURES: return createFeatures();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigIni createConfigIni() {
		ConfigIniImpl configIni = new ConfigIniImpl();
		return configIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LauncherArgs createLauncherArgs() {
		LauncherArgsImpl launcherArgs = new LauncherArgsImpl();
		return launcherArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugin createPlugin() {
		PluginImpl plugin = new PluginImpl();
		return plugin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine createVirtualMachine() {
		VirtualMachineImpl virtualMachine = new VirtualMachineImpl();
		return virtualMachine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Launcher createLauncher() {
		LauncherImpl launcher = new LauncherImpl();
		return launcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxIcon createLinuxIcon() {
		LinuxIconImpl linuxIcon = new LinuxIconImpl();
		return linuxIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacIcon createMacIcon() {
		MacIconImpl macIcon = new MacIconImpl();
		return macIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolarisIcon createSolarisIcon() {
		SolarisIconImpl solarisIcon = new SolarisIconImpl();
		return solarisIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bitmap createBitmap() {
		BitmapImpl bitmap = new BitmapImpl();
		return bitmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WinIcon createWinIcon() {
		WinIconImpl winIcon = new WinIconImpl();
		return winIcon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Splash createSplash() {
		SplashImpl splash = new SplashImpl();
		return splash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowImage createWindowImage() {
		WindowImageImpl windowImage = new WindowImageImpl();
		return windowImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AboutInfo createAboutInfo() {
		AboutInfoImpl aboutInfo = new AboutInfoImpl();
		return aboutInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intro createIntro() {
		IntroImpl intro = new IntroImpl();
		return intro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugins createPlugins() {
		PluginsImpl plugins = new PluginsImpl();
		return plugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Features createFeatures() {
		FeaturesImpl features = new FeaturesImpl();
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductPackage getProductPackage() {
		return (ProductPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProductPackage getPackage() {
		return ProductPackage.eINSTANCE;
	}

} //ProductFactoryImpl
