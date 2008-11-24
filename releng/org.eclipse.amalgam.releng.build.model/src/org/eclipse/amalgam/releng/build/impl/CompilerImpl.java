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
 * $Id: CompilerImpl.java,v 1.1 2008/11/24 20:36:44 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build.impl;

import org.eclipse.amalgam.releng.build.BuildPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compiler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.CompilerImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.CompilerImpl#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.CompilerImpl#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.CompilerImpl#isVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.CompilerImpl#isFailOnError <em>Fail On Error</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.CompilerImpl#isDebugInfo <em>Debug Info</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompilerImpl extends EObjectImpl implements org.eclipse.amalgam.releng.build.Compiler {
	/**
	 * The default value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected static final String ARGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected String args = ARGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceVersion() <em>Source Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_VERSION_EDEFAULT = "1.5";

	/**
	 * The cached value of the '{@link #getSourceVersion() <em>Source Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceVersion()
	 * @generated
	 * @ordered
	 */
	protected String sourceVersion = SOURCE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetVersion() <em>Target Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_VERSION_EDEFAULT = "1.5";

	/**
	 * The cached value of the '{@link #getTargetVersion() <em>Target Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetVersion()
	 * @generated
	 * @ordered
	 */
	protected String targetVersion = TARGET_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbose()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERBOSE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerbose() <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbose()
	 * @generated
	 * @ordered
	 */
	protected boolean verbose = VERBOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #isFailOnError() <em>Fail On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailOnError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAIL_ON_ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailOnError() <em>Fail On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailOnError()
	 * @generated
	 * @ordered
	 */
	protected boolean failOnError = FAIL_ON_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #isDebugInfo() <em>Debug Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDebugInfo()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEBUG_INFO_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDebugInfo() <em>Debug Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDebugInfo()
	 * @generated
	 * @ordered
	 */
	protected boolean debugInfo = DEBUG_INFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompilerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.COMPILER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArgs() {
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArgs(String newArgs) {
		String oldArgs = args;
		args = newArgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.COMPILER__ARGS, oldArgs, args));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceVersion() {
		return sourceVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceVersion(String newSourceVersion) {
		String oldSourceVersion = sourceVersion;
		sourceVersion = newSourceVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.COMPILER__SOURCE_VERSION, oldSourceVersion, sourceVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetVersion() {
		return targetVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetVersion(String newTargetVersion) {
		String oldTargetVersion = targetVersion;
		targetVersion = newTargetVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.COMPILER__TARGET_VERSION, oldTargetVersion, targetVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerbose() {
		return verbose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerbose(boolean newVerbose) {
		boolean oldVerbose = verbose;
		verbose = newVerbose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.COMPILER__VERBOSE, oldVerbose, verbose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFailOnError() {
		return failOnError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailOnError(boolean newFailOnError) {
		boolean oldFailOnError = failOnError;
		failOnError = newFailOnError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.COMPILER__FAIL_ON_ERROR, oldFailOnError, failOnError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDebugInfo() {
		return debugInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebugInfo(boolean newDebugInfo) {
		boolean oldDebugInfo = debugInfo;
		debugInfo = newDebugInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.COMPILER__DEBUG_INFO, oldDebugInfo, debugInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BuildPackage.COMPILER__ARGS:
				return getArgs();
			case BuildPackage.COMPILER__SOURCE_VERSION:
				return getSourceVersion();
			case BuildPackage.COMPILER__TARGET_VERSION:
				return getTargetVersion();
			case BuildPackage.COMPILER__VERBOSE:
				return isVerbose() ? Boolean.TRUE : Boolean.FALSE;
			case BuildPackage.COMPILER__FAIL_ON_ERROR:
				return isFailOnError() ? Boolean.TRUE : Boolean.FALSE;
			case BuildPackage.COMPILER__DEBUG_INFO:
				return isDebugInfo() ? Boolean.TRUE : Boolean.FALSE;
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
			case BuildPackage.COMPILER__ARGS:
				setArgs((String)newValue);
				return;
			case BuildPackage.COMPILER__SOURCE_VERSION:
				setSourceVersion((String)newValue);
				return;
			case BuildPackage.COMPILER__TARGET_VERSION:
				setTargetVersion((String)newValue);
				return;
			case BuildPackage.COMPILER__VERBOSE:
				setVerbose(((Boolean)newValue).booleanValue());
				return;
			case BuildPackage.COMPILER__FAIL_ON_ERROR:
				setFailOnError(((Boolean)newValue).booleanValue());
				return;
			case BuildPackage.COMPILER__DEBUG_INFO:
				setDebugInfo(((Boolean)newValue).booleanValue());
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
			case BuildPackage.COMPILER__ARGS:
				setArgs(ARGS_EDEFAULT);
				return;
			case BuildPackage.COMPILER__SOURCE_VERSION:
				setSourceVersion(SOURCE_VERSION_EDEFAULT);
				return;
			case BuildPackage.COMPILER__TARGET_VERSION:
				setTargetVersion(TARGET_VERSION_EDEFAULT);
				return;
			case BuildPackage.COMPILER__VERBOSE:
				setVerbose(VERBOSE_EDEFAULT);
				return;
			case BuildPackage.COMPILER__FAIL_ON_ERROR:
				setFailOnError(FAIL_ON_ERROR_EDEFAULT);
				return;
			case BuildPackage.COMPILER__DEBUG_INFO:
				setDebugInfo(DEBUG_INFO_EDEFAULT);
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
			case BuildPackage.COMPILER__ARGS:
				return ARGS_EDEFAULT == null ? args != null : !ARGS_EDEFAULT.equals(args);
			case BuildPackage.COMPILER__SOURCE_VERSION:
				return SOURCE_VERSION_EDEFAULT == null ? sourceVersion != null : !SOURCE_VERSION_EDEFAULT.equals(sourceVersion);
			case BuildPackage.COMPILER__TARGET_VERSION:
				return TARGET_VERSION_EDEFAULT == null ? targetVersion != null : !TARGET_VERSION_EDEFAULT.equals(targetVersion);
			case BuildPackage.COMPILER__VERBOSE:
				return verbose != VERBOSE_EDEFAULT;
			case BuildPackage.COMPILER__FAIL_ON_ERROR:
				return failOnError != FAIL_ON_ERROR_EDEFAULT;
			case BuildPackage.COMPILER__DEBUG_INFO:
				return debugInfo != DEBUG_INFO_EDEFAULT;
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
		result.append(" (args: ");
		result.append(args);
		result.append(", sourceVersion: ");
		result.append(sourceVersion);
		result.append(", targetVersion: ");
		result.append(targetVersion);
		result.append(", verbose: ");
		result.append(verbose);
		result.append(", failOnError: ");
		result.append(failOnError);
		result.append(", debugInfo: ");
		result.append(debugInfo);
		result.append(')');
		return result.toString();
	}

} //CompilerImpl
