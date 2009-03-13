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

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.amalgam.internal.dsltk.ui.Activator;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.gmf.internal.xpand.build.XpandBuilder;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.m2m.internal.qvt.oml.project.QVTOProjectPlugin;
import org.eclipse.m2m.internal.qvt.oml.project.builder.QVTOBuilderConfig;
import org.eclipse.m2m.internal.qvt.oml.project.nature.NatureUtils;
import org.eclipse.pde.core.build.IBuildEntry;
import org.eclipse.pde.internal.core.natures.PDE;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.ide.undo.CreateFolderOperation;
import org.eclipse.ui.part.ISetSelectionTarget;

/**
 * A project wizard that adds the appropriate natures for DSL development. At
 * the moment, this means Plugin, QVT and Xpand builder.
 */
public class DSLProjectWizard extends Wizard implements INewWizard {

	private IWorkbench workbench;
	private IStructuredSelection selection;
	private WizardNewProjectCreationPage newProjectCreationPage;
	protected final static String XPAND_ROOT = ".xpand-root";
	private final static String INITIAL_PROJECT_NAME = "org.eclipse.dsl.project";
	private final static String MODEL_FOLDER = "model"; //$NON-NLS-1$
	private final static String TRANSFORMATIONS_FOLDER = "transformations"; //$NON-NLS-1$
	private final static String DIAGRAMS_FOLDER = "diagrams"; //$NON-NLS-1$
	private final static String WORKFLOW_FOLDER = "workflows"; //$NON-NLS-1$
	private final static String BUILD_FILENAME_DESCRIPTOR = "build.properties"; //$NON-NLS-1$
	private final static String PLUGIN_FILENAME_DESCRIPTOR = "plugin.xml"; //$NON-NLS-1$
	private final static String TEMPLATES_FOLDER = "templates"; //$NON-NLS-1$
	private final static String MANIFEST_FOLDER = "META-INF"; //$NON-NLS-1$

	public DSLProjectWizard() {
		super();
		setWindowTitle(Messages.DSLProjectWizard_title);
		setDefaultPageImageDescriptor(Activator.getImageDescriptor(Activator.IMG_OBJ_DSL_PROJECT));
	}

	public org.eclipse.jface.viewers.IStructuredSelection getSelection() {
		return selection;
	}

	public IWorkbench getWorkbench() {
		return workbench;
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}

