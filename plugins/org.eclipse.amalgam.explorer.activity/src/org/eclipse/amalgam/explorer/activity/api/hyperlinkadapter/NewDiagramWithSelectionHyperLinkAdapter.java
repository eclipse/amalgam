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
package org.eclipse.amalgam.explorer.activity.api.hyperlinkadapter;

import java.util.Iterator;

import org.eclipse.amalgam.explorer.activity.api.dialog.EMFSelectionDialog;
import org.eclipse.amalgam.explorer.activity.api.dialog.SelectionDialog;
import org.eclipse.amalgam.explorer.activity.api.manager.ActivityExplorerManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;

public class NewDiagramWithSelectionHyperLinkAdapter extends NewDiagramHyperLinkAdapter {

	protected Session session = null;

	@Override
	protected void linkPressed(HyperlinkEvent event_p, EObject project_p, Session session_p) {

		final HyperlinkEvent event = event_p;
		session = session_p;

		ViewerFilter filter = getFilter();
		SelectionDialog dialog = new EMFSelectionDialog(ActivityExplorerManager.INSTANCE.getEditor().getSite().getShell(),
				project_p, filter);

		int value = dialog.open();
		if (value == IDialogConstants.OK_ID) {

			Object o = dialog.getSelection();
			if (o != null && o instanceof EObject)

				NewDiagramWithSelectionHyperLinkAdapter.super.linkPressed(event, (EObject) o, session);
		}
	}

	protected ViewerFilter getFilter() {

		return new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				Iterator<EObject> e = EcoreUtil.getAllContents((EObject) element, false);

				boolean result = getDiagramRepresentation(session, (EObject) element) != null;
				if (!result) {
					while (e.hasNext()) {
						EObject child = e.next();
						result = getDiagramRepresentation(session, (EObject) child) != null;
						if (result)
							break;
					}
				}
				return result;
			}
		};
	}
}
