/**
 * <copyright>
 * </copyright>
 *
 * $Id: Archetype.java,v 1.1 2008/11/14 17:31:42 rgronback Exp $
 */
package org.eclipse.amalgam.examples.dnc;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Archetype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.dnc.Archetype#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.dnc.DncPackage#getArchetype()
 * @model abstract="true"
 * @generated
 */
public interface Archetype extends org.eclipse.amalgam.examples.oocore.Class {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.amalgam.examples.dnc.DncPackage#getArchetype_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.dnc.Archetype#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Archetype
