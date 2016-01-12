/*******************************************************************************
 * Copyright (c)  2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.internal.session.listeners;

import java.lang.ref.WeakReference;

import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

/**
 * 
 */
public class ActivityExplorerSessionListener implements SessionManagerListener {
 

  @Override
  public void notify(Session sessionp, int notification) {

    WeakReference<Session> session = new WeakReference<Session>(sessionp);

    switch (notification) {
    case SessionListener.CLOSING:
    	ActivityExplorerManager.INSTANCE.dispatchEvent(notification, session.get());
      break;
    case SessionListener.SELECTED_VIEWS_CHANGE_KIND:
    	ActivityExplorerManager.INSTANCE.dispatchEvent(notification, session.get());
      break;
    case SessionListener.REPRESENTATION_CHANGE:
    	ActivityExplorerManager.INSTANCE.dispatchEvent(notification, session.get());
      break;
    case SessionListener.OPENED:
    	if ((session.get() != null) && !(session.get().getSemanticResources().isEmpty())) {
    		ActivityExplorerManager.INSTANCE.openEditor(session.get());
    	}
      break;
    case SessionListener.DIRTY:
    case SessionListener.SYNC:
    case SessionListener.SEMANTIC_CHANGE: // Listening to changes to mark
    	ActivityExplorerManager.INSTANCE.dispatchEvent(notification, session.get());
      break;
    case SessionListener.REPLACED:
    	ActivityExplorerManager.INSTANCE.dispatchEvent(notification, session.get());
      break;
    }
  }

  @Override
  public void notifyAddSession(Session newSession) {
	  // TODO Auto-generated method stub

  }

  @Override
  public void notifyRemoveSession(Session removedSession) {
	  // TODO Auto-generated method stub

  }

  @Override
  public void viewpointSelected(Viewpoint selectedSirius) {
	  // TODO Auto-generated method stub

  }

  @Override
  public void viewpointDeselected(Viewpoint deselectedSirius) {
	  // TODO Auto-generated method stub

  }
}
