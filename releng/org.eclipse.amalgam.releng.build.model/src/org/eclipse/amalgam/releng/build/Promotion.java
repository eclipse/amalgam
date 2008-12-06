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
 * $Id: Promotion.java,v 1.1 2008/12/06 03:59:50 rgronback Exp $
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

} // Promotion
