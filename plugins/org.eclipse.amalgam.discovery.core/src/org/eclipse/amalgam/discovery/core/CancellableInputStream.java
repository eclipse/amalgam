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

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;

/**
 * 
 * An {@link InputStream} which will throw {@link OperationCanceledException} on
 * any read operation if the end user cancelled the operation through the
 * progress monitor.
 * 
 * @author Cedric Brun <cedric.brun@obeo.fr>
 * 
 */
public class CancellableInputStream extends FilterInputStream {

	private IProgressMonitor monitor;

	protected CancellableInputStream(InputStream in, IProgressMonitor monitor) {
		super(in);
		this.monitor = monitor;
	}

	@Override
	public int read() throws IOException {
		exceptionIfCancelled();
		return super.read();
	}

	private void exceptionIfCancelled() {
		if (monitor.isCanceled())
			throw new OperationCanceledException();
	}

	@Override
	public int read(byte[] b) throws IOException {
		exceptionIfCancelled();
		return super.read(b);
	}

	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		exceptionIfCancelled();
		return super.read(b, off, len);
	}

}
