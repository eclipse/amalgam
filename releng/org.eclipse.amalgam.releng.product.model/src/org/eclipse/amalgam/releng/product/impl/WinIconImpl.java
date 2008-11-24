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
 * $Id: WinIconImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.Bitmap;
import org.eclipse.amalgam.releng.product.Icon;
import org.eclipse.amalgam.releng.product.ProductPackage;
import org.eclipse.amalgam.releng.product.WinIcon;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Win Icon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.WinIconImpl#getBmp <em>Bmp</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.WinIconImpl#isUseIco <em>Use Ico</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.WinIconImpl#getIco <em>Ico</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WinIconImpl extends EObjectImpl implements WinIcon {
	/**
	 * The cached value of the '{@link #getBmp() <em>Bmp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBmp()
	 * @generated
	 * @ordered
	 */
	protected Bitmap bmp;

	/**
	 * The default value of the '{@link #isUseIco() <em>Use Ico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseIco()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ICO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseIco() <em>Use Ico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseIco()
	 * @generated
	 * @ordered
	 */
	protected boolean useIco = USE_ICO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIco() <em>Ico</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIco()
	 * @generated
	 * @ordered
	 */
	protected Icon ico;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WinIconImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.WIN_ICON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bitmap getBmp() {
		return bmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBmp(Bitmap newBmp, NotificationChain msgs) {
		Bitmap oldBmp = bmp;
		bmp = newBmp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.WIN_ICON__BMP, oldBmp, newBmp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBmp(Bitmap newBmp) {
		if (newBmp != bmp) {
			NotificationChain msgs = null;
			if (bmp != null)
				msgs = ((InternalEObject)bmp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.WIN_ICON__BMP, null, msgs);
			if (newBmp != null)
				msgs = ((InternalEObject)newBmp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.WIN_ICON__BMP, null, msgs);
			msgs = basicSetBmp(newBmp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WIN_ICON__BMP, newBmp, newBmp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseIco() {
		return useIco;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseIco(boolean newUseIco) {
		boolean oldUseIco = useIco;
		useIco = newUseIco;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WIN_ICON__USE_ICO, oldUseIco, useIco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon getIco() {
		return ico;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIco(Icon newIco, NotificationChain msgs) {
		Icon oldIco = ico;
		ico = newIco;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProductPackage.WIN_ICON__ICO, oldIco, newIco);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIco(Icon newIco) {
		if (newIco != ico) {
			NotificationChain msgs = null;
			if (ico != null)
				msgs = ((InternalEObject)ico).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProductPackage.WIN_ICON__ICO, null, msgs);
			if (newIco != null)
				msgs = ((InternalEObject)newIco).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProductPackage.WIN_ICON__ICO, null, msgs);
			msgs = basicSetIco(newIco, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.WIN_ICON__ICO, newIco, newIco));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProductPackage.WIN_ICON__BMP:
				return basicSetBmp(null, msgs);
			case ProductPackage.WIN_ICON__ICO:
				return basicSetIco(null, msgs);
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
			case ProductPackage.WIN_ICON__BMP:
				return getBmp();
			case ProductPackage.WIN_ICON__USE_ICO:
				return isUseIco() ? Boolean.TRUE : Boolean.FALSE;
			case ProductPackage.WIN_ICON__ICO:
				return getIco();
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
			case ProductPackage.WIN_ICON__BMP:
				setBmp((Bitmap)newValue);
				return;
			case ProductPackage.WIN_ICON__USE_ICO:
				setUseIco(((Boolean)newValue).booleanValue());
				return;
			case ProductPackage.WIN_ICON__ICO:
				setIco((Icon)newValue);
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
			case ProductPackage.WIN_ICON__BMP:
				setBmp((Bitmap)null);
				return;
			case ProductPackage.WIN_ICON__USE_ICO:
				setUseIco(USE_ICO_EDEFAULT);
				return;
			case ProductPackage.WIN_ICON__ICO:
				setIco((Icon)null);
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
			case ProductPackage.WIN_ICON__BMP:
				return bmp != null;
			case ProductPackage.WIN_ICON__USE_ICO:
				return useIco != USE_ICO_EDEFAULT;
			case ProductPackage.WIN_ICON__ICO:
				return ico != null;
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
		result.append(" (useIco: ");
		result.append(useIco);
		result.append(')');
		return result.toString();
	}

} //WinIconImpl
