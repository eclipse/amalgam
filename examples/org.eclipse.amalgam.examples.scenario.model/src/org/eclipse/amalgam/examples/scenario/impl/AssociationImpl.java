/**
 * <copyright>
 * </copyright>
 *
 * $Id: AssociationImpl.java,v 1.1 2008/11/14 17:38:46 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario.impl;

import org.eclipse.amalgam.examples.scenario.Association;
import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.impl.AssociationImpl#isIsDirected <em>Is Directed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ConnectionImpl implements Association {
	/**
	 * The default value of the '{@link #isIsDirected() <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIRECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDirected() <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDirected()
	 * @generated
	 * @ordered
	 */
	protected boolean isDirected = IS_DIRECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDirected() {
		return isDirected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDirected(boolean newIsDirected) {
		boolean oldIsDirected = isDirected;
		isDirected = newIsDirected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.ASSOCIATION__IS_DIRECTED, oldIsDirected, isDirected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.ASSOCIATION__IS_DIRECTED:
				return isIsDirected() ? Boolean.TRUE : Boolean.FALSE;
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
			case ScenarioPackage.ASSOCIATION__IS_DIRECTED:
				setIsDirected(((Boolean)newValue).booleanValue());
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
			case ScenarioPackage.ASSOCIATION__IS_DIRECTED:
				setIsDirected(IS_DIRECTED_EDEFAULT);
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
			case ScenarioPackage.ASSOCIATION__IS_DIRECTED:
				return isDirected != IS_DIRECTED_EDEFAULT;
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
		result.append(" (isDirected: ");
		result.append(isDirected);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
