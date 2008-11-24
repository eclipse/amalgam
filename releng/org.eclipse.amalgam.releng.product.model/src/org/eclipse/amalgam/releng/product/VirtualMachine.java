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
 * $Id: VirtualMachine.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Virtual Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.VirtualMachine#getMacos <em>Macos</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.VirtualMachine#getSolaris <em>Solaris</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.VirtualMachine#getLinux <em>Linux</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.VirtualMachine#getWindows <em>Windows</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.product.ProductPackage#getVirtualMachine()
 * @model
 * @generated
 */
public interface VirtualMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Macos</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macos</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macos</em>' attribute.
	 * @see #setMacos(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getVirtualMachine_Macos()
	 * @model extendedMetaData="kind='element' name='macos' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMacos();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.VirtualMachine#getMacos <em>Macos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macos</em>' attribute.
	 * @see #getMacos()
	 * @generated
	 */
	void setMacos(String value);

	/**
	 * Returns the value of the '<em><b>Solaris</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solaris</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solaris</em>' attribute.
	 * @see #setSolaris(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getVirtualMachine_Solaris()
	 * @model extendedMetaData="kind='element' name='solaris' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSolaris();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.VirtualMachine#getSolaris <em>Solaris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solaris</em>' attribute.
	 * @see #getSolaris()
	 * @generated
	 */
	void setSolaris(String value);

	/**
	 * Returns the value of the '<em><b>Linux</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linux</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linux</em>' attribute.
	 * @see #setLinux(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getVirtualMachine_Linux()
	 * @model extendedMetaData="kind='element' name='linux' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLinux();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.VirtualMachine#getLinux <em>Linux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linux</em>' attribute.
	 * @see #getLinux()
	 * @generated
	 */
	void setLinux(String value);

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' attribute.
	 * @see #setWindows(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getVirtualMachine_Windows()
	 * @model extendedMetaData="kind='element' name='windows' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWindows();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.VirtualMachine#getWindows <em>Windows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Windows</em>' attribute.
	 * @see #getWindows()
	 * @generated
	 */
	void setWindows(String value);

} // VirtualMachine
