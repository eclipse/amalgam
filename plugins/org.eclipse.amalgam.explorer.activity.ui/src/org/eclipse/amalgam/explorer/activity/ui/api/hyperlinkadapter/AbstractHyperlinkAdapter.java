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
package org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;

/**
 * Base class to implement an {@link HyperlinkAdapter} in Modeling context.
 * 
 */
public abstract class AbstractHyperlinkAdapter extends HyperlinkAdapter {
	/**
	 * Root Element of the Semantic model.
	 */
	protected EObject _root;
	/**
	 * Sirius session.
	 */
	private Session _session;

	/**
	 * Constructor.
	 * 
	 * @param project_p
	 */
	public AbstractHyperlinkAdapter(EObject root_p, Session session_p) {
		_root = root_p;
		_session = session_p;
	}

	/**
	 * Get the model element that the run is performed against.<br>
	 * 
	 * @param project_p
	 * @return
	 */
	protected EObject getModelElement(EObject root_p) {
		return _root;
	}

	/**
	 * @see org.eclipse.ui.forms.events.HyperlinkAdapter#linkActivated(org.eclipse.ui.forms.events.HyperlinkEvent)
	 */
	@Override
	public void linkActivated(HyperlinkEvent event_p) {
		linkPressed(event_p, _root, _session);
	}

	/**
	 * Called when link is activated i.e pressed by the end-user.
	 * 
	 * @param event_p
	 * @param project_p
	 * @param session_p
	 */
	protected abstract void linkPressed(HyperlinkEvent event_p, EObject project_p, Session session_p);
}
