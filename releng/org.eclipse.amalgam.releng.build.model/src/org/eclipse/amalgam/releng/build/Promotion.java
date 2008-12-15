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
 * $Id: Promotion.java,v 1.2 2008/12/15 01:31:42 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Promotion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.Promotion#getDirectory <em>Directory</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Promotion#isIncubating <em>Incubating</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Promotion#getBaseURL <em>Base URL</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Promotion#getBuildAlias <em>Build Alias</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.build.BuildPackage#getPromotion()
 * @model
 * @generated
 */
public interface Promotion extends EObject {
	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getPromotion_Directory()
	 * @model
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Promotion#getDirectory <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' attribute.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Incubating</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incubating</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incubating</em>' attribute.
	 * @see #setIncubating(boolean)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getPromotion_Incubating()
	 * @model
	 * @generated
	 */
	boolean isIncubating();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Promotion#isIncubating <em>Incubating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incubating</em>' attribute.
	 * @see #isIncubating()
	 * @generated
	 */
	void setIncubating(boolean value);

	/**
	 * Returns the value of the '<em><b>Base URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base URL</em>' attribute.
	 * @see #setBaseURL(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getPromotion_BaseURL()
	 * @model
	 * @generated
	 */
	String getBaseURL();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Promotion#getBaseURL <em>Base URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base URL</em>' attribute.
	 * @see #getBaseURL()
	 * @generated
	 */
	void setBaseURL(String value);

	/**
	 * Returns the value of the '<em><b>Build Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Alias</em>' attribute.
	 * @see #setBuildAlias(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getPromotion_BuildAlias()
	 * @model
	 * @generated
	 */
	String getBuildAlias();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Promotion#getBuildAlias <em>Build Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Alias</em>' attribute.
	 * @see #getBuildAlias()
	 * @generated
	 */
	void setBuildAlias(String value);

} // Promotion
