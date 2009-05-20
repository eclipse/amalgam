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
 * $Id: InstallationUnit.java,v 1.1 2009/05/20 18:12:35 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Installation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.InstallationUnit#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.InstallationUnit#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.InstallationUnit#getRepo <em>Repo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.build.BuildPackage#getInstallationUnit()
 * @model abstract="true"
 * @generated
 */
public interface InstallationUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getInstallationUnit_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.InstallationUnit#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getInstallationUnit_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.InstallationUnit#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Repo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo</em>' reference.
	 * @see #setRepo(Repository)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getInstallationUnit_Repo()
	 * @model
	 * @generated
	 */
	Repository getRepo();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.InstallationUnit#getRepo <em>Repo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo</em>' reference.
	 * @see #getRepo()
	 * @generated
	 */
	void setRepo(Repository value);

} // InstallationUnit
