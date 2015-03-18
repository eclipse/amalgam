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
package org.eclipse.amalgam.discovery.core;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

public class CancellableXMIResourceImpl extends XMIResourceImpl {

	private IProgressMonitor monitor;

	private URIConverter uriConverter;

	public CancellableXMIResourceImpl(URI catalogURI, IProgressMonitor monitor) {
		super(catalogURI);
		this.monitor = monitor;
	}

	@Override
	protected URIConverter getURIConverter() {
		if (uriConverter == null) {
			uriConverter = new ExtensibleURIConverterImpl();
			uriConverter.getURIHandlers().clear();
			uriConverter.getURIHandlers().add(new CancellableURIHandler(monitor));
		}
		return uriConverter;
	}

}
