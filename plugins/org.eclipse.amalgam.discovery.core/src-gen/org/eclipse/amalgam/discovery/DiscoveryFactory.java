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
 * $Id: DiscoveryFactory.java,v 1.3 2010/02/25 15:50:40 cbrun Exp $
 */
package org.eclipse.amalgam.discovery;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.discovery.DiscoveryPackage
 * @generated
 */
public interface DiscoveryFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    DiscoveryFactory eINSTANCE = org.eclipse.amalgam.discovery.impl.DiscoveryFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Installable Component</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Installable Component</em>'.
	 * @generated
	 */
    InstallableComponent createInstallableComponent();

    /**
	 * Returns a new object of class '<em>Overview</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Overview</em>'.
	 * @generated
	 */
    Overview createOverview();

    /**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
    Category createCategory();

    /**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
    DiscoveryDefinition createDiscoveryDefinition();

    /**
	 * Returns a new object of class '<em>Group</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group</em>'.
	 * @generated
	 */
    Group createGroup();

    /**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

				/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    DiscoveryPackage getDiscoveryPackage();

} //DiscoveryFactory
