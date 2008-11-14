/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomStyle.java,v 1.1 2008/11/14 17:38:02 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario.diagram.custom.style;

import org.eclipse.gmf.runtime.notation.Style;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle#getHyperlink <em>Hyperlink</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage#getCustomStyle()
 * @model
 * @generated
 */
public interface CustomStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Hyperlink</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyperlink</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperlink</em>' attribute.
	 * @see #setHyperlink(String)
	 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage#getCustomStyle_Hyperlink()
	 * @model default=""
	 * @generated
	 */
	String getHyperlink();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle#getHyperlink <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hyperlink</em>' attribute.
	 * @see #getHyperlink()
	 * @generated
	 */
	void setHyperlink(String value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(boolean)
	 * @see org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage#getCustomStyle_Default()
	 * @model default="true"
	 * @generated
	 */
	boolean isDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle#isDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #isDefault()
	 * @generated
	 */
	void setDefault(boolean value);

} // CustomStyle
