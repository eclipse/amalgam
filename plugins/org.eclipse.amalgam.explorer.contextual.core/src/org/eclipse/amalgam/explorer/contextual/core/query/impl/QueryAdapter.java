/******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.query.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 */
public class QueryAdapter {
	/**
	 * Singleton.
	 */
	private static QueryAdapter _instance = null;

	/**
	 * Singleton constructor.
	 */
	private QueryAdapter() {
		// nothing to do.
	}

	/**
	 * Singleton accessor.
	 * @return
	 */
	public static QueryAdapter getInstance() {
		if (_instance == null) {
			_instance = new QueryAdapter();
		}
		return _instance;
	}

	/**
	 * Compute a query and return its result.
	 * @param currentElement_p context of the query.
	 */
	public List<Object> compute(Object currentElement_p, Object query_p) {
		if (currentElement_p instanceof EObject) 
		{
			List<Object> executeQueryResult = QueryExecutionManager.getInstance().executeQueryWithResult(query_p, currentElement_p);
			return executeQueryResult;
		}
		return Collections.emptyList();
	}

}
