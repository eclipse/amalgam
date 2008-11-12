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
package org.eclipse.amalgam.internal.dsltk.wizards;

import java.io.PrintStream;
import java.util.Collections;

import org.eclipse.amalgam.internal.dsltk.ui.Activator;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.provider.GenModelEditPlugin;
import org.eclipse.emf.codegen.ecore.ui.EmptyProjectWizard;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.m2m.internal.qvt.oml.builder.QvtBuilderConfig;
import org.eclipse.m2m.internal.qvt.oml.common.nature.TransformationNature;
import org.eclipse.m2m.internal.qvt.oml.common.project.NatureUtils;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.undo.CreateFolderOperation;
import org.eclipse.ui.part.ISetSelectionTarget;
//import org.eclipse.xtend.shared.ui.core.builder.XtendXpandNature;

/**
 * A project wizard that adds the appropriate natures for DSL development. At
 * the moment, this means Java/Plugin, QVT and Xpand/Xtend. In the future, it will
 * be configurable.
 */
public class DSLProjectWizard extends EmptyProjectWizard {

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		setWindowTitle(Messages.DSLProjectWizard_title);
		setDefaultPageImageDescriptor(Activator.getImageDescriptor(Activator.IMG_OBJ_DSL_PROJECT));
	}

	@Override
	public void addPages() {
		WizardNewProjectCreationPage newProjectCreationPage = new DSLProjectWizardCreationPage("DSLProjectCreationWizard") {
			@Override
			protected boolean validatePage() {
				if (super.validatePage()) {
					IPath locationPath = getLocationPath();
					genModelProjectLocation = Platform.getLocation().equals(locationPath) ? null : locationPath;
					IPath projectPath = getProjectHandle().getFullPath();
					genModelContainerPath = projectPath.append("model");
					return true;
				} else {
					return false;
				}
			}
		};

		newProjectCreationPage.setInitialProjectName(initialProjectName);
		newProjectCreationPage.setTitle(Messages.DSLProjectWizard_title);
		newProjectCreationPage.setDescription(Messages.DSLProjectWizard_description);
		addPage(newProjectCreationPage);
	}

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor progressMonitor) {
				try {
					project = Generator.createEMFProject(new Path(genModelContainerPath.toString()), genModelProjectLocation, Collections.<IProject> emptyList(), progressMonitor,
							Generator.EMF_MODEL_PROJECT_STYLE | Generator.EMF_PLUGIN_PROJECT_STYLE);
					
					createFolder("templates", progressMonitor);
					createFolder("workflows", progressMonitor);
					IJavaProject javaProject = JavaCore.create(project);
					IClasspathEntry[] entries = javaProject.getRawClasspath();
					IClasspathEntry[] newEntries = new IClasspathEntry[entries.length+2];
					System.arraycopy(entries, 0, newEntries, 0, entries.length);
					newEntries[newEntries.length-2] = JavaCore.newSourceEntry(javaProject.getPath().append("templates"));
					newEntries[newEntries.length-1] = JavaCore.newSourceEntry(javaProject.getPath().append("workflows"));
					javaProject.setRawClasspath(newEntries, progressMonitor);
					
					PrintStream manifest = new PrintStream(URIConverter.INSTANCE.createOutputStream(URI.createPlatformResourceURI("/" + genModelContainerPath.segment(0) + "/META-INF/MANIFEST.MF",
							true), null));
					manifest.println("Manifest-Version: 1.0");
					manifest.println("Bundle-ManifestVersion: 2");
					manifest.print("Bundle-Name: ");
					manifest.print(genModelContainerPath.segment(0));
					manifest.println(" Plug-in");
					manifest.print("Bundle-SymbolicName: ");
					manifest.println(genModelContainerPath.segment(0));
					manifest.println("Bundle-Version: 1.0.0.qualifier");
					manifest.println("Require-Bundle: org.eclipse.emf.ecore,");
					manifest.println(" org.eclipse.xpand,");
					manifest.println(" org.eclipse.xtend,");
					manifest.println(" org.eclipse.xtend.typesystem.emf,");
					manifest.println(" org.eclipse.emf.mwe.core,");
					manifest.println(" org.eclipse.emf.mwe.utils,");
					manifest.println(" org.eclipse.emf.ecore.xmi,");
					manifest.println(" org.apache.commons.logging,");
					manifest.println(" org.antlr.runtime");
					manifest.close();

					// configure additional options/natures
					createFolder("diagrams", progressMonitor);
					configureQVTOptions(progressMonitor);
//					configureXpandOptions(progressMonitor);
				} catch (Exception exception) {
					GenModelEditPlugin.INSTANCE.log(exception);
				} finally {
					progressMonitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);
		} catch (Exception exception) {
			GenModelEditPlugin.INSTANCE.log(exception);
			return false;
		}

		if (project != null) {
			IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(project);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart).selectReveal(targetSelection);
					}
				});
			}
		}

		return true;
	}

	private void configureQVTOptions(IProgressMonitor monitor) throws CoreException {
		QvtBuilderConfig.getConfig(project).setSourceContainer(createFolder("transformations", monitor));
		NatureUtils.addNature(project, TransformationNature.ID);
	}

//	private void configureXpandOptions(IProgressMonitor monitor) throws CoreException {
//		NatureUtils.addNature(project, XtendXpandNature.NATURE_ID);
//	}

	private IContainer createFolder(String name, IProgressMonitor monitor) {
		IProgressMonitor safeMonitor = monitor != null ? monitor : new NullProgressMonitor();
		IContainer srcContainer = project.getFolder(name);
		try {
			CreateFolderOperation operation = new CreateFolderOperation((IFolder) srcContainer, null, "Creating folder " + name);
			operation.execute(safeMonitor, null);
		} catch (ExecutionException e) {
			GenModelEditPlugin.INSTANCE.log(e);
		}
		return srcContainer;
	}

}
