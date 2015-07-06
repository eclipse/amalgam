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
package org.eclipse.amalgam.explorer.activity.ui.api.editor.pages;

import org.eclipse.ui.forms.editor.FormEditor;

/**
 * Documentation that allows end-user to enter HTML documentation related to the
 * model.
 * 
 */
public class DocumentationActivityExplorerPage extends AbstractActivityExplorerPage
// implements IRichTextSaveable
{

	public DocumentationActivityExplorerPage(FormEditor editor_p) {
		super(editor_p, DocumentationActivityExplorerPage.class.getName(), Messages.DocumentationActivityExplorerPage_0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isVisible() {
		return true;
	}
}
