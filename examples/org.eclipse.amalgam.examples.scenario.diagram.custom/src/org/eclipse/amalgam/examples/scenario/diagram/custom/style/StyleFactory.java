/**
 * <copyright>
 * </copyright>
 *
 * $Id: StyleFactory.java,v 1.1 2008/11/14 17:38:02 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario.diagram.custom.style;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage
 * @generated
 */
public interface StyleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StyleFactory eINSTANCE = org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.StyleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Custom Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Style</em>'.
	 * @generated
	 */
	CustomStyle createCustomStyle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StylePackage getStylePackage();

} //StyleFactory
