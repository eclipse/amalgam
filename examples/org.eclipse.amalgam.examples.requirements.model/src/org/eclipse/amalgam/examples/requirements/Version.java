/**
 * <copyright>
 * </copyright>
 *
 * $Id: Version.java,v 1.1 2008/11/14 17:35:37 rgronback Exp $
 */
package org.eclipse.amalgam.examples.requirements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.Version#getMajor <em>Major</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.Version#getMinor <em>Minor</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.requirements.Version#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.requirements.RequirementsPackage#getVersion()
 * @model
 * @generated
 */
public interface Version extends EObject {
	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(int)
	 * @see org.eclipse.amalgam.examples.requirements.RequirementsPackage#getVersion_Major()
	 * @model
	 * @generated
	 */
	int getMajor();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.requirements.Version#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(int value);

	/**
	 * Returns the value of the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor</em>' attribute.
	 * @see #setMinor(int)
	 * @see org.eclipse.amalgam.examples.requirements.RequirementsPackage#getVersion_Minor()
	 * @model
	 * @generated
	 */
	int getMinor();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.requirements.Version#getMinor <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor</em>' attribute.
	 * @see #getMinor()
	 * @generated
	 */
	void setMinor(int value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' attribute.
	 * @see #setService(int)
	 * @see org.eclipse.amalgam.examples.requirements.RequirementsPackage#getVersion_Service()
	 * @model
	 * @generated
	 */
	int getService();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.requirements.Version#getService <em>Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' attribute.
	 * @see #getService()
	 * @generated
	 */
	void setService(int value);

} // Version
