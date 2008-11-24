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
 * $Id: LauncherArgsImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.LauncherArgs;
import org.eclipse.amalgam.releng.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Launcher Args</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getProgramArgs <em>Program Args</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getProgramArgsLin <em>Program Args Lin</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getProgramArgsMac <em>Program Args Mac</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getProgramArgsSol <em>Program Args Sol</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getProgramArgsWin <em>Program Args Win</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getVmArgs <em>Vm Args</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getVmArgsLin <em>Vm Args Lin</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getVmArgsMac <em>Vm Args Mac</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getVmArgsSol <em>Vm Args Sol</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.LauncherArgsImpl#getVmArgsWin <em>Vm Args Win</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LauncherArgsImpl extends EObjectImpl implements LauncherArgs {
	/**
	 * The default value of the '{@link #getProgramArgs() <em>Program Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramArgs() <em>Program Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgs()
	 * @generated
	 * @ordered
	 */
	protected String programArgs = PROGRAM_ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramArgsLin() <em>Program Args Lin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgsLin()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ARGS_LIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramArgsLin() <em>Program Args Lin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgsLin()
	 * @generated
	 * @ordered
	 */
	protected String programArgsLin = PROGRAM_ARGS_LIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramArgsMac() <em>Program Args Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgsMac()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ARGS_MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramArgsMac() <em>Program Args Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgsMac()
	 * @generated
	 * @ordered
	 */
	protected String programArgsMac = PROGRAM_ARGS_MAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramArgsSol() <em>Program Args Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgsSol()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ARGS_SOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramArgsSol() <em>Program Args Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgsSol()
	 * @generated
	 * @ordered
	 */
	protected String programArgsSol = PROGRAM_ARGS_SOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgramArgsWin() <em>Program Args Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgsWin()
	 * @generated
	 * @ordered
	 */
	protected static final String PROGRAM_ARGS_WIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgramArgsWin() <em>Program Args Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramArgsWin()
	 * @generated
	 * @ordered
	 */
	protected String programArgsWin = PROGRAM_ARGS_WIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmArgs() <em>Vm Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmArgs() <em>Vm Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgs()
	 * @generated
	 * @ordered
	 */
	protected String vmArgs = VM_ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmArgsLin() <em>Vm Args Lin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgsLin()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ARGS_LIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmArgsLin() <em>Vm Args Lin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgsLin()
	 * @generated
	 * @ordered
	 */
	protected String vmArgsLin = VM_ARGS_LIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmArgsMac() <em>Vm Args Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgsMac()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ARGS_MAC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmArgsMac() <em>Vm Args Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgsMac()
	 * @generated
	 * @ordered
	 */
	protected String vmArgsMac = VM_ARGS_MAC_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmArgsSol() <em>Vm Args Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgsSol()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ARGS_SOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmArgsSol() <em>Vm Args Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgsSol()
	 * @generated
	 * @ordered
	 */
	protected String vmArgsSol = VM_ARGS_SOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getVmArgsWin() <em>Vm Args Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgsWin()
	 * @generated
	 * @ordered
	 */
	protected static final String VM_ARGS_WIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVmArgsWin() <em>Vm Args Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmArgsWin()
	 * @generated
	 * @ordered
	 */
	protected String vmArgsWin = VM_ARGS_WIN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LauncherArgsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.LAUNCHER_ARGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramArgs() {
		return programArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramArgs(String newProgramArgs) {
		String oldProgramArgs = programArgs;
		programArgs = newProgramArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS, oldProgramArgs, programArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramArgsLin() {
		return programArgsLin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramArgsLin(String newProgramArgsLin) {
		String oldProgramArgsLin = programArgsLin;
		programArgsLin = newProgramArgsLin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_LIN, oldProgramArgsLin, programArgsLin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramArgsMac() {
		return programArgsMac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramArgsMac(String newProgramArgsMac) {
		String oldProgramArgsMac = programArgsMac;
		programArgsMac = newProgramArgsMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_MAC, oldProgramArgsMac, programArgsMac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramArgsSol() {
		return programArgsSol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramArgsSol(String newProgramArgsSol) {
		String oldProgramArgsSol = programArgsSol;
		programArgsSol = newProgramArgsSol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_SOL, oldProgramArgsSol, programArgsSol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProgramArgsWin() {
		return programArgsWin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramArgsWin(String newProgramArgsWin) {
		String oldProgramArgsWin = programArgsWin;
		programArgsWin = newProgramArgsWin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_WIN, oldProgramArgsWin, programArgsWin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmArgs() {
		return vmArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmArgs(String newVmArgs) {
		String oldVmArgs = vmArgs;
		vmArgs = newVmArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__VM_ARGS, oldVmArgs, vmArgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmArgsLin() {
		return vmArgsLin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmArgsLin(String newVmArgsLin) {
		String oldVmArgsLin = vmArgsLin;
		vmArgsLin = newVmArgsLin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__VM_ARGS_LIN, oldVmArgsLin, vmArgsLin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmArgsMac() {
		return vmArgsMac;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmArgsMac(String newVmArgsMac) {
		String oldVmArgsMac = vmArgsMac;
		vmArgsMac = newVmArgsMac;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__VM_ARGS_MAC, oldVmArgsMac, vmArgsMac));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmArgsSol() {
		return vmArgsSol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmArgsSol(String newVmArgsSol) {
		String oldVmArgsSol = vmArgsSol;
		vmArgsSol = newVmArgsSol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__VM_ARGS_SOL, oldVmArgsSol, vmArgsSol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmArgsWin() {
		return vmArgsWin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmArgsWin(String newVmArgsWin) {
		String oldVmArgsWin = vmArgsWin;
		vmArgsWin = newVmArgsWin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.LAUNCHER_ARGS__VM_ARGS_WIN, oldVmArgsWin, vmArgsWin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS:
				return getProgramArgs();
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_LIN:
				return getProgramArgsLin();
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_MAC:
				return getProgramArgsMac();
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_SOL:
				return getProgramArgsSol();
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_WIN:
				return getProgramArgsWin();
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS:
				return getVmArgs();
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_LIN:
				return getVmArgsLin();
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_MAC:
				return getVmArgsMac();
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_SOL:
				return getVmArgsSol();
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_WIN:
				return getVmArgsWin();
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
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS:
				setProgramArgs((String)newValue);
				return;
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_LIN:
				setProgramArgsLin((String)newValue);
				return;
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_MAC:
				setProgramArgsMac((String)newValue);
				return;
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_SOL:
				setProgramArgsSol((String)newValue);
				return;
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_WIN:
				setProgramArgsWin((String)newValue);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS:
				setVmArgs((String)newValue);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_LIN:
				setVmArgsLin((String)newValue);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_MAC:
				setVmArgsMac((String)newValue);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_SOL:
				setVmArgsSol((String)newValue);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_WIN:
				setVmArgsWin((String)newValue);
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
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS:
				setProgramArgs(PROGRAM_ARGS_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_LIN:
				setProgramArgsLin(PROGRAM_ARGS_LIN_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_MAC:
				setProgramArgsMac(PROGRAM_ARGS_MAC_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_SOL:
				setProgramArgsSol(PROGRAM_ARGS_SOL_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_WIN:
				setProgramArgsWin(PROGRAM_ARGS_WIN_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS:
				setVmArgs(VM_ARGS_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_LIN:
				setVmArgsLin(VM_ARGS_LIN_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_MAC:
				setVmArgsMac(VM_ARGS_MAC_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_SOL:
				setVmArgsSol(VM_ARGS_SOL_EDEFAULT);
				return;
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_WIN:
				setVmArgsWin(VM_ARGS_WIN_EDEFAULT);
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
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS:
				return PROGRAM_ARGS_EDEFAULT == null ? programArgs != null : !PROGRAM_ARGS_EDEFAULT.equals(programArgs);
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_LIN:
				return PROGRAM_ARGS_LIN_EDEFAULT == null ? programArgsLin != null : !PROGRAM_ARGS_LIN_EDEFAULT.equals(programArgsLin);
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_MAC:
				return PROGRAM_ARGS_MAC_EDEFAULT == null ? programArgsMac != null : !PROGRAM_ARGS_MAC_EDEFAULT.equals(programArgsMac);
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_SOL:
				return PROGRAM_ARGS_SOL_EDEFAULT == null ? programArgsSol != null : !PROGRAM_ARGS_SOL_EDEFAULT.equals(programArgsSol);
			case ProductPackage.LAUNCHER_ARGS__PROGRAM_ARGS_WIN:
				return PROGRAM_ARGS_WIN_EDEFAULT == null ? programArgsWin != null : !PROGRAM_ARGS_WIN_EDEFAULT.equals(programArgsWin);
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS:
				return VM_ARGS_EDEFAULT == null ? vmArgs != null : !VM_ARGS_EDEFAULT.equals(vmArgs);
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_LIN:
				return VM_ARGS_LIN_EDEFAULT == null ? vmArgsLin != null : !VM_ARGS_LIN_EDEFAULT.equals(vmArgsLin);
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_MAC:
				return VM_ARGS_MAC_EDEFAULT == null ? vmArgsMac != null : !VM_ARGS_MAC_EDEFAULT.equals(vmArgsMac);
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_SOL:
				return VM_ARGS_SOL_EDEFAULT == null ? vmArgsSol != null : !VM_ARGS_SOL_EDEFAULT.equals(vmArgsSol);
			case ProductPackage.LAUNCHER_ARGS__VM_ARGS_WIN:
				return VM_ARGS_WIN_EDEFAULT == null ? vmArgsWin != null : !VM_ARGS_WIN_EDEFAULT.equals(vmArgsWin);
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
		result.append(" (programArgs: ");
		result.append(programArgs);
		result.append(", programArgsLin: ");
		result.append(programArgsLin);
		result.append(", programArgsMac: ");
		result.append(programArgsMac);
		result.append(", programArgsSol: ");
		result.append(programArgsSol);
		result.append(", programArgsWin: ");
		result.append(programArgsWin);
		result.append(", vmArgs: ");
		result.append(vmArgs);
		result.append(", vmArgsLin: ");
		result.append(vmArgsLin);
		result.append(", vmArgsMac: ");
		result.append(vmArgsMac);
		result.append(", vmArgsSol: ");
		result.append(vmArgsSol);
		result.append(", vmArgsWin: ");
		result.append(vmArgsWin);
		result.append(')');
		return result.toString();
	}

} //LauncherArgsImpl
