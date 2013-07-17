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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl;

/**
 * An URIHandler which creates cancellable input streams.
 * 
 * @author Cedric Brun <cedric.brun@obeo.fr>
 * 
 */
public class CancellableURIHandler extends URIHandlerImpl {

	private IProgressMonitor monitor;

	public CancellableURIHandler(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	public InputStream createInputStream(URI uri, Map<?, ?> options)
			throws IOException {
		InputStream original = super.createInputStream(uri, options);
		return new CancellableInputStream(original, monitor);
	}

	public boolean canHandle(URI uri) {
		return super.canHandle(uri);
	}

	public OutputStream createOutputStream(URI uri, Map<?, ?> options)
			throws IOException {
		return super.createOutputStream(uri, options);
	}

	public void delete(URI uri, Map<?, ?> options) throws IOException {
		super.delete(uri, options);

	}

	public Map<String, ?> contentDescription(URI uri, Map<?, ?> options)
			throws IOException {
		return super.contentDescription(uri, options);

	}

	public boolean exists(URI uri, Map<?, ?> options) {
		return super.exists(uri, options);

	}

	public Map<String, ?> getAttributes(URI uri, Map<?, ?> options) {
		return super.getAttributes(uri, options);
	}

	public void setAttributes(URI uri, Map<String, ?> attributes,
			Map<?, ?> options) throws IOException {
		super.setAttributes(uri, attributes, options);
	}

}
