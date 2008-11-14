/**
 * <copyright>
 * </copyright>
 *
 * $Id: Package.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.Package#getContents <em>Contents</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends PackageableElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.examples.oocore.PackageableElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amalgam.examples.oocore.PackageableElement#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see org.eclipse.amalgam.examples.oocore.OocorePackage#getPackage_Contents()
	 * @see org.eclipse.amalgam.examples.oocore.PackageableElement#getPackage
	 * @model opposite="package" containment="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getContents();

} // Package
