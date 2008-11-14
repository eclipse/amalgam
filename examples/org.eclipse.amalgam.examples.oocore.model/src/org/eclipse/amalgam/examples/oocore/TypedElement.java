/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypedElement.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.TypedElement#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.TypedElement#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.TypedElement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.TypedElement#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getTypedElement()
 * @model
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getTypedElement_UpperBound()
	 * @model default="1"
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.TypedElement#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getTypedElement_LowerBound()
	 * @model default="0"
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.TypedElement#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Classifier)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getTypedElement_Type()
	 * @model
	 * @generated
	 */
	Classifier getType();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.TypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Classifier value);

	/**
	 * Returns the value of the '<em><b>Visibility</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.examples.oocore.Visibility}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.amalgam.examples.oocore.Visibility
	 * @see #setVisibility(Visibility)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getTypedElement_Visibility()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	Visibility getVisibility();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.TypedElement#getVisibility <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility</em>' attribute.
	 * @see org.eclipse.amalgam.examples.oocore.Visibility
	 * @see #getVisibility()
	 * @generated
	 */
	void setVisibility(Visibility value);

} // TypedElement
