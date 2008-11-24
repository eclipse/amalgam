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
 * $Id: ConfigImpl.java,v 1.1 2008/11/24 20:36:44 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build.impl;

import org.eclipse.amalgam.releng.build.ARCH;
import org.eclipse.amalgam.releng.build.ArchiveFormat;
import org.eclipse.amalgam.releng.build.BuildPackage;
import org.eclipse.amalgam.releng.build.Config;
import org.eclipse.amalgam.releng.build.OS;
import org.eclipse.amalgam.releng.build.WS;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ConfigImpl#getOs <em>Os</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ConfigImpl#getWs <em>Ws</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ConfigImpl#getArch <em>Arch</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ConfigImpl#getArchiveFormat <em>Archive Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigImpl extends EObjectImpl implements Config {
	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final OS OS_EDEFAULT = OS.WIN32;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected OS os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWs() <em>Ws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWs()
	 * @generated
	 * @ordered
	 */
	protected static final WS WS_EDEFAULT = WS.WIN32;

	/**
	 * The cached value of the '{@link #getWs() <em>Ws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWs()
	 * @generated
	 * @ordered
	 */
	protected WS ws = WS_EDEFAULT;

	/**
	 * The default value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected static final ARCH ARCH_EDEFAULT = ARCH.X86;

	/**
	 * The cached value of the '{@link #getArch() <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArch()
	 * @generated
	 * @ordered
	 */
	protected ARCH arch = ARCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchiveFormat() <em>Archive Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveFormat()
	 * @generated
	 * @ordered
	 */
	protected static final ArchiveFormat ARCHIVE_FORMAT_EDEFAULT = ArchiveFormat.ZIP;

	/**
	 * The cached value of the '{@link #getArchiveFormat() <em>Archive Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchiveFormat()
	 * @generated
	 * @ordered
	 */
	protected ArchiveFormat archiveFormat = ARCHIVE_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OS getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(OS newOs) {
		OS oldOs = os;
		os = newOs == null ? OS_EDEFAULT : newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.CONFIG__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WS getWs() {
		return ws;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWs(WS newWs) {
		WS oldWs = ws;
		ws = newWs == null ? WS_EDEFAULT : newWs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.CONFIG__WS, oldWs, ws));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARCH getArch() {
		return arch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArch(ARCH newArch) {
		ARCH oldArch = arch;
		arch = newArch == null ? ARCH_EDEFAULT : newArch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.CONFIG__ARCH, oldArch, arch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchiveFormat getArchiveFormat() {
		return archiveFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchiveFormat(ArchiveFormat newArchiveFormat) {
		ArchiveFormat oldArchiveFormat = archiveFormat;
		archiveFormat = newArchiveFormat == null ? ARCHIVE_FORMAT_EDEFAULT : newArchiveFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.CONFIG__ARCHIVE_FORMAT, oldArchiveFormat, archiveFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuildPackage.CONFIG__OS:
				return getOs();
			case BuildPackage.CONFIG__WS:
				return getWs();
			case BuildPackage.CONFIG__ARCH:
				return getArch();
			case BuildPackage.CONFIG__ARCHIVE_FORMAT:
				return getArchiveFormat();
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
			case BuildPackage.CONFIG__OS:
				setOs((OS)newValue);
				return;
			case BuildPackage.CONFIG__WS:
				setWs((WS)newValue);
				return;
			case BuildPackage.CONFIG__ARCH:
				setArch((ARCH)newValue);
				return;
			case BuildPackage.CONFIG__ARCHIVE_FORMAT:
				setArchiveFormat((ArchiveFormat)newValue);
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
			case BuildPackage.CONFIG__OS:
				setOs(OS_EDEFAULT);
				return;
			case BuildPackage.CONFIG__WS:
				setWs(WS_EDEFAULT);
				return;
			case BuildPackage.CONFIG__ARCH:
				setArch(ARCH_EDEFAULT);
				return;
			case BuildPackage.CONFIG__ARCHIVE_FORMAT:
				setArchiveFormat(ARCHIVE_FORMAT_EDEFAULT);
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
			case BuildPackage.CONFIG__OS:
				return os != OS_EDEFAULT;
			case BuildPackage.CONFIG__WS:
				return ws != WS_EDEFAULT;
			case BuildPackage.CONFIG__ARCH:
				return arch != ARCH_EDEFAULT;
			case BuildPackage.CONFIG__ARCHIVE_FORMAT:
				return archiveFormat != ARCHIVE_FORMAT_EDEFAULT;
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
		result.append(" (os: ");
		result.append(os);
		result.append(", ws: ");
		result.append(ws);
		result.append(", arch: ");
		result.append(arch);
		result.append(", archiveFormat: ");
		result.append(archiveFormat);
		result.append(')');
		return result.toString();
	}

} //ConfigImpl
