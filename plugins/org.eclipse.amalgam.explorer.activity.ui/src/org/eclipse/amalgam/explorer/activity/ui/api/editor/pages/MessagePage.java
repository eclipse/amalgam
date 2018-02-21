/*******************************************************************************
 * Copyright (c)  2006, 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.editor.pages;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class MessagePage extends FormPage {

    private static final int FORM_BODY_MARGIN_HEIGHT = 0;

    private static final int FORM_BODY_MARGIN_WIDTH = 0;

    private static final int FORM_BODY_MARGIN_TOP = 12;

    private static final int FORM_BODY_MARGIN_BOTTOM = 12;

    private static final int FORM_BODY_MARGIN_LEFT = 6;

    private static final int FORM_BODY_MARGIN_RIGHT = 6;

    private static final int FORM_BODY_HORIZONTAL_SPACING = 20;

    private static final int FORM_BODY_VERTICAL_SPACING = 17;

    protected String message;

    public MessagePage(FormEditor formEditor, String message) {
        this(formEditor, message, ""); //$NON-NLS-1$ //$NON-NLS-2$
    }

    public MessagePage(FormEditor formEditor, String message, String title) {
        super(formEditor, "007", title); //$NON-NLS-1$ //$NON-NLS-2$
        this.message = message;
    }

    @Override
    protected void createFormContent(final IManagedForm managedForm) {
        // Create single columned page layout
        Composite body = managedForm.getForm().getBody();
        body.setLayout(createFormBodyGridLayout(false, 1));

        // Display message indicating that editor input is being loaded
        FormToolkit toolkit = managedForm.getToolkit();
        Label label = toolkit.createLabel(body, message);
        label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
    }

    private GridLayout createFormBodyGridLayout(boolean makeColumnsEqualWidth, int numColumns) {
        GridLayout layout = new GridLayout();

        layout.marginHeight = FORM_BODY_MARGIN_HEIGHT;
        layout.marginWidth = FORM_BODY_MARGIN_WIDTH;

        layout.marginTop = FORM_BODY_MARGIN_TOP;
        layout.marginBottom = FORM_BODY_MARGIN_BOTTOM;
        layout.marginLeft = FORM_BODY_MARGIN_LEFT;
        layout.marginRight = FORM_BODY_MARGIN_RIGHT;

        layout.horizontalSpacing = FORM_BODY_HORIZONTAL_SPACING;
        layout.verticalSpacing = FORM_BODY_VERTICAL_SPACING;

        layout.makeColumnsEqualWidth = makeColumnsEqualWidth;
        layout.numColumns = numColumns;

        return layout;
    }
}
