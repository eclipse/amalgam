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
 * $Id: WinIcon.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Win Icon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.WinIcon#getBmp <em>Bmp</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.WinIcon#isUseIco <em>Use Ico</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.WinIcon#getIco <em>Ico</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.product.ProductPackage#getWinIcon()
 * @model
 * @generated
 */
public interface WinIcon extends EObject {
	/**
	 * Returns the value of the '<em><b>Bmp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bmp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bmp</em>' containment reference.
	 * @see #setBmp(Bitmap)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getWinIcon_Bmp()
	 * @model containment="true"
	 * @generated
	 */
	Bitmap getBmp();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.WinIcon#getBmp <em>Bmp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bmp</em>' containment reference.
	 * @see #getBmp()
	 * @generated
	 */
	void setBmp(Bitmap value);

	/**
	 * Returns the value of the '<em><b>Use Ico</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Ico</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Ico</em>' attribute.
	 * @see #setUseIco(boolean)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getWinIcon_UseIco()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isUseIco();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.WinIcon#isUseIco <em>Use Ico</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Ico</em>' attribute.
	 * @see #isUseIco()
	 * @generated
	 */
	void setUseIco(boolean value);

	/**
	 * Returns the value of the '<em><b>Ico</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ico</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ico</em>' containment reference.
	 * @see #setIco(Icon)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getWinIcon_Ico()
	 * @model containment="true"
	 * @generated
	 */
	Icon getIco();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.WinIcon#getIco <em>Ico</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ico</em>' containment reference.
	 * @see #getIco()
	 * @generated
	 */
	void setIco(Icon value);

} // WinIcon
