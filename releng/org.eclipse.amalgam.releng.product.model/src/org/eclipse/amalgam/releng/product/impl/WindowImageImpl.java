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
 * $Id: WindowImageImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.ProductPackage;
import org.eclipse.amalgam.releng.product.WindowImage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.WindowImageImpl#getI16 <em>I16</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.WindowImageImpl#getI32 <em>I32</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.WindowImageImpl#getI48 <em>I48</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.WindowImageImpl#getI64 <em>I64</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.WindowImageImpl#getI128 <em>I128</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WindowImageImpl extends EObjectImpl implements WindowImage {
	/**
	 * The default value of the '{@link #getI16() <em>I16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI16()
	 * @generated
	 * @ordered
	 */
	protected static final String I16_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI16() <em>I16</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI16()
	 * @generated
	 * @ordered
	 */
	protected String i16 = I16_EDEFAULT;

	/**
	 * The default value of the '{@link #getI32() <em>I32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI32()
	 * @generated
	 * @ordered
	 */
	protected static final String I32_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI32() <em>I32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI32()
	 * @generated
	 * @ordered
	 */
	protected String i32 = I32_EDEFAULT;

	/**
	 * The default value of the '{@link #getI48() <em>I48</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI48()
	 * @generated
	 * @ordered
	 */
	protected static final String I48_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI48() <em>I48</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI48()
	 * @generated
	 * @ordered
	 */
	protected String i48 = I48_EDEFAULT;

	/**
	 * The default value of the '{@link #getI64() <em>I64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI64()
	 * @generated
	 * @ordered
	 */
	protected static final String I64_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI64() <em>I64</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI64()
	 * @generated
	 * @ordered
	 */
	protected String i64 = I64_EDEFAULT;

	/**
	 * The default value of the '{@link #getI128() <em>I128</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI128()
	 * @generated
	 * @ordered
	 */
	protected static final String I128_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getI128() <em>I128</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getI128()
	 * @generated
	 * @ordered
	 */
	protected String i128 = I128_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowImageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.WINDOW_IMAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI16() {
		return i16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI16(String newI16) {
		String oldI16 = i16;
		i16 = newI16;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WINDOW_IMAGE__I16, oldI16, i16));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI32() {
		return i32;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI32(String newI32) {
		String oldI32 = i32;
		i32 = newI32;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WINDOW_IMAGE__I32, oldI32, i32));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI48() {
		return i48;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI48(String newI48) {
		String oldI48 = i48;
		i48 = newI48;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WINDOW_IMAGE__I48, oldI48, i48));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI64() {
		return i64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI64(String newI64) {
		String oldI64 = i64;
		i64 = newI64;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WINDOW_IMAGE__I64, oldI64, i64));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getI128() {
		return i128;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setI128(String newI128) {
		String oldI128 = i128;
		i128 = newI128;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WINDOW_IMAGE__I128, oldI128, i128));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.WINDOW_IMAGE__I16:
				return getI16();
			case ProductPackage.WINDOW_IMAGE__I32:
				return getI32();
			case ProductPackage.WINDOW_IMAGE__I48:
				return getI48();
			case ProductPackage.WINDOW_IMAGE__I64:
				return getI64();
			case ProductPackage.WINDOW_IMAGE__I128:
				return getI128();
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
			case ProductPackage.WINDOW_IMAGE__I16:
				setI16((String)newValue);
				return;
			case ProductPackage.WINDOW_IMAGE__I32:
				setI32((String)newValue);
				return;
			case ProductPackage.WINDOW_IMAGE__I48:
				setI48((String)newValue);
				return;
			case ProductPackage.WINDOW_IMAGE__I64:
				setI64((String)newValue);
				return;
			case ProductPackage.WINDOW_IMAGE__I128:
				setI128((String)newValue);
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
			case ProductPackage.WINDOW_IMAGE__I16:
				setI16(I16_EDEFAULT);
				return;
			case ProductPackage.WINDOW_IMAGE__I32:
				setI32(I32_EDEFAULT);
				return;
			case ProductPackage.WINDOW_IMAGE__I48:
				setI48(I48_EDEFAULT);
				return;
			case ProductPackage.WINDOW_IMAGE__I64:
				setI64(I64_EDEFAULT);
				return;
			case ProductPackage.WINDOW_IMAGE__I128:
				setI128(I128_EDEFAULT);
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
			case ProductPackage.WINDOW_IMAGE__I16:
				return I16_EDEFAULT == null ? i16 != null : !I16_EDEFAULT.equals(i16);
			case ProductPackage.WINDOW_IMAGE__I32:
				return I32_EDEFAULT == null ? i32 != null : !I32_EDEFAULT.equals(i32);
			case ProductPackage.WINDOW_IMAGE__I48:
				return I48_EDEFAULT == null ? i48 != null : !I48_EDEFAULT.equals(i48);
			case ProductPackage.WINDOW_IMAGE__I64:
				return I64_EDEFAULT == null ? i64 != null : !I64_EDEFAULT.equals(i64);
			case ProductPackage.WINDOW_IMAGE__I128:
				return I128_EDEFAULT == null ? i128 != null : !I128_EDEFAULT.equals(i128);
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
		result.append(" (i16: ");
		result.append(i16);
		result.append(", i32: ");
		result.append(i32);
		result.append(", i48: ");
		result.append(i48);
		result.append(", i64: ");
		result.append(i64);
		result.append(", i128: ");
		result.append(i128);
		result.append(')');
		return result.toString();
	}

} //WindowImageImpl
