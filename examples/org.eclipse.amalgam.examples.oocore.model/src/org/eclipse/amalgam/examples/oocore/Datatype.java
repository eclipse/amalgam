/**
 * <copyright>
 * </copyright>
 *
 * $Id: Datatype.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Datatype#getDefaultLiteral <em>Default Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getDatatype()
 * @model
 * @generated
 */
public interface Datatype extends Classifier {
	/**
	 * Returns the value of the '<em><b>Default Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Literal</em>' attribute.
	 * @see #setDefaultLiteral(String)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getDatatype_DefaultLiteral()
	 * @model
	 * @generated
	 */
	String getDefaultLiteral();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.Datatype#getDefaultLiteral <em>Default Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Literal</em>' attribute.
	 * @see #getDefaultLiteral()
	 * @generated
	 */
	void setDefaultLiteral(String value);

} // Datatype
