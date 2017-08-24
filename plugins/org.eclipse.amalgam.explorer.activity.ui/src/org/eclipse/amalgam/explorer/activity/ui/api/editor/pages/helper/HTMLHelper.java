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
package org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper;

public class HTMLHelper {

    public static String overviewDescForm(String description) {
        return formWrapper2(description);
    }

    public static String imageLinkForm(String id) {
        String link = linkForm(id);
        return formWrapper(link);
    }

    public static String linkForm(String id) {
        return String.format("<a href=\"%s\"><img href=\"%s\"/></a>", id, id); //$NON-NLS-1$
    }

    public static String breadcrumbForm(String previous, String current, String next) {
        String txt = ""; //$NON-NLS-1$
        if (previous != null)
            txt += linkForm(previous);
        if (current != null)
            txt += linkForm(current);
        if (next != null)
            txt += linkForm(next);
        return formWrapper(txt);
    }

    public static String formWrapper(String txt) {
        return String.format("<form><p>%s</p></form>", txt); //$NON-NLS-1$
    }

    public static String formWrapper2(String txt) {
        return String.format("<form>%s</form>", txt); //$NON-NLS-1$
    }
}
