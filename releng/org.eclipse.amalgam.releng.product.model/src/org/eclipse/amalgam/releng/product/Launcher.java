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
 * $Id: Launcher.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.Launcher#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Launcher#getLinux <em>Linux</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Launcher#getMacosx <em>Macosx</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Launcher#getSolaris <em>Solaris</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Launcher#getWin <em>Win</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncher()
 * @model
 * @generated
 */
public interface Launcher extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncher_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Launcher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Linux</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linux</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linux</em>' containment reference.
	 * @see #setLinux(LinuxIcon)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncher_Linux()
	 * @model containment="true"
	 * @generated
	 */
	LinuxIcon getLinux();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Launcher#getLinux <em>Linux</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linux</em>' containment reference.
	 * @see #getLinux()
	 * @generated
	 */
	void setLinux(LinuxIcon value);

	/**
	 * Returns the value of the '<em><b>Macosx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macosx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macosx</em>' containment reference.
	 * @see #setMacosx(MacIcon)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncher_Macosx()
	 * @model containment="true"
	 * @generated
	 */
	MacIcon getMacosx();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Launcher#getMacosx <em>Macosx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Macosx</em>' containment reference.
	 * @see #getMacosx()
	 * @generated
	 */
	void setMacosx(MacIcon value);

	/**
	 * Returns the value of the '<em><b>Solaris</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solaris</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solaris</em>' containment reference.
	 * @see #setSolaris(SolarisIcon)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncher_Solaris()
	 * @model containment="true"
	 * @generated
	 */
	SolarisIcon getSolaris();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Launcher#getSolaris <em>Solaris</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solaris</em>' containment reference.
	 * @see #getSolaris()
	 * @generated
	 */
	void setSolaris(SolarisIcon value);

	/**
	 * Returns the value of the '<em><b>Win</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Win</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win</em>' containment reference.
	 * @see #setWin(WinIcon)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncher_Win()
	 * @model containment="true"
	 * @generated
	 */
	WinIcon getWin();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Launcher#getWin <em>Win</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win</em>' containment reference.
	 * @see #getWin()
	 * @generated
	 */
	void setWin(WinIcon value);

} // Launcher
