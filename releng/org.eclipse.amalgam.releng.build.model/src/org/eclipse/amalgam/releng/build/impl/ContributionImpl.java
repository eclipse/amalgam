/**
 * Copyright (c) 2008 Borland Software Corporation
 *   
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *      Borland Software Corporation - initial API and implementation
 *
 * $Id: ContributionImpl.java,v 1.3 2009/05/21 12:57:50 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build.impl;

import java.util.Collection;

import org.eclipse.amalgam.releng.build.BuildPackage;
import org.eclipse.amalgam.releng.build.Bundle;
import org.eclipse.amalgam.releng.build.Contact;
import org.eclipse.amalgam.releng.build.Contribution;
import org.eclipse.amalgam.releng.build.Feature;
import org.eclipse.amalgam.releng.build.Product;
import org.eclipse.amalgam.releng.build.Repository;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ContributionImpl#getContacts <em>Contacts</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ContributionImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ContributionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ContributionImpl#getRepositories <em>Repositories</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ContributionImpl#getBundles <em>Bundles</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.impl.ContributionImpl#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionImpl extends EObjectImpl implements Contribution {
	/**
	 * The cached value of the '{@link #getContacts() <em>Contacts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContacts()
	 * @generated
	 * @ordered
	 */
	protected EList<Contact> contacts;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> features;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRepositories() <em>Repositories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositories()
	 * @generated
	 * @ordered
	 */
	protected EList<Repository> repositories;

	/**
	 * The cached value of the '{@link #getBundles() <em>Bundles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundles()
	 * @generated
	 * @ordered
	 */
	protected EList<Bundle> bundles;

	/**
	 * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducts()
	 * @generated
	 * @ordered
	 */
	protected EList<Product> products;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContributionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BuildPackage.Literals.CONTRIBUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contact> getContacts() {
		if (contacts == null) {
			contacts = new EObjectContainmentEList.Resolving<Contact>(Contact.class, this, BuildPackage.CONTRIBUTION__CONTACTS);
		}
		return contacts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList.Resolving<Feature>(Feature.class, this, BuildPackage.CONTRIBUTION__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BuildPackage.CONTRIBUTION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Repository> getRepositories() {
		if (repositories == null) {
			repositories = new EObjectContainmentEList.Resolving<Repository>(Repository.class, this, BuildPackage.CONTRIBUTION__REPOSITORIES);
		}
		return repositories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bundle> getBundles() {
		if (bundles == null) {
			bundles = new EObjectContainmentEList.Resolving<Bundle>(Bundle.class, this, BuildPackage.CONTRIBUTION__BUNDLES);
		}
		return bundles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Product> getProducts() {
		if (products == null) {
			products = new EObjectContainmentEList.Resolving<Product>(Product.class, this, BuildPackage.CONTRIBUTION__PRODUCTS);
		}
		return products;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BuildPackage.CONTRIBUTION__CONTACTS:
				return ((InternalEList<?>)getContacts()).basicRemove(otherEnd, msgs);
			case BuildPackage.CONTRIBUTION__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case BuildPackage.CONTRIBUTION__REPOSITORIES:
				return ((InternalEList<?>)getRepositories()).basicRemove(otherEnd, msgs);
			case BuildPackage.CONTRIBUTION__BUNDLES:
				return ((InternalEList<?>)getBundles()).basicRemove(otherEnd, msgs);
			case BuildPackage.CONTRIBUTION__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
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
			case BuildPackage.CONTRIBUTION__CONTACTS:
				return getContacts();
			case BuildPackage.CONTRIBUTION__FEATURES:
				return getFeatures();
			case BuildPackage.CONTRIBUTION__LABEL:
				return getLabel();
			case BuildPackage.CONTRIBUTION__REPOSITORIES:
				return getRepositories();
			case BuildPackage.CONTRIBUTION__BUNDLES:
				return getBundles();
			case BuildPackage.CONTRIBUTION__PRODUCTS:
				return getProducts();
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
			case BuildPackage.CONTRIBUTION__CONTACTS:
				getContacts().clear();
				getContacts().addAll((Collection<? extends Contact>)newValue);
				return;
			case BuildPackage.CONTRIBUTION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case BuildPackage.CONTRIBUTION__LABEL:
				setLabel((String)newValue);
				return;
			case BuildPackage.CONTRIBUTION__REPOSITORIES:
				getRepositories().clear();
				getRepositories().addAll((Collection<? extends Repository>)newValue);
				return;
			case BuildPackage.CONTRIBUTION__BUNDLES:
				getBundles().clear();
				getBundles().addAll((Collection<? extends Bundle>)newValue);
				return;
			case BuildPackage.CONTRIBUTION__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
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
			case BuildPackage.CONTRIBUTION__CONTACTS:
				getContacts().clear();
				return;
			case BuildPackage.CONTRIBUTION__FEATURES:
				getFeatures().clear();
				return;
			case BuildPackage.CONTRIBUTION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case BuildPackage.CONTRIBUTION__REPOSITORIES:
				getRepositories().clear();
				return;
			case BuildPackage.CONTRIBUTION__BUNDLES:
				getBundles().clear();
				return;
			case BuildPackage.CONTRIBUTION__PRODUCTS:
				getProducts().clear();
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
			case BuildPackage.CONTRIBUTION__CONTACTS:
				return contacts != null && !contacts.isEmpty();
			case BuildPackage.CONTRIBUTION__FEATURES:
				return features != null && !features.isEmpty();
			case BuildPackage.CONTRIBUTION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case BuildPackage.CONTRIBUTION__REPOSITORIES:
				return repositories != null && !repositories.isEmpty();
			case BuildPackage.CONTRIBUTION__BUNDLES:
				return bundles != null && !bundles.isEmpty();
			case BuildPackage.CONTRIBUTION__PRODUCTS:
				return products != null && !products.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //ContributionImpl
