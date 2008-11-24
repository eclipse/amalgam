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
 * $Id: ProductImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.AboutInfo;
import org.eclipse.amalgam.releng.product.ConfigIni;
import org.eclipse.amalgam.releng.product.Features;
import org.eclipse.amalgam.releng.product.Intro;
import org.eclipse.amalgam.releng.product.Launcher;
import org.eclipse.amalgam.releng.product.LauncherArgs;
import org.eclipse.amalgam.releng.product.Plugins;
import org.eclipse.amalgam.releng.product.Product;
import org.eclipse.amalgam.releng.product.ProductPackage;
import org.eclipse.amalgam.releng.product.Splash;
import org.eclipse.amalgam.releng.product.VirtualMachine;
import org.eclipse.amalgam.releng.product.WindowImage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getConfigIni <em>Config Ini</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getLauncherArgs <em>Launcher Args</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#isUseFeatures <em>Use Features</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getVm <em>Vm</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getLauncher <em>Launcher</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getSplash <em>Splash</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getWindowImages <em>Window Images</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getAboutInfo <em>About Info</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getIntro <em>Intro</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ProductImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductImpl extends EObjectImpl implements Product {
	/**
	 * The cached value of the '{@link #getConfigIni() <em>Config Ini</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigIni()
	 * @generated
	 * @ordered
	 */
	protected ConfigIni configIni;

	/**
	 * The cached value of the '{@link #getLauncherArgs() <em>Launcher Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLauncherArgs()
	 * @generated
	 * @ordered
	 */
	protected LauncherArgs launcherArgs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseFeatures() <em>Use Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_FEATURES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseFeatures() <em>Use Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseFeatures()
	 * @generated
	 * @ordered
	 */
	protected boolean useFeatures = USE_FEATURES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVm() <em>Vm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVm()
	 * @generated
	 * @ordered
	 */
	protected VirtualMachine vm;

	/**
	 * The cached value of the '{@link #getLauncher() <em>Launcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLauncher()
	 * @generated
	 * @ordered
	 */
	protected Launcher launcher;

	/**
	 * The cached value of the '{@link #getSplash() <em>Splash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSplash()
	 * @generated
	 * @ordered
	 */
	protected Splash splash;

	/**
	 * The cached value of the '{@link #getWindowImages() <em>Window Images</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindowImages()
	 * @generated
	 * @ordered
	 */
	protected WindowImage windowImages;

	/**
	 * The cached value of the '{@link #getAboutInfo() <em>About Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAboutInfo()
	 * @generated
	 * @ordered
	 */
	protected AboutInfo aboutInfo;

	/**
	 * The cached value of the '{@link #getIntro() <em>Intro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntro()
	 * @generated
	 * @ordered
	 */
	protected Intro intro;

	/**
	 * The cached value of the '{@link #getPlugins() <em>Plugins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlugins()
	 * @generated
	 * @ordered
	 */
	protected Plugins plugins;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected Features features;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.PRODUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigIni getConfigIni() {
		return configIni;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigIni(ConfigIni newConfigIni, NotificationChain msgs) {
		ConfigIni oldConfigIni = configIni;
		configIni = newConfigIni;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__CONFIG_INI, oldConfigIni, newConfigIni);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigIni(ConfigIni newConfigIni) {
		if (newConfigIni != configIni) {
			NotificationChain msgs = null;
			if (configIni != null)
				msgs = ((InternalEObject)configIni).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__CONFIG_INI, null, msgs);
			if (newConfigIni != null)
				msgs = ((InternalEObject)newConfigIni).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__CONFIG_INI, null, msgs);
			msgs = basicSetConfigIni(newConfigIni, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__CONFIG_INI, newConfigIni, newConfigIni));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LauncherArgs getLauncherArgs() {
		return launcherArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLauncherArgs(LauncherArgs newLauncherArgs, NotificationChain msgs) {
		LauncherArgs oldLauncherArgs = launcherArgs;
		launcherArgs = newLauncherArgs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__LAUNCHER_ARGS, oldLauncherArgs, newLauncherArgs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLauncherArgs(LauncherArgs newLauncherArgs) {
		if (newLauncherArgs != launcherArgs) {
			NotificationChain msgs = null;
			if (launcherArgs != null)
				msgs = ((InternalEObject)launcherArgs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__LAUNCHER_ARGS, null, msgs);
			if (newLauncherArgs != null)
				msgs = ((InternalEObject)newLauncherArgs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__LAUNCHER_ARGS, null, msgs);
			msgs = basicSetLauncherArgs(newLauncherArgs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__LAUNCHER_ARGS, newLauncherArgs, newLauncherArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseFeatures() {
		return useFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseFeatures(boolean newUseFeatures) {
		boolean oldUseFeatures = useFeatures;
		useFeatures = newUseFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__USE_FEATURES, oldUseFeatures, useFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualMachine getVm() {
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVm(VirtualMachine newVm, NotificationChain msgs) {
		VirtualMachine oldVm = vm;
		vm = newVm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__VM, oldVm, newVm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVm(VirtualMachine newVm) {
		if (newVm != vm) {
			NotificationChain msgs = null;
			if (vm != null)
				msgs = ((InternalEObject)vm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__VM, null, msgs);
			if (newVm != null)
				msgs = ((InternalEObject)newVm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__VM, null, msgs);
			msgs = basicSetVm(newVm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__VM, newVm, newVm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Launcher getLauncher() {
		return launcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLauncher(Launcher newLauncher, NotificationChain msgs) {
		Launcher oldLauncher = launcher;
		launcher = newLauncher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__LAUNCHER, oldLauncher, newLauncher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLauncher(Launcher newLauncher) {
		if (newLauncher != launcher) {
			NotificationChain msgs = null;
			if (launcher != null)
				msgs = ((InternalEObject)launcher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__LAUNCHER, null, msgs);
			if (newLauncher != null)
				msgs = ((InternalEObject)newLauncher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__LAUNCHER, null, msgs);
			msgs = basicSetLauncher(newLauncher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__LAUNCHER, newLauncher, newLauncher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Splash getSplash() {
		return splash;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSplash(Splash newSplash, NotificationChain msgs) {
		Splash oldSplash = splash;
		splash = newSplash;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SPLASH, oldSplash, newSplash);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSplash(Splash newSplash) {
		if (newSplash != splash) {
			NotificationChain msgs = null;
			if (splash != null)
				msgs = ((InternalEObject)splash).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__SPLASH, null, msgs);
			if (newSplash != null)
				msgs = ((InternalEObject)newSplash).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__SPLASH, null, msgs);
			msgs = basicSetSplash(newSplash, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__SPLASH, newSplash, newSplash));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WindowImage getWindowImages() {
		return windowImages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWindowImages(WindowImage newWindowImages, NotificationChain msgs) {
		WindowImage oldWindowImages = windowImages;
		windowImages = newWindowImages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__WINDOW_IMAGES, oldWindowImages, newWindowImages);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindowImages(WindowImage newWindowImages) {
		if (newWindowImages != windowImages) {
			NotificationChain msgs = null;
			if (windowImages != null)
				msgs = ((InternalEObject)windowImages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__WINDOW_IMAGES, null, msgs);
			if (newWindowImages != null)
				msgs = ((InternalEObject)newWindowImages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__WINDOW_IMAGES, null, msgs);
			msgs = basicSetWindowImages(newWindowImages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__WINDOW_IMAGES, newWindowImages, newWindowImages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AboutInfo getAboutInfo() {
		return aboutInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAboutInfo(AboutInfo newAboutInfo, NotificationChain msgs) {
		AboutInfo oldAboutInfo = aboutInfo;
		aboutInfo = newAboutInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__ABOUT_INFO, oldAboutInfo, newAboutInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAboutInfo(AboutInfo newAboutInfo) {
		if (newAboutInfo != aboutInfo) {
			NotificationChain msgs = null;
			if (aboutInfo != null)
				msgs = ((InternalEObject)aboutInfo).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__ABOUT_INFO, null, msgs);
			if (newAboutInfo != null)
				msgs = ((InternalEObject)newAboutInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__ABOUT_INFO, null, msgs);
			msgs = basicSetAboutInfo(newAboutInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__ABOUT_INFO, newAboutInfo, newAboutInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Intro getIntro() {
		return intro;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntro(Intro newIntro, NotificationChain msgs) {
		Intro oldIntro = intro;
		intro = newIntro;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__INTRO, oldIntro, newIntro);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntro(Intro newIntro) {
		if (newIntro != intro) {
			NotificationChain msgs = null;
			if (intro != null)
				msgs = ((InternalEObject)intro).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__INTRO, null, msgs);
			if (newIntro != null)
				msgs = ((InternalEObject)newIntro).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__INTRO, null, msgs);
			msgs = basicSetIntro(newIntro, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__INTRO, newIntro, newIntro));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plugins getPlugins() {
		return plugins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlugins(Plugins newPlugins, NotificationChain msgs) {
		Plugins oldPlugins = plugins;
		plugins = newPlugins;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PLUGINS, oldPlugins, newPlugins);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlugins(Plugins newPlugins) {
		if (newPlugins != plugins) {
			NotificationChain msgs = null;
			if (plugins != null)
				msgs = ((InternalEObject)plugins).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__PLUGINS, null, msgs);
			if (newPlugins != null)
				msgs = ((InternalEObject)newPlugins).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__PLUGINS, null, msgs);
			msgs = basicSetPlugins(newPlugins, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__PLUGINS, newPlugins, newPlugins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Features getFeatures() {
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatures(Features newFeatures, NotificationChain msgs) {
		Features oldFeatures = features;
		features = newFeatures;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__FEATURES, oldFeatures, newFeatures);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatures(Features newFeatures) {
		if (newFeatures != features) {
			NotificationChain msgs = null;
			if (features != null)
				msgs = ((InternalEObject)features).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__FEATURES, null, msgs);
			if (newFeatures != null)
				msgs = ((InternalEObject)newFeatures).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.PRODUCT__FEATURES, null, msgs);
			msgs = basicSetFeatures(newFeatures, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__FEATURES, newFeatures, newFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.PRODUCT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.PRODUCT__CONFIG_INI:
				return basicSetConfigIni(null, msgs);
			case ProductPackage.PRODUCT__LAUNCHER_ARGS:
				return basicSetLauncherArgs(null, msgs);
			case ProductPackage.PRODUCT__VM:
				return basicSetVm(null, msgs);
			case ProductPackage.PRODUCT__LAUNCHER:
				return basicSetLauncher(null, msgs);
			case ProductPackage.PRODUCT__SPLASH:
				return basicSetSplash(null, msgs);
			case ProductPackage.PRODUCT__WINDOW_IMAGES:
				return basicSetWindowImages(null, msgs);
			case ProductPackage.PRODUCT__ABOUT_INFO:
				return basicSetAboutInfo(null, msgs);
			case ProductPackage.PRODUCT__INTRO:
				return basicSetIntro(null, msgs);
			case ProductPackage.PRODUCT__PLUGINS:
				return basicSetPlugins(null, msgs);
			case ProductPackage.PRODUCT__FEATURES:
				return basicSetFeatures(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.PRODUCT__CONFIG_INI:
				return getConfigIni();
			case ProductPackage.PRODUCT__LAUNCHER_ARGS:
				return getLauncherArgs();
			case ProductPackage.PRODUCT__NAME:
				return getName();
			case ProductPackage.PRODUCT__ID:
				return getId();
			case ProductPackage.PRODUCT__APPLICATION:
				return getApplication();
			case ProductPackage.PRODUCT__USE_FEATURES:
				return isUseFeatures() ? Boolean.TRUE : Boolean.FALSE;
			case ProductPackage.PRODUCT__VM:
				return getVm();
			case ProductPackage.PRODUCT__LAUNCHER:
				return getLauncher();
			case ProductPackage.PRODUCT__SPLASH:
				return getSplash();
			case ProductPackage.PRODUCT__WINDOW_IMAGES:
				return getWindowImages();
			case ProductPackage.PRODUCT__ABOUT_INFO:
				return getAboutInfo();
			case ProductPackage.PRODUCT__INTRO:
				return getIntro();
			case ProductPackage.PRODUCT__PLUGINS:
				return getPlugins();
			case ProductPackage.PRODUCT__FEATURES:
				return getFeatures();
			case ProductPackage.PRODUCT__VERSION:
				return getVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProductPackage.PRODUCT__CONFIG_INI:
				setConfigIni((ConfigIni)newValue);
				return;
			case ProductPackage.PRODUCT__LAUNCHER_ARGS:
				setLauncherArgs((LauncherArgs)newValue);
				return;
			case ProductPackage.PRODUCT__NAME:
				setName((String)newValue);
				return;
			case ProductPackage.PRODUCT__ID:
				setId((String)newValue);
				return;
			case ProductPackage.PRODUCT__APPLICATION:
				setApplication((String)newValue);
				return;
			case ProductPackage.PRODUCT__USE_FEATURES:
				setUseFeatures(((Boolean)newValue).booleanValue());
				return;
			case ProductPackage.PRODUCT__VM:
				setVm((VirtualMachine)newValue);
				return;
			case ProductPackage.PRODUCT__LAUNCHER:
				setLauncher((Launcher)newValue);
				return;
			case ProductPackage.PRODUCT__SPLASH:
				setSplash((Splash)newValue);
				return;
			case ProductPackage.PRODUCT__WINDOW_IMAGES:
				setWindowImages((WindowImage)newValue);
				return;
			case ProductPackage.PRODUCT__ABOUT_INFO:
				setAboutInfo((AboutInfo)newValue);
				return;
			case ProductPackage.PRODUCT__INTRO:
				setIntro((Intro)newValue);
				return;
			case ProductPackage.PRODUCT__PLUGINS:
				setPlugins((Plugins)newValue);
				return;
			case ProductPackage.PRODUCT__FEATURES:
				setFeatures((Features)newValue);
				return;
			case ProductPackage.PRODUCT__VERSION:
				setVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProductPackage.PRODUCT__CONFIG_INI:
				setConfigIni((ConfigIni)null);
				return;
			case ProductPackage.PRODUCT__LAUNCHER_ARGS:
				setLauncherArgs((LauncherArgs)null);
				return;
			case ProductPackage.PRODUCT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__ID:
				setId(ID_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__USE_FEATURES:
				setUseFeatures(USE_FEATURES_EDEFAULT);
				return;
			case ProductPackage.PRODUCT__VM:
				setVm((VirtualMachine)null);
				return;
			case ProductPackage.PRODUCT__LAUNCHER:
				setLauncher((Launcher)null);
				return;
			case ProductPackage.PRODUCT__SPLASH:
				setSplash((Splash)null);
				return;
			case ProductPackage.PRODUCT__WINDOW_IMAGES:
				setWindowImages((WindowImage)null);
				return;
			case ProductPackage.PRODUCT__ABOUT_INFO:
				setAboutInfo((AboutInfo)null);
				return;
			case ProductPackage.PRODUCT__INTRO:
				setIntro((Intro)null);
				return;
			case ProductPackage.PRODUCT__PLUGINS:
				setPlugins((Plugins)null);
				return;
			case ProductPackage.PRODUCT__FEATURES:
				setFeatures((Features)null);
				return;
			case ProductPackage.PRODUCT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProductPackage.PRODUCT__CONFIG_INI:
				return configIni != null;
			case ProductPackage.PRODUCT__LAUNCHER_ARGS:
				return launcherArgs != null;
			case ProductPackage.PRODUCT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProductPackage.PRODUCT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ProductPackage.PRODUCT__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case ProductPackage.PRODUCT__USE_FEATURES:
				return useFeatures != USE_FEATURES_EDEFAULT;
			case ProductPackage.PRODUCT__VM:
				return vm != null;
			case ProductPackage.PRODUCT__LAUNCHER:
				return launcher != null;
			case ProductPackage.PRODUCT__SPLASH:
				return splash != null;
			case ProductPackage.PRODUCT__WINDOW_IMAGES:
				return windowImages != null;
			case ProductPackage.PRODUCT__ABOUT_INFO:
				return aboutInfo != null;
			case ProductPackage.PRODUCT__INTRO:
				return intro != null;
			case ProductPackage.PRODUCT__PLUGINS:
				return plugins != null;
			case ProductPackage.PRODUCT__FEATURES:
				return features != null;
			case ProductPackage.PRODUCT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", application: ");
		result.append(application);
		result.append(", useFeatures: ");
		result.append(useFeatures);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //ProductImpl
