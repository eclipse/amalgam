/**
 * <copyright>
 * </copyright>
 *
 * $Id: DatatypeImpl.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore.impl;

import org.eclipse.amalgam.examples.oocore.Datatype;
import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.impl.DatatypeImpl#getDefaultLiteral <em>Default Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DatatypeImpl extends ClassifierImpl implements Datatype {
	/**
	 * The default value of the '{@link #getDefaultLiteral() <em>Default Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultLiteral() <em>Default Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultLiteral()
	 * @generated
	 * @ordered
	 */
	protected String defaultLiteral = DEFAULT_LITERAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DatatypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OocorePackage.Literals.DATATYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultLiteral() {
		return defaultLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultLiteral(String newDefaultLiteral) {
		String oldDefaultLiteral = defaultLiteral;
		defaultLiteral = newDefaultLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OocorePackage.DATATYPE__DEFAULT_LITERAL, oldDefaultLiteral, defaultLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OocorePackage.DATATYPE__DEFAULT_LITERAL:
				return getDefaultLiteral();
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
			case OocorePackage.DATATYPE__DEFAULT_LITERAL:
				setDefaultLiteral((String)newValue);
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
			case OocorePackage.DATATYPE__DEFAULT_LITERAL:
				setDefaultLiteral(DEFAULT_LITERAL_EDEFAULT);
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
			case OocorePackage.DATATYPE__DEFAULT_LITERAL:
				return DEFAULT_LITERAL_EDEFAULT == null ? defaultLiteral != null : !DEFAULT_LITERAL_EDEFAULT.equals(defaultLiteral);
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
		result.append(" (defaultLiteral: ");
		result.append(defaultLiteral);
		result.append(')');
		return result.toString();
	}

} //DatatypeImpl
