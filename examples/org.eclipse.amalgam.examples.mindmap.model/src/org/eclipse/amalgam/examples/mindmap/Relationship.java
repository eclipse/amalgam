/**
 * <copyright>
 * </copyright>
 *
 * $Id: Relationship.java,v 1.1 2008/11/14 17:33:36 rgronback Exp $
 */
package org.eclipse.amalgam.examples.mindmap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.mindmap.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.mindmap.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.mindmap.Relationship#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.mindmap.MindmapPackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends MapElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Topic)
	 * @see org.eclipse.amalgam.examples.mindmap.MindmapPackage#getRelationship_Source()
	 * @model required="true"
	 * @generated
	 */
	Topic getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.mindmap.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Topic value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Topic)
	 * @see org.eclipse.amalgam.examples.mindmap.MindmapPackage#getRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	Topic getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.mindmap.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Topic value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.examples.mindmap.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.amalgam.examples.mindmap.Type
	 * @see #setType(Type)
	 * @see org.eclipse.amalgam.examples.mindmap.MindmapPackage#getRelationship_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.mindmap.Relationship#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.amalgam.examples.mindmap.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // Relationship
