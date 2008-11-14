/**
 * <copyright>
 * </copyright>
 *
 * $Id: PackageableElement.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Packageable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.PackageableElement#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getPackageableElement()
 * @model abstract="true"
 * @generated
 */
public interface PackageableElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.oocore.Package#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(org.eclipse.amalgam.examples.oocore.Package)
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getPackageableElement_Package()
	 * @see org.eclipse.amalgam.examples.oocore.Package#getContents
	 * @model opposite="contents" transient="false" ordered="false"
	 * @generated
	 */
	org.eclipse.amalgam.examples.oocore.Package getPackage();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.oocore.PackageableElement#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(org.eclipse.amalgam.examples.oocore.Package value);

} // PackageableElement
