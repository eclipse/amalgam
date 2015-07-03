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
package org.eclipse.amalgam.explorer.activity.internal.preferences;

import org.eclipse.amalgam.explorer.activity.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.api.preferences.PreferenceConstants;
import org.eclipse.amalgam.explorer.activity.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Default preference values initialization.
 *
 */
public class DefaultPreferenceInitializer extends AbstractPreferenceInitializer {

	private static final boolean DEFAULT_VALUE = true;

	public DefaultPreferenceInitializer() {
		super();
	}

	/**
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {

		IPreferenceStore store = ActivityExplorerActivator.getDefault().getPreferenceStore();

		store.setDefault(PreferenceConstants.P_OPEN_ACTIVITY_EXPLORER, DEFAULT_VALUE);

		for (IConfigurationElement page : ActivityExplorerExtensionManager.getAllPagesElt()) {
			store.setDefault(ActivityExplorerExtensionManager.getId(page), DEFAULT_VALUE);
			for (IConfigurationElement section : ActivityExplorerExtensionManager.getSections(page)) {
				store.setDefault(ActivityExplorerExtensionManager.getId(section), DEFAULT_VALUE);
				for (IConfigurationElement activity : ActivityExplorerExtensionManager.getActivities(section)) {
					store.setDefault(ActivityExplorerExtensionManager.getId(activity), DEFAULT_VALUE);
				}
			}

		}

	}

}
