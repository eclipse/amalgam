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
 * $Id: ConfigIniImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.ConfigIni;
import org.eclipse.amalgam.releng.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Ini</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ConfigIniImpl#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ConfigIniImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ConfigIniImpl#getLinux <em>Linux</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ConfigIniImpl#getMacosx <em>Macosx</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ConfigIniImpl#getSolaris <em>Solaris</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.ConfigIniImpl#getWin32 <em>Win32</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigIniImpl extends EObjectImpl implements ConfigIni {
	/**
	 * The default value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected String use = USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLinux() <em>Linux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinux()
	 * @generated
	 * @ordered
	 */
	protected static final String LINUX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinux() <em>Linux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinux()
	 * @generated
	 * @ordered
	 */
	protected String linux = LINUX_EDEFAULT;

	/**
	 * The default value of the '{@link #getMacosx() <em>Macosx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacosx()
	 * @generated
	 * @ordered
	 */
	protected static final String MACOSX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacosx() <em>Macosx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacosx()
	 * @generated
	 * @ordered
	 */
	protected String macosx = MACOSX_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolaris() <em>Solaris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolaris()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLARIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolaris() <em>Solaris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolaris()
	 * @generated
	 * @ordered
	 */
	protected String solaris = SOLARIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWin32() <em>Win32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin32()
	 * @generated
	 * @ordered
	 */
	protected static final String WIN32_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWin32() <em>Win32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin32()
	 * @generated
	 * @ordered
	 */
	protected String win32 = WIN32_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigIniImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.CONFIG_INI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUse(String newUse) {
		String oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CONFIG_INI__USE, oldUse, use));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CONFIG_INI__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinux() {
		return linux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinux(String newLinux) {
		String oldLinux = linux;
		linux = newLinux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CONFIG_INI__LINUX, oldLinux, linux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMacosx() {
		return macosx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacosx(String newMacosx) {
		String oldMacosx = macosx;
		macosx = newMacosx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CONFIG_INI__MACOSX, oldMacosx, macosx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolaris() {
		return solaris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolaris(String newSolaris) {
		String oldSolaris = solaris;
		solaris = newSolaris;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CONFIG_INI__SOLARIS, oldSolaris, solaris));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWin32() {
		return win32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWin32(String newWin32) {
		String oldWin32 = win32;
		win32 = newWin32;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.CONFIG_INI__WIN32, oldWin32, win32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.CONFIG_INI__USE:
				return getUse();
			case ProductPackage.CONFIG_INI__PATH:
				return getPath();
			case ProductPackage.CONFIG_INI__LINUX:
				return getLinux();
			case ProductPackage.CONFIG_INI__MACOSX:
				return getMacosx();
			case ProductPackage.CONFIG_INI__SOLARIS:
				return getSolaris();
			case ProductPackage.CONFIG_INI__WIN32:
				return getWin32();
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
			case ProductPackage.CONFIG_INI__USE:
				setUse((String)newValue);
				return;
			case ProductPackage.CONFIG_INI__PATH:
				setPath((String)newValue);
				return;
			case ProductPackage.CONFIG_INI__LINUX:
				setLinux((String)newValue);
				return;
			case ProductPackage.CONFIG_INI__MACOSX:
				setMacosx((String)newValue);
				return;
			case ProductPackage.CONFIG_INI__SOLARIS:
				setSolaris((String)newValue);
				return;
			case ProductPackage.CONFIG_INI__WIN32:
				setWin32((String)newValue);
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
			case ProductPackage.CONFIG_INI__USE:
				setUse(USE_EDEFAULT);
				return;
			case ProductPackage.CONFIG_INI__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ProductPackage.CONFIG_INI__LINUX:
				setLinux(LINUX_EDEFAULT);
				return;
			case ProductPackage.CONFIG_INI__MACOSX:
				setMacosx(MACOSX_EDEFAULT);
				return;
			case ProductPackage.CONFIG_INI__SOLARIS:
				setSolaris(SOLARIS_EDEFAULT);
				return;
			case ProductPackage.CONFIG_INI__WIN32:
				setWin32(WIN32_EDEFAULT);
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
			case ProductPackage.CONFIG_INI__USE:
				return USE_EDEFAULT == null ? use != null : !USE_EDEFAULT.equals(use);
			case ProductPackage.CONFIG_INI__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ProductPackage.CONFIG_INI__LINUX:
				return LINUX_EDEFAULT == null ? linux != null : !LINUX_EDEFAULT.equals(linux);
			case ProductPackage.CONFIG_INI__MACOSX:
				return MACOSX_EDEFAULT == null ? macosx != null : !MACOSX_EDEFAULT.equals(macosx);
			case ProductPackage.CONFIG_INI__SOLARIS:
				return SOLARIS_EDEFAULT == null ? solaris != null : !SOLARIS_EDEFAULT.equals(solaris);
			case ProductPackage.CONFIG_INI__WIN32:
				return WIN32_EDEFAULT == null ? win32 != null : !WIN32_EDEFAULT.equals(win32);
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
		result.append(" (use: ");
		result.append(use);
		result.append(", path: ");
		result.append(path);
		result.append(", linux: ");
		result.append(linux);
		result.append(", macosx: ");
		result.append(macosx);
		result.append(", solaris: ");
		result.append(solaris);
		result.append(", win32: ");
		result.append(win32);
		result.append(')');
		return result.toString();
	}

} //ConfigIniImpl
