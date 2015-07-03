/*******************************************************************************
 * Copyright (c)  2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.internal.preferences;

import org.eclipse.amalgam.explorer.activity.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class ActivityExplorerManagementPreferencePage extends ActivityExplorerPreferencePage {

	private ActivityExplorerSelectionBlock constraintsComposite;

	public ActivityExplorerManagementPreferencePage() {
		setDescription(Messages.ActivityExplorerManagementPreferencePage_0);
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite result = new Composite(parent, SWT.NONE);
		FillLayout layout = new FillLayout();
		result.setLayout(layout);

		constraintsComposite = new ActivityExplorerSelectionBlock();
		constraintsComposite.createWidget(result);

		applyDialogFont(result);

		return result;

	}

	protected void performDefaults() {
		super.performDefaults();
		setDefaultValues();
	}

	private void setDefaultValues() {
		for (IConfigurationElement page : ActivityExplorerExtensionManager.getAllPagesElt()) {
			constraintsComposite.controller.setDefaultValue(page);
		}

	}

}
