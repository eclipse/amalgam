/**
 * 
 *   Copyright (c)  2009 Obeo.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *   
 *   Contributors:
 *       Obeo - initial API and implementation
 *  
 *
 * $Id: ImageDef.java,v 1.1 2009/12/21 12:35:54 cbrun Exp $
 */
package org.eclipse.amalgam.discovery;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.discovery.ImageDef#getImage32 <em>Image32</em>}</li>
 *   <li>{@link org.eclipse.amalgam.discovery.ImageDef#getImage48 <em>Image48</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.discovery.DiscoveryPackage#getImageDef()
 * @model
 * @generated
 */
public interface ImageDef extends EObject {
    /**
     * Returns the value of the '<em><b>Image32</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Image32</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Image32</em>' attribute.
     * @see #setImage32(String)
     * @see org.eclipse.amalgam.discovery.DiscoveryPackage#getImageDef_Image32()
     * @model required="true"
     * @generated
     */
    String getImage32();

    /**
     * Sets the value of the '{@link org.eclipse.amalgam.discovery.ImageDef#getImage32 <em>Image32</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Image32</em>' attribute.
     * @see #getImage32()
     * @generated
     */
    void setImage32(String value);

    /**
     * Returns the value of the '<em><b>Image48</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Image48</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Image48</em>' attribute.
     * @see #setImage48(String)
     * @see org.eclipse.amalgam.discovery.DiscoveryPackage#getImageDef_Image48()
     * @model required="true"
     * @generated
     */
    String getImage48();

    /**
     * Sets the value of the '{@link org.eclipse.amalgam.discovery.ImageDef#getImage48 <em>Image48</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Image48</em>' attribute.
     * @see #getImage48()
     * @generated
     */
    void setImage48(String value);

} // ImageDef
