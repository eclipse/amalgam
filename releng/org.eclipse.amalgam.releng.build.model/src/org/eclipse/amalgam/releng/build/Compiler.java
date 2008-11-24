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
 * $Id: Compiler.java,v 1.1 2008/11/24 20:36:44 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compiler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.Compiler#getArgs <em>Args</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Compiler#getSourceVersion <em>Source Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Compiler#getTargetVersion <em>Target Version</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Compiler#isVerbose <em>Verbose</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Compiler#isFailOnError <em>Fail On Error</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Compiler#isDebugInfo <em>Debug Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.build.BuildPackage#getCompiler()
 * @model
 * @generated
 */
public interface Compiler extends EObject {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getCompiler_Args()
	 * @model
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Compiler#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

	/**
	 * Returns the value of the '<em><b>Source Version</b></em>' attribute.
	 * The default value is <code>"1.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Version</em>' attribute.
	 * @see #setSourceVersion(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getCompiler_SourceVersion()
	 * @model default="1.5"
	 * @generated
	 */
	String getSourceVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Compiler#getSourceVersion <em>Source Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Version</em>' attribute.
	 * @see #getSourceVersion()
	 * @generated
	 */
	void setSourceVersion(String value);

	/**
	 * Returns the value of the '<em><b>Target Version</b></em>' attribute.
	 * The default value is <code>"1.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Version</em>' attribute.
	 * @see #setTargetVersion(String)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getCompiler_TargetVersion()
	 * @model default="1.5"
	 * @generated
	 */
	String getTargetVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Compiler#getTargetVersion <em>Target Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Version</em>' attribute.
	 * @see #getTargetVersion()
	 * @generated
	 */
	void setTargetVersion(String value);

	/**
	 * Returns the value of the '<em><b>Verbose</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verbose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbose</em>' attribute.
	 * @see #setVerbose(boolean)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getCompiler_Verbose()
	 * @model default="false"
	 * @generated
	 */
	boolean isVerbose();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Compiler#isVerbose <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbose</em>' attribute.
	 * @see #isVerbose()
	 * @generated
	 */
	void setVerbose(boolean value);

	/**
	 * Returns the value of the '<em><b>Fail On Error</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fail On Error</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail On Error</em>' attribute.
	 * @see #setFailOnError(boolean)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getCompiler_FailOnError()
	 * @model default="false"
	 * @generated
	 */
	boolean isFailOnError();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Compiler#isFailOnError <em>Fail On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail On Error</em>' attribute.
	 * @see #isFailOnError()
	 * @generated
	 */
	void setFailOnError(boolean value);

	/**
	 * Returns the value of the '<em><b>Debug Info</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Info</em>' attribute.
	 * @see #setDebugInfo(boolean)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getCompiler_DebugInfo()
	 * @model default="true"
	 * @generated
	 */
	boolean isDebugInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Compiler#isDebugInfo <em>Debug Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug Info</em>' attribute.
	 * @see #isDebugInfo()
	 * @generated
	 */
	void setDebugInfo(boolean value);

} // Compiler
