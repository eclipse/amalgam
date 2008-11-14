/**
 * <copyright>
 * </copyright>
 *
 * $Id: GatewayImpl.java,v 1.1 2008/11/14 17:38:46 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario.impl;

import org.eclipse.amalgam.examples.scenario.Gateway;
import org.eclipse.amalgam.examples.scenario.GatewayType;
import org.eclipse.amalgam.examples.scenario.ScenarioPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.impl.GatewayImpl#getGatewayType <em>Gateway Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GatewayImpl extends ElementImpl implements Gateway {
	/**
	 * The default value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayType()
	 * @generated
	 * @ordered
	 */
	protected static final GatewayType GATEWAY_TYPE_EDEFAULT = GatewayType.XOR;

	/**
	 * The cached value of the '{@link #getGatewayType() <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGatewayType()
	 * @generated
	 * @ordered
	 */
	protected GatewayType gatewayType = GATEWAY_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayType getGatewayType() {
		return gatewayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGatewayType(GatewayType newGatewayType) {
		GatewayType oldGatewayType = gatewayType;
		gatewayType = newGatewayType == null ? GATEWAY_TYPE_EDEFAULT : newGatewayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScenarioPackage.GATEWAY__GATEWAY_TYPE, oldGatewayType, gatewayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScenarioPackage.GATEWAY__GATEWAY_TYPE:
				return getGatewayType();
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
			case ScenarioPackage.GATEWAY__GATEWAY_TYPE:
				setGatewayType((GatewayType)newValue);
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
			case ScenarioPackage.GATEWAY__GATEWAY_TYPE:
				setGatewayType(GATEWAY_TYPE_EDEFAULT);
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
			case ScenarioPackage.GATEWAY__GATEWAY_TYPE:
				return gatewayType != GATEWAY_TYPE_EDEFAULT;
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
		result.append(" (gatewayType: ");
		result.append(gatewayType);
		result.append(')');
		return result.toString();
	}

} //GatewayImpl
