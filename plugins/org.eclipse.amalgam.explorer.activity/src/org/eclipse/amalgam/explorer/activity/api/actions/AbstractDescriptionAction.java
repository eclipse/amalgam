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
package org.eclipse.amalgam.explorer.activity.api.actions;

import org.eclipse.amalgam.explorer.activity.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.IImageKeys;
import org.eclipse.amalgam.explorer.activity.api.dialog.DescriptionDialog;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormText;

/**
 * Action that displays a description in a popup dialog.
 * 
 */
public abstract class AbstractDescriptionAction extends Action {

	/**
	 * Shell used as parent of the popup dialog.
	 */
	private Shell _shell;

	/**
	 * Constructor.
	 */
	public AbstractDescriptionAction(Shell shell_p) {
		setText(Messages.AbstractDescriptionAction_0);
		ImageDescriptor descriptor = ActivityExplorerActivator.imageDescriptorFromPlugin(ActivityExplorerActivator.ID,
				IImageKeys.IMAGE_DESCRIPTOR_DESCRIPTION);
		setImageDescriptor(descriptor);
		_shell = shell_p;
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		String descriptionContent = getDescriptionContent();
		new DescriptionDialog(_shell, descriptionContent).open();
	}

	/**
	 * Get the description file as a string relative path.<br>
	 * Returned path must be relative to {@link #getDescriptionFolder()} result.<br>
	 * The XML content of returned file must be compliant with {@link FormText}
	 * widget.
	 * 
	 * @return
	 */
	protected abstract String getDescriptionContent();

}
