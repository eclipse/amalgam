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
package org.eclipse.amalgam.explorer.activity.api.editor.pages;

import org.eclipse.amalgam.explorer.activity.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.IImageKeys;
import org.eclipse.amalgam.explorer.activity.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.internal.intf.IOrdered;
import org.eclipse.amalgam.explorer.activity.internal.intf.IVisibility;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.editor.SharedHeaderFormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * Base class to implement ActivityExplorer pages in an {@link ActivityExplorerEditor}.
 * 
 */
public abstract class AbstractActivityExplorerPage extends FormPage implements IExecutableExtension, IOrdered, IVisibility {

	private boolean overview;
	private Image overviewImageOff;
	private String overviewText;
	private Image overviewImageOn;
	private String overviewImageOnPath;
	private String overviewImageOffPath;
	protected IPredicate predicate;

	private int index;

	private static String ids;

	/**
	 * Constructor.
	 * 
	 * @param editor_p
	 * @param id_p
	 * @param title_p
	 */

	public static void setID(String id) {
		ids = id;
	}

	public AbstractActivityExplorerPage() {
		this(null, ids, ""); //$NON-NLS-1$
	}

	public AbstractActivityExplorerPage(FormEditor editor_p, String id_p, String title_p) {
		super(editor_p, id_p, title_p);

	}

	/**
	 * @see org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui.forms.IManagedForm)
	 */
	@Override
	protected void createFormContent(IManagedForm managedForm_p) {
		FormToolkit toolkit = managedForm_p.getToolkit();
		toolkit.decorateFormHeading(managedForm_p.getForm().getForm());
		// For performance optimization.
		// managedForm_p.getForm().setDelayedReflow(true);
	}

	/**
	 * @see org.eclipse.ui.forms.editor.FormPage#getEditor()
	 */
	@Override
	public SharedHeaderFormEditor getEditor() {
		return (SharedHeaderFormEditor) super.getEditor();
	}

	public void setInitializationData(IConfigurationElement cfig, String propertyName, Object data) {

		super.setInitializationData(cfig, propertyName, data);

		String title = ActivityExplorerExtensionManager.getTitle(cfig);
		String tabName = ActivityExplorerExtensionManager.getTabName(cfig);

		if (tabName == null)
			tabName = title;
		setPartName(tabName);

		overview = ActivityExplorerExtensionManager.getOverviewElement(cfig) != null;
		if (overview) {

			overviewImageOffPath = ActivityExplorerExtensionManager.getOverviewImageOff(cfig);
			overviewImageOnPath = ActivityExplorerExtensionManager.getOverviewImageOn(cfig);

			String plugin_id = ActivityExplorerExtensionManager.getPluginId(cfig);

			if ((overviewImageOffPath.equals(IImageKeys.IMAGE_DEFAULT_OVERVIEW_OFF))) {
				plugin_id = ActivityExplorerActivator.ID;
			}

			setOverviewImageOff(ActivityExplorerActivator.getDefault().getImage(plugin_id, overviewImageOffPath));

			if ((overviewImageOnPath.equals(IImageKeys.IMAGE_DEFAULT_OVERVIEW_ON))) {
				plugin_id = ActivityExplorerActivator.ID;
			}

			setOverviewImageOn(ActivityExplorerActivator.getDefault().getImage(plugin_id, overviewImageOnPath));

			setOverViewText(ActivityExplorerExtensionManager.getOverviewDescription(cfig));
		}

		predicate = ActivityExplorerExtensionManager.getPredicate(cfig);

	}

	private void setOverviewImageOn(Image image) {
		overviewImageOn = image;

	}

	public String getOverViewImageOnPath() {
		return overviewImageOnPath;

	}

	public String getOverViewImageOffPath() {
		return overviewImageOffPath;

	}

	public Image getOverViewImageOn() {
		return overviewImageOn;

	}

	private void setOverViewText(String text) {
		overviewText = text;

	}

	public String getOverViewText() {
		return overviewText;

	}

	private void setOverviewImageOff(Image image) {
		overviewImageOff = image;
	}

	public Image getOverviewImageOff() {
		return overviewImageOff;
	}

	public boolean contributeToOverview() {
		return overview;
	}

	public void contributeToOverview(boolean contribute) {
		overview = contribute;
	}

	public abstract boolean isVisible();

	public int getPosition() {
		return index;
	}

	public void setPosition(int index) {
		this.index = index;

	}

	@Override
	public int getIndex() {
		return index;
	}

	@Override
	public void setIndex(int index_p) {
		this.index = index_p;

	}

	public int compareTo(IOrdered arg0) {
		int result = 1;
		if (null != arg0) {
			result = new Integer(getPosition()).compareTo(new Integer(arg0.getPosition()));
		}
		return result;

	}

}
