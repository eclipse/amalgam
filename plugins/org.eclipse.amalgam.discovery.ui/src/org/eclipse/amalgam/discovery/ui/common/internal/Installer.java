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
package org.eclipse.amalgam.discovery.ui.common.internal;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.amalgam.discovery.DiscoveryUIPlugin;
import org.eclipse.amalgam.discovery.InstallableComponent;
import org.eclipse.amalgam.discovery.ui.wizards.internal.Messages;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.equinox.internal.provisional.p2.ui.IProvHelpContextIds;
import org.eclipse.equinox.internal.provisional.p2.ui.QueryableMetadataRepositoryManager;
import org.eclipse.equinox.internal.provisional.p2.ui.dialogs.PreselectedIUInstallWizard;
import org.eclipse.equinox.internal.provisional.p2.ui.dialogs.ProvisioningWizardDialog;
import org.eclipse.equinox.internal.provisional.p2.ui.policy.Policy;
import org.eclipse.jface.operation.IRunnableContext;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class Installer {
    public static boolean install(Collection<InstallableComponent> descriptors, IRunnableContext context) {
        try {
            final PrepareInstallProfileJob job = new PrepareInstallProfileJob(descriptors);
            context.run(true, true, job);

            if (job.getPlannerResolutionOperation() != null && job.getPlannerResolutionOperation().getProvisioningPlan() != null) {
                Display.getCurrent().asyncExec(new Runnable() {
                    public void run() {
                        PreselectedIUInstallWizard wizard = new PreselectedIUInstallWizard(Policy.getDefault(), job.getProfileId(), job.getIUs(), job.getPlannerResolutionOperation(),
                                new QueryableMetadataRepositoryManager(Policy.getDefault().getQueryContext(), false));
                        WizardDialog dialog = new ProvisioningWizardDialog(DiscoveryUiUtil.getShell(), wizard);
                        dialog.create();
                        PlatformUI.getWorkbench().getHelpSystem().setHelp(dialog.getShell(), IProvHelpContextIds.INSTALL_WIZARD);

                        dialog.open();
                    }
                });
            }
        } catch (InvocationTargetException e) {
            IStatus status = new Status(IStatus.ERROR, DiscoveryUIPlugin.PLUGIN_ID, NLS.bind(Messages.ConnectorDiscoveryWizard_installProblems, new Object[] { e.getCause().getMessage() }), e.getCause());
            DiscoveryUiUtil.displayStatus(DiscoveryUiUtil.getShell(), Messages.ConnectorDiscoveryWizard_cannotInstall, status, false);
            return false;
        } catch (InterruptedException e) {
            // canceled
            return false;
        }
        return true;
    }
}
