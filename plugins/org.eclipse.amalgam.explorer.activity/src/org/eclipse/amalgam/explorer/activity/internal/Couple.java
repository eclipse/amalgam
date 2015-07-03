/*******************************************************************************
 * Copyright (c)  2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.internal;

public class Couple<K, V> implements Cloneable {

	public Couple(K key_p, V value_p) {
		_key = key_p;
		_value = value_p;
	}

	public K getKey() {
		return _key;
	}

	public V getValue() {
		return _value;
	}

	public void setKey(K key_p) {
		_key = key_p;
	}

	public void setValue(V value_p) {
		_value = value_p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Couple<K, V> clone() {
		try {
			return (Couple<K, V>) super.clone();
		} catch (CloneNotSupportedException exception_p) {
			return null;
		}
	}

	public String toString() {
		String keyString = _key == null ? "" : _key.toString(); //$NON-NLS-1$
		String valueString = _value == null ? "" : _value.toString(); //$NON-NLS-1$
		return keyString + '(' + valueString + ')';
	}

	private K _key;
	private V _value;
}
