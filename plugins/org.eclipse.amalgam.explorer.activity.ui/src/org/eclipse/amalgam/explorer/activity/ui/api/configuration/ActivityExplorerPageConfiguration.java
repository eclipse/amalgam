/*******************************************************************************
 * Copyright (c) 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.configuration;

import java.util.TreeSet;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.ActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.sections.ActivityExplorerSection;
import org.eclipse.swt.graphics.Image;

/**
 * Configuration data for {@link ActivityExplorerPage}.
 */
public class ActivityExplorerPageConfiguration extends CommonActivityExplorerPageConfiguration {
    /**
     * Header title of the page
     */
    private String headerTitle;

    private Image headerImageOff;

    private Image headerImageOn;

    private String description;

    private TreeSet<ActivityExplorerSection> sections = new TreeSet<ActivityExplorerSection>();

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public Image getHeaderImageOff() {
        return headerImageOff;
    }

    public void setHeaderImageOff(Image headerImageOff) {
        this.headerImageOff = headerImageOff;
    }

    public Image getHeaderImageOn() {
        return headerImageOn;
    }

    public void setHeaderImageOn(Image headerImageOn) {
        this.headerImageOn = headerImageOn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TreeSet<ActivityExplorerSection> getSections() {
        return sections;
    }

    public void setSections(TreeSet<ActivityExplorerSection> sections) {
        this.sections = sections;
    }

}
