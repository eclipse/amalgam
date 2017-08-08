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
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IOrdered;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IVisibility;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ImageHyperlink;

/**
 * Represents an activity than can be invoked by the end-user by clicking on the
 * corresponding hyperlink.
 */
public class ExplorerActivity implements IVisibility, IOrdered {
    /**
     * The configuration for this activity.
     */
    private final ActivityConfiguration config;

    /**
     * The preference store where to look for visibility configuration (can be
     * changed the the end-user).
     */
    private final IPreferenceStore preferenceStore = ActivityExplorerActivator.getDefault().getPreferenceStore();

    /**
     * The actual widget which represents the activity inside a section.
     */
    private ImageHyperlink widget;

    public ExplorerActivity(ActivityConfiguration cfg) {
        this.config = cfg;
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

    @Override
    public int getPosition() {
        return config.getIndex();
    }

    @Override
    public void setPosition(int index) {
        this.config.setIndex(index);
    }

    @Override
    public boolean isVisible() {
        boolean result = preferenceStore.getBoolean(config.getId());
        if (config.getPredicate() != null) {
            result &= config.getPredicate().isOk();
        }
        return result;
    }

    @Override
    public int compareTo(IOrdered other) {
        return this.getPosition() - other.getPosition();
    }

    /**
     * Create the actual hyperlink widget representing the activity.
     * 
     * @param parent
     *            the parent control.
     * @param toolkit
     *            the toolkit to use for widget creation & styling.
     * @return the hyperlink widget representing the activity.
     */
    public Control init(Composite parent, FormToolkit toolkit) {
        widget = FormHelper.createLinkWithDescription(toolkit, parent, config.getImage(), config.getName(), null, config.getDescription(), config.getListener());
        return widget;
    }

    public void dispose() {
        // dispose the section widget
        if (widget != null && !widget.isDisposed()) {
            widget.dispose();
        }
    }

}
