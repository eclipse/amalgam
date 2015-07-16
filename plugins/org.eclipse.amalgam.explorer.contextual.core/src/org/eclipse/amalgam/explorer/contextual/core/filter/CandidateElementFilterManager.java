/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.filter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.amalgam.explorer.contextual.core.ExplorerActivator;
import org.eclipse.amalgam.explorer.contextual.core.ext.AbstractExtensionPointManager;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

/**
 *
 */
public final class CandidateElementFilterManager extends AbstractExtensionPointManager{
	
	private static final String FILTER_CONF_ELEMENT_NAME = "candidateElementFilter";
	

	/** Filters Map. This map structured as following <Filter ID, Filter Instance> **/
	private static Map<String, ICandidateElementFilter> _filterRegistry;
	
	/**
	 * Check if a given element has to be displayed in the Contextual Explorer view or not.
	 * @param object the candidate element to evaluation acceptance.
	 * @return True if the element is to accept, false otherwise.
	 */
	public static boolean accept(Object object){
		Map<String, ICandidateElementFilter> filters = getFilters();
		// There no filter in the platform. So accept all elements.
		if (filters.isEmpty())
			return true;
		
		Set<String> filters_ids = filters.keySet();
		for (String filters_id : filters_ids) 
		{
			ICandidateElementFilter iFilter = filters.get(filters_id);
			if (false == iFilter.accept(object))
				return false;
		}
		
		return true;
	}
	
	/**
	 * Get available filters.
	 * @return a {@link Map} of available filters containing data organized as <code> &lt;Filter ID, {@link ICandidateElementFilter}&gt; <code/> 
	 */
	public static Map<String, ICandidateElementFilter> getFilters(){
		if (_filterRegistry == null)
		{
			_filterRegistry = new HashMap<String, ICandidateElementFilter>();
			IConfigurationElement[] configurationElements = getConfigurationElementsFor(ExplorerActivator.PLUGIN_ID, FILTER_CONF_ELEMENT_NAME);
			for (IConfigurationElement iConfigurationElement : configurationElements) 
			{
				String filter_id = iConfigurationElement.getAttribute(DEFAULT_ID_ATTRIBUTE);
				ICandidateElementFilter filter = createTypedInstance(iConfigurationElement, DEFAULT_CLASS_ATTRIBUTE, ICandidateElementFilter.class);
				if (_filterRegistry.get(filter_id) == null)
				{
					_filterRegistry.put(filter_id, filter);
				}
				else
				{
					String filter_class = iConfigurationElement.getAttribute(DEFAULT_CLASS_ATTRIBUTE);
					ExplorerActivator.getDefault().getLog().log(new Status(IStatus.ERROR, ExplorerActivator.PLUGIN_ID, "Filter ID : " + filter_id +" is shared by many filters. Only the folowing filter will be retained : " + filter_class));
				}
			}
		}
		return _filterRegistry;
	}
	
	/**
	 * Return a filter corresponding to the id provided in parameter <code>filterID<code/>
	 * @param filterID the id of the filter
	 * @return Filter 
	 */
	public static ICandidateElementFilter getFilter(String filterID){
		ICandidateElementFilter result = getFilters().get(filterID);
		if (result != null) {
			return result;
		}
		throw new RuntimeException("There is no filter with id = " + filterID);
	}
}
