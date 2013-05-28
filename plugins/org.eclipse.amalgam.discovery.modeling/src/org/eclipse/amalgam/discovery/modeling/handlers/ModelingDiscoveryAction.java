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
package org.eclipse.amalgam.discovery.modeling.handlers;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.amalgam.discovery.DiscoveryDefinition;
import org.eclipse.amalgam.discovery.modeling.Activator;
import org.eclipse.amalgam.discovery.ui.viewer.DiscoveryContentProvider;
import org.eclipse.amalgam.discovery.ui.wizards.DiscoveryWizard;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * 
 * @author Cedric Brun <cedric.brun@obeo.fr>
 * 
 */
public class ModelingDiscoveryAction extends Action {
	
	private static final String CATALOG_URI = "http://www.eclipse.org/modeling/amalgam/downloads/discovery/kepler/modeling.xmi";

	/**
	 * The constructor.
	 */
	public ModelingDiscoveryAction() {
	}

	@Override
	public void run() {

		final IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();

		DiscoveryContentProvider provider = new DiscoveryContentProvider() {

			@Override
			protected DiscoveryDefinition load() {
				URI catalogURI = URI.createURI(CATALOG_URI);
				Activator.getDefault().prepareProxySettings(CATALOG_URI);
				Resource res = new XMIResourceImpl(catalogURI);
				try {
					res.load(Collections.EMPTY_MAP);
				} catch (IOException e) {
					errorDialog(window, e);
				}
				return (DiscoveryDefinition) res.getContents().get(0);
			}

			private void errorDialog(final IWorkbenchWindow window, Exception e) {
				String message = "We can't connect to the discovery source: \n"+  CATALOG_URI +"\n Make sure you're connected to internet and try again.";
				MessageDialog.openError(window.getShell(),
						"Can't connect to discovery source",
						message);
				throw new RuntimeException(e);
			}

			@Override
			public String getDescription() {
				return "Pick a modeling component to install it.";
			}

			@Override
			public String getTitle() {
				return "Eclipse Modeling Components Discovery";
			}

		};
		DiscoveryWizard wizard = new DiscoveryWizard(provider);

		WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
		dialog.open();

	}
}
