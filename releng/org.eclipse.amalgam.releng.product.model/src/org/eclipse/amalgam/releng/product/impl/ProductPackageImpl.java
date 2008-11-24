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
 * $Id: ProductPackageImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.AboutInfo;
import org.eclipse.amalgam.releng.product.Bitmap;
import org.eclipse.amalgam.releng.product.ConfigIni;
import org.eclipse.amalgam.releng.product.Feature;
import org.eclipse.amalgam.releng.product.Features;
import org.eclipse.amalgam.releng.product.Icon;
import org.eclipse.amalgam.releng.product.Image;
import org.eclipse.amalgam.releng.product.Intro;
import org.eclipse.amalgam.releng.product.Launcher;
import org.eclipse.amalgam.releng.product.LauncherArgs;
import org.eclipse.amalgam.releng.product.LinuxIcon;
import org.eclipse.amalgam.releng.product.MacIcon;
import org.eclipse.amalgam.releng.product.Plugin;
import org.eclipse.amalgam.releng.product.Plugins;
import org.eclipse.amalgam.releng.product.Product;
import org.eclipse.amalgam.releng.product.ProductFactory;
import org.eclipse.amalgam.releng.product.ProductPackage;
import org.eclipse.amalgam.releng.product.SolarisIcon;
import org.eclipse.amalgam.releng.product.Splash;
import org.eclipse.amalgam.releng.product.VirtualMachine;
import org.eclipse.amalgam.releng.product.WinIcon;
import org.eclipse.amalgam.releng.product.WindowImage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProductPackageImpl extends EPackageImpl implements ProductPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configIniEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launcherArgsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass virtualMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass launcherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linuxIconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass macIconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solarisIconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitmapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass winIconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splashEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aboutInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass introEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featuresEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProductPackageImpl() {
		super(eNS_URI, ProductFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProductPackage init() {
		if (isInited) return (ProductPackage)EPackage.Registry.INSTANCE.getEPackage(ProductPackage.eNS_URI);

		// Obtain or create and register package
		ProductPackageImpl theProductPackage = (ProductPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ProductPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ProductPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theProductPackage.createPackageContents();

		// Initialize created meta-data
		theProductPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProductPackage.freeze();

		return theProductPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_ConfigIni() {
		return (EReference)productEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_LauncherArgs() {
		return (EReference)productEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Name() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Id() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Application() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_UseFeatures() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Vm() {
		return (EReference)productEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Launcher() {
		return (EReference)productEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Splash() {
		return (EReference)productEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_WindowImages() {
		return (EReference)productEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_AboutInfo() {
		return (EReference)productEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Intro() {
		return (EReference)productEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Plugins() {
		return (EReference)productEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProduct_Features() {
		return (EReference)productEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProduct_Version() {
		return (EAttribute)productEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigIni() {
		return configIniEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigIni_Use() {
		return (EAttribute)configIniEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigIni_Path() {
		return (EAttribute)configIniEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigIni_Linux() {
		return (EAttribute)configIniEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigIni_Macosx() {
		return (EAttribute)configIniEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigIni_Solaris() {
		return (EAttribute)configIniEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigIni_Win32() {
		return (EAttribute)configIniEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLauncherArgs() {
		return launcherArgsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_ProgramArgs() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_ProgramArgsLin() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_ProgramArgsMac() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_ProgramArgsSol() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_ProgramArgsWin() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_VmArgs() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_VmArgsLin() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_VmArgsMac() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_VmArgsSol() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncherArgs_VmArgsWin() {
		return (EAttribute)launcherArgsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlugin() {
		return pluginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Id() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlugin_Fragment() {
		return (EAttribute)pluginEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Id() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_Version() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVirtualMachine() {
		return virtualMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_Macos() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_Solaris() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_Linux() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVirtualMachine_Windows() {
		return (EAttribute)virtualMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLauncher() {
		return launcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLauncher_Name() {
		return (EAttribute)launcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLauncher_Linux() {
		return (EReference)launcherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLauncher_Macosx() {
		return (EReference)launcherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLauncher_Solaris() {
		return (EReference)launcherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLauncher_Win() {
		return (EReference)launcherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinuxIcon() {
		return linuxIconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinuxIcon_Icon() {
		return (EAttribute)linuxIconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMacIcon() {
		return macIconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMacIcon_Icon() {
		return (EAttribute)macIconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolarisIcon() {
		return solarisIconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolarisIcon_SolarisLarge() {
		return (EAttribute)solarisIconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolarisIcon_SolarisMedium() {
		return (EAttribute)solarisIconEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolarisIcon_SolarisSmall() {
		return (EAttribute)solarisIconEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolarisIcon_SolarisTiny() {
		return (EAttribute)solarisIconEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitmap() {
		return bitmapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmap_WinSmallHigh() {
		return (EAttribute)bitmapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmap_WinSmallLow() {
		return (EAttribute)bitmapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmap_WinMediumHigh() {
		return (EAttribute)bitmapEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmap_WinMediumLow() {
		return (EAttribute)bitmapEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmap_WinLargeHigh() {
		return (EAttribute)bitmapEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmap_WinLargeLow() {
		return (EAttribute)bitmapEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWinIcon() {
		return winIconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWinIcon_Bmp() {
		return (EReference)winIconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWinIcon_UseIco() {
		return (EAttribute)winIconEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWinIcon_Ico() {
		return (EReference)winIconEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIcon() {
		return iconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIcon_Path() {
		return (EAttribute)iconEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSplash() {
		return splashEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplash_Location() {
		return (EAttribute)splashEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplash_HandlerType() {
		return (EAttribute)splashEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplash_StartupProgressRect() {
		return (EAttribute)splashEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplash_StartupMessageRect() {
		return (EAttribute)splashEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSplash_StartupForegroundColor() {
		return (EAttribute)splashEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindowImage() {
		return windowImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowImage_I16() {
		return (EAttribute)windowImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowImage_I32() {
		return (EAttribute)windowImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowImage_I48() {
		return (EAttribute)windowImageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowImage_I64() {
		return (EAttribute)windowImageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindowImage_I128() {
		return (EAttribute)windowImageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAboutInfo() {
		return aboutInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAboutInfo_Text() {
		return (EAttribute)aboutInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAboutInfo_Image() {
		return (EReference)aboutInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Path() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntro() {
		return introEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntro_IntroId() {
		return (EAttribute)introEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlugins() {
		return pluginsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlugins_Plugin() {
		return (EReference)pluginsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatures() {
		return featuresEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatures_Feature() {
		return (EReference)featuresEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFactory getProductFactory() {
		return (ProductFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		productEClass = createEClass(PRODUCT);
		createEReference(productEClass, PRODUCT__CONFIG_INI);
		createEReference(productEClass, PRODUCT__LAUNCHER_ARGS);
		createEAttribute(productEClass, PRODUCT__NAME);
		createEAttribute(productEClass, PRODUCT__ID);
		createEAttribute(productEClass, PRODUCT__APPLICATION);
		createEAttribute(productEClass, PRODUCT__USE_FEATURES);
		createEReference(productEClass, PRODUCT__VM);
		createEReference(productEClass, PRODUCT__LAUNCHER);
		createEReference(productEClass, PRODUCT__SPLASH);
		createEReference(productEClass, PRODUCT__WINDOW_IMAGES);
		createEReference(productEClass, PRODUCT__ABOUT_INFO);
		createEReference(productEClass, PRODUCT__INTRO);
		createEReference(productEClass, PRODUCT__PLUGINS);
		createEReference(productEClass, PRODUCT__FEATURES);
		createEAttribute(productEClass, PRODUCT__VERSION);

		configIniEClass = createEClass(CONFIG_INI);
		createEAttribute(configIniEClass, CONFIG_INI__USE);
		createEAttribute(configIniEClass, CONFIG_INI__PATH);
		createEAttribute(configIniEClass, CONFIG_INI__LINUX);
		createEAttribute(configIniEClass, CONFIG_INI__MACOSX);
		createEAttribute(configIniEClass, CONFIG_INI__SOLARIS);
		createEAttribute(configIniEClass, CONFIG_INI__WIN32);

		launcherArgsEClass = createEClass(LAUNCHER_ARGS);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__PROGRAM_ARGS);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__PROGRAM_ARGS_LIN);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__PROGRAM_ARGS_MAC);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__PROGRAM_ARGS_SOL);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__PROGRAM_ARGS_WIN);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__VM_ARGS);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__VM_ARGS_LIN);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__VM_ARGS_MAC);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__VM_ARGS_SOL);
		createEAttribute(launcherArgsEClass, LAUNCHER_ARGS__VM_ARGS_WIN);

		pluginEClass = createEClass(PLUGIN);
		createEAttribute(pluginEClass, PLUGIN__ID);
		createEAttribute(pluginEClass, PLUGIN__FRAGMENT);

		featureEClass = createEClass(FEATURE);
		createEAttribute(featureEClass, FEATURE__ID);
		createEAttribute(featureEClass, FEATURE__VERSION);

		virtualMachineEClass = createEClass(VIRTUAL_MACHINE);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__MACOS);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__SOLARIS);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__LINUX);
		createEAttribute(virtualMachineEClass, VIRTUAL_MACHINE__WINDOWS);

		launcherEClass = createEClass(LAUNCHER);
		createEAttribute(launcherEClass, LAUNCHER__NAME);
		createEReference(launcherEClass, LAUNCHER__LINUX);
		createEReference(launcherEClass, LAUNCHER__MACOSX);
		createEReference(launcherEClass, LAUNCHER__SOLARIS);
		createEReference(launcherEClass, LAUNCHER__WIN);

		linuxIconEClass = createEClass(LINUX_ICON);
		createEAttribute(linuxIconEClass, LINUX_ICON__ICON);

		macIconEClass = createEClass(MAC_ICON);
		createEAttribute(macIconEClass, MAC_ICON__ICON);

		solarisIconEClass = createEClass(SOLARIS_ICON);
		createEAttribute(solarisIconEClass, SOLARIS_ICON__SOLARIS_LARGE);
		createEAttribute(solarisIconEClass, SOLARIS_ICON__SOLARIS_MEDIUM);
		createEAttribute(solarisIconEClass, SOLARIS_ICON__SOLARIS_SMALL);
		createEAttribute(solarisIconEClass, SOLARIS_ICON__SOLARIS_TINY);

		bitmapEClass = createEClass(BITMAP);
		createEAttribute(bitmapEClass, BITMAP__WIN_SMALL_HIGH);
		createEAttribute(bitmapEClass, BITMAP__WIN_SMALL_LOW);
		createEAttribute(bitmapEClass, BITMAP__WIN_MEDIUM_HIGH);
		createEAttribute(bitmapEClass, BITMAP__WIN_MEDIUM_LOW);
		createEAttribute(bitmapEClass, BITMAP__WIN_LARGE_HIGH);
		createEAttribute(bitmapEClass, BITMAP__WIN_LARGE_LOW);

		winIconEClass = createEClass(WIN_ICON);
		createEReference(winIconEClass, WIN_ICON__BMP);
		createEAttribute(winIconEClass, WIN_ICON__USE_ICO);
		createEReference(winIconEClass, WIN_ICON__ICO);

		iconEClass = createEClass(ICON);
		createEAttribute(iconEClass, ICON__PATH);

		splashEClass = createEClass(SPLASH);
		createEAttribute(splashEClass, SPLASH__LOCATION);
		createEAttribute(splashEClass, SPLASH__HANDLER_TYPE);
		createEAttribute(splashEClass, SPLASH__STARTUP_PROGRESS_RECT);
		createEAttribute(splashEClass, SPLASH__STARTUP_MESSAGE_RECT);
		createEAttribute(splashEClass, SPLASH__STARTUP_FOREGROUND_COLOR);

		windowImageEClass = createEClass(WINDOW_IMAGE);
		createEAttribute(windowImageEClass, WINDOW_IMAGE__I16);
		createEAttribute(windowImageEClass, WINDOW_IMAGE__I32);
		createEAttribute(windowImageEClass, WINDOW_IMAGE__I48);
		createEAttribute(windowImageEClass, WINDOW_IMAGE__I64);
		createEAttribute(windowImageEClass, WINDOW_IMAGE__I128);

		aboutInfoEClass = createEClass(ABOUT_INFO);
		createEAttribute(aboutInfoEClass, ABOUT_INFO__TEXT);
		createEReference(aboutInfoEClass, ABOUT_INFO__IMAGE);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__PATH);

		introEClass = createEClass(INTRO);
		createEAttribute(introEClass, INTRO__INTRO_ID);

		pluginsEClass = createEClass(PLUGINS);
		createEReference(pluginsEClass, PLUGINS__PLUGIN);

		featuresEClass = createEClass(FEATURES);
		createEReference(featuresEClass, FEATURES__FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProduct_ConfigIni(), this.getConfigIni(), null, "configIni", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_LauncherArgs(), this.getLauncherArgs(), null, "launcherArgs", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Id(), theXMLTypePackage.getString(), "id", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Application(), theXMLTypePackage.getString(), "application", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_UseFeatures(), theXMLTypePackage.getBoolean(), "useFeatures", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Vm(), this.getVirtualMachine(), null, "vm", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Launcher(), this.getLauncher(), null, "launcher", null, 1, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Splash(), this.getSplash(), null, "splash", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_WindowImages(), this.getWindowImage(), null, "windowImages", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_AboutInfo(), this.getAboutInfo(), null, "aboutInfo", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Intro(), this.getIntro(), null, "intro", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Plugins(), this.getPlugins(), null, "plugins", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProduct_Features(), this.getFeatures(), null, "features", null, 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProduct_Version(), theXMLTypePackage.getString(), "version", "", 0, 1, Product.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configIniEClass, ConfigIni.class, "ConfigIni", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigIni_Use(), theXMLTypePackage.getString(), "use", "", 0, 1, ConfigIni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigIni_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, ConfigIni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigIni_Linux(), ecorePackage.getEString(), "linux", null, 0, 1, ConfigIni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigIni_Macosx(), ecorePackage.getEString(), "macosx", null, 0, 1, ConfigIni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigIni_Solaris(), ecorePackage.getEString(), "solaris", null, 0, 1, ConfigIni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfigIni_Win32(), ecorePackage.getEString(), "win32", null, 0, 1, ConfigIni.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(launcherArgsEClass, LauncherArgs.class, "LauncherArgs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLauncherArgs_ProgramArgs(), ecorePackage.getEString(), "programArgs", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncherArgs_ProgramArgsLin(), ecorePackage.getEString(), "programArgsLin", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncherArgs_ProgramArgsMac(), ecorePackage.getEString(), "programArgsMac", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncherArgs_ProgramArgsSol(), ecorePackage.getEString(), "programArgsSol", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncherArgs_ProgramArgsWin(), ecorePackage.getEString(), "programArgsWin", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncherArgs_VmArgs(), ecorePackage.getEString(), "vmArgs", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncherArgs_VmArgsLin(), ecorePackage.getEString(), "vmArgsLin", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncherArgs_VmArgsMac(), ecorePackage.getEString(), "vmArgsMac", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncherArgs_VmArgsSol(), ecorePackage.getEString(), "vmArgsSol", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLauncherArgs_VmArgsWin(), ecorePackage.getEString(), "vmArgsWin", null, 0, 1, LauncherArgs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginEClass, Plugin.class, "Plugin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlugin_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlugin_Fragment(), theXMLTypePackage.getBoolean(), "fragment", "false", 0, 1, Plugin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFeature_Id(), theXMLTypePackage.getString(), "id", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(virtualMachineEClass, VirtualMachine.class, "VirtualMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVirtualMachine_Macos(), ecorePackage.getEString(), "macos", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_Solaris(), ecorePackage.getEString(), "solaris", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_Linux(), ecorePackage.getEString(), "linux", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVirtualMachine_Windows(), ecorePackage.getEString(), "windows", null, 0, 1, VirtualMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(launcherEClass, Launcher.class, "Launcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLauncher_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLauncher_Linux(), this.getLinuxIcon(), null, "linux", null, 0, 1, Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLauncher_Macosx(), this.getMacIcon(), null, "macosx", null, 0, 1, Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLauncher_Solaris(), this.getSolarisIcon(), null, "solaris", null, 0, 1, Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLauncher_Win(), this.getWinIcon(), null, "win", null, 0, 1, Launcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linuxIconEClass, LinuxIcon.class, "LinuxIcon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinuxIcon_Icon(), theXMLTypePackage.getString(), "icon", null, 0, 1, LinuxIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(macIconEClass, MacIcon.class, "MacIcon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMacIcon_Icon(), theXMLTypePackage.getString(), "icon", null, 0, 1, MacIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solarisIconEClass, SolarisIcon.class, "SolarisIcon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolarisIcon_SolarisLarge(), theXMLTypePackage.getString(), "solarisLarge", null, 0, 1, SolarisIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolarisIcon_SolarisMedium(), theXMLTypePackage.getString(), "solarisMedium", null, 0, 1, SolarisIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolarisIcon_SolarisSmall(), theXMLTypePackage.getString(), "solarisSmall", null, 0, 1, SolarisIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolarisIcon_SolarisTiny(), theXMLTypePackage.getString(), "solarisTiny", null, 0, 1, SolarisIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitmapEClass, Bitmap.class, "Bitmap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitmap_WinSmallHigh(), theXMLTypePackage.getString(), "winSmallHigh", null, 0, 1, Bitmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmap_WinSmallLow(), theXMLTypePackage.getString(), "winSmallLow", null, 0, 1, Bitmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmap_WinMediumHigh(), theXMLTypePackage.getString(), "winMediumHigh", null, 0, 1, Bitmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmap_WinMediumLow(), theXMLTypePackage.getString(), "winMediumLow", null, 0, 1, Bitmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmap_WinLargeHigh(), theXMLTypePackage.getString(), "winLargeHigh", null, 0, 1, Bitmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmap_WinLargeLow(), theXMLTypePackage.getString(), "winLargeLow", null, 0, 1, Bitmap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(winIconEClass, WinIcon.class, "WinIcon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWinIcon_Bmp(), this.getBitmap(), null, "bmp", null, 0, 1, WinIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWinIcon_UseIco(), theXMLTypePackage.getBoolean(), "useIco", null, 0, 1, WinIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWinIcon_Ico(), this.getIcon(), null, "ico", null, 0, 1, WinIcon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconEClass, Icon.class, "Icon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIcon_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, Icon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(splashEClass, Splash.class, "Splash", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSplash_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, Splash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSplash_HandlerType(), theXMLTypePackage.getString(), "handlerType", null, 0, 1, Splash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSplash_StartupProgressRect(), theXMLTypePackage.getString(), "startupProgressRect", null, 0, 1, Splash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSplash_StartupMessageRect(), theXMLTypePackage.getString(), "startupMessageRect", null, 0, 1, Splash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSplash_StartupForegroundColor(), theXMLTypePackage.getString(), "startupForegroundColor", null, 0, 1, Splash.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowImageEClass, WindowImage.class, "WindowImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindowImage_I16(), theXMLTypePackage.getString(), "i16", null, 0, 1, WindowImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowImage_I32(), theXMLTypePackage.getString(), "i32", null, 0, 1, WindowImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowImage_I48(), theXMLTypePackage.getString(), "i48", null, 0, 1, WindowImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowImage_I64(), theXMLTypePackage.getString(), "i64", null, 0, 1, WindowImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWindowImage_I128(), theXMLTypePackage.getString(), "i128", null, 0, 1, WindowImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aboutInfoEClass, AboutInfo.class, "AboutInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAboutInfo_Text(), ecorePackage.getEString(), "text", null, 0, 1, AboutInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAboutInfo_Image(), this.getImage(), null, "image", null, 0, 1, AboutInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Path(), theXMLTypePackage.getString(), "path", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(introEClass, Intro.class, "Intro", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntro_IntroId(), theXMLTypePackage.getString(), "introId", null, 0, 1, Intro.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginsEClass, Plugins.class, "Plugins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlugins_Plugin(), this.getPlugin(), null, "plugin", null, 0, -1, Plugins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featuresEClass, Features.class, "Features", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatures_Feature(), this.getFeature(), null, "feature", null, 0, -1, Features.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (productEClass, 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "product"
		   });		
		addAnnotation
		  (getConfigIni_Linux(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "linux",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConfigIni_Macosx(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "macosx",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConfigIni_Solaris(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "solaris",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConfigIni_Win32(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "win32",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_ProgramArgs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programArgs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_ProgramArgsLin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programArgsLin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_ProgramArgsMac(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programArgsMac",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_ProgramArgsSol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programArgsSol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_ProgramArgsWin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programArgsWin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_VmArgs(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vmArgs",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_VmArgsLin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vmArgsLin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_VmArgsMac(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vmArgsMac",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_VmArgsSol(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vmArgsSol",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLauncherArgs_VmArgsWin(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vmArgsWin",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (pluginEClass, 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "plugin"
		   });		
		addAnnotation
		  (featureEClass, 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "feature"
		   });		
		addAnnotation
		  (getVirtualMachine_Macos(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "macos",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getVirtualMachine_Solaris(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "solaris",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getVirtualMachine_Linux(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "linux",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getVirtualMachine_Windows(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "windows",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAboutInfo_Text(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "text",
			 "namespace", "##targetNamespace"
		   });
	}

} //ProductPackageImpl
