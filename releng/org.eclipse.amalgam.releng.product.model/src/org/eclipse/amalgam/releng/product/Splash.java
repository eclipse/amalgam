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
 * $Id: Splash.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Splash</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.Splash#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Splash#getHandlerType <em>Handler Type</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Splash#getStartupProgressRect <em>Startup Progress Rect</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Splash#getStartupMessageRect <em>Startup Message Rect</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Splash#getStartupForegroundColor <em>Startup Foreground Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.product.ProductPackage#getSplash()
 * @model
 * @generated
 */
public interface Splash extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getSplash_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Splash#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Handler Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Handler Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handler Type</em>' attribute.
	 * @see #setHandlerType(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getSplash_HandlerType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getHandlerType();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Splash#getHandlerType <em>Handler Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Type</em>' attribute.
	 * @see #getHandlerType()
	 * @generated
	 */
	void setHandlerType(String value);

	/**
	 * Returns the value of the '<em><b>Startup Progress Rect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Progress Rect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Progress Rect</em>' attribute.
	 * @see #setStartupProgressRect(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getSplash_StartupProgressRect()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getStartupProgressRect();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Splash#getStartupProgressRect <em>Startup Progress Rect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Progress Rect</em>' attribute.
	 * @see #getStartupProgressRect()
	 * @generated
	 */
	void setStartupProgressRect(String value);

	/**
	 * Returns the value of the '<em><b>Startup Message Rect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Message Rect</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Message Rect</em>' attribute.
	 * @see #setStartupMessageRect(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getSplash_StartupMessageRect()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getStartupMessageRect();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Splash#getStartupMessageRect <em>Startup Message Rect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Message Rect</em>' attribute.
	 * @see #getStartupMessageRect()
	 * @generated
	 */
	void setStartupMessageRect(String value);

	/**
	 * Returns the value of the '<em><b>Startup Foreground Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startup Foreground Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startup Foreground Color</em>' attribute.
	 * @see #setStartupForegroundColor(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getSplash_StartupForegroundColor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getStartupForegroundColor();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Splash#getStartupForegroundColor <em>Startup Foreground Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startup Foreground Color</em>' attribute.
	 * @see #getStartupForegroundColor()
	 * @generated
	 */
	void setStartupForegroundColor(String value);

} // Splash
