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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.filter.CandidateElementFilterManager;
import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.emf.transaction.RunnableWithResult;

/**
 * Command for computing query.
 */
@SuppressWarnings("rawtypes")
public class QueryComputeCommand extends RunnableWithResult.Impl {
	protected List<Object> internalResult = null;
	protected Object currentElement = null;
	protected Object query = null;

	/**
	 * Default Constructor
	 */
	public QueryComputeCommand(Object currentElement_p, Object query_p) {
		internalResult = new ArrayList<Object>(0);
		currentElement = currentElement_p;
		query = query_p;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@SuppressWarnings("unchecked")
	public void run() {
		if (query instanceof IQuery) 
		{
			for (Object o : ((IQuery) query).compute(currentElement))
			{
				if (CandidateElementFilterManager.accept(o))
					internalResult.add(o);
			}
			setResult(internalResult);
		}
	}
}
