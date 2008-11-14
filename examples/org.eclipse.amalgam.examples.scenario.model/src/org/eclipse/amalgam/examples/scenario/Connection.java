/**
 * <copyright>
 * </copyright>
 *
 * $Id: Connection.java,v 1.1 2008/11/14 17:38:46 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Connection#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Connection#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getConnection()
 * @model abstract="true"
 * @generated
 */
public interface Connection extends Element {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.scenario.Element#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getConnection_Source()
	 * @see org.eclipse.amalgam.examples.scenario.Element#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Connection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.scenario.Element#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Element)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getConnection_Target()
	 * @see org.eclipse.amalgam.examples.scenario.Element#getIncoming
	 * @model opposite="incoming"
	 * @generated
	 */
	Element getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Connection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Element value);

} // Connection
