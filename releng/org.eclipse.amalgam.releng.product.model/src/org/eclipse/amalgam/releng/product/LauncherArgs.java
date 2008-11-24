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
 * $Id: LauncherArgs.java,v 1.1 2008/11/24 20:38:29 rgronback Exp $
 */
package org.eclipse.amalgam.releng.product;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launcher Args</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgs <em>Program Args</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsLin <em>Program Args Lin</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsMac <em>Program Args Mac</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsSol <em>Program Args Sol</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsWin <em>Program Args Win</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgs <em>Vm Args</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsLin <em>Vm Args Lin</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsMac <em>Vm Args Mac</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsSol <em>Vm Args Sol</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsWin <em>Vm Args Win</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs()
 * @model
 * @generated
 */
public interface LauncherArgs extends EObject {
	/**
	 * Returns the value of the '<em><b>Program Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Args</em>' attribute.
	 * @see #setProgramArgs(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_ProgramArgs()
	 * @model extendedMetaData="kind='element' name='programArgs' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProgramArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgs <em>Program Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Args</em>' attribute.
	 * @see #getProgramArgs()
	 * @generated
	 */
	void setProgramArgs(String value);

	/**
	 * Returns the value of the '<em><b>Program Args Lin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Args Lin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Args Lin</em>' attribute.
	 * @see #setProgramArgsLin(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_ProgramArgsLin()
	 * @model extendedMetaData="kind='element' name='programArgsLin' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProgramArgsLin();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsLin <em>Program Args Lin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Args Lin</em>' attribute.
	 * @see #getProgramArgsLin()
	 * @generated
	 */
	void setProgramArgsLin(String value);

	/**
	 * Returns the value of the '<em><b>Program Args Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Args Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Args Mac</em>' attribute.
	 * @see #setProgramArgsMac(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_ProgramArgsMac()
	 * @model extendedMetaData="kind='element' name='programArgsMac' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProgramArgsMac();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsMac <em>Program Args Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Args Mac</em>' attribute.
	 * @see #getProgramArgsMac()
	 * @generated
	 */
	void setProgramArgsMac(String value);

	/**
	 * Returns the value of the '<em><b>Program Args Sol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Args Sol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Args Sol</em>' attribute.
	 * @see #setProgramArgsSol(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_ProgramArgsSol()
	 * @model extendedMetaData="kind='element' name='programArgsSol' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProgramArgsSol();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsSol <em>Program Args Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Args Sol</em>' attribute.
	 * @see #getProgramArgsSol()
	 * @generated
	 */
	void setProgramArgsSol(String value);

	/**
	 * Returns the value of the '<em><b>Program Args Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Program Args Win</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Program Args Win</em>' attribute.
	 * @see #setProgramArgsWin(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_ProgramArgsWin()
	 * @model extendedMetaData="kind='element' name='programArgsWin' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProgramArgsWin();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getProgramArgsWin <em>Program Args Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Args Win</em>' attribute.
	 * @see #getProgramArgsWin()
	 * @generated
	 */
	void setProgramArgsWin(String value);

	/**
	 * Returns the value of the '<em><b>Vm Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Args</em>' attribute.
	 * @see #setVmArgs(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_VmArgs()
	 * @model extendedMetaData="kind='element' name='vmArgs' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVmArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgs <em>Vm Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Args</em>' attribute.
	 * @see #getVmArgs()
	 * @generated
	 */
	void setVmArgs(String value);

	/**
	 * Returns the value of the '<em><b>Vm Args Lin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Args Lin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Args Lin</em>' attribute.
	 * @see #setVmArgsLin(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_VmArgsLin()
	 * @model extendedMetaData="kind='element' name='vmArgsLin' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVmArgsLin();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsLin <em>Vm Args Lin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Args Lin</em>' attribute.
	 * @see #getVmArgsLin()
	 * @generated
	 */
	void setVmArgsLin(String value);

	/**
	 * Returns the value of the '<em><b>Vm Args Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Args Mac</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Args Mac</em>' attribute.
	 * @see #setVmArgsMac(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_VmArgsMac()
	 * @model extendedMetaData="kind='element' name='vmArgsMac' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVmArgsMac();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsMac <em>Vm Args Mac</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Args Mac</em>' attribute.
	 * @see #getVmArgsMac()
	 * @generated
	 */
	void setVmArgsMac(String value);

	/**
	 * Returns the value of the '<em><b>Vm Args Sol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Args Sol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Args Sol</em>' attribute.
	 * @see #setVmArgsSol(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_VmArgsSol()
	 * @model extendedMetaData="kind='element' name='vmArgsSol' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVmArgsSol();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsSol <em>Vm Args Sol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Args Sol</em>' attribute.
	 * @see #getVmArgsSol()
	 * @generated
	 */
	void setVmArgsSol(String value);

	/**
	 * Returns the value of the '<em><b>Vm Args Win</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Args Win</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Args Win</em>' attribute.
	 * @see #setVmArgsWin(String)
	 * @see org.eclipse.amalgam.releng.product.ProductPackage#getLauncherArgs_VmArgsWin()
	 * @model extendedMetaData="kind='element' name='vmArgsWin' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVmArgsWin();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.product.LauncherArgs#getVmArgsWin <em>Vm Args Win</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Args Win</em>' attribute.
	 * @see #getVmArgsWin()
	 * @generated
	 */
	void setVmArgsWin(String value);

} // LauncherArgs
