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
package org.eclipse.amalgam.explorer.activity.ui.internal.session.listeners;

import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * 
 */
public class ActivityExplorerSessionListener implements SessionManagerListener {

    @Override
    public void notify(Session session, int notification) {
        ActivityExplorerManager.INSTANCE.dispatchEvent(notification, session);
    }

    @Override
    public void notifyAddSession(Session newSession) {
        // Do Nothing
    }

    @Override
    public void notifyRemoveSession(Session removedSession) {
        // Do Nothing
    }

    @Override
    public void viewpointSelected(Viewpoint selectedSirius) {
        // Do Nothing
    }

    @Override
    public void viewpointDeselected(Viewpoint deselectedSirius) {
        // Do Nothing
    }
}
