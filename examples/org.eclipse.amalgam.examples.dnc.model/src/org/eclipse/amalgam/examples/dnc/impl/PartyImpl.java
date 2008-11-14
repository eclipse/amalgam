/**
 * <copyright>
 * </copyright>
 *
 * $Id: PartyImpl.java,v 1.1 2008/11/14 17:31:42 rgronback Exp $
 */
package org.eclipse.amalgam.examples.dnc.impl;

import org.eclipse.amalgam.examples.dnc.DncPackage;
import org.eclipse.amalgam.examples.dnc.Party;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Party</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PartyImpl extends ArchetypeImpl implements Party {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DncPackage.Literals.PARTY;
	}

} //PartyImpl
