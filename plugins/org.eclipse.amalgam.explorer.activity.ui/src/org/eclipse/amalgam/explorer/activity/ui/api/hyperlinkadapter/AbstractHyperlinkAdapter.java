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

import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
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
	 * Constructor.
	 * 
	 * @param root
	 */
	public AbstractHyperlinkAdapter(EObject root) {
		_root = root;
	}

	/**
   * Constructor.
   * 
   * @param root
   */
	@Deprecated
  public AbstractHyperlinkAdapter(EObject root, Session session) {
    this(root);
  }
	
	/**
	 * Get the model element that the run is performed against.<br>
	 * 
	 * @param root
	 * @return
	 */
	protected EObject getModelElement(EObject root) {
		return _root;
	}

	/**
	 * @see org.eclipse.ui.forms.events.HyperlinkAdapter#linkActivated(org.eclipse.ui.forms.events.HyperlinkEvent)
	 */
	@Override
	public void linkActivated(HyperlinkEvent event) {
		linkPressed(event, _root, ActivityExplorerManager.INSTANCE.getSession());
	}

	/**
	 * Called when link is activated i.e pressed by the end-user.
	 * 
	 * @param event
	 * @param root
	 * @param session
	 */
	protected abstract void linkPressed(HyperlinkEvent event, EObject root, Session session);
}
