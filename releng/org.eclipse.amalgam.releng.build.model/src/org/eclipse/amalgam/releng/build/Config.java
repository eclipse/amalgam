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
 * $Id: Config.java,v 1.1 2008/11/24 20:36:44 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amalgam.releng.build.Config#getOs <em>Os</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Config#getWs <em>Ws</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Config#getArch <em>Arch</em>}</li>
 *   <li>{@link org.eclipse.amalgam.releng.build.Config#getArchiveFormat <em>Archive Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amalgam.releng.build.BuildPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.releng.build.OS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.OS
	 * @see #setOs(OS)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getConfig_Os()
	 * @model required="true"
	 * @generated
	 */
	OS getOs();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Config#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.OS
	 * @see #getOs()
	 * @generated
	 */
	void setOs(OS value);

	/**
	 * Returns the value of the '<em><b>Ws</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.releng.build.WS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ws</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ws</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.WS
	 * @see #setWs(WS)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getConfig_Ws()
	 * @model required="true"
	 * @generated
	 */
	WS getWs();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Config#getWs <em>Ws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ws</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.WS
	 * @see #getWs()
	 * @generated
	 */
	void setWs(WS value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.releng.build.ARCH}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.ARCH
	 * @see #setArch(ARCH)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getConfig_Arch()
	 * @model required="true"
	 * @generated
	 */
	ARCH getArch();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Config#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.ARCH
	 * @see #getArch()
	 * @generated
	 */
	void setArch(ARCH value);

	/**
	 * Returns the value of the '<em><b>Archive Format</b></em>' attribute.
	 * The default value is <code>"tar.gz"</code>.
	 * The literals are from the enumeration {@link org.eclipse.amalgam.releng.build.ArchiveFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Archive Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Archive Format</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.ArchiveFormat
	 * @see #setArchiveFormat(ArchiveFormat)
	 * @see org.eclipse.amalgam.releng.build.BuildPackage#getConfig_ArchiveFormat()
	 * @model default="tar.gz"
	 * @generated
	 */
	ArchiveFormat getArchiveFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.amalgam.releng.build.Config#getArchiveFormat <em>Archive Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Archive Format</em>' attribute.
	 * @see org.eclipse.amalgam.releng.build.ArchiveFormat
	 * @see #getArchiveFormat()
	 * @generated
	 */
	void setArchiveFormat(ArchiveFormat value);

} // Config
