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
package org.eclipse.amalgam.pak.tests.unit;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Diagnostician;
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
public class EPackageRegistryConsistencyTest {

	private String nsURI;

	private static EPackage.Registry registry = EPackage.Registry.INSTANCE;

	public EPackageRegistryConsistencyTest(String nsURI) {
		this.nsURI = nsURI;
	}

	@Parameters
	public static Collection<Object[]> data() {
		List<Object[]> parameters = new ArrayList<Object[]>();
		for (Object obj : registry.keySet()) {
			parameters.add(new Object[] { obj });

		}

		return parameters;
	}

	@Test
	public void isResolvable() {
		EPackage pak = registry.getEPackage(nsURI);
		assertNotNull("The registry could not find the package with the nsURI:"
				+ nsURI, pak);
	}

	@Test
	public void isValid() {
		EPackage pak = registry.getEPackage(nsURI);
		/*
		 * UML Can't be valid. The metamodel is using very specific conventions
		 * (and its own set of code generators) which are just not valid in a
		 * "pure Ecore" context.
		 */
		if (pak != null && !"uml".equals(pak.getName())) {
			Diagnostic result = Diagnostician.INSTANCE.validate(pak);
			if (result.getSeverity() != Diagnostic.OK) {
				fail("EPackage with uri " + nsURI + " is not valid ("
						+ severityLabel(result.getSeverity()) + ") "
						+ prettyMessage(result));
			}
		}
	}

	private String prettyMessage(Diagnostic diag) {
		String result = "";
		for (Diagnostic child : diag.getChildren()) {
			result += "\n" + severityLabel(child.getSeverity()) + " : "
					+ child.getMessage();
			result += prettyMessage(child);
		}
		return result;
	}

	private String severityLabel(int severity) {
		switch (severity) {
		case Diagnostic.ERROR:
			return "ERROR";
		case Diagnostic.CANCEL:
			return "CANCEL";
		case Diagnostic.INFO:
			return "INFO";
		case Diagnostic.WARNING:
			return "WARNING";
		case Diagnostic.OK:
			return "OK";

		}
		return "UNKNOWN";
	}
}
