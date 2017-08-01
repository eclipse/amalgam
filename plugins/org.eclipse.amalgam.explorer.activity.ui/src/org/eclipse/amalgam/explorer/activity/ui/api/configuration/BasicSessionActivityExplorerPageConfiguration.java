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

import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.BasicSessionActivityExplorerPage;

/**
 * Encapsulates configuration data for a
 * {@link BasicSessionActivityExplorerPage}.
 */
public class BasicSessionActivityExplorerPageConfiguration extends ActivityExplorerPageConfiguration {
    /**
     * Define if viewer should appears in the page.
     */
    private boolean displayViewer;

    public boolean isDisplayViewer() {
        return displayViewer;
    }

    public void setDisplayViewer(boolean displayViewer) {
        this.displayViewer = displayViewer;
    }
}
