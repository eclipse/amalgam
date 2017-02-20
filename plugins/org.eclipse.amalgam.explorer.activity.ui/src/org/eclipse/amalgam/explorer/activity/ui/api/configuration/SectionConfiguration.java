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

import org.eclipse.amalgam.explorer.activity.ui.api.editor.activities.ExplorerActivity;

/**
 * Represents the configuration of a section in a page.
 * 
 * @author pcdavid
 */
public class SectionConfiguration {
    private String id;

    private String name;

    private int index;

    private boolean isExpanded;

    private boolean isFiltering;

    private String description;

    public TreeSet<ExplorerActivity> activities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean isExpanded) {
        this.isExpanded = isExpanded;
    }

    public boolean isFiltering() {
        return isFiltering;
    }

    public void setFiltering(boolean isFiltering) {
        this.isFiltering = isFiltering;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
