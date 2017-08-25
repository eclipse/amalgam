/*******************************************************************************
 * Copyright (c)  2006, 2017 THALES GLOBAL SERVICES and others.
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
    protected final EObject root;

    /**
     * Constructor.
     *
     * @param root
     */
    public AbstractHyperlinkAdapter(EObject root) {
        this.root = root;
    }

    /**
     * Get the model element that the run is performed against.<br>
     *
     * @param root
     * @return
     */
    protected EObject getModelElement(EObject root) {
        return this.root;
    }

    @Override
    public void linkActivated(HyperlinkEvent event) {
        Session.of(root).ifPresent(s -> linkPressed(event, root, s));
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
