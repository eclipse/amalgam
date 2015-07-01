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
package org.eclipse.amalgam.explorer.activity.api.editor.activities;

import org.eclipse.amalgam.explorer.activity.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.FormHelper;
import org.eclipse.amalgam.explorer.activity.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.internal.intf.IOrdered;
import org.eclipse.amalgam.explorer.activity.internal.intf.IVisibility;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;

public class ExplorerActivity implements IVisibility, IOrdered {

	public ExplorerActivity(IConfigurationElement element_p) {
		name = ActivityExplorerExtensionManager.getName(element_p);
		description = ActivityExplorerExtensionManager.getDescription(element_p);
		index = Integer.parseInt(ActivityExplorerExtensionManager.getIndex(element_p));

		listener = ActivityExplorerExtensionManager.getActivityAdapter(element_p);

		image = ActivityExplorerExtensionManager.getImage(element_p);
		id = ActivityExplorerExtensionManager.getId(element_p);
		predicate = ActivityExplorerExtensionManager.getPredicate(element_p);
	}

	public ExplorerActivity(String id, String name, IHyperlinkListener listener, IPredicate predicate, int index) {
		super();
		this.id = id;
		this.name = name;
		this.listener = listener;
		this.predicate = predicate;
		setPosition(index);

	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public IHyperlinkListener getListener() {
		return listener;
	}

	private String id;
	private String name;
	private IHyperlinkListener listener;
	private int index;
	private Image image;
	private String description;
	private IPredicate predicate;

	public Image getImage() {
		return image;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * Return true this activity is visible.
	 */
	public boolean isVisible() {

		boolean result = ActivityExplorerActivator.getDefault().getPreferenceStore().getBoolean(getId());
		if (predicate != null) {
			result &= predicate.isOk();
		}
		return result;
	}

	public IPredicate getPredicate() {
		return predicate;
	}

	public int getPosition() {
		return index;
	}

	public void setPosition(int index_p) {
		this.index = index_p;

	}

	public Control init(Composite activityContainer_p, FormToolkit toolkit_p) {
		widget = FormHelper.createLinkWithDescription(toolkit_p, activityContainer_p, image, name, null, description,
				listener);
		return widget;

	}

	ImageHyperlink widget;

	public ImageHyperlink getWidget() {
		return widget;
	}

	public void dispose() {
		// dispose the section widget
		if (widget != null && !widget.isDisposed())
			widget.dispose();

	}

	public int compareTo(IOrdered arg0) {
		return new Integer(getPosition()).compareTo(new Integer(arg0.getPosition()));

	}
}
