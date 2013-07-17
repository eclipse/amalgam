/*******************************************************************************
 * Copyright (c)  2009 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.discovery.ui.viewer;

import org.eclipse.amalgam.discovery.DiscoveryDefinition;
import org.eclipse.amalgam.discovery.core.InstallationStatusUpdater;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * 
 * @author Cedric Brun <cedric.brun@obeo.fr>
 * 
 */
public abstract class DiscoveryContentProvider {

	protected DiscoveryDefinition disco;

	public void update(IProgressMonitor monitor) throws InterruptedException {
		disco = getDiscovery();
		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}
		InstallationStatusUpdater installedUpdater = new InstallationStatusUpdater(
				disco);
		installedUpdater.update(monitor);
	}

	public DiscoveryDefinition getDiscovery() {
		return disco;
	}

	public abstract DiscoveryDefinition load(IProgressMonitor monitor) throws InterruptedException ;

	public abstract String getTitle();

	public abstract String getDescription();

}
