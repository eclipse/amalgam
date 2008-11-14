/**
 * <copyright>
 * </copyright>
 *
 * $Id: StyleFactoryImpl.java,v 1.1 2008/11/14 17:38:02 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl;

import org.eclipse.amalgam.examples.scenario.diagram.custom.style.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StyleFactoryImpl extends EFactoryImpl implements StyleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StyleFactory init() {
		try {
			StyleFactory theStyleFactory = (StyleFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/scenario/2008/styles"); 
			if (theStyleFactory != null) {
				return theStyleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StyleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StylePackage.CUSTOM_STYLE: return createCustomStyle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomStyle createCustomStyle() {
		CustomStyleImpl customStyle = new CustomStyleImpl();
		return customStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StylePackage getStylePackage() {
		return (StylePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StylePackage getPackage() {
		return StylePackage.eINSTANCE;
	}

} //StyleFactoryImpl
