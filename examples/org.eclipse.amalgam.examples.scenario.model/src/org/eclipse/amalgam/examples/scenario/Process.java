/**
 * <copyright>
 * </copyright>
 *
 * $Id: Process.java,v 1.1 2008/11/14 17:38:46 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Process#getElements <em>Elements</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Process#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Process#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Process#getCreationDate <em>Creation Date</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.Process#getModificationDate <em>Modification Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Element {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.examples.scenario.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getProcess_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Element> getElements();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getProcess_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Process#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' attribute.
	 * @see #setAuthor(String)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getProcess_Author()
	 * @model
	 * @generated
	 */
	String getAuthor();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Process#getAuthor <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' attribute.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(String value);

	/**
	 * Returns the value of the '<em><b>Creation Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creation Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creation Date</em>' attribute.
	 * @see #setCreationDate(Date)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getProcess_CreationDate()
	 * @model
	 * @generated
	 */
	Date getCreationDate();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Process#getCreationDate <em>Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Date</em>' attribute.
	 * @see #getCreationDate()
	 * @generated
	 */
	void setCreationDate(Date value);

	/**
	 * Returns the value of the '<em><b>Modification Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modification Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modification Date</em>' attribute.
	 * @see #setModificationDate(Date)
	 * @see org.eclipse.amalgam.examples.scenario.ScenarioPackage#getProcess_ModificationDate()
	 * @model
	 * @generated
	 */
	Date getModificationDate();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.Process#getModificationDate <em>Modification Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Date</em>' attribute.
	 * @see #getModificationDate()
	 * @generated
	 */
	void setModificationDate(Date value);

} // Process
