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
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.amalgam.explorer.contextual.core.ExplorerActivator;
import org.eclipse.amalgam.explorer.contextual.core.ext.AbstractExtensionPointManager;
import org.eclipse.amalgam.explorer.contextual.core.filter.CandidateElementFilterManager;
import org.eclipse.amalgam.explorer.contextual.core.query.ICustomQueryExecutionManager;
import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

/**
 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public final class QueryExecutionManager extends AbstractExtensionPointManager{
	
	private static final String _CUSTOM_QUERY_EXEC_MANAGER__CONF_NAME = "customQueryExecutionManager";
	private static final String _QUERY_CLASS__ATTR_NAME= "queryClass";
	private static final String _QUERY_CUSTOM_EXECUTION_MANAGER_CLASS__ATTR_NAME= "customExecutionManager";
	
	/** Singleton Variable **/
	private static QueryExecutionManager _instance = null;
	
	private Map<String, ICustomQueryExecutionManager> _availableCustomQueryExecutionManager ;
	
	/** Singleton Variable initialization and getter **/
	public static QueryExecutionManager getInstance(){
		if (null == _instance)
			_instance = new QueryExecutionManager();
		
		return _instance;
	}
	
	/**
	 * Default Constructor
	 */
	public QueryExecutionManager() {
		_availableCustomQueryExecutionManager = new HashMap<String, ICustomQueryExecutionManager>();
		initRegistry();
	}
	
	/**
	 * Execute a Query.
	 * @param query_p the query to execute
	 * @param currentElement_p the element the query is to execute for
	 * @return The query execution result
	 */
	public List<Object> executeQueryWithResult(Object query_p, Object currentElement_p) {
		List<Object> result = Collections.emptyList();
		ICustomQueryExecutionManager customQueryExecution = getCustomQueryExecution(query_p);
		if (null != customQueryExecution)
		{
			// TODO: Design extensions points and method
			List<Object> executeWithResult = customQueryExecution.executeWithResult(query_p, currentElement_p);
			result = new ArrayList<Object>(executeWithResult);
		}
		else
		{
			QueryComputeCommand queryComputeCommand = new QueryComputeCommand(currentElement_p, query_p);
			try {
				defaultQueryExecution(queryComputeCommand, currentElement_p);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			List<Object> queryResult = (List<Object>) queryComputeCommand.getResult();
			if (null != queryResult)
				result = new ArrayList<Object>(queryResult);
		}
		
		// Trim result from useless 'null' values.
		for (Iterator<Object> iterator = result.iterator(); iterator.hasNext();) 
		{
			Object next = iterator.next();
			if (null == next) 
			{
				iterator.remove();
			}
			else
			{
				// Apply all candidate elements filters acceptance condition 
				if (false == CandidateElementFilterManager.accept(next))
					iterator.remove();
			}
		}
		return result;
	}
	
	/**
	 * Find a Custom Query Execution Manager
	 * @param query_p the query
	 * @return an {@link ICustomQueryExecutionManager} that will execute the query or 
	 * <code>null</code> if no Custom Query Execution Manager is registered for that query.
	 */
	private ICustomQueryExecutionManager getCustomQueryExecution(Object query_p) {
		String queryClassName = query_p.getClass().getName();
		ICustomQueryExecutionManager result = null;
		// try to get Custom Execution Manager by the class name
		result = _availableCustomQueryExecutionManager.get(queryClassName);
		
		if (result == null)
		{// This means that there is no Registered Execution Manager for the current query Class
			// Check Supper Classes and Implemented Interfaces 
			result = checkClassIftypeOf(query_p.getClass());
		}
		
		return result;
	}
	
	/**
	 * Find a Custom Query Execution Manager registered from a super class or an implemented interface 
	 * @param clazz the java {@link Class} of the current query
	 * @return an {@link ICustomQueryExecutionManager} that will execute the query or <code>null</code> 
	 * if no Custom Query Execution Manager is registered for that  query supper classes of implemented 
	 * interfaces
	 */
	private ICustomQueryExecutionManager checkClassIftypeOf(Class clazz){
		ICustomQueryExecutionManager result = null;
		Class superclass = clazz.getSuperclass();
		// Check class super classes
		if (superclass != null)
		{
			result = _availableCustomQueryExecutionManager.get(superclass.getName());
			if (null == result)
				result = checkClassIftypeOf(superclass);
		}
		
		// Check now implemented interfaces if result is still null
		if (result == null)
		{
			Class[] interfaces = clazz.getInterfaces();
			for (Class iInterface : interfaces) 
			{
				result = _availableCustomQueryExecutionManager.get(iInterface.getName());
				if (null == result)
					result = checkClassIftypeOf(iInterface);
				else
					break;
			}
		}
		
		return result;
	}
	
	/**
	 * Initialize the Registry of Custom execution managers
	 */
	private void initRegistry() {
		IConfigurationElement[] configurationElements = 
				getConfigurationElementsFor(ExplorerActivator.PLUGIN_ID, _CUSTOM_QUERY_EXEC_MANAGER__CONF_NAME);
		
		for (IConfigurationElement iConfigurationElement : configurationElements) 
		{
			String queryClassFQN = "";
			ICustomQueryExecutionManager execManager = null;
			queryClassFQN = iConfigurationElement.getAttribute(_QUERY_CLASS__ATTR_NAME);
//			execManager = (ICustomQueryExecutionManager) iConfigurationElement.createExecutableExtension(_QUERY_CUSTOM_EXECUTION_MANAGER_CLASS__ATTR_NAME);
			execManager = createTypedInstance(iConfigurationElement, _QUERY_CUSTOM_EXECUTION_MANAGER_CLASS__ATTR_NAME, ICustomQueryExecutionManager.class);
			_availableCustomQueryExecutionManager.put(queryClassFQN, execManager);
		}
	}
	
	/**
	 * The default Query Execution Manager. It knows how to execute query implementing {@link IQuery} interface.
	 * 
	 * Each query execution is done in an run exclusive mode by using a {@link TransactionalEditingDomain}. This 
	 * will ensure a read lock of model.
	 * 
	 * If there is no Editing domain available for <code>currentElement_p</code>, the query will be executed by 
	 * using its run method.
	 * 
	 * @param runnable_p
	 * @param currentElement_p
	 * @return
	 * @throws InterruptedException 
	 */
	private void defaultQueryExecution(RunnableWithResult runnable_p, Object currentElement_p) throws InterruptedException{
		if (currentElement_p instanceof EObject)
		{
			EObject e_currentElement_p = (EObject) currentElement_p; 
			Resource eResource = e_currentElement_p.eResource();
			if (null == eResource)
				return ;
			
			ResourceSet resourceSet = eResource.getResourceSet();
			if (null == resourceSet)
				return ;
			
			TransactionalEditingDomain editingDomain_p = TransactionalEditingDomain.Factory.INSTANCE.getEditingDomain(resourceSet);
			
			if (editingDomain_p != null)
			{
				if (editingDomain_p != null) 
				{
					editingDomain_p.runExclusive(runnable_p);
				}
			}
			else
			{
				runnable_p.run();
			}
		}
	}
	
}
