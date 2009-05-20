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
 * $Id: BuildPackage.java,v 1.10 2009/05/20 18:12:35 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.amalgam.releng.build.BuildFactory
 * @model kind="package"
 * @generated
 */
public interface BuildPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "build";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/amalgam/2008/build";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "build";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BuildPackage eINSTANCE = org.eclipse.amalgam.releng.build.impl.BuildPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.BuildImpl <em>Build</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.BuildImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getBuild()
	 * @generated
	 */
	int BUILD = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Build Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__BUILD_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Platforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__PLATFORMS = 2;

	/**
	 * The feature id for the '<em><b>Configs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__CONFIGS = 3;

	/**
	 * The feature id for the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__MAP = 4;

	/**
	 * The feature id for the '<em><b>Fetch Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__FETCH_TAG = 5;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__CATEGORIES = 6;

	/**
	 * The feature id for the '<em><b>Contributions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__CONTRIBUTIONS = 7;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__PRODUCT = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__LABEL = 9;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__BASE = 10;

	/**
	 * The feature id for the '<em><b>Builder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__BUILDER = 11;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__DATE = 12;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__TIME = 13;

	/**
	 * The feature id for the '<em><b>Compiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__COMPILER = 14;

	/**
	 * The feature id for the '<em><b>Launch VM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__LAUNCH_VM = 15;

	/**
	 * The feature id for the '<em><b>Promotion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__PROMOTION = 16;

	/**
	 * The feature id for the '<em><b>Builder URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__BUILDER_URL = 17;

	/**
	 * The feature id for the '<em><b>Buildmaster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__BUILDMASTER = 18;

	/**
	 * The feature id for the '<em><b>Default Mail List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__DEFAULT_MAIL_LIST = 19;

	/**
	 * The feature id for the '<em><b>Sendmail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD__SENDMAIL = 20;

	/**
	 * The number of structural features of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.RepositoryImpl <em>Repository</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.RepositoryImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getRepository()
	 * @generated
	 */
	int REPOSITORY = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Repository</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOSITORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.PlatformImpl <em>Platform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.PlatformImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getPlatform()
	 * @generated
	 */
	int PLATFORM = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__FILE = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Config</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__CONFIG = 2;

	/**
	 * The feature id for the '<em><b>Deltapack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM__DELTAPACK = 3;

	/**
	 * The number of structural features of the '<em>Platform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLATFORM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.ConfigImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 3;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__OS = 0;

	/**
	 * The feature id for the '<em><b>Ws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__WS = 1;

	/**
	 * The feature id for the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ARCH = 2;

	/**
	 * The feature id for the '<em><b>Archive Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__ARCHIVE_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.MapImpl <em>Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.MapImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 4;

	/**
	 * The feature id for the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__ROOT = 0;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__REPO = 1;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP__TAG = 2;

	/**
	 * The number of structural features of the '<em>Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.CategoryImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__LABEL = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__FEATURES = 3;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.ContributionImpl <em>Contribution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.ContributionImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getContribution()
	 * @generated
	 */
	int CONTRIBUTION = 6;

	/**
	 * The feature id for the '<em><b>Contacts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__CONTACTS = 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__FEATURES = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Repositories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__REPOSITORIES = 3;

	/**
	 * The feature id for the '<em><b>Bundles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__BUNDLES = 4;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION__PRODUCTS = 5;

	/**
	 * The number of structural features of the '<em>Contribution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTRIBUTION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.ContactImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = 1;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.InstallationUnitImpl <em>Installation Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.InstallationUnitImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getInstallationUnit()
	 * @generated
	 */
	int INSTALLATION_UNIT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_UNIT__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_UNIT__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_UNIT__REPO = 2;

	/**
	 * The number of structural features of the '<em>Installation Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTALLATION_UNIT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.FeatureImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = INSTALLATION_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__VERSION = INSTALLATION_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REPO = INSTALLATION_UNIT__REPO;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CATEGORY = INSTALLATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Product</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IN_PRODUCT = INSTALLATION_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = INSTALLATION_UNIT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.BundleImpl <em>Bundle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.BundleImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__ID = INSTALLATION_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__VERSION = INSTALLATION_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE__REPO = INSTALLATION_UNIT__REPO;

	/**
	 * The number of structural features of the '<em>Bundle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUNDLE_FEATURE_COUNT = INSTALLATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.CompilerImpl <em>Compiler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.CompilerImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getCompiler()
	 * @generated
	 */
	int COMPILER = 10;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER__ARGS = 0;

	/**
	 * The feature id for the '<em><b>Source Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER__SOURCE_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Target Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER__TARGET_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER__VERBOSE = 3;

	/**
	 * The feature id for the '<em><b>Fail On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER__FAIL_ON_ERROR = 4;

	/**
	 * The feature id for the '<em><b>Debug Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER__DEBUG_INFO = 5;

	/**
	 * The number of structural features of the '<em>Compiler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPILER_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.PromotionImpl <em>Promotion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.PromotionImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getPromotion()
	 * @generated
	 */
	int PROMOTION = 11;

	/**
	 * The feature id for the '<em><b>Upload Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__UPLOAD_DIRECTORY = 0;

	/**
	 * The feature id for the '<em><b>Download Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__DOWNLOAD_DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Incubating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__INCUBATING = 2;

	/**
	 * The feature id for the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__BASE_URL = 3;

	/**
	 * The feature id for the '<em><b>Build Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION__BUILD_ALIAS = 4;

	/**
	 * The number of structural features of the '<em>Promotion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROMOTION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.impl.ProductImpl
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__ID = INSTALLATION_UNIT__ID;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__VERSION = INSTALLATION_UNIT__VERSION;

	/**
	 * The feature id for the '<em><b>Repo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT__REPO = INSTALLATION_UNIT__REPO;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = INSTALLATION_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.BuildType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.BuildType
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getBuildType()
	 * @generated
	 */
	int BUILD_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.OS <em>OS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.OS
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getOS()
	 * @generated
	 */
	int OS = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.WS <em>WS</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.WS
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getWS()
	 * @generated
	 */
	int WS = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.ARCH <em>ARCH</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.ARCH
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getARCH()
	 * @generated
	 */
	int ARCH = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.releng.build.ArchiveFormat <em>Archive Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.releng.build.ArchiveFormat
	 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getArchiveFormat()
	 * @generated
	 */
	int ARCHIVE_FORMAT = 18;


	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Build <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build
	 * @generated
	 */
	EClass getBuild();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Build#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getType()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Build#getBuildRoot <em>Build Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Root</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getBuildRoot()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_BuildRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Build#getPlatforms <em>Platforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Platforms</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getPlatforms()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Platforms();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Build#getConfigs <em>Configs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configs</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getConfigs()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Configs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.build.Build#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Map</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getMap()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Map();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Build#getFetchTag <em>Fetch Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fetch Tag</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getFetchTag()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_FetchTag();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Build#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getCategories()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Build#getContributions <em>Contributions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contributions</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getContributions()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Contributions();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.releng.build.Build#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getProduct()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Product();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Build#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getLabel()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Label();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.releng.build.Build#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getBase()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Base();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.releng.build.Build#getBuilder <em>Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Builder</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getBuilder()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Builder();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Build#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getDate()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Build#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getTime()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Time();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.build.Build#getCompiler <em>Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compiler</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getCompiler()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Compiler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Build#getLaunchVM <em>Launch VM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Launch VM</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getLaunchVM()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_LaunchVM();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.build.Build#getPromotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Promotion</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getPromotion()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Promotion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Build#getBuilderURL <em>Builder URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Builder URL</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getBuilderURL()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_BuilderURL();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.amalgam.releng.build.Build#getBuildmaster <em>Buildmaster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buildmaster</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getBuildmaster()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_Buildmaster();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Build#getDefaultMailList <em>Default Mail List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Default Mail List</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#getDefaultMailList()
	 * @see #getBuild()
	 * @generated
	 */
	EReference getBuild_DefaultMailList();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Build#isSendmail <em>Sendmail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sendmail</em>'.
	 * @see org.eclipse.amalgam.releng.build.Build#isSendmail()
	 * @see #getBuild()
	 * @generated
	 */
	EAttribute getBuild_Sendmail();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Repository <em>Repository</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repository</em>'.
	 * @see org.eclipse.amalgam.releng.build.Repository
	 * @generated
	 */
	EClass getRepository();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Repository#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.amalgam.releng.build.Repository#getLocation()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Location();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Repository#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.amalgam.releng.build.Repository#getLabel()
	 * @see #getRepository()
	 * @generated
	 */
	EAttribute getRepository_Label();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Platform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Platform</em>'.
	 * @see org.eclipse.amalgam.releng.build.Platform
	 * @generated
	 */
	EClass getPlatform();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Platform#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.eclipse.amalgam.releng.build.Platform#getFile()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_File();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Platform#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see org.eclipse.amalgam.releng.build.Platform#getLocation()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Location();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.releng.build.Platform#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Config</em>'.
	 * @see org.eclipse.amalgam.releng.build.Platform#getConfig()
	 * @see #getPlatform()
	 * @generated
	 */
	EReference getPlatform_Config();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Platform#getDeltapack <em>Deltapack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deltapack</em>'.
	 * @see org.eclipse.amalgam.releng.build.Platform#getDeltapack()
	 * @see #getPlatform()
	 * @generated
	 */
	EAttribute getPlatform_Deltapack();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see org.eclipse.amalgam.releng.build.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Config#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see org.eclipse.amalgam.releng.build.Config#getOs()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Os();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Config#getWs <em>Ws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ws</em>'.
	 * @see org.eclipse.amalgam.releng.build.Config#getWs()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Ws();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Config#getArch <em>Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arch</em>'.
	 * @see org.eclipse.amalgam.releng.build.Config#getArch()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Arch();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Config#getArchiveFormat <em>Archive Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive Format</em>'.
	 * @see org.eclipse.amalgam.releng.build.Config#getArchiveFormat()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_ArchiveFormat();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map</em>'.
	 * @see org.eclipse.amalgam.releng.build.Map
	 * @generated
	 */
	EClass getMap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Map#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root</em>'.
	 * @see org.eclipse.amalgam.releng.build.Map#getRoot()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Root();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Map#getRepo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repo</em>'.
	 * @see org.eclipse.amalgam.releng.build.Map#getRepo()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Repo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Map#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.eclipse.amalgam.releng.build.Map#getTag()
	 * @see #getMap()
	 * @generated
	 */
	EAttribute getMap_Tag();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.eclipse.amalgam.releng.build.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.releng.build.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Category#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.amalgam.releng.build.Category#getLabel()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Category#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.amalgam.releng.build.Category#getDescription()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Description();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.amalgam.releng.build.Category#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see org.eclipse.amalgam.releng.build.Category#getFeatures()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Features();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Contribution <em>Contribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contribution</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contribution
	 * @generated
	 */
	EClass getContribution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Contribution#getContacts <em>Contacts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contacts</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contribution#getContacts()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Contacts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Contribution#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contribution#getFeatures()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Contribution#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contribution#getLabel()
	 * @see #getContribution()
	 * @generated
	 */
	EAttribute getContribution_Label();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Contribution#getRepositories <em>Repositories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repositories</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contribution#getRepositories()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Repositories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Contribution#getBundles <em>Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bundles</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contribution#getBundles()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Bundles();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amalgam.releng.build.Contribution#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contribution#getProducts()
	 * @see #getContribution()
	 * @generated
	 */
	EReference getContribution_Products();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Contact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contact#getName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.eclipse.amalgam.releng.build.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.eclipse.amalgam.releng.build.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.amalgam.releng.build.Feature#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see org.eclipse.amalgam.releng.build.Feature#getCategory()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Feature#isInProduct <em>In Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Product</em>'.
	 * @see org.eclipse.amalgam.releng.build.Feature#isInProduct()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_InProduct();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bundle</em>'.
	 * @see org.eclipse.amalgam.releng.build.Bundle
	 * @generated
	 */
	EClass getBundle();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Compiler <em>Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compiler</em>'.
	 * @see org.eclipse.amalgam.releng.build.Compiler
	 * @generated
	 */
	EClass getCompiler();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Compiler#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Args</em>'.
	 * @see org.eclipse.amalgam.releng.build.Compiler#getArgs()
	 * @see #getCompiler()
	 * @generated
	 */
	EAttribute getCompiler_Args();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Compiler#getSourceVersion <em>Source Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Version</em>'.
	 * @see org.eclipse.amalgam.releng.build.Compiler#getSourceVersion()
	 * @see #getCompiler()
	 * @generated
	 */
	EAttribute getCompiler_SourceVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Compiler#getTargetVersion <em>Target Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Version</em>'.
	 * @see org.eclipse.amalgam.releng.build.Compiler#getTargetVersion()
	 * @see #getCompiler()
	 * @generated
	 */
	EAttribute getCompiler_TargetVersion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Compiler#isVerbose <em>Verbose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verbose</em>'.
	 * @see org.eclipse.amalgam.releng.build.Compiler#isVerbose()
	 * @see #getCompiler()
	 * @generated
	 */
	EAttribute getCompiler_Verbose();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Compiler#isFailOnError <em>Fail On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail On Error</em>'.
	 * @see org.eclipse.amalgam.releng.build.Compiler#isFailOnError()
	 * @see #getCompiler()
	 * @generated
	 */
	EAttribute getCompiler_FailOnError();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Compiler#isDebugInfo <em>Debug Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Debug Info</em>'.
	 * @see org.eclipse.amalgam.releng.build.Compiler#isDebugInfo()
	 * @see #getCompiler()
	 * @generated
	 */
	EAttribute getCompiler_DebugInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Promotion <em>Promotion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Promotion</em>'.
	 * @see org.eclipse.amalgam.releng.build.Promotion
	 * @generated
	 */
	EClass getPromotion();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Promotion#getUploadDirectory <em>Upload Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upload Directory</em>'.
	 * @see org.eclipse.amalgam.releng.build.Promotion#getUploadDirectory()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_UploadDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Promotion#getDownloadDirectory <em>Download Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Directory</em>'.
	 * @see org.eclipse.amalgam.releng.build.Promotion#getDownloadDirectory()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_DownloadDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Promotion#isIncubating <em>Incubating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Incubating</em>'.
	 * @see org.eclipse.amalgam.releng.build.Promotion#isIncubating()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_Incubating();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Promotion#getBaseURL <em>Base URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base URL</em>'.
	 * @see org.eclipse.amalgam.releng.build.Promotion#getBaseURL()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_BaseURL();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.Promotion#getBuildAlias <em>Build Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Build Alias</em>'.
	 * @see org.eclipse.amalgam.releng.build.Promotion#getBuildAlias()
	 * @see #getPromotion()
	 * @generated
	 */
	EAttribute getPromotion_BuildAlias();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.InstallationUnit <em>Installation Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Installation Unit</em>'.
	 * @see org.eclipse.amalgam.releng.build.InstallationUnit
	 * @generated
	 */
	EClass getInstallationUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.InstallationUnit#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.amalgam.releng.build.InstallationUnit#getId()
	 * @see #getInstallationUnit()
	 * @generated
	 */
	EAttribute getInstallationUnit_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.releng.build.InstallationUnit#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.amalgam.releng.build.InstallationUnit#getVersion()
	 * @see #getInstallationUnit()
	 * @generated
	 */
	EAttribute getInstallationUnit_Version();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amalgam.releng.build.InstallationUnit#getRepo <em>Repo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Repo</em>'.
	 * @see org.eclipse.amalgam.releng.build.InstallationUnit#getRepo()
	 * @see #getInstallationUnit()
	 * @generated
	 */
	EReference getInstallationUnit_Repo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.releng.build.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.eclipse.amalgam.releng.build.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.releng.build.BuildType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see org.eclipse.amalgam.releng.build.BuildType
	 * @generated
	 */
	EEnum getBuildType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.releng.build.OS <em>OS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OS</em>'.
	 * @see org.eclipse.amalgam.releng.build.OS
	 * @generated
	 */
	EEnum getOS();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.releng.build.WS <em>WS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>WS</em>'.
	 * @see org.eclipse.amalgam.releng.build.WS
	 * @generated
	 */
	EEnum getWS();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.releng.build.ARCH <em>ARCH</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ARCH</em>'.
	 * @see org.eclipse.amalgam.releng.build.ARCH
	 * @generated
	 */
	EEnum getARCH();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.amalgam.releng.build.ArchiveFormat <em>Archive Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Archive Format</em>'.
	 * @see org.eclipse.amalgam.releng.build.ArchiveFormat
	 * @generated
	 */
	EEnum getArchiveFormat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BuildFactory getBuildFactory();

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
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.BuildImpl <em>Build</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.BuildImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getBuild()
		 * @generated
		 */
		EClass BUILD = eINSTANCE.getBuild();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__TYPE = eINSTANCE.getBuild_Type();

		/**
		 * The meta object literal for the '<em><b>Build Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__BUILD_ROOT = eINSTANCE.getBuild_BuildRoot();

		/**
		 * The meta object literal for the '<em><b>Platforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__PLATFORMS = eINSTANCE.getBuild_Platforms();

		/**
		 * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__CONFIGS = eINSTANCE.getBuild_Configs();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__MAP = eINSTANCE.getBuild_Map();

		/**
		 * The meta object literal for the '<em><b>Fetch Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__FETCH_TAG = eINSTANCE.getBuild_FetchTag();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__CATEGORIES = eINSTANCE.getBuild_Categories();

		/**
		 * The meta object literal for the '<em><b>Contributions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__CONTRIBUTIONS = eINSTANCE.getBuild_Contributions();

		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__PRODUCT = eINSTANCE.getBuild_Product();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__LABEL = eINSTANCE.getBuild_Label();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__BASE = eINSTANCE.getBuild_Base();

		/**
		 * The meta object literal for the '<em><b>Builder</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__BUILDER = eINSTANCE.getBuild_Builder();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__DATE = eINSTANCE.getBuild_Date();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__TIME = eINSTANCE.getBuild_Time();

		/**
		 * The meta object literal for the '<em><b>Compiler</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__COMPILER = eINSTANCE.getBuild_Compiler();

		/**
		 * The meta object literal for the '<em><b>Launch VM</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__LAUNCH_VM = eINSTANCE.getBuild_LaunchVM();

		/**
		 * The meta object literal for the '<em><b>Promotion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__PROMOTION = eINSTANCE.getBuild_Promotion();

		/**
		 * The meta object literal for the '<em><b>Builder URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__BUILDER_URL = eINSTANCE.getBuild_BuilderURL();

		/**
		 * The meta object literal for the '<em><b>Buildmaster</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__BUILDMASTER = eINSTANCE.getBuild_Buildmaster();

		/**
		 * The meta object literal for the '<em><b>Default Mail List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUILD__DEFAULT_MAIL_LIST = eINSTANCE.getBuild_DefaultMailList();

		/**
		 * The meta object literal for the '<em><b>Sendmail</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD__SENDMAIL = eINSTANCE.getBuild_Sendmail();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.RepositoryImpl <em>Repository</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.RepositoryImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getRepository()
		 * @generated
		 */
		EClass REPOSITORY = eINSTANCE.getRepository();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__LOCATION = eINSTANCE.getRepository_Location();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOSITORY__LABEL = eINSTANCE.getRepository_Label();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.PlatformImpl <em>Platform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.PlatformImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getPlatform()
		 * @generated
		 */
		EClass PLATFORM = eINSTANCE.getPlatform();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__FILE = eINSTANCE.getPlatform_File();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__LOCATION = eINSTANCE.getPlatform_Location();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLATFORM__CONFIG = eINSTANCE.getPlatform_Config();

		/**
		 * The meta object literal for the '<em><b>Deltapack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLATFORM__DELTAPACK = eINSTANCE.getPlatform_Deltapack();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.ConfigImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__OS = eINSTANCE.getConfig_Os();

		/**
		 * The meta object literal for the '<em><b>Ws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__WS = eINSTANCE.getConfig_Ws();

		/**
		 * The meta object literal for the '<em><b>Arch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__ARCH = eINSTANCE.getConfig_Arch();

		/**
		 * The meta object literal for the '<em><b>Archive Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__ARCHIVE_FORMAT = eINSTANCE.getConfig_ArchiveFormat();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.MapImpl <em>Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.MapImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getMap()
		 * @generated
		 */
		EClass MAP = eINSTANCE.getMap();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__ROOT = eINSTANCE.getMap_Root();

		/**
		 * The meta object literal for the '<em><b>Repo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__REPO = eINSTANCE.getMap_Repo();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAP__TAG = eINSTANCE.getMap_Tag();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.CategoryImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__LABEL = eINSTANCE.getCategory_Label();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__DESCRIPTION = eINSTANCE.getCategory_Description();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__FEATURES = eINSTANCE.getCategory_Features();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.ContributionImpl <em>Contribution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.ContributionImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getContribution()
		 * @generated
		 */
		EClass CONTRIBUTION = eINSTANCE.getContribution();

		/**
		 * The meta object literal for the '<em><b>Contacts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__CONTACTS = eINSTANCE.getContribution_Contacts();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__FEATURES = eINSTANCE.getContribution_Features();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTRIBUTION__LABEL = eINSTANCE.getContribution_Label();

		/**
		 * The meta object literal for the '<em><b>Repositories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__REPOSITORIES = eINSTANCE.getContribution_Repositories();

		/**
		 * The meta object literal for the '<em><b>Bundles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__BUNDLES = eINSTANCE.getContribution_Bundles();

		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTRIBUTION__PRODUCTS = eINSTANCE.getContribution_Products();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.ContactImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__NAME = eINSTANCE.getContact_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__EMAIL = eINSTANCE.getContact_Email();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.FeatureImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CATEGORY = eINSTANCE.getFeature_Category();

		/**
		 * The meta object literal for the '<em><b>In Product</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__IN_PRODUCT = eINSTANCE.getFeature_InProduct();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.BundleImpl <em>Bundle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.BundleImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getBundle()
		 * @generated
		 */
		EClass BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.CompilerImpl <em>Compiler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.CompilerImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getCompiler()
		 * @generated
		 */
		EClass COMPILER = eINSTANCE.getCompiler();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER__ARGS = eINSTANCE.getCompiler_Args();

		/**
		 * The meta object literal for the '<em><b>Source Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER__SOURCE_VERSION = eINSTANCE.getCompiler_SourceVersion();

		/**
		 * The meta object literal for the '<em><b>Target Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER__TARGET_VERSION = eINSTANCE.getCompiler_TargetVersion();

		/**
		 * The meta object literal for the '<em><b>Verbose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER__VERBOSE = eINSTANCE.getCompiler_Verbose();

		/**
		 * The meta object literal for the '<em><b>Fail On Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER__FAIL_ON_ERROR = eINSTANCE.getCompiler_FailOnError();

		/**
		 * The meta object literal for the '<em><b>Debug Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPILER__DEBUG_INFO = eINSTANCE.getCompiler_DebugInfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.PromotionImpl <em>Promotion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.PromotionImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getPromotion()
		 * @generated
		 */
		EClass PROMOTION = eINSTANCE.getPromotion();

		/**
		 * The meta object literal for the '<em><b>Upload Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__UPLOAD_DIRECTORY = eINSTANCE.getPromotion_UploadDirectory();

		/**
		 * The meta object literal for the '<em><b>Download Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__DOWNLOAD_DIRECTORY = eINSTANCE.getPromotion_DownloadDirectory();

		/**
		 * The meta object literal for the '<em><b>Incubating</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__INCUBATING = eINSTANCE.getPromotion_Incubating();

		/**
		 * The meta object literal for the '<em><b>Base URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__BASE_URL = eINSTANCE.getPromotion_BaseURL();

		/**
		 * The meta object literal for the '<em><b>Build Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROMOTION__BUILD_ALIAS = eINSTANCE.getPromotion_BuildAlias();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.InstallationUnitImpl <em>Installation Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.InstallationUnitImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getInstallationUnit()
		 * @generated
		 */
		EClass INSTALLATION_UNIT = eINSTANCE.getInstallationUnit();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION_UNIT__ID = eINSTANCE.getInstallationUnit_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTALLATION_UNIT__VERSION = eINSTANCE.getInstallationUnit_Version();

		/**
		 * The meta object literal for the '<em><b>Repo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTALLATION_UNIT__REPO = eINSTANCE.getInstallationUnit_Repo();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.impl.ProductImpl
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.BuildType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.BuildType
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getBuildType()
		 * @generated
		 */
		EEnum BUILD_TYPE = eINSTANCE.getBuildType();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.OS <em>OS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.OS
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getOS()
		 * @generated
		 */
		EEnum OS = eINSTANCE.getOS();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.WS <em>WS</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.WS
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getWS()
		 * @generated
		 */
		EEnum WS = eINSTANCE.getWS();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.ARCH <em>ARCH</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.ARCH
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getARCH()
		 * @generated
		 */
		EEnum ARCH = eINSTANCE.getARCH();

		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.releng.build.ArchiveFormat <em>Archive Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.releng.build.ArchiveFormat
		 * @see org.eclipse.amalgam.releng.build.impl.BuildPackageImpl#getArchiveFormat()
		 * @generated
		 */
		EEnum ARCHIVE_FORMAT = eINSTANCE.getArchiveFormat();

	}

} //BuildPackage
