/**
 * <copyright>
 * </copyright>
 *
 * $Id: StructuralFeature.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.StructuralFeature#isRequired <em>Required</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.StructuralFeature#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface StructuralFeature extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getStructuralFeature_Required()
	 * @model
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.StructuralFeature#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.oocore.Class#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(org.eclipse.amalgam.examples.oocore.Class)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getStructuralFeature_Owner()
	 * @see org.eclipse.amalgam.examples.oocore.Class#getFeatures
	 * @model opposite="features" required="true" transient="false" ordered="false"
	 * @generated
	 */
	org.eclipse.amalgam.examples.oocore.Class getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.StructuralFeature#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(org.eclipse.amalgam.examples.oocore.Class value);

} // StructuralFeature
