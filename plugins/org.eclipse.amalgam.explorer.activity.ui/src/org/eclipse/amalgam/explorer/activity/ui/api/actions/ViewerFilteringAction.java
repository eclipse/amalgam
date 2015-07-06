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
package org.eclipse.amalgam.explorer.activity.ui.api.actions;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.BasicSessionActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.sections.ActivityExplorerSection;
import org.eclipse.jface.action.Action;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 */
public class ViewerFilteringAction extends Action {
	private BasicSessionActivityExplorerPage _architecturePage;
	private ActivityExplorerSection section;

	/**
	 * Constructor.
	 */
	public ViewerFilteringAction(BasicSessionActivityExplorerPage architecturePage, ActivityExplorerSection section) {
		super(null, AS_CHECK_BOX);
		// set Image descriptor for enable state
		setImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_ELCL_SYNCED));
		// set ImageDescriptor for disable state
		setDisabledImageDescriptor(PlatformUI.getWorkbench().getSharedImages()
				.getImageDescriptor(ISharedImages.IMG_ELCL_SYNCED_DISABLED));

		this._architecturePage = architecturePage;
		this.section = section;
	}

	/**
	 * Get diagram viewer filter based on {@link #getFilteredViewpoint()} and
	 * {@link #getRetainedRepresentationDescriptions()}.
	 * 
	 * @return
	 */

	/**
	 * Get the architecture page this action is working on.
	 * 
	 * @return the architecturePage
	 */
	protected BasicSessionActivityExplorerPage getArchitecturePage() {
		return _architecturePage;
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		if (isChecked()) {
			// End-user has just clicked the action to enable filter.
			_architecturePage.callViewersFilter(this);
		} else {
			// End-user has just clicked the action to disable filter.
			// Don't provide this current action because we are deactivating the
			// same filter.
			// The page already handles to uncheck this action.
			_architecturePage.callViewersFilter(null);
		}

	}

	public ActivityExplorerSection getSection() {
		return section;
	}
}
