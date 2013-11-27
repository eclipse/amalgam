/*******************************************************************************
 * Copyright (c)  2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.discovery.modeling.handlers;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.amalgam.discovery.DiscoveryDefinition;
import org.eclipse.amalgam.discovery.InstallableComponent;
import org.eclipse.amalgam.discovery.core.AvailabilityUpdater;
import org.eclipse.amalgam.discovery.core.DiscoveryDefinitionBrowser;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * 
 * @author cedric.brun@obeo.fr
 * 
 */
@RunWith(value = Parameterized.class)
public class InstallableComponentsTest {

	private static InstallableComponent component;

	public InstallableComponentsTest(InstallableComponent component) {
		this.component = component;
	}

	@Parameters
	public static Collection<Object[]> data() throws InterruptedException {
		List<Object[]> parameters = new ArrayList<Object[]>();
		ModelingPackageDiscovery discovery = new ModelingPackageDiscovery();
		discovery.load(new NullProgressMonitor());
		DiscoveryDefinition catalog = discovery.getDiscovery();
		for (InstallableComponent next : new DiscoveryDefinitionBrowser(catalog).getAllInstallableComponents()) {
			next.setAvailable(false);
			/*
			 *This block is here to test the test. By changing the repository URLS we are making sure it is not available.
			List<String> newURLS = new ArrayList<String>();
			for (String url : next.getSitesURLS()) {
				newURLS.add(url + "shouldfail");
			}
			next.getSitesURLS().clear();
			next.getSitesURLS().addAll(newURLS);
			*/
			parameters.add(new Object[] { next });
		}
		new AvailabilityUpdater(catalog).update(new NullProgressMonitor());
		return parameters;
	}

	@Test
	public void isAvailable() {
		assertTrue(
				"Component " + component.getName()
						+ " is not available on the update sites : "
						+ component.getSitesURLS(), component.isAvailable());
	}

}
