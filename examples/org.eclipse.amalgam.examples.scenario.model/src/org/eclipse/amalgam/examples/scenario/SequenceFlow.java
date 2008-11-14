/**
 * <copyright>
 * </copyright>
 *
 * $Id: SequenceFlow.java,v 1.1 2008/11/14 17:38:46 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.SequenceFlow#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.SequenceFlow#isIsDefault <em>Is Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getSequenceFlow()
 * @model
 * @generated
 */
public interface SequenceFlow extends Connection {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(Integer)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getSequenceFlow_Quantity()
	 * @model default="1" required="true"
	 * @generated
	 */
	Integer getQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.SequenceFlow#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Integer value);

	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getSequenceFlow_IsDefault()
	 * @model
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.SequenceFlow#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

} // SequenceFlow
