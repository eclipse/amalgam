/**
 * <copyright>
 * </copyright>
 *
 * $Id: Class.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Class#getSuperclasses <em>Superclasses</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Class#getSubclasses <em>Subclasses</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Class#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Class#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Class#isInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Class#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Superclasses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.examples.oocore.Class}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.oocore.Class#getSubclasses <em>Subclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Superclasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Superclasses</em>' reference list.
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getClass_Superclasses()
	 * @see org.eclipse.amalgam.examples.oocore.Class#getSubclasses
	 * @model opposite="subclasses" ordered="false"
	 * @generated
	 */
	EList<Class> getSuperclasses();

	/**
	 * Returns the value of the '<em><b>Subclasses</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.examples.oocore.Class}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.oocore.Class#getSuperclasses <em>Superclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subclasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subclasses</em>' reference list.
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getClass_Subclasses()
	 * @see org.eclipse.amalgam.examples.oocore.Class#getSuperclasses
	 * @model opposite="superclasses" ordered="false"
	 * @generated
	 */
	EList<Class> getSubclasses();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.examples.oocore.StructuralFeature}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.oocore.StructuralFeature#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getClass_Features()
	 * @see org.eclipse.amalgam.examples.oocore.StructuralFeature#getOwner
	 * @model opposite="owner" containment="true" ordered="false"
	 * @generated
	 */
	EList<StructuralFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(boolean)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getClass_Abstract()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isAbstract();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.Class#isAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #isAbstract()
	 * @generated
	 */
	void setAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(boolean)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getClass_Interface()
	 * @model default="false" unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.Class#isInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #isInterface()
	 * @generated
	 */
	void setInterface(boolean value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.examples.oocore.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getClass_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperations();

} // Class
