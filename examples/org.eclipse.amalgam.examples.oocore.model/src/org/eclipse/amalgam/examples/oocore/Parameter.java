/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parameter.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Parameter#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.oocore.Operation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(Operation)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getParameter_Owner()
	 * @see org.eclipse.amalgam.examples.oocore.Operation#getParameters
	 * @model opposite="parameters" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Operation getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.Parameter#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Operation value);

} // Parameter
