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

import org.eclipse.amalgam.explorer.activity.api.manager.ActivityExplorerManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkEvent;

public class BlankHyperLinkAdapter extends AbstractHyperlinkAdapter {

	public BlankHyperLinkAdapter() {
		super(ActivityExplorerManager.INSTANCE.getRootSemanticModel(), ActivityExplorerManager.INSTANCE.getSession());
	}

	@Override
	protected void linkPressed(HyperlinkEvent event_p, EObject project_p, Session session_p) {
		// TODO Auto-generated method stub

	}

}
