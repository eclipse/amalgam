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
package org.eclipse.amalgam.common.ui.wizards;

import java.util.HashSet;

import org.eclipse.amalgam.common.ui.Activator;
import org.eclipse.amalgam.common.ui.Messages;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;

/**
 *
 */
public class ProjectNamesPage extends WizardPage {
	private SampleWizard wizard;
	private Composite container;

	/**
	 * @param pageName
	 */
	public ProjectNamesPage(SampleWizard wizard) {
		super("projects"); //$NON-NLS-1$
		this.wizard = wizard;
		setTitle(Messages.ProjectNamesPage_title);
		setDescription(Messages.ProjectNamesPage_desc);
	}

	@Override
	public void setVisible(boolean visible) {
		setPageComplete(wizard.getSelection() != null);
		if (container != null)
			updateEntries();
		super.setVisible(visible);
	}

	private void updateEntries() {
		IConfigurationElement selection = wizard.getSelection();
		if (selection != null) {
			setMessage(null);
			IConfigurationElement[] projects = selection.getChildren("project"); //$NON-NLS-1$
			Control[] children = container.getChildren();
			if (projects.length == 1 && children.length == 2) {
				Text text = (Text) children[1];
				text.setText(projects[0].getAttribute("name")); //$NON-NLS-1$
				validateEntries();
				return;
			}
			// dispose all
			for (int i = 0; i < children.length; i++) {
				children[i].dispose();
			}
			// create entries
			if (projects.length == 1) {
				createEntry(Messages.ProjectNamesPage_projectName, projects[0].getAttribute("name")); //$NON-NLS-1$ 
			} else {
				for (int i = 0; i < projects.length; i++) {
					String label = NLS.bind(Messages.ProjectNamesPage_multiProjectName, "" + (i + 1)); //$NON-NLS-1$ 
					createEntry(label, projects[i].getAttribute("name")); //$NON-NLS-1$
				}
			}
			container.layout();
			validateEntries();
		} else {
			setMessage(Messages.ProjectNamesPage_noSampleFound, IMessageProvider.WARNING);
		}
	}

	public String[] getProjectNames() {
		Control[] children = container.getChildren();
		String[] names = new String[children.length / 2];

		int index = 0;
		for (int i = 0; i < children.length; i++) {
			if (children[i] instanceof Text) {
				String name = ((Text) children[i]).getText();
				names[index++] = name;
			}
		}
		return names;
	}

	private void createEntry(String labelName, String projectName) {
		Label label = new Label(container, SWT.NULL);
		label.setText(labelName);
		label.setLayoutData(new GridData(GridData.VERTICAL_ALIGN_CENTER));
		final Text text = new Text(container, SWT.SINGLE | SWT.BORDER);
		text.setText(projectName);
		text.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validateEntries();
			}
		});
		text.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	private void validateEntries() {
		Control[] children = container.getChildren();
		boolean empty = false;

		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < children.length; i++) {
			if (children[i] instanceof Text) {
				String name = ((Text) children[i]).getText();
				if (name.length() == 0) {
					empty = true;
					break;
				}
				IStatus nameStatus = Activator.getWorkspace().validateName(name, IResource.PROJECT);
				if (!nameStatus.isOK()) {
					setErrorMessage(nameStatus.getMessage());
					setPageComplete(false);
					return;
				}
				set.add(name);
			}
		}
		if (empty) {
			setErrorMessage(Messages.ProjectNamesPage_emptyName);
			setPageComplete(false);
		} else {
			int nnames = set.size();
			int nfields = children.length / 2;
			if (nfields > nnames) {
				setErrorMessage(Messages.ProjectNamesPage_duplicateNames);
				setPageComplete(false);
			} else {
				setPageComplete(true);
				setErrorMessage(null);
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets
	 * .Composite)
	 */
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		container.setLayout(layout);
		setControl(container);
		updateEntries();

		PlatformUI.getWorkbench().getHelpSystem().setHelp(container, "org.eclipse.pde.doc.user.project_names_page");
	}
}
