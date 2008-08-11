/*******************************************************************************
 * Copyright (c) 2008 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.common.ui.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

import org.eclipse.amalgam.common.ui.Activator;
import org.eclipse.amalgam.common.ui.Messages;
import org.eclipse.amalgam.common.ui.wizards.SampleWizard;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.intro.IIntroSite;
import org.eclipse.ui.intro.config.IIntroAction;
import org.eclipse.ui.intro.config.IIntroURL;
import org.eclipse.ui.intro.config.IntroURLFactory;
import org.eclipse.update.configurator.ConfiguratorUtils;
import org.eclipse.update.configurator.IPlatformConfiguration;
import org.eclipse.update.standalone.InstallCommand;
import org.osgi.framework.Version;

public class ShowSampleAction extends Action implements IIntroAction {
	private static final String UPDATE_SITE = "http://dev.eclipse.org/viewcvs/index.cgi/org.eclipse.amalgam/examples/?root=Modeling_Project"; //$NON-NLS-1$
	private String sampleId;
	private String featureId;
	private String version;

	public ShowSampleAction() {
	}

	public void run(IIntroSite site, Properties params) {
		sampleId = params.getProperty("id"); //$NON-NLS-1$
		if (sampleId == null) {
			return;
		}
		featureId = params.getProperty("feature");
		if (featureId == null) {
			return;
		}
		version = params.getProperty("version");
		if (version == null) {
			return;
		}

		Runnable r = new Runnable() {
			public void run() {
				if (!ensureSampleFeaturePresent())
					return;

				SampleWizard wizard = new SampleWizard();
				try {
					wizard.setInitializationData(null, "class", sampleId); //$NON-NLS-1$
					wizard.setSampleEditorNeeded(false);
					wizard.setSwitchPerspective(false);
					wizard.setSelectRevealEnabled(false);
					wizard.setActivitiesEnabled(false);
					WizardDialog dialog = new WizardDialog(Activator.getActiveWorkbenchShell(), wizard);
					dialog.create();
					if (dialog.open() == Window.OK) {
						switchToSampleStandby(wizard);
					}
				} catch (CoreException e) {
					Activator.log(e);
				}
			}
		};

		Shell currentShell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		currentShell.getDisplay().asyncExec(r);
	}

	private void switchToSampleStandby(SampleWizard wizard) {
		StringBuffer url = new StringBuffer();
		url.append("http://org.eclipse.ui.intro/showStandby?"); //$NON-NLS-1$
		url.append("pluginId=org.eclipse.pde.ui"); //$NON-NLS-1$
		url.append("&"); //$NON-NLS-1$
		url.append("partId=org.eclipse.pde.ui.sampleStandbyPart"); //$NON-NLS-1$
		url.append("&"); //$NON-NLS-1$
		url.append("input="); //$NON-NLS-1$
		url.append(sampleId);
		IIntroURL introURL = IntroURLFactory.createIntroURL(url.toString());
		if (introURL != null) {
			introURL.execute();
			ensureProperContext(wizard);
		}
	}

	private void ensureProperContext(SampleWizard wizard) {
		IConfigurationElement sample = wizard.getSelection();
		String perspId = sample.getAttribute("perspectiveId"); //$NON-NLS-1$
		if (perspId != null) {
			try {
				wizard.enableActivities();
				PlatformUI.getWorkbench().showPerspective(perspId, Activator.getActiveWorkbenchWindow());
				wizard.selectReveal(Activator.getActiveWorkbenchShell());
			} catch (WorkbenchException e) {
				Activator.log(e);
			}
		}
		enableActivities(sample);
	}

	private void enableActivities(IConfigurationElement sample) {
	}

	private boolean ensureSampleFeaturePresent() {
		if (checkFeature())
			return true;
		// the feature is not present - ask to download
		if (MessageDialog.openQuestion(Activator.getActiveWorkbenchShell(), Messages.ShowSampleAction_msgTitle, Messages.ShowSampleAction_msgDesc)) {
			return downloadFeature();
		}
		return false;
	}

	private boolean checkFeature() {
		IPlatformConfiguration config = ConfiguratorUtils.getCurrentPlatformConfiguration();
		IPlatformConfiguration.IFeatureEntry[] features = config.getConfiguredFeatureEntries();
		Version sampleVersion = new Version(version);
		for (int i = 0; i < features.length; i++) {
			String id = features[i].getFeatureIdentifier();
			if (featureId.equals(id)) {
				String version = features[i].getFeatureVersion();
				Version fversion = Version.parseVersion(version);
				if (isCompatibleWith(fversion, sampleVersion))
					return true;
			}
		}
		return false;
	}

	private boolean downloadFeature() {
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					InstallCommand command = new InstallCommand(featureId, version, UPDATE_SITE, null, "false"); //$NON-NLS-1$
					command.run(monitor);
					command.applyChangesNow();
				} catch (Exception e) {
					throw new InvocationTargetException(e);
				}
			}
		};
		try {
			PlatformUI.getWorkbench().getProgressService().busyCursorWhile(op);
		} catch (InvocationTargetException e) {
			Activator.log(e);
			return false;
		} catch (InterruptedException e) {
			Activator.log(e);
		}
		return true;
	}

	public static boolean isCompatibleWith(Version v1, Version v2) {
		if (v1.getMajor() != v2.getMajor())
			return false;
		if (v1.getMinor() > v2.getMinor())
			return true;
		if (v1.getMinor() < v2.getMinor())
			return false;
		if (v1.getMicro() > v2.getMicro())
			return true;
		if (v1.getMicro() < v2.getMicro())
			return false;
		return v1.getQualifier().compareTo(v2.getQualifier()) >= 0;
	}
}
