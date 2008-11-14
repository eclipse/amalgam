/**
 * <copyright>
 * </copyright>
 *
 * $Id: Gateway.java,v 1.1 2008/11/14 17:38:46 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Gateway#getGatewayType <em>Gateway Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getGateway()
 * @model
 * @generated
 */
public interface Gateway extends Element {
	/**
	 * Returns the value of the '<em><b>Gateway Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.examples.scenario.GatewayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway Type</em>' attribute.
	 * @see org.eclipse.amalgam.examples.scenario.GatewayType
	 * @see #setGatewayType(GatewayType)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getGateway_GatewayType()
	 * @model
	 * @generated
	 */
	GatewayType getGatewayType();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Gateway#getGatewayType <em>Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway Type</em>' attribute.
	 * @see org.eclipse.amalgam.examples.scenario.GatewayType
	 * @see #getGatewayType()
	 * @generated
	 */
	void setGatewayType(GatewayType value);

} // Gateway
