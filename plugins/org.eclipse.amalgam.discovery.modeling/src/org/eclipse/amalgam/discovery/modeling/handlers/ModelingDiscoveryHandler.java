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
import org.eclipse.amalgam.discovery.ui.viewer.DiscoveryContentProvider;
import org.eclipse.amalgam.discovery.ui.wizards.DiscoveryWizard;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * 
 * @author Cedric Brun <cedric.brun@obeo.fr>
 * 
 */
public class ModelingDiscoveryHandler extends AbstractHandler {
    /**
     * The constructor.
     */
    public ModelingDiscoveryHandler() {
    }

    /**
     * the command has been executed, so extract extract the needed information
     * from the application context.
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

        DiscoveryContentProvider provider = new DiscoveryContentProvider() {

            @Override
            protected DiscoveryDefinition load() {
                Resource res = new XMIResourceImpl(URI.createURI("platform:/plugin/org.eclipse.amalgam.discovery.modeling/model/modeling.xmi"));
                try {
                    res.load(Collections.EMPTY_MAP);
                } catch (IOException e) {
                }
                return (DiscoveryDefinition) res.getContents().get(0);
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

        return null;
    }
}