	@Override
	public void addPages() {
		newProjectCreationPage = new DSLProjectWizardCreationPage("DSLProjectCreationWizard") { //$NON-NLS-1$
			@Override
			protected boolean validatePage() {
				if (super.validatePage()) {
					return true;
				} else {
					return false;
				}
			}
		};

		newProjectCreationPage.setInitialProjectName(INITIAL_PROJECT_NAME );
		newProjectCreationPage.setTitle(Messages.DSLProjectWizard_title);
		newProjectCreationPage.setDescription(Messages.DSLProjectWizard_description);
		addPage(newProjectCreationPage);
	}

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) {
				try {
					// start task
					monitor.beginTask(Messages.NewProjectCreationOperation_creating, 1);

					// create project
					IProject project = createProject(monitor);

					// generate the manifest file
					createManifest(project);

					// generate the build.properties file
					createBuildPropertiesFile(project);

					// create default folders
					createFolder(MODEL_FOLDER, monitor);
					createFolder(WORKFLOW_FOLDER, monitor);
					createFolder(DIAGRAMS_FOLDER, monitor);

					// configure QVT folder and nature
					QVTOBuilderConfig.getConfig(project).setSourceContainer(createFolder(TRANSFORMATIONS_FOLDER, monitor));
					NatureUtils.addNature(project, QVTOProjectPlugin.NATURE_ID);

					// configure Xpand folder and builder
					createFolder(TEMPLATES_FOLDER, monitor);
					addBuilder(project, XpandBuilder.getBUILDER_ID());
					PrintStream xpandroot = new PrintStream(URIConverter.INSTANCE.createOutputStream(URI.createPlatformResourceURI("/" + project.getName() + "/" + XPAND_ROOT , true), null));
					xpandroot.println(TEMPLATES_FOLDER);
					xpandroot.close();

					IWorkingSet[] workingSets = newProjectCreationPage.getSelectedWorkingSets();
					if (workingSets.length > 0)
						getWorkbench().getWorkingSetManager().addToWorkingSets(project, workingSets);
				} catch (Exception exception) {
					Activator.log(exception);
				} finally {
					monitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);
		} catch (Exception exception) {
			Activator.log(exception);
			return false;
		}

		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		final IWorkbenchPart activePart = page.getActivePart();
		if (activePart instanceof ISetSelectionTarget) {
			final ISelection targetSelection = new StructuredSelection(newProjectCreationPage.getProjectHandle());
			getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					((ISetSelectionTarget) activePart).selectReveal(targetSelection);
				}
			});
		}

		return true;
	}
	
	private void createManifest(IProject project) throws IOException {
		PrintStream manifest = new PrintStream(URIConverter.INSTANCE.createOutputStream(URI.createPlatformResourceURI("/" + project.getName() + "/" + MANIFEST_FOLDER + "/MANIFEST.MF", true),
				null));
		manifest.println("Manifest-Version: 1.0");
		manifest.println("Bundle-ManifestVersion: 2");
		manifest.print("Bundle-Name: ");
		manifest.print(project.getName());
		manifest.println(" Plug-in");
		manifest.print("Bundle-SymbolicName: ");
		manifest.println(project.getName());
		manifest.println("Bundle-Version: 1.0.0.qualifier");
		manifest.println("Bundle-RequiredExecutionEnvironment: J2SE-1.5");
		manifest.close();
	}

	private IContainer createFolder(String name, IProgressMonitor monitor) {
		IProgressMonitor safeMonitor = monitor != null ? monitor : new NullProgressMonitor();
		IContainer srcContainer = newProjectCreationPage.getProjectHandle().getFolder(name);
		try {
			CreateFolderOperation operation = new CreateFolderOperation((IFolder) srcContainer, null, Messages.CreatingFolder + " " + name);
			operation.execute(safeMonitor, null);
		} catch (ExecutionException e) {
			Activator.log(e);
		}
		return srcContainer;
	}

	private IProject createProject(IProgressMonitor monitor) throws CoreException {
		IProject project = newProjectCreationPage.getProjectHandle();
		IPath location = newProjectCreationPage.getLocationPath();
		if (!project.exists()) {
			if (!Platform.getLocation().equals(location)) {
				IProjectDescription desc = project.getWorkspace().newProjectDescription(project.getName());
				desc.setLocation(location);
				project.create(desc, monitor);
			} else {
				project.create(monitor);
			}
			project.open(null);
		}
		addNatureToProject(project, PDE.PLUGIN_NATURE, null);
		return project;
	}

	public static void addNatureToProject(IProject proj, String natureId, IProgressMonitor monitor) throws CoreException {
		IProjectDescription description = proj.getDescription();
		String[] prevNatures = description.getNatureIds();
		String[] newNatures = new String[prevNatures.length + 1];
		System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
		newNatures[prevNatures.length] = natureId;
		description.setNatureIds(newNatures);
		proj.setDescription(description, monitor);
	}

	private void createBuildPropertiesFile(IProject project) throws CoreException {
		PrintStream build;
		try {
			build = new PrintStream(URIConverter.INSTANCE.createOutputStream(URI.createPlatformResourceURI("/" + project.getName() + "/" + BUILD_FILENAME_DESCRIPTOR, true), null));
		} catch (IOException e) {
			Activator.log(e);
			return;
		}
		build.println("bin.includes = " + MANIFEST_FOLDER + "/,\\");
		build.println(" " + MODEL_FOLDER + "/,\\");
		build.println(" " + TEMPLATES_FOLDER + "/,\\");
		build.println(" " + TRANSFORMATIONS_FOLDER + "/,\\");
		build.println(" " + DIAGRAMS_FOLDER + "/,\\");
		build.println(" " + WORKFLOW_FOLDER + "/");
		build.close();
	}

	protected void fillBinIncludes(IProject project, IBuildEntry binEntry) throws CoreException {
		binEntry.addToken(PLUGIN_FILENAME_DESCRIPTOR);
		binEntry.addToken(MANIFEST_FOLDER + "/"); //$NON-NLS-1$
	}

	private void addBuilder(IProject project, String id) {
		IProjectDescription desc;
		try {
			desc = project.getDescription();
		} catch (CoreException e) {
			Activator.log(e);
			return;
		}
		ICommand[] commands = desc.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(id)) {
				return;
			}
		}
		// add builder to project
		ICommand command = desc.newCommand();
		command.setBuilderName(id);
		ICommand[] nc = new ICommand[commands.length + 1];
		// Add it before other builders.
		System.arraycopy(commands, 0, nc, 1, commands.length);
		nc[0] = command;
		desc.setBuildSpec(nc);
		try {
			project.setDescription(desc, null);
		} catch (CoreException e) {
			Activator.log(e);
		}
	}

}
