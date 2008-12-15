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
 * $Id: PromotionImpl.java,v 1.2 2008/12/15 01:31:42 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build.impl;

import org.eclipse.amalgam.releng.build.BuildPackage;
import org.eclipse.amalgam.releng.build.Promotion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Promotion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.PromotionImpl#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.PromotionImpl#isIncubating <em>Incubating</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.PromotionImpl#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.PromotionImpl#getBuildAlias <em>Build Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PromotionImpl extends EObjectImpl implements Promotion {
	/**
	 * The default value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectory() <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectory()
	 * @generated
	 * @ordered
	 */
	protected String directory = DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIncubating() <em>Incubating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncubating()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCUBATING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIncubating() <em>Incubating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncubating()
	 * @generated
	 * @ordered
	 */
	protected boolean incubating = INCUBATING_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseURL() <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseURL()
	 * @generated
	 * @ordered
	 */
	protected String baseURL = BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildAlias() <em>Build Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildAlias() <em>Build Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildAlias()
	 * @generated
	 * @ordered
	 */
	protected String buildAlias = BUILD_ALIAS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PromotionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.PROMOTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirectory() {
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectory(String newDirectory) {
		String oldDirectory = directory;
		directory = newDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.PROMOTION__DIRECTORY, oldDirectory, directory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncubating() {
		return incubating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncubating(boolean newIncubating) {
		boolean oldIncubating = incubating;
		incubating = newIncubating;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.PROMOTION__INCUBATING, oldIncubating, incubating));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseURL() {
		return baseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseURL(String newBaseURL) {
		String oldBaseURL = baseURL;
		baseURL = newBaseURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.PROMOTION__BASE_URL, oldBaseURL, baseURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBuildAlias() {
		return buildAlias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildAlias(String newBuildAlias) {
		String oldBuildAlias = buildAlias;
		buildAlias = newBuildAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.PROMOTION__BUILD_ALIAS, oldBuildAlias, buildAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuildPackage.PROMOTION__DIRECTORY:
				return getDirectory();
			case BuildPackage.PROMOTION__INCUBATING:
				return isIncubating() ? Boolean.TRUE : Boolean.FALSE;
			case BuildPackage.PROMOTION__BASE_URL:
				return getBaseURL();
			case BuildPackage.PROMOTION__BUILD_ALIAS:
				return getBuildAlias();
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
			case BuildPackage.PROMOTION__DIRECTORY:
				setDirectory((String)newValue);
				return;
			case BuildPackage.PROMOTION__INCUBATING:
				setIncubating(((Boolean)newValue).booleanValue());
				return;
			case BuildPackage.PROMOTION__BASE_URL:
				setBaseURL((String)newValue);
				return;
			case BuildPackage.PROMOTION__BUILD_ALIAS:
				setBuildAlias((String)newValue);
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
			case BuildPackage.PROMOTION__DIRECTORY:
				setDirectory(DIRECTORY_EDEFAULT);
				return;
			case BuildPackage.PROMOTION__INCUBATING:
				setIncubating(INCUBATING_EDEFAULT);
				return;
			case BuildPackage.PROMOTION__BASE_URL:
				setBaseURL(BASE_URL_EDEFAULT);
				return;
			case BuildPackage.PROMOTION__BUILD_ALIAS:
				setBuildAlias(BUILD_ALIAS_EDEFAULT);
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
			case BuildPackage.PROMOTION__DIRECTORY:
				return DIRECTORY_EDEFAULT == null ? directory != null : !DIRECTORY_EDEFAULT.equals(directory);
			case BuildPackage.PROMOTION__INCUBATING:
				return incubating != INCUBATING_EDEFAULT;
			case BuildPackage.PROMOTION__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseURL != null : !BASE_URL_EDEFAULT.equals(baseURL);
			case BuildPackage.PROMOTION__BUILD_ALIAS:
				return BUILD_ALIAS_EDEFAULT == null ? buildAlias != null : !BUILD_ALIAS_EDEFAULT.equals(buildAlias);
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
		result.append(" (directory: ");
		result.append(directory);
		result.append(", incubating: ");
		result.append(incubating);
		result.append(", baseURL: ");
		result.append(baseURL);
		result.append(", buildAlias: ");
		result.append(buildAlias);
		result.append(')');
		return result.toString();
	}

} //PromotionImpl
