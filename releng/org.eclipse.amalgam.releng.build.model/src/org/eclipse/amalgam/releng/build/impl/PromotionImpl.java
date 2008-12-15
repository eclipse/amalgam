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
 * $Id: PromotionImpl.java,v 1.3 2008/12/15 21:09:05 rgronback Exp $
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
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.PromotionImpl#getUploadDirectory <em>Upload Directory</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.PromotionImpl#getDownloadDirectory <em>Download Directory</em>}</li>
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
	 * The default value of the '{@link #getUploadDirectory() <em>Upload Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String UPLOAD_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUploadDirectory() <em>Upload Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUploadDirectory()
	 * @generated
	 * @ordered
	 */
	protected String uploadDirectory = UPLOAD_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDownloadDirectory() <em>Download Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String DOWNLOAD_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDownloadDirectory() <em>Download Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownloadDirectory()
	 * @generated
	 * @ordered
	 */
	protected String downloadDirectory = DOWNLOAD_DIRECTORY_EDEFAULT;

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
	public String getUploadDirectory() {
		return uploadDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUploadDirectory(String newUploadDirectory) {
		String oldUploadDirectory = uploadDirectory;
		uploadDirectory = newUploadDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.PROMOTION__UPLOAD_DIRECTORY, oldUploadDirectory, uploadDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDownloadDirectory() {
		return downloadDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownloadDirectory(String newDownloadDirectory) {
		String oldDownloadDirectory = downloadDirectory;
		downloadDirectory = newDownloadDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.PROMOTION__DOWNLOAD_DIRECTORY, oldDownloadDirectory, downloadDirectory));
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
			case BuildPackage.PROMOTION__UPLOAD_DIRECTORY:
				return getUploadDirectory();
			case BuildPackage.PROMOTION__DOWNLOAD_DIRECTORY:
				return getDownloadDirectory();
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
			case BuildPackage.PROMOTION__UPLOAD_DIRECTORY:
				setUploadDirectory((String)newValue);
				return;
			case BuildPackage.PROMOTION__DOWNLOAD_DIRECTORY:
				setDownloadDirectory((String)newValue);
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
			case BuildPackage.PROMOTION__UPLOAD_DIRECTORY:
				setUploadDirectory(UPLOAD_DIRECTORY_EDEFAULT);
				return;
			case BuildPackage.PROMOTION__DOWNLOAD_DIRECTORY:
				setDownloadDirectory(DOWNLOAD_DIRECTORY_EDEFAULT);
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
			case BuildPackage.PROMOTION__UPLOAD_DIRECTORY:
				return UPLOAD_DIRECTORY_EDEFAULT == null ? uploadDirectory != null : !UPLOAD_DIRECTORY_EDEFAULT.equals(uploadDirectory);
			case BuildPackage.PROMOTION__DOWNLOAD_DIRECTORY:
				return DOWNLOAD_DIRECTORY_EDEFAULT == null ? downloadDirectory != null : !DOWNLOAD_DIRECTORY_EDEFAULT.equals(downloadDirectory);
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
		result.append(" (uploadDirectory: ");
		result.append(uploadDirectory);
		result.append(", downloadDirectory: ");
		result.append(downloadDirectory);
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
