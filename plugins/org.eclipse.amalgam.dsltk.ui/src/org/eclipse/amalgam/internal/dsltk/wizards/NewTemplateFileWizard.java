/*
 * Copyright (c) 2005, 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     committers of openArchitectureWare - initial API and implementation
 *     Artem Tikhomirov (Borland) - refactored. Add builder on project with new templates.
 */
package org.eclipse.amalgam.internal.dsltk.wizards;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.amalgam.internal.dsltk.ui.Activator;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.gmf.internal.xpand.build.XpandBuilder;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.wizards.newresource.BasicNewFileResourceWizard;

public class NewTemplateFileWizard extends BasicNewFileResourceWizard {

	public NewTemplateFileWizard() {
	}

	@Override
	public void addPages() {
		super.addPages();
		WizardNewFileCreationPage page = (WizardNewFileCreationPage) getPage("newFilePage1"); //$NON-NLS-1$
		page.setTitle(Messages.XpandWizard_title); //$NON-NLS-1$
		page.setDescription(Messages.XpandWizard_description); //$NON-NLS-1$
		page.setFileName("NewTemplateFile.xpt");
	}

	@Override
	public boolean performFinish() {
		WizardNewFileCreationPage page = (WizardNewFileCreationPage) getPage("newFilePage1"); //$NON-NLS-1$
		final IFile file = page.createNewFile();
		if (file == null) {
			return false;
		}

		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor) {
				try {
					// start task
					monitor.beginTask(Messages.NewProjectCreationOperation_creating, 1);

					PrintStream content;
					try {
						content = new PrintStream(URIConverter.INSTANCE.createOutputStream(URI.createPlatformResourceURI(file.getFullPath().toOSString(), true), null), false, "ISO-8859-1");
					} catch (IOException e) {
						Activator.log(e);
						return;
					}
					content.println("«IMPORT 'http://www.eclipse.org/emf/2002/Ecore'»");
					content.println("");
					content.println("«DEFINE Main FOR ecore::EPackage»");
					content.println("«ENDDEFINE»");
					content.close();
					configureBuilder(file.getProject());
				} catch (Exception exception) {
					Activator.log(exception);
				} finally {
					monitor.done();
				}
			};
		};

		try {
			getContainer().run(false, false, operation);
		} catch (Exception exception) {
			Activator.log(exception);
			return false;
		}

		selectAndReveal(file);

		// Open editor on new file.
		IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
		try {
			if (dw != null) {
				IWorkbenchPage activePage = dw.getActivePage();
				if (activePage != null) {
					IDE.openEditor(activePage, file, true);
				}
			}
		} catch (PartInitException e) {
			Activator.log(e);
			return false;
		}
		return true;
	}

	private void configureBuilder(final IProject project) {
		try {
			final IProjectDescription desc = project.getDescription();
			final ICommand[] commands = desc.getBuildSpec();

			for (ICommand element : commands) {
				if (element.getBuilderName().equals(XpandBuilder.getBUILDER_ID())) {
					return;
				}
			}

			project.getWorkspace().run(new IWorkspaceRunnable() {

				public void run(IProgressMonitor monitor) throws CoreException {
					final ICommand[] newCommands = new ICommand[commands.length + 1];
					System.arraycopy(commands, 0, newCommands, 0, commands.length);
					final ICommand command = desc.newCommand();
					command.setBuilderName(XpandBuilder.getBUILDER_ID());
					newCommands[commands.length] = command;
					desc.setBuildSpec(newCommands);
					project.setDescription(desc, monitor);
				}

			}, project.getWorkspace().getRoot(), 0, null);
		} catch (CoreException ex) {
			Activator.log(ex.getStatus());
		}
	}
}
