/**
 * <copyright>
 * </copyright>
 *
 * $Id: Association.java,v 1.1 2008/11/14 17:31:42 rgronback Exp $
 */
package org.eclipse.amalgam.examples.dnc;

import org.eclipse.amalgam.examples.oocore.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.dnc.Association#isAggregation <em>Aggregation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.dnc.DncPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends Reference {
	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see #setAggregation(boolean)
	 * @see org.eclipse.amalgam.examples.dnc.DncPackage#getAssociation_Aggregation()
	 * @model
	 * @generated
	 */
	boolean isAggregation();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.dnc.Association#isAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see #isAggregation()
	 * @generated
	 */
	void setAggregation(boolean value);

} // Association
