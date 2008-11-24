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
 * $Id: LauncherImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.Launcher;
import org.eclipse.amalgam.releng.product.LinuxIcon;
import org.eclipse.amalgam.releng.product.MacIcon;
import org.eclipse.amalgam.releng.product.ProductPackage;
import org.eclipse.amalgam.releng.product.SolarisIcon;
import org.eclipse.amalgam.releng.product.WinIcon;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherImpl#getLinux <em>Linux</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherImpl#getMacosx <em>Macosx</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherImpl#getSolaris <em>Solaris</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherImpl#getWin <em>Win</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LauncherImpl extends EObjectImpl implements Launcher {
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
	 * The cached value of the '{@link #getLinux() <em>Linux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinux()
	 * @generated
	 * @ordered
	 */
	protected LinuxIcon linux;

	/**
	 * The cached value of the '{@link #getMacosx() <em>Macosx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacosx()
	 * @generated
	 * @ordered
	 */
	protected MacIcon macosx;

	/**
	 * The cached value of the '{@link #getSolaris() <em>Solaris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolaris()
	 * @generated
	 * @ordered
	 */
	protected SolarisIcon solaris;

	/**
	 * The cached value of the '{@link #getWin() <em>Win</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin()
	 * @generated
	 * @ordered
	 */
	protected WinIcon win;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LauncherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.LAUNCHER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxIcon getLinux() {
		return linux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLinux(LinuxIcon newLinux, NotificationChain msgs) {
		LinuxIcon oldLinux = linux;
		linux = newLinux;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER__LINUX, oldLinux, newLinux);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinux(LinuxIcon newLinux) {
		if (newLinux != linux) {
			NotificationChain msgs = null;
			if (linux != null)
				msgs = ((InternalEObject)linux).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.LAUNCHER__LINUX, null, msgs);
			if (newLinux != null)
				msgs = ((InternalEObject)newLinux).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.LAUNCHER__LINUX, null, msgs);
			msgs = basicSetLinux(newLinux, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER__LINUX, newLinux, newLinux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacIcon getMacosx() {
		return macosx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMacosx(MacIcon newMacosx, NotificationChain msgs) {
		MacIcon oldMacosx = macosx;
		macosx = newMacosx;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER__MACOSX, oldMacosx, newMacosx);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMacosx(MacIcon newMacosx) {
		if (newMacosx != macosx) {
			NotificationChain msgs = null;
			if (macosx != null)
				msgs = ((InternalEObject)macosx).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.LAUNCHER__MACOSX, null, msgs);
			if (newMacosx != null)
				msgs = ((InternalEObject)newMacosx).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.LAUNCHER__MACOSX, null, msgs);
			msgs = basicSetMacosx(newMacosx, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER__MACOSX, newMacosx, newMacosx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolarisIcon getSolaris() {
		return solaris;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSolaris(SolarisIcon newSolaris, NotificationChain msgs) {
		SolarisIcon oldSolaris = solaris;
		solaris = newSolaris;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER__SOLARIS, oldSolaris, newSolaris);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolaris(SolarisIcon newSolaris) {
		if (newSolaris != solaris) {
			NotificationChain msgs = null;
			if (solaris != null)
				msgs = ((InternalEObject)solaris).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.LAUNCHER__SOLARIS, null, msgs);
			if (newSolaris != null)
				msgs = ((InternalEObject)newSolaris).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.LAUNCHER__SOLARIS, null, msgs);
			msgs = basicSetSolaris(newSolaris, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER__SOLARIS, newSolaris, newSolaris));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WinIcon getWin() {
		return win;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWin(WinIcon newWin, NotificationChain msgs) {
		WinIcon oldWin = win;
		win = newWin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER__WIN, oldWin, newWin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWin(WinIcon newWin) {
		if (newWin != win) {
			NotificationChain msgs = null;
			if (win != null)
				msgs = ((InternalEObject)win).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.LAUNCHER__WIN, null, msgs);
			if (newWin != null)
				msgs = ((InternalEObject)newWin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.LAUNCHER__WIN, null, msgs);
			msgs = basicSetWin(newWin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER__WIN, newWin, newWin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.LAUNCHER__LINUX:
				return basicSetLinux(null, msgs);
			case ProductPackage.LAUNCHER__MACOSX:
				return basicSetMacosx(null, msgs);
			case ProductPackage.LAUNCHER__SOLARIS:
				return basicSetSolaris(null, msgs);
			case ProductPackage.LAUNCHER__WIN:
				return basicSetWin(null, msgs);
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
			case ProductPackage.LAUNCHER__NAME:
				return getName();
			case ProductPackage.LAUNCHER__LINUX:
				return getLinux();
			case ProductPackage.LAUNCHER__MACOSX:
				return getMacosx();
			case ProductPackage.LAUNCHER__SOLARIS:
				return getSolaris();
			case ProductPackage.LAUNCHER__WIN:
				return getWin();
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
			case ProductPackage.LAUNCHER__NAME:
				setName((String)newValue);
				return;
			case ProductPackage.LAUNCHER__LINUX:
				setLinux((LinuxIcon)newValue);
				return;
			case ProductPackage.LAUNCHER__MACOSX:
				setMacosx((MacIcon)newValue);
				return;
			case ProductPackage.LAUNCHER__SOLARIS:
				setSolaris((SolarisIcon)newValue);
				return;
			case ProductPackage.LAUNCHER__WIN:
				setWin((WinIcon)newValue);
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
			case ProductPackage.LAUNCHER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER__LINUX:
				setLinux((LinuxIcon)null);
				return;
			case ProductPackage.LAUNCHER__MACOSX:
				setMacosx((MacIcon)null);
				return;
			case ProductPackage.LAUNCHER__SOLARIS:
				setSolaris((SolarisIcon)null);
				return;
			case ProductPackage.LAUNCHER__WIN:
				setWin((WinIcon)null);
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
			case ProductPackage.LAUNCHER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProductPackage.LAUNCHER__LINUX:
				return linux != null;
			case ProductPackage.LAUNCHER__MACOSX:
				return macosx != null;
			case ProductPackage.LAUNCHER__SOLARIS:
				return solaris != null;
			case ProductPackage.LAUNCHER__WIN:
				return win != null;
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
		result.append(')');
		return result.toString();
	}

} //LauncherImpl
