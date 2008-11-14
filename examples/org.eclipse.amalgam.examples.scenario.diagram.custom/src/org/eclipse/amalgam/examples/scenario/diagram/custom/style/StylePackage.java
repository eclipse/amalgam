/**
 * <copyright>
 * </copyright>
 *
 * $Id: StylePackage.java,v 1.1 2008/11/14 17:38:02 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario.diagram.custom.style;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.StyleFactory
 * @model kind="package"
 * @generated
 */
public interface StylePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "style";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/scenario/2008/styles";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "style";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StylePackage eINSTANCE = org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.StylePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.CustomStyleImpl <em>Custom Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.CustomStyleImpl
	 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.StylePackageImpl#getCustomStyle()
	 * @generated
	 */
	int CUSTOM_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Hyperlink</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STYLE__HYPERLINK = NotationPackage.STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STYLE__DEFAULT = NotationPackage.STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_STYLE_FEATURE_COUNT = NotationPackage.STYLE_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle <em>Custom Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Style</em>'.
	 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle
	 * @generated
	 */
	EClass getCustomStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle#getHyperlink <em>Hyperlink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hyperlink</em>'.
	 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle#getHyperlink()
	 * @see #getCustomStyle()
	 * @generated
	 */
	EAttribute getCustomStyle_Hyperlink();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle#isDefault()
	 * @see #getCustomStyle()
	 * @generated
	 */
	EAttribute getCustomStyle_Default();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StyleFactory getStyleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.CustomStyleImpl <em>Custom Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.CustomStyleImpl
		 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.StylePackageImpl#getCustomStyle()
		 * @generated
		 */
		EClass CUSTOM_STYLE = eINSTANCE.getCustomStyle();

		/**
		 * The meta object literal for the '<em><b>Hyperlink</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_STYLE__HYPERLINK = eINSTANCE.getCustomStyle_Hyperlink();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_STYLE__DEFAULT = eINSTANCE.getCustomStyle_Default();

	}

} //StylePackage
