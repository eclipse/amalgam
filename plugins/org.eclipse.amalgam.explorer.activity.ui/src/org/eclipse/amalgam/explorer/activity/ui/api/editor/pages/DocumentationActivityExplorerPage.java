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
package org.eclipse.amalgam.explorer.activity.ui.api.editor.pages;

import org.eclipse.ui.forms.editor.FormEditor;

/**
 * Documentation that allows end-user to enter HTML documentation related to the
 * model.
 */
public class DocumentationActivityExplorerPage extends CommonActivityExplorerPage {

    public DocumentationActivityExplorerPage(FormEditor editor) {
        super(editor, DocumentationActivityExplorerPage.class.getName(), Messages.DocumentationActivityExplorerPage_0);
    }

    @Override
    public boolean isVisible() {
        return true;
    }
}
