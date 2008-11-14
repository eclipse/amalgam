/**
 * <copyright>
 * </copyright>
 *
 * $Id: Association.java,v 1.1 2008/11/14 17:38:46 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Association#isIsDirected <em>Is Directed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Connection {
	/**
	 * Returns the value of the '<em><b>Is Directed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Directed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Directed</em>' attribute.
	 * @see #setIsDirected(boolean)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getAssociation_IsDirected()
	 * @model
	 * @generated
	 */
	boolean isIsDirected();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Association#isIsDirected <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Directed</em>' attribute.
	 * @see #isIsDirected()
	 * @generated
	 */
	void setIsDirected(boolean value);

} // Association
