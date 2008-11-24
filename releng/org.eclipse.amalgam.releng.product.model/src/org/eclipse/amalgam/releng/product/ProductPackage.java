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
 * $Id: ProductPackage.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.releng.product.ProductFactory
 * @model kind="package"
 * @generated
 */
public interface ProductPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "product";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/amalgam/2008/product";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProductPackage eINSTANCE = org.eclipse.amalgam.releng.product.impl.ProductPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.ProductImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 0;

	/**
	 * The feature id for the '<em><b>Config Ini</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__CONFIG_INI = 0;

	/**
	 * The feature id for the '<em><b>Launcher Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LAUNCHER_ARGS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = 3;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__APPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Use Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__USE_FEATURES = 5;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VM = 6;

	/**
	 * The feature id for the '<em><b>Launcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__LAUNCHER = 7;

	/**
	 * The feature id for the '<em><b>Splash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__SPLASH = 8;

	/**
	 * The feature id for the '<em><b>Window Images</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__WINDOW_IMAGES = 9;

	/**
	 * The feature id for the '<em><b>About Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ABOUT_INFO = 10;

	/**
	 * The feature id for the '<em><b>Intro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__INTRO = 11;

	/**
	 * The feature id for the '<em><b>Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__PLUGINS = 12;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__FEATURES = 13;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VERSION = 14;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.ConfigIniImpl <em>Config Ini</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.ConfigIniImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getConfigIni()
	 * @generated
	 */
	int CONFIG_INI = 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_INI__USE = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_INI__PATH = 1;

	/**
	 * The feature id for the '<em><b>Linux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_INI__LINUX = 2;

	/**
	 * The feature id for the '<em><b>Macosx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_INI__MACOSX = 3;

	/**
	 * The feature id for the '<em><b>Solaris</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_INI__SOLARIS = 4;

	/**
	 * The feature id for the '<em><b>Win32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_INI__WIN32 = 5;

	/**
	 * The number of structural features of the '<em>Config Ini</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_INI_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl <em>Launcher Args</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getLauncherArgs()
	 * @generated
	 */
	int LAUNCHER_ARGS = 2;

	/**
	 * The feature id for the '<em><b>Program Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__PROGRAM_ARGS = 0;

	/**
	 * The feature id for the '<em><b>Program Args Lin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__PROGRAM_ARGS_LIN = 1;

	/**
	 * The feature id for the '<em><b>Program Args Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__PROGRAM_ARGS_MAC = 2;

	/**
	 * The feature id for the '<em><b>Program Args Sol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__PROGRAM_ARGS_SOL = 3;

	/**
	 * The feature id for the '<em><b>Program Args Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__PROGRAM_ARGS_WIN = 4;

	/**
	 * The feature id for the '<em><b>Vm Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__VM_ARGS = 5;

	/**
	 * The feature id for the '<em><b>Vm Args Lin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__VM_ARGS_LIN = 6;

	/**
	 * The feature id for the '<em><b>Vm Args Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__VM_ARGS_MAC = 7;

	/**
	 * The feature id for the '<em><b>Vm Args Sol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__VM_ARGS_SOL = 8;

	/**
	 * The feature id for the '<em><b>Vm Args Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS__VM_ARGS_WIN = 9;

	/**
	 * The number of structural features of the '<em>Launcher Args</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_ARGS_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.PluginImpl <em>Plugin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.PluginImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getPlugin()
	 * @generated
	 */
	int PLUGIN = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__ID = 0;

	/**
	 * The feature id for the '<em><b>Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN__FRAGMENT = 1;

	/**
	 * The number of structural features of the '<em>Plugin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGIN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.FeatureImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.VirtualMachineImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getVirtualMachine()
	 * @generated
	 */
	int VIRTUAL_MACHINE = 5;

	/**
	 * The feature id for the '<em><b>Macos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__MACOS = 0;

	/**
	 * The feature id for the '<em><b>Solaris</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__SOLARIS = 1;

	/**
	 * The feature id for the '<em><b>Linux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__LINUX = 2;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE__WINDOWS = 3;

	/**
	 * The number of structural features of the '<em>Virtual Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIRTUAL_MACHINE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.LauncherImpl <em>Launcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.LauncherImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getLauncher()
	 * @generated
	 */
	int LAUNCHER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Linux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__LINUX = 1;

	/**
	 * The feature id for the '<em><b>Macosx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__MACOSX = 2;

	/**
	 * The feature id for the '<em><b>Solaris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__SOLARIS = 3;

	/**
	 * The feature id for the '<em><b>Win</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER__WIN = 4;

	/**
	 * The number of structural features of the '<em>Launcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAUNCHER_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.LinuxIconImpl <em>Linux Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.LinuxIconImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getLinuxIcon()
	 * @generated
	 */
	int LINUX_ICON = 7;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_ICON__ICON = 0;

	/**
	 * The number of structural features of the '<em>Linux Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINUX_ICON_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.MacIconImpl <em>Mac Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.MacIconImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getMacIcon()
	 * @generated
	 */
	int MAC_ICON = 8;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ICON__ICON = 0;

	/**
	 * The number of structural features of the '<em>Mac Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAC_ICON_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.SolarisIconImpl <em>Solaris Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.SolarisIconImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getSolarisIcon()
	 * @generated
	 */
	int SOLARIS_ICON = 9;

	/**
	 * The feature id for the '<em><b>Solaris Large</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLARIS_ICON__SOLARIS_LARGE = 0;

	/**
	 * The feature id for the '<em><b>Solaris Medium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLARIS_ICON__SOLARIS_MEDIUM = 1;

	/**
	 * The feature id for the '<em><b>Solaris Small</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLARIS_ICON__SOLARIS_SMALL = 2;

	/**
	 * The feature id for the '<em><b>Solaris Tiny</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLARIS_ICON__SOLARIS_TINY = 3;

	/**
	 * The number of structural features of the '<em>Solaris Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLARIS_ICON_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.BitmapImpl <em>Bitmap</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.BitmapImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getBitmap()
	 * @generated
	 */
	int BITMAP = 10;

	/**
	 * The feature id for the '<em><b>Win Small High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__WIN_SMALL_HIGH = 0;

	/**
	 * The feature id for the '<em><b>Win Small Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__WIN_SMALL_LOW = 1;

	/**
	 * The feature id for the '<em><b>Win Medium High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__WIN_MEDIUM_HIGH = 2;

	/**
	 * The feature id for the '<em><b>Win Medium Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__WIN_MEDIUM_LOW = 3;

	/**
	 * The feature id for the '<em><b>Win Large High</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__WIN_LARGE_HIGH = 4;

	/**
	 * The feature id for the '<em><b>Win Large Low</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP__WIN_LARGE_LOW = 5;

	/**
	 * The number of structural features of the '<em>Bitmap</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BITMAP_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.WinIconImpl <em>Win Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.WinIconImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getWinIcon()
	 * @generated
	 */
	int WIN_ICON = 11;

	/**
	 * The feature id for the '<em><b>Bmp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_ICON__BMP = 0;

	/**
	 * The feature id for the '<em><b>Use Ico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_ICON__USE_ICO = 1;

	/**
	 * The feature id for the '<em><b>Ico</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_ICON__ICO = 2;

	/**
	 * The number of structural features of the '<em>Win Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIN_ICON_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.IconImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 12;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__PATH = 0;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.SplashImpl <em>Splash</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.SplashImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getSplash()
	 * @generated
	 */
	int SPLASH = 13;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLASH__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Handler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLASH__HANDLER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Startup Progress Rect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLASH__STARTUP_PROGRESS_RECT = 2;

	/**
	 * The feature id for the '<em><b>Startup Message Rect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLASH__STARTUP_MESSAGE_RECT = 3;

	/**
	 * The feature id for the '<em><b>Startup Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLASH__STARTUP_FOREGROUND_COLOR = 4;

	/**
	 * The number of structural features of the '<em>Splash</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLASH_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.WindowImageImpl <em>Window Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.WindowImageImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getWindowImage()
	 * @generated
	 */
	int WINDOW_IMAGE = 14;

	/**
	 * The feature id for the '<em><b>I16</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_IMAGE__I16 = 0;

	/**
	 * The feature id for the '<em><b>I32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_IMAGE__I32 = 1;

	/**
	 * The feature id for the '<em><b>I48</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_IMAGE__I48 = 2;

	/**
	 * The feature id for the '<em><b>I64</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_IMAGE__I64 = 3;

	/**
	 * The feature id for the '<em><b>I128</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_IMAGE__I128 = 4;

	/**
	 * The number of structural features of the '<em>Window Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_IMAGE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.AboutInfoImpl <em>About Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.AboutInfoImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getAboutInfo()
	 * @generated
	 */
	int ABOUT_INFO = 15;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_INFO__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_INFO__IMAGE = 1;

	/**
	 * The number of structural features of the '<em>About Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOUT_INFO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.ImageImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 16;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__PATH = 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.IntroImpl <em>Intro</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.IntroImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getIntro()
	 * @generated
	 */
	int INTRO = 17;

	/**
	 * The feature id for the '<em><b>Intro Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRO__INTRO_ID = 0;

	/**
	 * The number of structural features of the '<em>Intro</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTRO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.PluginsImpl <em>Plugins</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.PluginsImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getPlugins()
	 * @generated
	 */
	int PLUGINS = 18;

	/**
	 * The feature id for the '<em><b>Plugin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS__PLUGIN = 0;

	/**
	 * The number of structural features of the '<em>Plugins</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUGINS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.product.impl.FeaturesImpl <em>Features</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.product.impl.FeaturesImpl
	 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getFeatures()
	 * @generated
	 */
	int FEATURES = 19;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Features</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getConfigIni <em>Config Ini</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Config Ini</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getConfigIni()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_ConfigIni();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getLauncherArgs <em>Launcher Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Launcher Args</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getLauncherArgs()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_LauncherArgs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Product#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getName()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Product#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getId()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Product#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getApplication()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Application();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Product#isUseFeatures <em>Use Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Features</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#isUseFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_UseFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getVm()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Vm();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getLauncher <em>Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Launcher</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getLauncher()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Launcher();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getSplash <em>Splash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Splash</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getSplash()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Splash();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getWindowImages <em>Window Images</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Window Images</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getWindowImages()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_WindowImages();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getAboutInfo <em>About Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>About Info</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getAboutInfo()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_AboutInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getIntro <em>Intro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intro</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getIntro()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Intro();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getPlugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plugins</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getPlugins()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Plugins();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Product#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getFeatures()
	 * @see #getProduct()
	 * @generated
	 */
	EReference getProduct_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Product#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.amalgam.releng.product.Product#getVersion()
	 * @see #getProduct()
	 * @generated
	 */
	EAttribute getProduct_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.ConfigIni <em>Config Ini</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config Ini</em>'.
	 * @see org.eclipse.amalgam.releng.product.ConfigIni
	 * @generated
	 */
	EClass getConfigIni();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.ConfigIni#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use</em>'.
	 * @see org.eclipse.amalgam.releng.product.ConfigIni#getUse()
	 * @see #getConfigIni()
	 * @generated
	 */
	EAttribute getConfigIni_Use();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.ConfigIni#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.amalgam.releng.product.ConfigIni#getPath()
	 * @see #getConfigIni()
	 * @generated
	 */
	EAttribute getConfigIni_Path();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.ConfigIni#getLinux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linux</em>'.
	 * @see org.eclipse.amalgam.releng.product.ConfigIni#getLinux()
	 * @see #getConfigIni()
	 * @generated
	 */
	EAttribute getConfigIni_Linux();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.ConfigIni#getMacosx <em>Macosx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macosx</em>'.
	 * @see org.eclipse.amalgam.releng.product.ConfigIni#getMacosx()
	 * @see #getConfigIni()
	 * @generated
	 */
	EAttribute getConfigIni_Macosx();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.ConfigIni#getSolaris <em>Solaris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solaris</em>'.
	 * @see org.eclipse.amalgam.releng.product.ConfigIni#getSolaris()
	 * @see #getConfigIni()
	 * @generated
	 */
	EAttribute getConfigIni_Solaris();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.ConfigIni#getWin32 <em>Win32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win32</em>'.
	 * @see org.eclipse.amalgam.releng.product.ConfigIni#getWin32()
	 * @see #getConfigIni()
	 * @generated
	 */
	EAttribute getConfigIni_Win32();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.LauncherArgs <em>Launcher Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launcher Args</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs
	 * @generated
	 */
	EClass getLauncherArgs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgs <em>Program Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Args</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgs()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_ProgramArgs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsLin <em>Program Args Lin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Args Lin</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsLin()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_ProgramArgsLin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsMac <em>Program Args Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Args Mac</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsMac()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_ProgramArgsMac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsSol <em>Program Args Sol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Args Sol</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsSol()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_ProgramArgsSol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsWin <em>Program Args Win</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Program Args Win</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsWin()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_ProgramArgsWin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgs <em>Vm Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Args</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgs()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_VmArgs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsLin <em>Vm Args Lin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Args Lin</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsLin()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_VmArgsLin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsMac <em>Vm Args Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Args Mac</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsMac()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_VmArgsMac();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsSol <em>Vm Args Sol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Args Sol</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsSol()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_VmArgsSol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsWin <em>Vm Args Win</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm Args Win</em>'.
	 * @see org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsWin()
	 * @see #getLauncherArgs()
	 * @generated
	 */
	EAttribute getLauncherArgs_VmArgsWin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Plugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugin</em>'.
	 * @see org.eclipse.amalgam.releng.product.Plugin
	 * @generated
	 */
	EClass getPlugin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Plugin#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.amalgam.releng.product.Plugin#getId()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Plugin#isFragment <em>Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fragment</em>'.
	 * @see org.eclipse.amalgam.releng.product.Plugin#isFragment()
	 * @see #getPlugin()
	 * @generated
	 */
	EAttribute getPlugin_Fragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.eclipse.amalgam.releng.product.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Feature#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.amalgam.releng.product.Feature#getId()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Feature#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.amalgam.releng.product.Feature#getVersion()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Version();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.VirtualMachine <em>Virtual Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Virtual Machine</em>'.
	 * @see org.eclipse.amalgam.releng.product.VirtualMachine
	 * @generated
	 */
	EClass getVirtualMachine();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.VirtualMachine#getMacos <em>Macos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Macos</em>'.
	 * @see org.eclipse.amalgam.releng.product.VirtualMachine#getMacos()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Macos();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.VirtualMachine#getSolaris <em>Solaris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solaris</em>'.
	 * @see org.eclipse.amalgam.releng.product.VirtualMachine#getSolaris()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Solaris();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.VirtualMachine#getLinux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linux</em>'.
	 * @see org.eclipse.amalgam.releng.product.VirtualMachine#getLinux()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Linux();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.VirtualMachine#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Windows</em>'.
	 * @see org.eclipse.amalgam.releng.product.VirtualMachine#getWindows()
	 * @see #getVirtualMachine()
	 * @generated
	 */
	EAttribute getVirtualMachine_Windows();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Launcher <em>Launcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Launcher</em>'.
	 * @see org.eclipse.amalgam.releng.product.Launcher
	 * @generated
	 */
	EClass getLauncher();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Launcher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.releng.product.Launcher#getName()
	 * @see #getLauncher()
	 * @generated
	 */
	EAttribute getLauncher_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Launcher#getLinux <em>Linux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Linux</em>'.
	 * @see org.eclipse.amalgam.releng.product.Launcher#getLinux()
	 * @see #getLauncher()
	 * @generated
	 */
	EReference getLauncher_Linux();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Launcher#getMacosx <em>Macosx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Macosx</em>'.
	 * @see org.eclipse.amalgam.releng.product.Launcher#getMacosx()
	 * @see #getLauncher()
	 * @generated
	 */
	EReference getLauncher_Macosx();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Launcher#getSolaris <em>Solaris</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Solaris</em>'.
	 * @see org.eclipse.amalgam.releng.product.Launcher#getSolaris()
	 * @see #getLauncher()
	 * @generated
	 */
	EReference getLauncher_Solaris();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.Launcher#getWin <em>Win</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Win</em>'.
	 * @see org.eclipse.amalgam.releng.product.Launcher#getWin()
	 * @see #getLauncher()
	 * @generated
	 */
	EReference getLauncher_Win();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.LinuxIcon <em>Linux Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linux Icon</em>'.
	 * @see org.eclipse.amalgam.releng.product.LinuxIcon
	 * @generated
	 */
	EClass getLinuxIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.LinuxIcon#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.eclipse.amalgam.releng.product.LinuxIcon#getIcon()
	 * @see #getLinuxIcon()
	 * @generated
	 */
	EAttribute getLinuxIcon_Icon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.MacIcon <em>Mac Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mac Icon</em>'.
	 * @see org.eclipse.amalgam.releng.product.MacIcon
	 * @generated
	 */
	EClass getMacIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.MacIcon#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon</em>'.
	 * @see org.eclipse.amalgam.releng.product.MacIcon#getIcon()
	 * @see #getMacIcon()
	 * @generated
	 */
	EAttribute getMacIcon_Icon();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.SolarisIcon <em>Solaris Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solaris Icon</em>'.
	 * @see org.eclipse.amalgam.releng.product.SolarisIcon
	 * @generated
	 */
	EClass getSolarisIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.SolarisIcon#getSolarisLarge <em>Solaris Large</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solaris Large</em>'.
	 * @see org.eclipse.amalgam.releng.product.SolarisIcon#getSolarisLarge()
	 * @see #getSolarisIcon()
	 * @generated
	 */
	EAttribute getSolarisIcon_SolarisLarge();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.SolarisIcon#getSolarisMedium <em>Solaris Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solaris Medium</em>'.
	 * @see org.eclipse.amalgam.releng.product.SolarisIcon#getSolarisMedium()
	 * @see #getSolarisIcon()
	 * @generated
	 */
	EAttribute getSolarisIcon_SolarisMedium();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.SolarisIcon#getSolarisSmall <em>Solaris Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solaris Small</em>'.
	 * @see org.eclipse.amalgam.releng.product.SolarisIcon#getSolarisSmall()
	 * @see #getSolarisIcon()
	 * @generated
	 */
	EAttribute getSolarisIcon_SolarisSmall();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.SolarisIcon#getSolarisTiny <em>Solaris Tiny</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Solaris Tiny</em>'.
	 * @see org.eclipse.amalgam.releng.product.SolarisIcon#getSolarisTiny()
	 * @see #getSolarisIcon()
	 * @generated
	 */
	EAttribute getSolarisIcon_SolarisTiny();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Bitmap <em>Bitmap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bitmap</em>'.
	 * @see org.eclipse.amalgam.releng.product.Bitmap
	 * @generated
	 */
	EClass getBitmap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Bitmap#getWinSmallHigh <em>Win Small High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Small High</em>'.
	 * @see org.eclipse.amalgam.releng.product.Bitmap#getWinSmallHigh()
	 * @see #getBitmap()
	 * @generated
	 */
	EAttribute getBitmap_WinSmallHigh();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Bitmap#getWinSmallLow <em>Win Small Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Small Low</em>'.
	 * @see org.eclipse.amalgam.releng.product.Bitmap#getWinSmallLow()
	 * @see #getBitmap()
	 * @generated
	 */
	EAttribute getBitmap_WinSmallLow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Bitmap#getWinMediumHigh <em>Win Medium High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Medium High</em>'.
	 * @see org.eclipse.amalgam.releng.product.Bitmap#getWinMediumHigh()
	 * @see #getBitmap()
	 * @generated
	 */
	EAttribute getBitmap_WinMediumHigh();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Bitmap#getWinMediumLow <em>Win Medium Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Medium Low</em>'.
	 * @see org.eclipse.amalgam.releng.product.Bitmap#getWinMediumLow()
	 * @see #getBitmap()
	 * @generated
	 */
	EAttribute getBitmap_WinMediumLow();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Bitmap#getWinLargeHigh <em>Win Large High</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Large High</em>'.
	 * @see org.eclipse.amalgam.releng.product.Bitmap#getWinLargeHigh()
	 * @see #getBitmap()
	 * @generated
	 */
	EAttribute getBitmap_WinLargeHigh();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Bitmap#getWinLargeLow <em>Win Large Low</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win Large Low</em>'.
	 * @see org.eclipse.amalgam.releng.product.Bitmap#getWinLargeLow()
	 * @see #getBitmap()
	 * @generated
	 */
	EAttribute getBitmap_WinLargeLow();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.WinIcon <em>Win Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Win Icon</em>'.
	 * @see org.eclipse.amalgam.releng.product.WinIcon
	 * @generated
	 */
	EClass getWinIcon();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.WinIcon#getBmp <em>Bmp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bmp</em>'.
	 * @see org.eclipse.amalgam.releng.product.WinIcon#getBmp()
	 * @see #getWinIcon()
	 * @generated
	 */
	EReference getWinIcon_Bmp();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.WinIcon#isUseIco <em>Use Ico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Ico</em>'.
	 * @see org.eclipse.amalgam.releng.product.WinIcon#isUseIco()
	 * @see #getWinIcon()
	 * @generated
	 */
	EAttribute getWinIcon_UseIco();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.WinIcon#getIco <em>Ico</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ico</em>'.
	 * @see org.eclipse.amalgam.releng.product.WinIcon#getIco()
	 * @see #getWinIcon()
	 * @generated
	 */
	EReference getWinIcon_Ico();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see org.eclipse.amalgam.releng.product.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Icon#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.amalgam.releng.product.Icon#getPath()
	 * @see #getIcon()
	 * @generated
	 */
	EAttribute getIcon_Path();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Splash <em>Splash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Splash</em>'.
	 * @see org.eclipse.amalgam.releng.product.Splash
	 * @generated
	 */
	EClass getSplash();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Splash#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.amalgam.releng.product.Splash#getLocation()
	 * @see #getSplash()
	 * @generated
	 */
	EAttribute getSplash_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Splash#getHandlerType <em>Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handler Type</em>'.
	 * @see org.eclipse.amalgam.releng.product.Splash#getHandlerType()
	 * @see #getSplash()
	 * @generated
	 */
	EAttribute getSplash_HandlerType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Splash#getStartupProgressRect <em>Startup Progress Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Progress Rect</em>'.
	 * @see org.eclipse.amalgam.releng.product.Splash#getStartupProgressRect()
	 * @see #getSplash()
	 * @generated
	 */
	EAttribute getSplash_StartupProgressRect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Splash#getStartupMessageRect <em>Startup Message Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Message Rect</em>'.
	 * @see org.eclipse.amalgam.releng.product.Splash#getStartupMessageRect()
	 * @see #getSplash()
	 * @generated
	 */
	EAttribute getSplash_StartupMessageRect();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Splash#getStartupForegroundColor <em>Startup Foreground Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Startup Foreground Color</em>'.
	 * @see org.eclipse.amalgam.releng.product.Splash#getStartupForegroundColor()
	 * @see #getSplash()
	 * @generated
	 */
	EAttribute getSplash_StartupForegroundColor();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.WindowImage <em>Window Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window Image</em>'.
	 * @see org.eclipse.amalgam.releng.product.WindowImage
	 * @generated
	 */
	EClass getWindowImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.WindowImage#getI16 <em>I16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I16</em>'.
	 * @see org.eclipse.amalgam.releng.product.WindowImage#getI16()
	 * @see #getWindowImage()
	 * @generated
	 */
	EAttribute getWindowImage_I16();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.WindowImage#getI32 <em>I32</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I32</em>'.
	 * @see org.eclipse.amalgam.releng.product.WindowImage#getI32()
	 * @see #getWindowImage()
	 * @generated
	 */
	EAttribute getWindowImage_I32();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.WindowImage#getI48 <em>I48</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I48</em>'.
	 * @see org.eclipse.amalgam.releng.product.WindowImage#getI48()
	 * @see #getWindowImage()
	 * @generated
	 */
	EAttribute getWindowImage_I48();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.WindowImage#getI64 <em>I64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I64</em>'.
	 * @see org.eclipse.amalgam.releng.product.WindowImage#getI64()
	 * @see #getWindowImage()
	 * @generated
	 */
	EAttribute getWindowImage_I64();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.WindowImage#getI128 <em>I128</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>I128</em>'.
	 * @see org.eclipse.amalgam.releng.product.WindowImage#getI128()
	 * @see #getWindowImage()
	 * @generated
	 */
	EAttribute getWindowImage_I128();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.AboutInfo <em>About Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>About Info</em>'.
	 * @see org.eclipse.amalgam.releng.product.AboutInfo
	 * @generated
	 */
	EClass getAboutInfo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.AboutInfo#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.eclipse.amalgam.releng.product.AboutInfo#getText()
	 * @see #getAboutInfo()
	 * @generated
	 */
	EAttribute getAboutInfo_Text();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.product.AboutInfo#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image</em>'.
	 * @see org.eclipse.amalgam.releng.product.AboutInfo#getImage()
	 * @see #getAboutInfo()
	 * @generated
	 */
	EReference getAboutInfo_Image();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.eclipse.amalgam.releng.product.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Image#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.eclipse.amalgam.releng.product.Image#getPath()
	 * @see #getImage()
	 * @generated
	 */
	EAttribute getImage_Path();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Intro <em>Intro</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Intro</em>'.
	 * @see org.eclipse.amalgam.releng.product.Intro
	 * @generated
	 */
	EClass getIntro();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.product.Intro#getIntroId <em>Intro Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intro Id</em>'.
	 * @see org.eclipse.amalgam.releng.product.Intro#getIntroId()
	 * @see #getIntro()
	 * @generated
	 */
	EAttribute getIntro_IntroId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Plugins <em>Plugins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plugins</em>'.
	 * @see org.eclipse.amalgam.releng.product.Plugins
	 * @generated
	 */
	EClass getPlugins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.product.Plugins#getPlugin <em>Plugin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plugin</em>'.
	 * @see org.eclipse.amalgam.releng.product.Plugins#getPlugin()
	 * @see #getPlugins()
	 * @generated
	 */
	EReference getPlugins_Plugin();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.product.Features <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features</em>'.
	 * @see org.eclipse.amalgam.releng.product.Features
	 * @generated
	 */
	EClass getFeatures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.product.Features#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see org.eclipse.amalgam.releng.product.Features#getFeature()
	 * @see #getFeatures()
	 * @generated
	 */
	EReference getFeatures_Feature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProductFactory getProductFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.ProductImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '<em><b>Config Ini</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__CONFIG_INI = eINSTANCE.getProduct_ConfigIni();

		/**
		 * The meta object literal for the '<em><b>Launcher Args</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__LAUNCHER_ARGS = eINSTANCE.getProduct_LauncherArgs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__NAME = eINSTANCE.getProduct_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__ID = eINSTANCE.getProduct_Id();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__APPLICATION = eINSTANCE.getProduct_Application();

		/**
		 * The meta object literal for the '<em><b>Use Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__USE_FEATURES = eINSTANCE.getProduct_UseFeatures();

		/**
		 * The meta object literal for the '<em><b>Vm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__VM = eINSTANCE.getProduct_Vm();

		/**
		 * The meta object literal for the '<em><b>Launcher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__LAUNCHER = eINSTANCE.getProduct_Launcher();

		/**
		 * The meta object literal for the '<em><b>Splash</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__SPLASH = eINSTANCE.getProduct_Splash();

		/**
		 * The meta object literal for the '<em><b>Window Images</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__WINDOW_IMAGES = eINSTANCE.getProduct_WindowImages();

		/**
		 * The meta object literal for the '<em><b>About Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__ABOUT_INFO = eINSTANCE.getProduct_AboutInfo();

		/**
		 * The meta object literal for the '<em><b>Intro</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__INTRO = eINSTANCE.getProduct_Intro();

		/**
		 * The meta object literal for the '<em><b>Plugins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__PLUGINS = eINSTANCE.getProduct_Plugins();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT__FEATURES = eINSTANCE.getProduct_Features();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT__VERSION = eINSTANCE.getProduct_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.ConfigIniImpl <em>Config Ini</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.ConfigIniImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getConfigIni()
		 * @generated
		 */
		EClass CONFIG_INI = eINSTANCE.getConfigIni();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_INI__USE = eINSTANCE.getConfigIni_Use();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_INI__PATH = eINSTANCE.getConfigIni_Path();

		/**
		 * The meta object literal for the '<em><b>Linux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_INI__LINUX = eINSTANCE.getConfigIni_Linux();

		/**
		 * The meta object literal for the '<em><b>Macosx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_INI__MACOSX = eINSTANCE.getConfigIni_Macosx();

		/**
		 * The meta object literal for the '<em><b>Solaris</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_INI__SOLARIS = eINSTANCE.getConfigIni_Solaris();

		/**
		 * The meta object literal for the '<em><b>Win32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG_INI__WIN32 = eINSTANCE.getConfigIni_Win32();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl <em>Launcher Args</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getLauncherArgs()
		 * @generated
		 */
		EClass LAUNCHER_ARGS = eINSTANCE.getLauncherArgs();

		/**
		 * The meta object literal for the '<em><b>Program Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__PROGRAM_ARGS = eINSTANCE.getLauncherArgs_ProgramArgs();

		/**
		 * The meta object literal for the '<em><b>Program Args Lin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__PROGRAM_ARGS_LIN = eINSTANCE.getLauncherArgs_ProgramArgsLin();

		/**
		 * The meta object literal for the '<em><b>Program Args Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__PROGRAM_ARGS_MAC = eINSTANCE.getLauncherArgs_ProgramArgsMac();

		/**
		 * The meta object literal for the '<em><b>Program Args Sol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__PROGRAM_ARGS_SOL = eINSTANCE.getLauncherArgs_ProgramArgsSol();

		/**
		 * The meta object literal for the '<em><b>Program Args Win</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__PROGRAM_ARGS_WIN = eINSTANCE.getLauncherArgs_ProgramArgsWin();

		/**
		 * The meta object literal for the '<em><b>Vm Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__VM_ARGS = eINSTANCE.getLauncherArgs_VmArgs();

		/**
		 * The meta object literal for the '<em><b>Vm Args Lin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__VM_ARGS_LIN = eINSTANCE.getLauncherArgs_VmArgsLin();

		/**
		 * The meta object literal for the '<em><b>Vm Args Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__VM_ARGS_MAC = eINSTANCE.getLauncherArgs_VmArgsMac();

		/**
		 * The meta object literal for the '<em><b>Vm Args Sol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__VM_ARGS_SOL = eINSTANCE.getLauncherArgs_VmArgsSol();

		/**
		 * The meta object literal for the '<em><b>Vm Args Win</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER_ARGS__VM_ARGS_WIN = eINSTANCE.getLauncherArgs_VmArgsWin();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.PluginImpl <em>Plugin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.PluginImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getPlugin()
		 * @generated
		 */
		EClass PLUGIN = eINSTANCE.getPlugin();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__ID = eINSTANCE.getPlugin_Id();

		/**
		 * The meta object literal for the '<em><b>Fragment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLUGIN__FRAGMENT = eINSTANCE.getPlugin_Fragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.FeatureImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__ID = eINSTANCE.getFeature_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__VERSION = eINSTANCE.getFeature_Version();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.VirtualMachineImpl <em>Virtual Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.VirtualMachineImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getVirtualMachine()
		 * @generated
		 */
		EClass VIRTUAL_MACHINE = eINSTANCE.getVirtualMachine();

		/**
		 * The meta object literal for the '<em><b>Macos</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__MACOS = eINSTANCE.getVirtualMachine_Macos();

		/**
		 * The meta object literal for the '<em><b>Solaris</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__SOLARIS = eINSTANCE.getVirtualMachine_Solaris();

		/**
		 * The meta object literal for the '<em><b>Linux</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__LINUX = eINSTANCE.getVirtualMachine_Linux();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIRTUAL_MACHINE__WINDOWS = eINSTANCE.getVirtualMachine_Windows();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.LauncherImpl <em>Launcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.LauncherImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getLauncher()
		 * @generated
		 */
		EClass LAUNCHER = eINSTANCE.getLauncher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAUNCHER__NAME = eINSTANCE.getLauncher_Name();

		/**
		 * The meta object literal for the '<em><b>Linux</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCHER__LINUX = eINSTANCE.getLauncher_Linux();

		/**
		 * The meta object literal for the '<em><b>Macosx</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCHER__MACOSX = eINSTANCE.getLauncher_Macosx();

		/**
		 * The meta object literal for the '<em><b>Solaris</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCHER__SOLARIS = eINSTANCE.getLauncher_Solaris();

		/**
		 * The meta object literal for the '<em><b>Win</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAUNCHER__WIN = eINSTANCE.getLauncher_Win();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.LinuxIconImpl <em>Linux Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.LinuxIconImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getLinuxIcon()
		 * @generated
		 */
		EClass LINUX_ICON = eINSTANCE.getLinuxIcon();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINUX_ICON__ICON = eINSTANCE.getLinuxIcon_Icon();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.MacIconImpl <em>Mac Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.MacIconImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getMacIcon()
		 * @generated
		 */
		EClass MAC_ICON = eINSTANCE.getMacIcon();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAC_ICON__ICON = eINSTANCE.getMacIcon_Icon();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.SolarisIconImpl <em>Solaris Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.SolarisIconImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getSolarisIcon()
		 * @generated
		 */
		EClass SOLARIS_ICON = eINSTANCE.getSolarisIcon();

		/**
		 * The meta object literal for the '<em><b>Solaris Large</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLARIS_ICON__SOLARIS_LARGE = eINSTANCE.getSolarisIcon_SolarisLarge();

		/**
		 * The meta object literal for the '<em><b>Solaris Medium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLARIS_ICON__SOLARIS_MEDIUM = eINSTANCE.getSolarisIcon_SolarisMedium();

		/**
		 * The meta object literal for the '<em><b>Solaris Small</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLARIS_ICON__SOLARIS_SMALL = eINSTANCE.getSolarisIcon_SolarisSmall();

		/**
		 * The meta object literal for the '<em><b>Solaris Tiny</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLARIS_ICON__SOLARIS_TINY = eINSTANCE.getSolarisIcon_SolarisTiny();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.BitmapImpl <em>Bitmap</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.BitmapImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getBitmap()
		 * @generated
		 */
		EClass BITMAP = eINSTANCE.getBitmap();

		/**
		 * The meta object literal for the '<em><b>Win Small High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP__WIN_SMALL_HIGH = eINSTANCE.getBitmap_WinSmallHigh();

		/**
		 * The meta object literal for the '<em><b>Win Small Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP__WIN_SMALL_LOW = eINSTANCE.getBitmap_WinSmallLow();

		/**
		 * The meta object literal for the '<em><b>Win Medium High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP__WIN_MEDIUM_HIGH = eINSTANCE.getBitmap_WinMediumHigh();

		/**
		 * The meta object literal for the '<em><b>Win Medium Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP__WIN_MEDIUM_LOW = eINSTANCE.getBitmap_WinMediumLow();

		/**
		 * The meta object literal for the '<em><b>Win Large High</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP__WIN_LARGE_HIGH = eINSTANCE.getBitmap_WinLargeHigh();

		/**
		 * The meta object literal for the '<em><b>Win Large Low</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BITMAP__WIN_LARGE_LOW = eINSTANCE.getBitmap_WinLargeLow();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.WinIconImpl <em>Win Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.WinIconImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getWinIcon()
		 * @generated
		 */
		EClass WIN_ICON = eINSTANCE.getWinIcon();

		/**
		 * The meta object literal for the '<em><b>Bmp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIN_ICON__BMP = eINSTANCE.getWinIcon_Bmp();

		/**
		 * The meta object literal for the '<em><b>Use Ico</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIN_ICON__USE_ICO = eINSTANCE.getWinIcon_UseIco();

		/**
		 * The meta object literal for the '<em><b>Ico</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WIN_ICON__ICO = eINSTANCE.getWinIcon_Ico();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.IconImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON__PATH = eINSTANCE.getIcon_Path();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.SplashImpl <em>Splash</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.SplashImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getSplash()
		 * @generated
		 */
		EClass SPLASH = eINSTANCE.getSplash();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLASH__LOCATION = eINSTANCE.getSplash_Location();

		/**
		 * The meta object literal for the '<em><b>Handler Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLASH__HANDLER_TYPE = eINSTANCE.getSplash_HandlerType();

		/**
		 * The meta object literal for the '<em><b>Startup Progress Rect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLASH__STARTUP_PROGRESS_RECT = eINSTANCE.getSplash_StartupProgressRect();

		/**
		 * The meta object literal for the '<em><b>Startup Message Rect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLASH__STARTUP_MESSAGE_RECT = eINSTANCE.getSplash_StartupMessageRect();

		/**
		 * The meta object literal for the '<em><b>Startup Foreground Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPLASH__STARTUP_FOREGROUND_COLOR = eINSTANCE.getSplash_StartupForegroundColor();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.WindowImageImpl <em>Window Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.WindowImageImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getWindowImage()
		 * @generated
		 */
		EClass WINDOW_IMAGE = eINSTANCE.getWindowImage();

		/**
		 * The meta object literal for the '<em><b>I16</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW_IMAGE__I16 = eINSTANCE.getWindowImage_I16();

		/**
		 * The meta object literal for the '<em><b>I32</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW_IMAGE__I32 = eINSTANCE.getWindowImage_I32();

		/**
		 * The meta object literal for the '<em><b>I48</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW_IMAGE__I48 = eINSTANCE.getWindowImage_I48();

		/**
		 * The meta object literal for the '<em><b>I64</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW_IMAGE__I64 = eINSTANCE.getWindowImage_I64();

		/**
		 * The meta object literal for the '<em><b>I128</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW_IMAGE__I128 = eINSTANCE.getWindowImage_I128();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.AboutInfoImpl <em>About Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.AboutInfoImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getAboutInfo()
		 * @generated
		 */
		EClass ABOUT_INFO = eINSTANCE.getAboutInfo();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOUT_INFO__TEXT = eINSTANCE.getAboutInfo_Text();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABOUT_INFO__IMAGE = eINSTANCE.getAboutInfo_Image();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.ImageImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE__PATH = eINSTANCE.getImage_Path();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.IntroImpl <em>Intro</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.IntroImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getIntro()
		 * @generated
		 */
		EClass INTRO = eINSTANCE.getIntro();

		/**
		 * The meta object literal for the '<em><b>Intro Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTRO__INTRO_ID = eINSTANCE.getIntro_IntroId();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.PluginsImpl <em>Plugins</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.PluginsImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getPlugins()
		 * @generated
		 */
		EClass PLUGINS = eINSTANCE.getPlugins();

		/**
		 * The meta object literal for the '<em><b>Plugin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLUGINS__PLUGIN = eINSTANCE.getPlugins_Plugin();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.product.impl.FeaturesImpl <em>Features</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.product.impl.FeaturesImpl
		 * @see org.eclipse.amalgam.releng.product.impl.ProductPackageImpl#getFeatures()
		 * @generated
		 */
		EClass FEATURES = eINSTANCE.getFeatures();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES__FEATURE = eINSTANCE.getFeatures_Feature();

	}

} //ProductPackage
