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
 * $Id: Plugins.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plugins</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.Plugins#getPlugin <em>Plugin</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.product.ProductPackage#getPlugins()
 * @model
 * @generated
 */
public interface Plugins extends EObject {
	/**
	 * Returns the value of the '<em><b>Plugin</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.releng.product.Plugin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugin</em>' containment reference list.
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getPlugins_Plugin()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plugin> getPlugin();

} // Plugins
