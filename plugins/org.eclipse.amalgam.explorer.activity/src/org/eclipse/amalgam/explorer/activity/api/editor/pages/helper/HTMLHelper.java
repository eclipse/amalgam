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
package org.eclipse.amalgam.explorer.activity.api.editor.pages.helper;

import org.eclipse.amalgam.explorer.activity.api.editor.pages.AbstractActivityExplorerPage;
import org.eclipse.ui.forms.editor.IFormPage;

public class HTMLHelper {

	public static String overviewDescForm(AbstractActivityExplorerPage page) {
		String description = page.getOverViewText();

		return formWrapper2(description);
	}

	public static String imageLinkForm(IFormPage page) {
		String link = linkForm(page);
		return formWrapper(link);
	}

	public static String linkForm(IFormPage page) {
		String id = page.getId();
		String link = "<a href=\"" + id + "\"><img href=\"" + id //$NON-NLS-1$ //$NON-NLS-2$
				+ "\"/>" + "</a>"; //$NON-NLS-1$ //$NON-NLS-2$
		return link;
	}

	public static String breadcrumbForm(IFormPage previous, IFormPage current, IFormPage next) {
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
		StringBuffer buffer = new StringBuffer();
		buffer.append("<form>"); //$NON-NLS-1$
		buffer.append("<p>"); //$NON-NLS-1
		buffer.append(txt);
		buffer.append("</p>"); //$NON-NLS-1$
		buffer.append("</form>"); //$NON-NLS-1$
		return buffer.toString();
	}

	public static String formWrapper2(String txt) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<form>"); //$NON-NLS-1$
		//buffer.append("<p>"); //$NON-NLS-1

		buffer.append(txt);
		//buffer.append("</p>"); //$NON-NLS-1$
		buffer.append("</form>"); //$NON-NLS-1$
		return buffer.toString();
	}

}
