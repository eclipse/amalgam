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
 * $Id: SolarisIconImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.ProductPackage;
import org.eclipse.amalgam.releng.product.SolarisIcon;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Solaris Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.SolarisIconImpl#getSolarisLarge <em>Solaris Large</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.SolarisIconImpl#getSolarisMedium <em>Solaris Medium</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.SolarisIconImpl#getSolarisSmall <em>Solaris Small</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.SolarisIconImpl#getSolarisTiny <em>Solaris Tiny</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SolarisIconImpl extends EObjectImpl implements SolarisIcon {
	/**
	 * The default value of the '{@link #getSolarisLarge() <em>Solaris Large</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarisLarge()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLARIS_LARGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarisLarge() <em>Solaris Large</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarisLarge()
	 * @generated
	 * @ordered
	 */
	protected String solarisLarge = SOLARIS_LARGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolarisMedium() <em>Solaris Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarisMedium()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLARIS_MEDIUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarisMedium() <em>Solaris Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarisMedium()
	 * @generated
	 * @ordered
	 */
	protected String solarisMedium = SOLARIS_MEDIUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolarisSmall() <em>Solaris Small</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarisSmall()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLARIS_SMALL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarisSmall() <em>Solaris Small</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarisSmall()
	 * @generated
	 * @ordered
	 */
	protected String solarisSmall = SOLARIS_SMALL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSolarisTiny() <em>Solaris Tiny</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarisTiny()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLARIS_TINY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolarisTiny() <em>Solaris Tiny</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolarisTiny()
	 * @generated
	 * @ordered
	 */
	protected String solarisTiny = SOLARIS_TINY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SolarisIconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.SOLARIS_ICON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarisLarge() {
		return solarisLarge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarisLarge(String newSolarisLarge) {
		String oldSolarisLarge = solarisLarge;
		solarisLarge = newSolarisLarge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOLARIS_ICON__SOLARIS_LARGE, oldSolarisLarge, solarisLarge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarisMedium() {
		return solarisMedium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarisMedium(String newSolarisMedium) {
		String oldSolarisMedium = solarisMedium;
		solarisMedium = newSolarisMedium;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOLARIS_ICON__SOLARIS_MEDIUM, oldSolarisMedium, solarisMedium));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarisSmall() {
		return solarisSmall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarisSmall(String newSolarisSmall) {
		String oldSolarisSmall = solarisSmall;
		solarisSmall = newSolarisSmall;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOLARIS_ICON__SOLARIS_SMALL, oldSolarisSmall, solarisSmall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolarisTiny() {
		return solarisTiny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolarisTiny(String newSolarisTiny) {
		String oldSolarisTiny = solarisTiny;
		solarisTiny = newSolarisTiny;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SOLARIS_ICON__SOLARIS_TINY, oldSolarisTiny, solarisTiny));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.SOLARIS_ICON__SOLARIS_LARGE:
				return getSolarisLarge();
			case ProductPackage.SOLARIS_ICON__SOLARIS_MEDIUM:
				return getSolarisMedium();
			case ProductPackage.SOLARIS_ICON__SOLARIS_SMALL:
				return getSolarisSmall();
			case ProductPackage.SOLARIS_ICON__SOLARIS_TINY:
				return getSolarisTiny();
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
			case ProductPackage.SOLARIS_ICON__SOLARIS_LARGE:
				setSolarisLarge((String)newValue);
				return;
			case ProductPackage.SOLARIS_ICON__SOLARIS_MEDIUM:
				setSolarisMedium((String)newValue);
				return;
			case ProductPackage.SOLARIS_ICON__SOLARIS_SMALL:
				setSolarisSmall((String)newValue);
				return;
			case ProductPackage.SOLARIS_ICON__SOLARIS_TINY:
				setSolarisTiny((String)newValue);
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
			case ProductPackage.SOLARIS_ICON__SOLARIS_LARGE:
				setSolarisLarge(SOLARIS_LARGE_EDEFAULT);
				return;
			case ProductPackage.SOLARIS_ICON__SOLARIS_MEDIUM:
				setSolarisMedium(SOLARIS_MEDIUM_EDEFAULT);
				return;
			case ProductPackage.SOLARIS_ICON__SOLARIS_SMALL:
				setSolarisSmall(SOLARIS_SMALL_EDEFAULT);
				return;
			case ProductPackage.SOLARIS_ICON__SOLARIS_TINY:
				setSolarisTiny(SOLARIS_TINY_EDEFAULT);
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
			case ProductPackage.SOLARIS_ICON__SOLARIS_LARGE:
				return SOLARIS_LARGE_EDEFAULT == null ? solarisLarge != null : !SOLARIS_LARGE_EDEFAULT.equals(solarisLarge);
			case ProductPackage.SOLARIS_ICON__SOLARIS_MEDIUM:
				return SOLARIS_MEDIUM_EDEFAULT == null ? solarisMedium != null : !SOLARIS_MEDIUM_EDEFAULT.equals(solarisMedium);
			case ProductPackage.SOLARIS_ICON__SOLARIS_SMALL:
				return SOLARIS_SMALL_EDEFAULT == null ? solarisSmall != null : !SOLARIS_SMALL_EDEFAULT.equals(solarisSmall);
			case ProductPackage.SOLARIS_ICON__SOLARIS_TINY:
				return SOLARIS_TINY_EDEFAULT == null ? solarisTiny != null : !SOLARIS_TINY_EDEFAULT.equals(solarisTiny);
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
		result.append(" (solarisLarge: ");
		result.append(solarisLarge);
		result.append(", solarisMedium: ");
		result.append(solarisMedium);
		result.append(", solarisSmall: ");
		result.append(solarisSmall);
		result.append(", solarisTiny: ");
		result.append(solarisTiny);
		result.append(')');
		return result.toString();
	}

} //SolarisIconImpl
