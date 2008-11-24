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
 * $Id: BitmapImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.Bitmap;
import org.eclipse.amalgam.releng.product.ProductPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bitmap</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.BitmapImpl#getWinSmallHigh <em>Win Small High</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.BitmapImpl#getWinSmallLow <em>Win Small Low</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.BitmapImpl#getWinMediumHigh <em>Win Medium High</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.BitmapImpl#getWinMediumLow <em>Win Medium Low</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.BitmapImpl#getWinLargeHigh <em>Win Large High</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.BitmapImpl#getWinLargeLow <em>Win Large Low</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BitmapImpl extends EObjectImpl implements Bitmap {
	/**
	 * The default value of the '{@link #getWinSmallHigh() <em>Win Small High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinSmallHigh()
	 * @generated
	 * @ordered
	 */
	protected static final String WIN_SMALL_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWinSmallHigh() <em>Win Small High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinSmallHigh()
	 * @generated
	 * @ordered
	 */
	protected String winSmallHigh = WIN_SMALL_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinSmallLow() <em>Win Small Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinSmallLow()
	 * @generated
	 * @ordered
	 */
	protected static final String WIN_SMALL_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWinSmallLow() <em>Win Small Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinSmallLow()
	 * @generated
	 * @ordered
	 */
	protected String winSmallLow = WIN_SMALL_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinMediumHigh() <em>Win Medium High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinMediumHigh()
	 * @generated
	 * @ordered
	 */
	protected static final String WIN_MEDIUM_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWinMediumHigh() <em>Win Medium High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinMediumHigh()
	 * @generated
	 * @ordered
	 */
	protected String winMediumHigh = WIN_MEDIUM_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinMediumLow() <em>Win Medium Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinMediumLow()
	 * @generated
	 * @ordered
	 */
	protected static final String WIN_MEDIUM_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWinMediumLow() <em>Win Medium Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinMediumLow()
	 * @generated
	 * @ordered
	 */
	protected String winMediumLow = WIN_MEDIUM_LOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinLargeHigh() <em>Win Large High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinLargeHigh()
	 * @generated
	 * @ordered
	 */
	protected static final String WIN_LARGE_HIGH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWinLargeHigh() <em>Win Large High</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinLargeHigh()
	 * @generated
	 * @ordered
	 */
	protected String winLargeHigh = WIN_LARGE_HIGH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinLargeLow() <em>Win Large Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinLargeLow()
	 * @generated
	 * @ordered
	 */
	protected static final String WIN_LARGE_LOW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWinLargeLow() <em>Win Large Low</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinLargeLow()
	 * @generated
	 * @ordered
	 */
	protected String winLargeLow = WIN_LARGE_LOW_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitmapImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.BITMAP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWinSmallHigh() {
		return winSmallHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinSmallHigh(String newWinSmallHigh) {
		String oldWinSmallHigh = winSmallHigh;
		winSmallHigh = newWinSmallHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.BITMAP__WIN_SMALL_HIGH, oldWinSmallHigh, winSmallHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWinSmallLow() {
		return winSmallLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinSmallLow(String newWinSmallLow) {
		String oldWinSmallLow = winSmallLow;
		winSmallLow = newWinSmallLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.BITMAP__WIN_SMALL_LOW, oldWinSmallLow, winSmallLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWinMediumHigh() {
		return winMediumHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinMediumHigh(String newWinMediumHigh) {
		String oldWinMediumHigh = winMediumHigh;
		winMediumHigh = newWinMediumHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.BITMAP__WIN_MEDIUM_HIGH, oldWinMediumHigh, winMediumHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWinMediumLow() {
		return winMediumLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinMediumLow(String newWinMediumLow) {
		String oldWinMediumLow = winMediumLow;
		winMediumLow = newWinMediumLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.BITMAP__WIN_MEDIUM_LOW, oldWinMediumLow, winMediumLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWinLargeHigh() {
		return winLargeHigh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinLargeHigh(String newWinLargeHigh) {
		String oldWinLargeHigh = winLargeHigh;
		winLargeHigh = newWinLargeHigh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.BITMAP__WIN_LARGE_HIGH, oldWinLargeHigh, winLargeHigh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWinLargeLow() {
		return winLargeLow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinLargeLow(String newWinLargeLow) {
		String oldWinLargeLow = winLargeLow;
		winLargeLow = newWinLargeLow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.BITMAP__WIN_LARGE_LOW, oldWinLargeLow, winLargeLow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.BITMAP__WIN_SMALL_HIGH:
				return getWinSmallHigh();
			case ProductPackage.BITMAP__WIN_SMALL_LOW:
				return getWinSmallLow();
			case ProductPackage.BITMAP__WIN_MEDIUM_HIGH:
				return getWinMediumHigh();
			case ProductPackage.BITMAP__WIN_MEDIUM_LOW:
				return getWinMediumLow();
			case ProductPackage.BITMAP__WIN_LARGE_HIGH:
				return getWinLargeHigh();
			case ProductPackage.BITMAP__WIN_LARGE_LOW:
				return getWinLargeLow();
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
			case ProductPackage.BITMAP__WIN_SMALL_HIGH:
				setWinSmallHigh((String)newValue);
				return;
			case ProductPackage.BITMAP__WIN_SMALL_LOW:
				setWinSmallLow((String)newValue);
				return;
			case ProductPackage.BITMAP__WIN_MEDIUM_HIGH:
				setWinMediumHigh((String)newValue);
				return;
			case ProductPackage.BITMAP__WIN_MEDIUM_LOW:
				setWinMediumLow((String)newValue);
				return;
			case ProductPackage.BITMAP__WIN_LARGE_HIGH:
				setWinLargeHigh((String)newValue);
				return;
			case ProductPackage.BITMAP__WIN_LARGE_LOW:
				setWinLargeLow((String)newValue);
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
			case ProductPackage.BITMAP__WIN_SMALL_HIGH:
				setWinSmallHigh(WIN_SMALL_HIGH_EDEFAULT);
				return;
			case ProductPackage.BITMAP__WIN_SMALL_LOW:
				setWinSmallLow(WIN_SMALL_LOW_EDEFAULT);
				return;
			case ProductPackage.BITMAP__WIN_MEDIUM_HIGH:
				setWinMediumHigh(WIN_MEDIUM_HIGH_EDEFAULT);
				return;
			case ProductPackage.BITMAP__WIN_MEDIUM_LOW:
				setWinMediumLow(WIN_MEDIUM_LOW_EDEFAULT);
				return;
			case ProductPackage.BITMAP__WIN_LARGE_HIGH:
				setWinLargeHigh(WIN_LARGE_HIGH_EDEFAULT);
				return;
			case ProductPackage.BITMAP__WIN_LARGE_LOW:
				setWinLargeLow(WIN_LARGE_LOW_EDEFAULT);
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
			case ProductPackage.BITMAP__WIN_SMALL_HIGH:
				return WIN_SMALL_HIGH_EDEFAULT == null ? winSmallHigh != null : !WIN_SMALL_HIGH_EDEFAULT.equals(winSmallHigh);
			case ProductPackage.BITMAP__WIN_SMALL_LOW:
				return WIN_SMALL_LOW_EDEFAULT == null ? winSmallLow != null : !WIN_SMALL_LOW_EDEFAULT.equals(winSmallLow);
			case ProductPackage.BITMAP__WIN_MEDIUM_HIGH:
				return WIN_MEDIUM_HIGH_EDEFAULT == null ? winMediumHigh != null : !WIN_MEDIUM_HIGH_EDEFAULT.equals(winMediumHigh);
			case ProductPackage.BITMAP__WIN_MEDIUM_LOW:
				return WIN_MEDIUM_LOW_EDEFAULT == null ? winMediumLow != null : !WIN_MEDIUM_LOW_EDEFAULT.equals(winMediumLow);
			case ProductPackage.BITMAP__WIN_LARGE_HIGH:
				return WIN_LARGE_HIGH_EDEFAULT == null ? winLargeHigh != null : !WIN_LARGE_HIGH_EDEFAULT.equals(winLargeHigh);
			case ProductPackage.BITMAP__WIN_LARGE_LOW:
				return WIN_LARGE_LOW_EDEFAULT == null ? winLargeLow != null : !WIN_LARGE_LOW_EDEFAULT.equals(winLargeLow);
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
		result.append(" (winSmallHigh: ");
		result.append(winSmallHigh);
		result.append(", winSmallLow: ");
		result.append(winSmallLow);
		result.append(", winMediumHigh: ");
		result.append(winMediumHigh);
		result.append(", winMediumLow: ");
		result.append(winMediumLow);
		result.append(", winLargeHigh: ");
		result.append(winLargeHigh);
		result.append(", winLargeLow: ");
		result.append(winLargeLow);
		result.append(')');
		return result.toString();
	}

} //BitmapImpl
