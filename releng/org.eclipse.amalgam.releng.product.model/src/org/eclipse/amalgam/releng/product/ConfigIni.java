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
 * $Id: ConfigIni.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Ini</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.ConfigIni#getUse <em>Use</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.ConfigIni#getPath <em>Path</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.ConfigIni#getLinux <em>Linux</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.ConfigIni#getMacosx <em>Macosx</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.ConfigIni#getSolaris <em>Solaris</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.ConfigIni#getWin32 <em>Win32</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.product.ProductPackage#getConfigIni()
 * @model
 * @generated
 */
public interface ConfigIni extends EObject {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute.
	 * @see #setUse(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getConfigIni_Use()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getUse();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.ConfigIni#getUse <em>Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' attribute.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getConfigIni_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.ConfigIni#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

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
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getConfigIni_Linux()
	 * @model extendedMetaData="kind='element' name='linux' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLinux();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.ConfigIni#getLinux <em>Linux</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linux</em>' attribute.
	 * @see #getLinux()
	 * @generated
	 */
	void setLinux(String value);

	/**
	 * Returns the value of the '<em><b>Macosx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macosx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macosx</em>' attribute.
	 * @see #setMacosx(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getConfigIni_Macosx()
	 * @model extendedMetaData="kind='element' name='macosx' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMacosx();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.ConfigIni#getMacosx <em>Macosx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macosx</em>' attribute.
	 * @see #getMacosx()
	 * @generated
	 */
	void setMacosx(String value);

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
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getConfigIni_Solaris()
	 * @model extendedMetaData="kind='element' name='solaris' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSolaris();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.ConfigIni#getSolaris <em>Solaris</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solaris</em>' attribute.
	 * @see #getSolaris()
	 * @generated
	 */
	void setSolaris(String value);

	/**
	 * Returns the value of the '<em><b>Win32</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Win32</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win32</em>' attribute.
	 * @see #setWin32(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getConfigIni_Win32()
	 * @model extendedMetaData="kind='element' name='win32' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWin32();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.ConfigIni#getWin32 <em>Win32</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win32</em>' attribute.
	 * @see #getWin32()
	 * @generated
	 */
	void setWin32(String value);

} // ConfigIni
