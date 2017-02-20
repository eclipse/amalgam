/*******************************************************************************
 * Copyright (c)  2006, 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.editor.activities;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.configuration.ActivityConfiguration;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.ui.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IOrdered;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IVisibility;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;

public class ExplorerActivity implements IVisibility, IOrdered {
    private ActivityConfiguration config;
    private ImageHyperlink widget;

    private static ActivityConfiguration parseConfiguration(IConfigurationElement element_p) {
        ActivityConfiguration config = new ActivityConfiguration();
        config.setName(ActivityExplorerExtensionManager.getName(element_p));
        config.setDescription(ActivityExplorerExtensionManager.getDescription(element_p));
        config.setIndex(Integer.parseInt(ActivityExplorerExtensionManager.getIndex(element_p)));
        config.setListener(ActivityExplorerExtensionManager.getActivityAdapter(element_p));
        config.setImage(ActivityExplorerExtensionManager.getImage(element_p));
        config.setId(ActivityExplorerExtensionManager.getId(element_p));
        config.setPredicate(ActivityExplorerExtensionManager.getPredicate(element_p));
        return config;
    }
    
	public ExplorerActivity(IConfigurationElement element_p) {
	    this.config = parseConfiguration(element_p);
	}

	public ExplorerActivity(String id, String name, IHyperlinkListener listener, IPredicate predicate, int index) {
	    this.config = new ActivityConfiguration();
		this.config.setId(id);
		this.config.setName(name);
		this.config.setListener(listener);
		this.config.setPredicate(predicate);
		this.config.setIndex(index);
	}

	public String getId() {
		return config.getId();
	}

	public String getName() {
		return config.getName();
	}

	public IHyperlinkListener getListener() {
		return config.getListener();
	}

	public Image getImage() {
		return config.getImage();
	}

	public String getDescription() {
		return config.getDescription();
	}

	/**
	 * Return true this activity is visible.
	 */
	public boolean isVisible() {
		boolean result = ActivityExplorerActivator.getDefault().getPreferenceStore().getBoolean(getId());
		if (config.getPredicate() != null) {
			result &= config.getPredicate().isOk();
		}
		return result;
	}

	public IPredicate getPredicate() {
		return config.getPredicate();
	}

	public int getPosition() {
		return config.getIndex();
	}

	public void setPosition(int index_p) {
		this.config.setIndex(index_p);
	}

    public int compareTo(IOrdered arg0) {
        return new Integer(getPosition()).compareTo(new Integer(arg0.getPosition()));
    }
    
	public Control init(Composite activityContainer_p, FormToolkit toolkit_p) {
		widget = FormHelper.createLinkWithDescription(toolkit_p, activityContainer_p, config.getImage(), config.getName(), null, config.getDescription(),
		        config.getListener());
		return widget;
	}

	public ImageHyperlink getWidget() {
		return widget;
	}

	public void dispose() {
		// dispose the section widget
		if (widget != null && !widget.isDisposed())
			widget.dispose();
	}

}
