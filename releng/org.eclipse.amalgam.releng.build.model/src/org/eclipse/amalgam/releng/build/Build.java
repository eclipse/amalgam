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
 * $Id: Build.java,v 1.5 2008/12/16 11:28:16 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build;

import org.eclipse.amalgam.releng.product.Product;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getBuildRoot <em>Build Root</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getPlatforms <em>Platforms</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getConfigs <em>Configs</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getMap <em>Map</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getFetchTag <em>Fetch Tag</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getCategories <em>Categories</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getContributions <em>Contributions</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getProduct <em>Product</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getBase <em>Base</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getBuilder <em>Builder</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getDate <em>Date</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getLaunchVM <em>Launch VM</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getDeltapack <em>Deltapack</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getPromotion <em>Promotion</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getBuilderURL <em>Builder URL</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getBuildmaster <em>Buildmaster</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#getDefaultMailList <em>Default Mail List</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Build#isSendmail <em>Sendmail</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild()
 * @model
 * @generated
 */
public interface Build extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.releng.build.BuildType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.BuildType
	 * @see #setType(BuildType)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Type()
	 * @model required="true"
	 * @generated
	 */
	BuildType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.BuildType
	 * @see #getType()
	 * @generated
	 */
	void setType(BuildType value);

	/**
	 * Returns the value of the '<em><b>Build Root</b></em>' attribute.
	 * The default value is <code>"${user.home}/build"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Root</em>' attribute.
	 * @see #setBuildRoot(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_BuildRoot()
	 * @model default="${user.home}/build"
	 * @generated
	 */
	String getBuildRoot();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getBuildRoot <em>Build Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build Root</em>' attribute.
	 * @see #getBuildRoot()
	 * @generated
	 */
	void setBuildRoot(String value);

	/**
	 * Returns the value of the '<em><b>Platforms</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.releng.build.Platform}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Platforms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platforms</em>' containment reference list.
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Platforms()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Platform> getPlatforms();

	/**
	 * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.releng.build.Config}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configs</em>' containment reference list.
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Configs()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Config> getConfigs();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference.
	 * @see #setMap(Map)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Map()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Map getMap();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getMap <em>Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' containment reference.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map value);

	/**
	 * Returns the value of the '<em><b>Fetch Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fetch Tag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fetch Tag</em>' attribute.
	 * @see #setFetchTag(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_FetchTag()
	 * @model
	 * @generated
	 */
	String getFetchTag();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getFetchTag <em>Fetch Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fetch Tag</em>' attribute.
	 * @see #getFetchTag()
	 * @generated
	 */
	void setFetchTag(String value);

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.releng.build.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Categories()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Category> getCategories();

	/**
	 * Returns the value of the '<em><b>Contributions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.releng.build.Contribution}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contributions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contributions</em>' containment reference list.
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Contributions()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Contribution> getContributions();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Product</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Product()
	 * @model
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' reference.
	 * @see #setBase(Platform)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Base()
	 * @model required="true"
	 * @generated
	 */
	Platform getBase();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getBase <em>Base</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Platform value);

	/**
	 * Returns the value of the '<em><b>Builder</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder</em>' reference.
	 * @see #setBuilder(Platform)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Builder()
	 * @model required="true"
	 * @generated
	 */
	Platform getBuilder();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getBuilder <em>Builder</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder</em>' reference.
	 * @see #getBuilder()
	 * @generated
	 */
	void setBuilder(Platform value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Date()
	 * @model
	 * @generated
	 */
	String getDate();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(String value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

	/**
	 * Returns the value of the '<em><b>Compiler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compiler</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compiler</em>' containment reference.
	 * @see #setCompiler(org.eclipse.amalgam.releng.build.Compiler)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Compiler()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	org.eclipse.amalgam.releng.build.Compiler getCompiler();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getCompiler <em>Compiler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compiler</em>' containment reference.
	 * @see #getCompiler()
	 * @generated
	 */
	void setCompiler(org.eclipse.amalgam.releng.build.Compiler value);

	/**
	 * Returns the value of the '<em><b>Launch VM</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launch VM</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launch VM</em>' attribute.
	 * @see #setLaunchVM(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_LaunchVM()
	 * @model
	 * @generated
	 */
	String getLaunchVM();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getLaunchVM <em>Launch VM</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launch VM</em>' attribute.
	 * @see #getLaunchVM()
	 * @generated
	 */
	void setLaunchVM(String value);

	/**
	 * Returns the value of the '<em><b>Deltapack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deltapack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deltapack</em>' attribute.
	 * @see #setDeltapack(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Deltapack()
	 * @model
	 * @generated
	 */
	String getDeltapack();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getDeltapack <em>Deltapack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deltapack</em>' attribute.
	 * @see #getDeltapack()
	 * @generated
	 */
	void setDeltapack(String value);

	/**
	 * Returns the value of the '<em><b>Promotion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Promotion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Promotion</em>' containment reference.
	 * @see #setPromotion(Promotion)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Promotion()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Promotion getPromotion();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getPromotion <em>Promotion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Promotion</em>' containment reference.
	 * @see #getPromotion()
	 * @generated
	 */
	void setPromotion(Promotion value);

	/**
	 * Returns the value of the '<em><b>Builder URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Builder URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Builder URL</em>' attribute.
	 * @see #setBuilderURL(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_BuilderURL()
	 * @model
	 * @generated
	 */
	String getBuilderURL();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getBuilderURL <em>Builder URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Builder URL</em>' attribute.
	 * @see #getBuilderURL()
	 * @generated
	 */
	void setBuilderURL(String value);

	/**
	 * Returns the value of the '<em><b>Buildmaster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buildmaster</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buildmaster</em>' containment reference.
	 * @see #setBuildmaster(Contact)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Buildmaster()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	Contact getBuildmaster();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#getBuildmaster <em>Buildmaster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buildmaster</em>' containment reference.
	 * @see #getBuildmaster()
	 * @generated
	 */
	void setBuildmaster(Contact value);

	/**
	 * Returns the value of the '<em><b>Default Mail List</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amalgam.releng.build.Contact}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Mail List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Mail List</em>' containment reference list.
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_DefaultMailList()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Contact> getDefaultMailList();

	/**
	 * Returns the value of the '<em><b>Sendmail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sendmail</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sendmail</em>' attribute.
	 * @see #setSendmail(boolean)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getBuild_Sendmail()
	 * @model
	 * @generated
	 */
	boolean isSendmail();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Build#isSendmail <em>Sendmail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sendmail</em>' attribute.
	 * @see #isSendmail()
	 * @generated
	 */
	void setSendmail(boolean value);

} // Build
