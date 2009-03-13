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
 * $Id: BuildImpl.java,v 1.7 2009/03/13 11:09:27 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build.impl;

import java.util.Collection;

import org.eclipse.amalgam.releng.build.Build;
import org.eclipse.amalgam.releng.build.BuildPackage;
import org.eclipse.amalgam.releng.build.BuildType;
import org.eclipse.amalgam.releng.build.Category;
import org.eclipse.amalgam.releng.build.Config;
import org.eclipse.amalgam.releng.build.Contact;
import org.eclipse.amalgam.releng.build.Contribution;
import org.eclipse.amalgam.releng.build.Map;
import org.eclipse.amalgam.releng.build.Platform;

import org.eclipse.amalgam.releng.build.Promotion;
import org.eclipse.amalgam.releng.product.Product;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getBuildRoot <em>Build Root</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getConfigs <em>Configs</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getFetchTag <em>Fetch Tag</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getContributions <em>Contributions</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getBuilder <em>Builder</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getLaunchVM <em>Launch VM</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getPromotion <em>Promotion</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getBuilderURL <em>Builder URL</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getBuildmaster <em>Buildmaster</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#getDefaultMailList <em>Default Mail List</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.BuildImpl#isSendmail <em>Sendmail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BuildImpl extends EObjectImpl implements Build {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BuildType TYPE_EDEFAULT = BuildType.CONTINUOUS;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BuildType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildRoot() <em>Build Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_ROOT_EDEFAULT = "${user.home}/build";

	/**
	 * The cached value of the '{@link #getBuildRoot() <em>Build Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildRoot()
	 * @generated
	 * @ordered
	 */
	protected String buildRoot = BUILD_ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlatforms() <em>Platforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Platform> platforms;

	/**
	 * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigs()
	 * @generated
	 * @ordered
	 */
	protected EList<Config> configs;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Map map;

	/**
	 * The default value of the '{@link #getFetchTag() <em>Fetch Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchTag()
	 * @generated
	 * @ordered
	 */
	protected static final String FETCH_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFetchTag() <em>Fetch Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetchTag()
	 * @generated
	 * @ordered
	 */
	protected String fetchTag = FETCH_TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategories() <em>Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> categories;

	/**
	 * The cached value of the '{@link #getContributions() <em>Contributions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContributions()
	 * @generated
	 * @ordered
	 */
	protected EList<Contribution> contributions;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected Platform base;

	/**
	 * The cached value of the '{@link #getBuilder() <em>Builder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilder()
	 * @generated
	 * @ordered
	 */
	protected Platform builder;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected String date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCompiler() <em>Compiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompiler()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.amalgam.releng.build.Compiler compiler;

	/**
	 * The default value of the '{@link #getLaunchVM() <em>Launch VM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchVM()
	 * @generated
	 * @ordered
	 */
	protected static final String LAUNCH_VM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLaunchVM() <em>Launch VM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaunchVM()
	 * @generated
	 * @ordered
	 */
	protected String launchVM = LAUNCH_VM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPromotion() <em>Promotion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromotion()
	 * @generated
	 * @ordered
	 */
	protected Promotion promotion;

	/**
	 * The default value of the '{@link #getBuilderURL() <em>Builder URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILDER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuilderURL() <em>Builder URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuilderURL()
	 * @generated
	 * @ordered
	 */
	protected String builderURL = BUILDER_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBuildmaster() <em>Buildmaster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildmaster()
	 * @generated
	 * @ordered
	 */
	protected Contact buildmaster;

	/**
	 * The cached value of the '{@link #getDefaultMailList() <em>Default Mail List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultMailList()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> defaultMailList;

	/**
	 * The default value of the '{@link #isSendmail() <em>Sendmail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendmail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SENDMAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSendmail() <em>Sendmail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSendmail()
	 * @generated
	 * @ordered
	 */
	protected boolean sendmail = SENDMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.BUILD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BuildType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BuildType newType) {
		BuildType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildRoot() {
		return buildRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildRoot(String newBuildRoot) {
		String oldBuildRoot = buildRoot;
		buildRoot = newBuildRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__BUILD_ROOT, oldBuildRoot, buildRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Platform> getPlatforms() {
		if (platforms == null) {
			platforms = new EObjectContainmentEList.Resolving<Platform>(Platform.class, this, BuildPackage.BUILD__PLATFORMS);
		}
		return platforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Config> getConfigs() {
		if (configs == null) {
			configs = new EObjectContainmentEList.Resolving<Config>(Config.class, this, BuildPackage.BUILD__CONFIGS);
		}
		return configs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map getMap() {
		if (map != null && map.eIsProxy()) {
			InternalEObject oldMap = (InternalEObject)map;
			map = (Map)eResolveProxy(oldMap);
			if (map != oldMap) {
				InternalEObject newMap = (InternalEObject)map;
				NotificationChain msgs = oldMap.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__MAP, null, null);
				if (newMap.eInternalContainer() == null) {
					msgs = newMap.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__MAP, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.BUILD__MAP, oldMap, map));
			}
		}
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map basicGetMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMap(Map newMap, NotificationChain msgs) {
		Map oldMap = map;
		map = newMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__MAP, oldMap, newMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(Map newMap) {
		if (newMap != map) {
			NotificationChain msgs = null;
			if (map != null)
				msgs = ((InternalEObject)map).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__MAP, null, msgs);
			if (newMap != null)
				msgs = ((InternalEObject)newMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__MAP, null, msgs);
			msgs = basicSetMap(newMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__MAP, newMap, newMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFetchTag() {
		return fetchTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFetchTag(String newFetchTag) {
		String oldFetchTag = fetchTag;
		fetchTag = newFetchTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__FETCH_TAG, oldFetchTag, fetchTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategories() {
		if (categories == null) {
			categories = new EObjectContainmentEList.Resolving<Category>(Category.class, this, BuildPackage.BUILD__CATEGORIES);
		}
		return categories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contribution> getContributions() {
		if (contributions == null) {
			contributions = new EObjectContainmentEList.Resolving<Contribution>(Contribution.class, this, BuildPackage.BUILD__CONTRIBUTIONS);
		}
		return contributions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject)product;
			product = (Product)eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.BUILD__PRODUCT, oldProduct, product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform getBase() {
		if (base != null && base.eIsProxy()) {
			InternalEObject oldBase = (InternalEObject)base;
			base = (Platform)eResolveProxy(oldBase);
			if (base != oldBase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.BUILD__BASE, oldBase, base));
			}
		}
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform basicGetBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(Platform newBase) {
		Platform oldBase = base;
		base = newBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__BASE, oldBase, base));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform getBuilder() {
		if (builder != null && builder.eIsProxy()) {
			InternalEObject oldBuilder = (InternalEObject)builder;
			builder = (Platform)eResolveProxy(oldBuilder);
			if (builder != oldBuilder) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.BUILD__BUILDER, oldBuilder, builder));
			}
		}
		return builder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Platform basicGetBuilder() {
		return builder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuilder(Platform newBuilder) {
		Platform oldBuilder = builder;
		builder = newBuilder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__BUILDER, oldBuilder, builder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(String newDate) {
		String oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.amalgam.releng.build.Compiler getCompiler() {
		if (compiler != null && compiler.eIsProxy()) {
			InternalEObject oldCompiler = (InternalEObject)compiler;
			compiler = (org.eclipse.amalgam.releng.build.Compiler)eResolveProxy(oldCompiler);
			if (compiler != oldCompiler) {
				InternalEObject newCompiler = (InternalEObject)compiler;
				NotificationChain msgs = oldCompiler.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__COMPILER, null, null);
				if (newCompiler.eInternalContainer() == null) {
					msgs = newCompiler.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__COMPILER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.BUILD__COMPILER, oldCompiler, compiler));
			}
		}
		return compiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.amalgam.releng.build.Compiler basicGetCompiler() {
		return compiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompiler(org.eclipse.amalgam.releng.build.Compiler newCompiler, NotificationChain msgs) {
		org.eclipse.amalgam.releng.build.Compiler oldCompiler = compiler;
		compiler = newCompiler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__COMPILER, oldCompiler, newCompiler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompiler(org.eclipse.amalgam.releng.build.Compiler newCompiler) {
		if (newCompiler != compiler) {
			NotificationChain msgs = null;
			if (compiler != null)
				msgs = ((InternalEObject)compiler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__COMPILER, null, msgs);
			if (newCompiler != null)
				msgs = ((InternalEObject)newCompiler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__COMPILER, null, msgs);
			msgs = basicSetCompiler(newCompiler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__COMPILER, newCompiler, newCompiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLaunchVM() {
		return launchVM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunchVM(String newLaunchVM) {
		String oldLaunchVM = launchVM;
		launchVM = newLaunchVM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__LAUNCH_VM, oldLaunchVM, launchVM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Promotion getPromotion() {
		if (promotion != null && promotion.eIsProxy()) {
			InternalEObject oldPromotion = (InternalEObject)promotion;
			promotion = (Promotion)eResolveProxy(oldPromotion);
			if (promotion != oldPromotion) {
				InternalEObject newPromotion = (InternalEObject)promotion;
				NotificationChain msgs = oldPromotion.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__PROMOTION, null, null);
				if (newPromotion.eInternalContainer() == null) {
					msgs = newPromotion.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__PROMOTION, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.BUILD__PROMOTION, oldPromotion, promotion));
			}
		}
		return promotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Promotion basicGetPromotion() {
		return promotion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPromotion(Promotion newPromotion, NotificationChain msgs) {
		Promotion oldPromotion = promotion;
		promotion = newPromotion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__PROMOTION, oldPromotion, newPromotion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromotion(Promotion newPromotion) {
		if (newPromotion != promotion) {
			NotificationChain msgs = null;
			if (promotion != null)
				msgs = ((InternalEObject)promotion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__PROMOTION, null, msgs);
			if (newPromotion != null)
				msgs = ((InternalEObject)newPromotion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__PROMOTION, null, msgs);
			msgs = basicSetPromotion(newPromotion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__PROMOTION, newPromotion, newPromotion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuilderURL() {
		return builderURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuilderURL(String newBuilderURL) {
		String oldBuilderURL = builderURL;
		builderURL = newBuilderURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__BUILDER_URL, oldBuilderURL, builderURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact getBuildmaster() {
		if (buildmaster != null && buildmaster.eIsProxy()) {
			InternalEObject oldBuildmaster = (InternalEObject)buildmaster;
			buildmaster = (Contact)eResolveProxy(oldBuildmaster);
			if (buildmaster != oldBuildmaster) {
				InternalEObject newBuildmaster = (InternalEObject)buildmaster;
				NotificationChain msgs = oldBuildmaster.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__BUILDMASTER, null, null);
				if (newBuildmaster.eInternalContainer() == null) {
					msgs = newBuildmaster.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__BUILDMASTER, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BuildPackage.BUILD__BUILDMASTER, oldBuildmaster, buildmaster));
			}
		}
		return buildmaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact basicGetBuildmaster() {
		return buildmaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuildmaster(Contact newBuildmaster, NotificationChain msgs) {
		Contact oldBuildmaster = buildmaster;
		buildmaster = newBuildmaster;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__BUILDMASTER, oldBuildmaster, newBuildmaster);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildmaster(Contact newBuildmaster) {
		if (newBuildmaster != buildmaster) {
			NotificationChain msgs = null;
			if (buildmaster != null)
				msgs = ((InternalEObject)buildmaster).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__BUILDMASTER, null, msgs);
			if (newBuildmaster != null)
				msgs = ((InternalEObject)newBuildmaster).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BuildPackage.BUILD__BUILDMASTER, null, msgs);
			msgs = basicSetBuildmaster(newBuildmaster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__BUILDMASTER, newBuildmaster, newBuildmaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getDefaultMailList() {
		if (defaultMailList == null) {
			defaultMailList = new EObjectContainmentEList.Resolving<Contact>(Contact.class, this, BuildPackage.BUILD__DEFAULT_MAIL_LIST);
		}
		return defaultMailList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSendmail() {
		return sendmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendmail(boolean newSendmail) {
		boolean oldSendmail = sendmail;
		sendmail = newSendmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.BUILD__SENDMAIL, oldSendmail, sendmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildPackage.BUILD__PLATFORMS:
				return ((InternalEList<?>)getPlatforms()).basicRemove(otherEnd, msgs);
			case BuildPackage.BUILD__CONFIGS:
				return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
			case BuildPackage.BUILD__MAP:
				return basicSetMap(null, msgs);
			case BuildPackage.BUILD__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
			case BuildPackage.BUILD__CONTRIBUTIONS:
				return ((InternalEList<?>)getContributions()).basicRemove(otherEnd, msgs);
			case BuildPackage.BUILD__COMPILER:
				return basicSetCompiler(null, msgs);
			case BuildPackage.BUILD__PROMOTION:
				return basicSetPromotion(null, msgs);
			case BuildPackage.BUILD__BUILDMASTER:
				return basicSetBuildmaster(null, msgs);
			case BuildPackage.BUILD__DEFAULT_MAIL_LIST:
				return ((InternalEList<?>)getDefaultMailList()).basicRemove(otherEnd, msgs);
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
			case BuildPackage.BUILD__TYPE:
				return getType();
			case BuildPackage.BUILD__BUILD_ROOT:
				return getBuildRoot();
			case BuildPackage.BUILD__PLATFORMS:
				return getPlatforms();
			case BuildPackage.BUILD__CONFIGS:
				return getConfigs();
			case BuildPackage.BUILD__MAP:
				if (resolve) return getMap();
				return basicGetMap();
			case BuildPackage.BUILD__FETCH_TAG:
				return getFetchTag();
			case BuildPackage.BUILD__CATEGORIES:
				return getCategories();
			case BuildPackage.BUILD__CONTRIBUTIONS:
				return getContributions();
			case BuildPackage.BUILD__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case BuildPackage.BUILD__LABEL:
				return getLabel();
			case BuildPackage.BUILD__BASE:
				if (resolve) return getBase();
				return basicGetBase();
			case BuildPackage.BUILD__BUILDER:
				if (resolve) return getBuilder();
				return basicGetBuilder();
			case BuildPackage.BUILD__DATE:
				return getDate();
			case BuildPackage.BUILD__TIME:
				return getTime();
			case BuildPackage.BUILD__COMPILER:
				if (resolve) return getCompiler();
				return basicGetCompiler();
			case BuildPackage.BUILD__LAUNCH_VM:
				return getLaunchVM();
			case BuildPackage.BUILD__PROMOTION:
				if (resolve) return getPromotion();
				return basicGetPromotion();
			case BuildPackage.BUILD__BUILDER_URL:
				return getBuilderURL();
			case BuildPackage.BUILD__BUILDMASTER:
				if (resolve) return getBuildmaster();
				return basicGetBuildmaster();
			case BuildPackage.BUILD__DEFAULT_MAIL_LIST:
				return getDefaultMailList();
			case BuildPackage.BUILD__SENDMAIL:
				return isSendmail();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BuildPackage.BUILD__TYPE:
				setType((BuildType)newValue);
				return;
			case BuildPackage.BUILD__BUILD_ROOT:
				setBuildRoot((String)newValue);
				return;
			case BuildPackage.BUILD__PLATFORMS:
				getPlatforms().clear();
				getPlatforms().addAll((Collection<? extends Platform>)newValue);
				return;
			case BuildPackage.BUILD__CONFIGS:
				getConfigs().clear();
				getConfigs().addAll((Collection<? extends Config>)newValue);
				return;
			case BuildPackage.BUILD__MAP:
				setMap((Map)newValue);
				return;
			case BuildPackage.BUILD__FETCH_TAG:
				setFetchTag((String)newValue);
				return;
			case BuildPackage.BUILD__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Category>)newValue);
				return;
			case BuildPackage.BUILD__CONTRIBUTIONS:
				getContributions().clear();
				getContributions().addAll((Collection<? extends Contribution>)newValue);
				return;
			case BuildPackage.BUILD__PRODUCT:
				setProduct((Product)newValue);
				return;
			case BuildPackage.BUILD__LABEL:
				setLabel((String)newValue);
				return;
			case BuildPackage.BUILD__BASE:
				setBase((Platform)newValue);
				return;
			case BuildPackage.BUILD__BUILDER:
				setBuilder((Platform)newValue);
				return;
			case BuildPackage.BUILD__DATE:
				setDate((String)newValue);
				return;
			case BuildPackage.BUILD__TIME:
				setTime((String)newValue);
				return;
			case BuildPackage.BUILD__COMPILER:
				setCompiler((org.eclipse.amalgam.releng.build.Compiler)newValue);
				return;
			case BuildPackage.BUILD__LAUNCH_VM:
				setLaunchVM((String)newValue);
				return;
			case BuildPackage.BUILD__PROMOTION:
				setPromotion((Promotion)newValue);
				return;
			case BuildPackage.BUILD__BUILDER_URL:
				setBuilderURL((String)newValue);
				return;
			case BuildPackage.BUILD__BUILDMASTER:
				setBuildmaster((Contact)newValue);
				return;
			case BuildPackage.BUILD__DEFAULT_MAIL_LIST:
				getDefaultMailList().clear();
				getDefaultMailList().addAll((Collection<? extends Contact>)newValue);
				return;
			case BuildPackage.BUILD__SENDMAIL:
				setSendmail((Boolean)newValue);
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
			case BuildPackage.BUILD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BuildPackage.BUILD__BUILD_ROOT:
				setBuildRoot(BUILD_ROOT_EDEFAULT);
				return;
			case BuildPackage.BUILD__PLATFORMS:
				getPlatforms().clear();
				return;
			case BuildPackage.BUILD__CONFIGS:
				getConfigs().clear();
				return;
			case BuildPackage.BUILD__MAP:
				setMap((Map)null);
				return;
			case BuildPackage.BUILD__FETCH_TAG:
				setFetchTag(FETCH_TAG_EDEFAULT);
				return;
			case BuildPackage.BUILD__CATEGORIES:
				getCategories().clear();
				return;
			case BuildPackage.BUILD__CONTRIBUTIONS:
				getContributions().clear();
				return;
			case BuildPackage.BUILD__PRODUCT:
				setProduct((Product)null);
				return;
			case BuildPackage.BUILD__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case BuildPackage.BUILD__BASE:
				setBase((Platform)null);
				return;
			case BuildPackage.BUILD__BUILDER:
				setBuilder((Platform)null);
				return;
			case BuildPackage.BUILD__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case BuildPackage.BUILD__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case BuildPackage.BUILD__COMPILER:
				setCompiler((org.eclipse.amalgam.releng.build.Compiler)null);
				return;
			case BuildPackage.BUILD__LAUNCH_VM:
				setLaunchVM(LAUNCH_VM_EDEFAULT);
				return;
			case BuildPackage.BUILD__PROMOTION:
				setPromotion((Promotion)null);
				return;
			case BuildPackage.BUILD__BUILDER_URL:
				setBuilderURL(BUILDER_URL_EDEFAULT);
				return;
			case BuildPackage.BUILD__BUILDMASTER:
				setBuildmaster((Contact)null);
				return;
			case BuildPackage.BUILD__DEFAULT_MAIL_LIST:
				getDefaultMailList().clear();
				return;
			case BuildPackage.BUILD__SENDMAIL:
				setSendmail(SENDMAIL_EDEFAULT);
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
			case BuildPackage.BUILD__TYPE:
				return type != TYPE_EDEFAULT;
			case BuildPackage.BUILD__BUILD_ROOT:
				return BUILD_ROOT_EDEFAULT == null ? buildRoot != null : !BUILD_ROOT_EDEFAULT.equals(buildRoot);
			case BuildPackage.BUILD__PLATFORMS:
				return platforms != null && !platforms.isEmpty();
			case BuildPackage.BUILD__CONFIGS:
				return configs != null && !configs.isEmpty();
			case BuildPackage.BUILD__MAP:
				return map != null;
			case BuildPackage.BUILD__FETCH_TAG:
				return FETCH_TAG_EDEFAULT == null ? fetchTag != null : !FETCH_TAG_EDEFAULT.equals(fetchTag);
			case BuildPackage.BUILD__CATEGORIES:
				return categories != null && !categories.isEmpty();
			case BuildPackage.BUILD__CONTRIBUTIONS:
				return contributions != null && !contributions.isEmpty();
			case BuildPackage.BUILD__PRODUCT:
				return product != null;
			case BuildPackage.BUILD__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case BuildPackage.BUILD__BASE:
				return base != null;
			case BuildPackage.BUILD__BUILDER:
				return builder != null;
			case BuildPackage.BUILD__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case BuildPackage.BUILD__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case BuildPackage.BUILD__COMPILER:
				return compiler != null;
			case BuildPackage.BUILD__LAUNCH_VM:
				return LAUNCH_VM_EDEFAULT == null ? launchVM != null : !LAUNCH_VM_EDEFAULT.equals(launchVM);
			case BuildPackage.BUILD__PROMOTION:
				return promotion != null;
			case BuildPackage.BUILD__BUILDER_URL:
				return BUILDER_URL_EDEFAULT == null ? builderURL != null : !BUILDER_URL_EDEFAULT.equals(builderURL);
			case BuildPackage.BUILD__BUILDMASTER:
				return buildmaster != null;
			case BuildPackage.BUILD__DEFAULT_MAIL_LIST:
				return defaultMailList != null && !defaultMailList.isEmpty();
			case BuildPackage.BUILD__SENDMAIL:
				return sendmail != SENDMAIL_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", buildRoot: ");
		result.append(buildRoot);
		result.append(", fetchTag: ");
		result.append(fetchTag);
		result.append(", label: ");
		result.append(label);
		result.append(", date: ");
		result.append(date);
		result.append(", time: ");
		result.append(time);
		result.append(", launchVM: ");
		result.append(launchVM);
		result.append(", builderURL: ");
		result.append(builderURL);
		result.append(", sendmail: ");
		result.append(sendmail);
		result.append(')');
		return result.toString();
	}

} //BuildImpl
