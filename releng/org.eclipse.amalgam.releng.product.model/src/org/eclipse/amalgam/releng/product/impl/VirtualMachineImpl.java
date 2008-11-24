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
 * $Id: VirtualMachineImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.ProductPackage;
import org.eclipse.amalgam.releng.product.VirtualMachine;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.VirtualMachineImpl#getMacos <em>Macos</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.VirtualMachineImpl#getSolaris <em>Solaris</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.VirtualMachineImpl#getLinux <em>Linux</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.VirtualMachineImpl#getWindows <em>Windows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VirtualMachineImpl extends EObjectImpl implements VirtualMachine {
	/**
	 * The default value of the '{@link #getMacos() <em>Macos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacos()
	 * @generated
	 * @ordered
	 */
	protected static final String MACOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMacos() <em>Macos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacos()
	 * @generated
	 * @ordered
	 */
	protected String macos = MACOS_EDEFAULT;

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
	 * The default value of the '{@link #getWindows() <em>Windows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected static final String WINDOWS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected String windows = WINDOWS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VirtualMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.VIRTUAL_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMacos() {
		return macos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacos(String newMacos) {
		String oldMacos = macos;
		macos = newMacos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.VIRTUAL_MACHINE__MACOS, oldMacos, macos));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.VIRTUAL_MACHINE__SOLARIS, oldSolaris, solaris));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.VIRTUAL_MACHINE__LINUX, oldLinux, linux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWindows() {
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWindows(String newWindows) {
		String oldWindows = windows;
		windows = newWindows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.VIRTUAL_MACHINE__WINDOWS, oldWindows, windows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.VIRTUAL_MACHINE__MACOS:
				return getMacos();
			case ProductPackage.VIRTUAL_MACHINE__SOLARIS:
				return getSolaris();
			case ProductPackage.VIRTUAL_MACHINE__LINUX:
				return getLinux();
			case ProductPackage.VIRTUAL_MACHINE__WINDOWS:
				return getWindows();
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
			case ProductPackage.VIRTUAL_MACHINE__MACOS:
				setMacos((String)newValue);
				return;
			case ProductPackage.VIRTUAL_MACHINE__SOLARIS:
				setSolaris((String)newValue);
				return;
			case ProductPackage.VIRTUAL_MACHINE__LINUX:
				setLinux((String)newValue);
				return;
			case ProductPackage.VIRTUAL_MACHINE__WINDOWS:
				setWindows((String)newValue);
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
			case ProductPackage.VIRTUAL_MACHINE__MACOS:
				setMacos(MACOS_EDEFAULT);
				return;
			case ProductPackage.VIRTUAL_MACHINE__SOLARIS:
				setSolaris(SOLARIS_EDEFAULT);
				return;
			case ProductPackage.VIRTUAL_MACHINE__LINUX:
				setLinux(LINUX_EDEFAULT);
				return;
			case ProductPackage.VIRTUAL_MACHINE__WINDOWS:
				setWindows(WINDOWS_EDEFAULT);
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
			case ProductPackage.VIRTUAL_MACHINE__MACOS:
				return MACOS_EDEFAULT == null ? macos != null : !MACOS_EDEFAULT.equals(macos);
			case ProductPackage.VIRTUAL_MACHINE__SOLARIS:
				return SOLARIS_EDEFAULT == null ? solaris != null : !SOLARIS_EDEFAULT.equals(solaris);
			case ProductPackage.VIRTUAL_MACHINE__LINUX:
				return LINUX_EDEFAULT == null ? linux != null : !LINUX_EDEFAULT.equals(linux);
			case ProductPackage.VIRTUAL_MACHINE__WINDOWS:
				return WINDOWS_EDEFAULT == null ? windows != null : !WINDOWS_EDEFAULT.equals(windows);
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
		result.append(" (macos: ");
		result.append(macos);
		result.append(", solaris: ");
		result.append(solaris);
		result.append(", linux: ");
		result.append(linux);
		result.append(", windows: ");
		result.append(windows);
		result.append(')');
		return result.toString();
	}

} //VirtualMachineImpl
