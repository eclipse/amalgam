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
 * $Id: Product.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getConfigIni <em>Config Ini</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getLauncherArgs <em>Launcher Args</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#isUseFeatures <em>Use Features</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getVm <em>Vm</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getLauncher <em>Launcher</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getSplash <em>Splash</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getWindowImages <em>Window Images</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getAboutInfo <em>About Info</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getIntro <em>Intro</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getPlugins <em>Plugins</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.Product#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct()
 * @model extendedMetaData="kind='element' name='product'"
 * @generated
 */
public interface Product extends EObject {
	/**
	 * Returns the value of the '<em><b>Config Ini</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Ini</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Ini</em>' containment reference.
	 * @see #setConfigIni(ConfigIni)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_ConfigIni()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConfigIni getConfigIni();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getConfigIni <em>Config Ini</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Ini</em>' containment reference.
	 * @see #getConfigIni()
	 * @generated
	 */
	void setConfigIni(ConfigIni value);

	/**
	 * Returns the value of the '<em><b>Launcher Args</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launcher Args</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launcher Args</em>' containment reference.
	 * @see #setLauncherArgs(LauncherArgs)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_LauncherArgs()
	 * @model containment="true"
	 * @generated
	 */
	LauncherArgs getLauncherArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getLauncherArgs <em>Launcher Args</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launcher Args</em>' containment reference.
	 * @see #getLauncherArgs()
	 * @generated
	 */
	void setLauncherArgs(LauncherArgs value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Id()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Application()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Use Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Features</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Features</em>' attribute.
	 * @see #setUseFeatures(boolean)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_UseFeatures()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isUseFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#isUseFeatures <em>Use Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Features</em>' attribute.
	 * @see #isUseFeatures()
	 * @generated
	 */
	void setUseFeatures(boolean value);

	/**
	 * Returns the value of the '<em><b>Vm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm</em>' containment reference.
	 * @see #setVm(VirtualMachine)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Vm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VirtualMachine getVm();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getVm <em>Vm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm</em>' containment reference.
	 * @see #getVm()
	 * @generated
	 */
	void setVm(VirtualMachine value);

	/**
	 * Returns the value of the '<em><b>Launcher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Launcher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Launcher</em>' containment reference.
	 * @see #setLauncher(Launcher)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Launcher()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Launcher getLauncher();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getLauncher <em>Launcher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Launcher</em>' containment reference.
	 * @see #getLauncher()
	 * @generated
	 */
	void setLauncher(Launcher value);

	/**
	 * Returns the value of the '<em><b>Splash</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Splash</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Splash</em>' containment reference.
	 * @see #setSplash(Splash)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Splash()
	 * @model containment="true"
	 * @generated
	 */
	Splash getSplash();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getSplash <em>Splash</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Splash</em>' containment reference.
	 * @see #getSplash()
	 * @generated
	 */
	void setSplash(Splash value);

	/**
	 * Returns the value of the '<em><b>Window Images</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Window Images</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Window Images</em>' containment reference.
	 * @see #setWindowImages(WindowImage)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_WindowImages()
	 * @model containment="true"
	 * @generated
	 */
	WindowImage getWindowImages();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getWindowImages <em>Window Images</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Window Images</em>' containment reference.
	 * @see #getWindowImages()
	 * @generated
	 */
	void setWindowImages(WindowImage value);

	/**
	 * Returns the value of the '<em><b>About Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>About Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>About Info</em>' containment reference.
	 * @see #setAboutInfo(AboutInfo)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_AboutInfo()
	 * @model containment="true"
	 * @generated
	 */
	AboutInfo getAboutInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getAboutInfo <em>About Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>About Info</em>' containment reference.
	 * @see #getAboutInfo()
	 * @generated
	 */
	void setAboutInfo(AboutInfo value);

	/**
	 * Returns the value of the '<em><b>Intro</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intro</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intro</em>' containment reference.
	 * @see #setIntro(Intro)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Intro()
	 * @model containment="true"
	 * @generated
	 */
	Intro getIntro();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getIntro <em>Intro</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intro</em>' containment reference.
	 * @see #getIntro()
	 * @generated
	 */
	void setIntro(Intro value);

	/**
	 * Returns the value of the '<em><b>Plugins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plugins</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plugins</em>' containment reference.
	 * @see #setPlugins(Plugins)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Plugins()
	 * @model containment="true"
	 * @generated
	 */
	Plugins getPlugins();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getPlugins <em>Plugins</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plugins</em>' containment reference.
	 * @see #getPlugins()
	 * @generated
	 */
	void setPlugins(Plugins value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference.
	 * @see #setFeatures(Features)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Features()
	 * @model containment="true"
	 * @generated
	 */
	Features getFeatures();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getFeatures <em>Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' containment reference.
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(Features value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getProduct_Version()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.Product#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // Product
