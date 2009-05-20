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
 * $Id: Feature.java,v 1.3 2009/05/20 18:12:35 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.Feature#getCategory <em>Category</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Feature#isInProduct <em>In Product</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.build.BuildPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends InstallationUnit {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.releng.build.Category}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.releng.build.Category#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getFeature_Category()
	 * @see org.eclipse.amalgam.releng.build.Category#getFeatures
	 * @model opposite="features"
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>In Product</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Product</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Product</em>' attribute.
	 * @see #setInProduct(boolean)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getFeature_InProduct()
	 * @model default="true"
	 * @generated
	 */
	boolean isInProduct();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Feature#isInProduct <em>In Product</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Product</em>' attribute.
	 * @see #isInProduct()
	 * @generated
	 */
	void setInProduct(boolean value);

} // Feature
