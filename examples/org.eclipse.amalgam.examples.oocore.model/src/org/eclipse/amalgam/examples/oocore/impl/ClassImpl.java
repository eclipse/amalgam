/**
 * <copyright>
 * </copyright>
 *
 * $Id: ClassImpl.java,v 1.1 2008/11/14 17:34:32 rgronback Exp $
 */
package org.eclipse.amalgam.examples.oocore.impl;

import java.util.Collection;

import org.eclipse.amalgam.examples.oocore.OocorePackage;
import org.eclipse.amalgam.examples.oocore.Operation;
import org.eclipse.amalgam.examples.oocore.StructuralFeature;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.impl.ClassImpl#getSuperclasses <em>Superclasses</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.impl.ClassImpl#getSubclasses <em>Subclasses</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.impl.ClassImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.impl.ClassImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.impl.ClassImpl#isInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.amalgam.examples.oocore.impl.ClassImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements org.eclipse.amalgam.examples.oocore.Class {
	/**
	 * The cached value of the '{@link #getSuperclasses() <em>Superclasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.amalgam.examples.oocore.Class> superclasses;

	/**
	 * The cached value of the '{@link #getSubclasses() <em>Subclasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<org.eclipse.amalgam.examples.oocore.Class> subclasses;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralFeature> features;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INTERFACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInterface()
	 * @generated
	 * @ordered
	 */
	protected boolean interface_ = INTERFACE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OocorePackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.amalgam.examples.oocore.Class> getSuperclasses() {
		if (superclasses == null) {
			superclasses = new EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.amalgam.examples.oocore.Class>(org.eclipse.amalgam.examples.oocore.Class.class, this, OocorePackage.CLASS__SUPERCLASSES, OocorePackage.CLASS__SUBCLASSES);
		}
		return superclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.amalgam.examples.oocore.Class> getSubclasses() {
		if (subclasses == null) {
			subclasses = new EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.amalgam.examples.oocore.Class>(org.eclipse.amalgam.examples.oocore.Class.class, this, OocorePackage.CLASS__SUBCLASSES, OocorePackage.CLASS__SUPERCLASSES);
		}
		return subclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<StructuralFeature>(StructuralFeature.class, this, OocorePackage.CLASS__FEATURES, OocorePackage.STRUCTURAL_FEATURE__OWNER);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OocorePackage.CLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(boolean newInterface) {
		boolean oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OocorePackage.CLASS__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operation>(Operation.class, this, OocorePackage.CLASS__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OocorePackage.CLASS__SUPERCLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperclasses()).basicAdd(otherEnd, msgs);
			case OocorePackage.CLASS__SUBCLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubclasses()).basicAdd(otherEnd, msgs);
			case OocorePackage.CLASS__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OocorePackage.CLASS__SUPERCLASSES:
				return ((InternalEList<?>)getSuperclasses()).basicRemove(otherEnd, msgs);
			case OocorePackage.CLASS__SUBCLASSES:
				return ((InternalEList<?>)getSubclasses()).basicRemove(otherEnd, msgs);
			case OocorePackage.CLASS__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case OocorePackage.CLASS__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OocorePackage.CLASS__SUPERCLASSES:
				return getSuperclasses();
			case OocorePackage.CLASS__SUBCLASSES:
				return getSubclasses();
			case OocorePackage.CLASS__FEATURES:
				return getFeatures();
			case OocorePackage.CLASS__ABSTRACT:
				return isAbstract() ? Boolean.TRUE : Boolean.FALSE;
			case OocorePackage.CLASS__INTERFACE:
				return isInterface() ? Boolean.TRUE : Boolean.FALSE;
			case OocorePackage.CLASS__OPERATIONS:
				return getOperations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OocorePackage.CLASS__SUPERCLASSES:
				getSuperclasses().clear();
				getSuperclasses().addAll((Collection<? extends org.eclipse.amalgam.examples.oocore.Class>)newValue);
				return;
			case OocorePackage.CLASS__SUBCLASSES:
				getSubclasses().clear();
				getSubclasses().addAll((Collection<? extends org.eclipse.amalgam.examples.oocore.Class>)newValue);
				return;
			case OocorePackage.CLASS__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends StructuralFeature>)newValue);
				return;
			case OocorePackage.CLASS__ABSTRACT:
				setAbstract(((Boolean)newValue).booleanValue());
				return;
			case OocorePackage.CLASS__INTERFACE:
				setInterface(((Boolean)newValue).booleanValue());
				return;
			case OocorePackage.CLASS__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operation>)newValue);
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
			case OocorePackage.CLASS__SUPERCLASSES:
				getSuperclasses().clear();
				return;
			case OocorePackage.CLASS__SUBCLASSES:
				getSubclasses().clear();
				return;
			case OocorePackage.CLASS__FEATURES:
				getFeatures().clear();
				return;
			case OocorePackage.CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case OocorePackage.CLASS__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case OocorePackage.CLASS__OPERATIONS:
				getOperations().clear();
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
			case OocorePackage.CLASS__SUPERCLASSES:
				return superclasses != null && !superclasses.isEmpty();
			case OocorePackage.CLASS__SUBCLASSES:
				return subclasses != null && !subclasses.isEmpty();
			case OocorePackage.CLASS__FEATURES:
				return features != null && !features.isEmpty();
			case OocorePackage.CLASS__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case OocorePackage.CLASS__INTERFACE:
				return interface_ != INTERFACE_EDEFAULT;
			case OocorePackage.CLASS__OPERATIONS:
				return operations != null && !operations.isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", interface: ");
		result.append(interface_);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
