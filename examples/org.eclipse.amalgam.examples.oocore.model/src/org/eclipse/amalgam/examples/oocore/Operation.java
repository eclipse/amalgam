/**
 * <copyright>
 * </copyright>
 *
 * $Id: Operation.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Operation#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Operation#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.examples.oocore.Parameter}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.oocore.Parameter#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getOperation_Parameters()
	 * @see org.eclipse.amalgam.examples.oocore.Parameter#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<Parameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(org.eclipse.amalgam.examples.oocore.Class)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getOperation_Owner()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.amalgam.examples.oocore.Class getOwner();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.Operation#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(org.eclipse.amalgam.examples.oocore.Class value);

} // Operation
