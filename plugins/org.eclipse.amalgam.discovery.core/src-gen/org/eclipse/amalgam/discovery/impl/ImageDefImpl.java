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
 * $Id: ImageDefImpl.java,v 1.1 2009/12/21 12:35:54 cbrun Exp $
 */
package org.eclipse.amalgam.discovery.impl;

import org.eclipse.amalgam.discovery.DiscoveryPackage;
import org.eclipse.amalgam.discovery.ImageDef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.discovery.impl.ImageDefImpl#getImage32 <em>Image32</em>}</li>
 *   <li>{@link org.eclipse.amalgam.discovery.impl.ImageDefImpl#getImage48 <em>Image48</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageDefImpl extends MinimalEObjectImpl implements ImageDef {
    /**
     * The default value of the '{@link #getImage32() <em>Image32</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage32()
     * @generated
     * @ordered
     */
    protected static final String IMAGE32_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImage32() <em>Image32</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage32()
     * @generated
     * @ordered
     */
    protected String image32 = IMAGE32_EDEFAULT;

    /**
     * The default value of the '{@link #getImage48() <em>Image48</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage48()
     * @generated
     * @ordered
     */
    protected static final String IMAGE48_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImage48() <em>Image48</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImage48()
     * @generated
     * @ordered
     */
    protected String image48 = IMAGE48_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImageDefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DiscoveryPackage.Literals.IMAGE_DEF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImage32() {
        return image32;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImage32(String newImage32) {
        String oldImage32 = image32;
        image32 = newImage32;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DiscoveryPackage.IMAGE_DEF__IMAGE32, oldImage32, image32));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getImage48() {
        return image48;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setImage48(String newImage48) {
        String oldImage48 = image48;
        image48 = newImage48;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DiscoveryPackage.IMAGE_DEF__IMAGE48, oldImage48, image48));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DiscoveryPackage.IMAGE_DEF__IMAGE32:
                return getImage32();
            case DiscoveryPackage.IMAGE_DEF__IMAGE48:
                return getImage48();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case DiscoveryPackage.IMAGE_DEF__IMAGE32:
                setImage32((String)newValue);
                return;
            case DiscoveryPackage.IMAGE_DEF__IMAGE48:
                setImage48((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case DiscoveryPackage.IMAGE_DEF__IMAGE32:
                setImage32(IMAGE32_EDEFAULT);
                return;
            case DiscoveryPackage.IMAGE_DEF__IMAGE48:
                setImage48(IMAGE48_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case DiscoveryPackage.IMAGE_DEF__IMAGE32:
                return IMAGE32_EDEFAULT == null ? image32 != null : !IMAGE32_EDEFAULT.equals(image32);
            case DiscoveryPackage.IMAGE_DEF__IMAGE48:
                return IMAGE48_EDEFAULT == null ? image48 != null : !IMAGE48_EDEFAULT.equals(image48);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (image32: ");
        result.append(image32);
        result.append(", image48: ");
        result.append(image48);
        result.append(')');
        return result.toString();
    }

} //ImageDefImpl
