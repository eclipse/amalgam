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
 * $Id: SplashImpl.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product.impl;

import org.eclipse.amalgam.releng.product.ProductPackage;
import org.eclipse.amalgam.releng.product.Splash;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Splash</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.SplashImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.SplashImpl#getHandlerType <em>Handler Type</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.SplashImpl#getStartupProgressRect <em>Startup Progress Rect</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.SplashImpl#getStartupMessageRect <em>Startup Message Rect</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.impl.SplashImpl#getStartupForegroundColor <em>Startup Foreground Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SplashImpl extends EObjectImpl implements Splash {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHandlerType() <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerType()
	 * @generated
	 * @ordered
	 */
	protected static final String HANDLER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHandlerType() <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHandlerType()
	 * @generated
	 * @ordered
	 */
	protected String handlerType = HANDLER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupProgressRect() <em>Startup Progress Rect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupProgressRect()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTUP_PROGRESS_RECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartupProgressRect() <em>Startup Progress Rect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupProgressRect()
	 * @generated
	 * @ordered
	 */
	protected String startupProgressRect = STARTUP_PROGRESS_RECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupMessageRect() <em>Startup Message Rect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupMessageRect()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTUP_MESSAGE_RECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartupMessageRect() <em>Startup Message Rect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupMessageRect()
	 * @generated
	 * @ordered
	 */
	protected String startupMessageRect = STARTUP_MESSAGE_RECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartupForegroundColor() <em>Startup Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTUP_FOREGROUND_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartupForegroundColor() <em>Startup Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartupForegroundColor()
	 * @generated
	 * @ordered
	 */
	protected String startupForegroundColor = STARTUP_FOREGROUND_COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SplashImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProductPackage.Literals.SPLASH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SPLASH__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHandlerType() {
		return handlerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHandlerType(String newHandlerType) {
		String oldHandlerType = handlerType;
		handlerType = newHandlerType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SPLASH__HANDLER_TYPE, oldHandlerType, handlerType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartupProgressRect() {
		return startupProgressRect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupProgressRect(String newStartupProgressRect) {
		String oldStartupProgressRect = startupProgressRect;
		startupProgressRect = newStartupProgressRect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SPLASH__STARTUP_PROGRESS_RECT, oldStartupProgressRect, startupProgressRect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartupMessageRect() {
		return startupMessageRect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupMessageRect(String newStartupMessageRect) {
		String oldStartupMessageRect = startupMessageRect;
		startupMessageRect = newStartupMessageRect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SPLASH__STARTUP_MESSAGE_RECT, oldStartupMessageRect, startupMessageRect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartupForegroundColor() {
		return startupForegroundColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartupForegroundColor(String newStartupForegroundColor) {
		String oldStartupForegroundColor = startupForegroundColor;
		startupForegroundColor = newStartupForegroundColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProductPackage.SPLASH__STARTUP_FOREGROUND_COLOR, oldStartupForegroundColor, startupForegroundColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProductPackage.SPLASH__LOCATION:
				return getLocation();
			case ProductPackage.SPLASH__HANDLER_TYPE:
				return getHandlerType();
			case ProductPackage.SPLASH__STARTUP_PROGRESS_RECT:
				return getStartupProgressRect();
			case ProductPackage.SPLASH__STARTUP_MESSAGE_RECT:
				return getStartupMessageRect();
			case ProductPackage.SPLASH__STARTUP_FOREGROUND_COLOR:
				return getStartupForegroundColor();
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
			case ProductPackage.SPLASH__LOCATION:
				setLocation((String)newValue);
				return;
			case ProductPackage.SPLASH__HANDLER_TYPE:
				setHandlerType((String)newValue);
				return;
			case ProductPackage.SPLASH__STARTUP_PROGRESS_RECT:
				setStartupProgressRect((String)newValue);
				return;
			case ProductPackage.SPLASH__STARTUP_MESSAGE_RECT:
				setStartupMessageRect((String)newValue);
				return;
			case ProductPackage.SPLASH__STARTUP_FOREGROUND_COLOR:
				setStartupForegroundColor((String)newValue);
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
			case ProductPackage.SPLASH__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case ProductPackage.SPLASH__HANDLER_TYPE:
				setHandlerType(HANDLER_TYPE_EDEFAULT);
				return;
			case ProductPackage.SPLASH__STARTUP_PROGRESS_RECT:
				setStartupProgressRect(STARTUP_PROGRESS_RECT_EDEFAULT);
				return;
			case ProductPackage.SPLASH__STARTUP_MESSAGE_RECT:
				setStartupMessageRect(STARTUP_MESSAGE_RECT_EDEFAULT);
				return;
			case ProductPackage.SPLASH__STARTUP_FOREGROUND_COLOR:
				setStartupForegroundColor(STARTUP_FOREGROUND_COLOR_EDEFAULT);
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
			case ProductPackage.SPLASH__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case ProductPackage.SPLASH__HANDLER_TYPE:
				return HANDLER_TYPE_EDEFAULT == null ? handlerType != null : !HANDLER_TYPE_EDEFAULT.equals(handlerType);
			case ProductPackage.SPLASH__STARTUP_PROGRESS_RECT:
				return STARTUP_PROGRESS_RECT_EDEFAULT == null ? startupProgressRect != null : !STARTUP_PROGRESS_RECT_EDEFAULT.equals(startupProgressRect);
			case ProductPackage.SPLASH__STARTUP_MESSAGE_RECT:
				return STARTUP_MESSAGE_RECT_EDEFAULT == null ? startupMessageRect != null : !STARTUP_MESSAGE_RECT_EDEFAULT.equals(startupMessageRect);
			case ProductPackage.SPLASH__STARTUP_FOREGROUND_COLOR:
				return STARTUP_FOREGROUND_COLOR_EDEFAULT == null ? startupForegroundColor != null : !STARTUP_FOREGROUND_COLOR_EDEFAULT.equals(startupForegroundColor);
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
		result.append(" (location: ");
		result.append(location);
		result.append(", handlerType: ");
		result.append(handlerType);
		result.append(", startupProgressRect: ");
		result.append(startupProgressRect);
		result.append(", startupMessageRect: ");
		result.append(startupMessageRect);
		result.append(", startupForegroundColor: ");
		result.append(startupForegroundColor);
		result.append(')');
		return result.toString();
	}

} //SplashImpl
