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
 * $Id: ARCH.java,v 1.2 2009/03/13 11:09:27 rgronback Exp $
 */
package org.eclipse.amalgam.releng.build;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ARCH</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.amalgam.releng.build.BuildPackage#getARCH()
 * @model
 * @generated
 */
public enum ARCH implements Enumerator {
	/**
	 * The '<em><b>X86</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X86_VALUE
	 * @generated
	 * @ordered
	 */
	X86(0, "x86", "x86"),

	/**
	 * The '<em><b>Ppc</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PPC_VALUE
	 * @generated
	 * @ordered
	 */
	PPC(1, "ppc", "ppc"), /**
	 * The '<em><b>X86 64</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #X86_64_VALUE
	 * @generated
	 * @ordered
	 */
	X86_64(2, "x86_64", "x86_64");

	/**
	 * The '<em><b>X86</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X86</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X86
	 * @model name="x86"
	 * @generated
	 * @ordered
	 */
	public static final int X86_VALUE = 0;

	/**
	 * The '<em><b>Ppc</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ppc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PPC
	 * @model name="ppc"
	 * @generated
	 * @ordered
	 */
	public static final int PPC_VALUE = 1;

	/**
	 * The '<em><b>X86 64</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>X86 64</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #X86_64
	 * @model name="x86_64"
	 * @generated
	 * @ordered
	 */
	public static final int X86_64_VALUE = 2;

	/**
	 * An array of all the '<em><b>ARCH</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ARCH[] VALUES_ARRAY =
		new ARCH[] {
			X86,
			PPC,
			X86_64,
		};

	/**
	 * A public read-only list of all the '<em><b>ARCH</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ARCH> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ARCH</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ARCH get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ARCH result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ARCH</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ARCH getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ARCH result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ARCH</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ARCH get(int value) {
		switch (value) {
			case X86_VALUE: return X86;
			case PPC_VALUE: return PPC;
			case X86_64_VALUE: return X86_64;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ARCH(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ARCH
