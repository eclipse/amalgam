/*******************************************************************************
 * Copyright (c) 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.eclipse.amalgam.explorer.activity.ui.api.configuration;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.CommonActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;

/**
 * Encapsutates the configuration data for a
 * {@link CommonActivityExplorerPage}.
 * 
 * @author pcdavid
 */
public class CommonActivityExplorerPageConfiguration {
    private int index;

    private String title;

    private String tabName;

    private String pluginId;

    private boolean overview;

    private String overviewText;

    private String overviewImageOnPath;

    private String overviewImageOffPath;

    private IPredicate predicate;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTabName() {
        return tabName;
    }

    public void setTabName(String tabName) {
        this.tabName = tabName;
    }

    public boolean isOverview() {
        return overview;
    }

    public void setOverview(boolean overview) {
        this.overview = overview;
    }

    public String getOverviewText() {
        return overviewText;
    }

    public void setOverviewText(String overviewText) {
        this.overviewText = overviewText;
    }

    public String getOverviewImageOnPath() {
        return overviewImageOnPath;
    }

    public void setOverviewImageOnPath(String overviewImageOnPath) {
        this.overviewImageOnPath = overviewImageOnPath;
    }

    public String getOverviewImageOffPath() {
        return overviewImageOffPath;
    }

    public void setOverviewImageOffPath(String overviewImageOffPath) {
        this.overviewImageOffPath = overviewImageOffPath;
    }

    public IPredicate getPredicate() {
        return predicate;
    }

    public void setPredicate(IPredicate predicate) {
        this.predicate = predicate;
    }

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }
    
    
}