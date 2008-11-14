/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomStyleImpl.java,v 1.1 2008/11/14 17:38:02 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl;

import org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle;
import org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.CustomStyleImpl#getHyperlink <em>Hyperlink</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.scenario.diagram.custom.style.impl.CustomStyleImpl#isDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomStyleImpl extends EObjectImpl implements CustomStyle {
	/**
	 * The default value of the '{@link #getHyperlink() <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlink()
	 * @generated
	 * @ordered
	 */
	protected static final String HYPERLINK_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getHyperlink() <em>Hyperlink</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperlink()
	 * @generated
	 * @ordered
	 */
	protected String hyperlink = HYPERLINK_EDEFAULT;

	/**
	 * The default value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEFAULT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean default_ = DEFAULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StylePackage.Literals.CUSTOM_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHyperlink() {
		return hyperlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHyperlink(String newHyperlink) {
		String oldHyperlink = hyperlink;
		hyperlink = newHyperlink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.CUSTOM_STYLE__HYPERLINK, oldHyperlink, hyperlink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(boolean newDefault) {
		boolean oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StylePackage.CUSTOM_STYLE__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StylePackage.CUSTOM_STYLE__HYPERLINK:
				return getHyperlink();
			case StylePackage.CUSTOM_STYLE__DEFAULT:
				return isDefault() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StylePackage.CUSTOM_STYLE__HYPERLINK:
				setHyperlink((String)newValue);
				return;
			case StylePackage.CUSTOM_STYLE__DEFAULT:
				setDefault(((Boolean)newValue).booleanValue());
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StylePackage.CUSTOM_STYLE__HYPERLINK:
				setHyperlink(HYPERLINK_EDEFAULT);
				return;
			case StylePackage.CUSTOM_STYLE__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StylePackage.CUSTOM_STYLE__HYPERLINK:
				return HYPERLINK_EDEFAULT == null ? hyperlink != null : !HYPERLINK_EDEFAULT.equals(hyperlink);
			case StylePackage.CUSTOM_STYLE__DEFAULT:
				return default_ != DEFAULT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (hyperlink: ");
		result.append(hyperlink);
		result.append(", default: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //CustomStyleImpl
