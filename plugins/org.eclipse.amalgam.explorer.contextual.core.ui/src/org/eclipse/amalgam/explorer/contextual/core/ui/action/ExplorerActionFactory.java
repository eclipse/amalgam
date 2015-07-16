/******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.ui.action;

import org.eclipse.amalgam.explorer.contextual.core.ui.view.IExplorerContextualViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

/**
 *
 */
public abstract class ExplorerActionFactory {
  String actionId_p;
  /**
   * Creates a new workbench action factory with the given id.
   * 
   * @param actionId
   *            the id of actions created by this action factory
   */
  protected ExplorerActionFactory(String actionId) {
      actionId_p = actionId;
  }
  
  public abstract IWorkbenchAction create(IWorkbenchWindow window, IExplorerContextualViewPart explorerContextualView_p);
  
  /**
   * Workbench action (id "backwardHistory"): Backward in the explorer navigation
   * history. This action maintains its enablement state.
   */
  public static final ExplorerActionFactory BACKWARD_HISTORY = new ExplorerActionFactory("backwardHistory") {//$NON-NLS-1$
      /**
       * @see org.eclipse.ui.actions.ActionFactory#create(org.eclipse.ui.IWorkbenchWindow)
       */
      @Override
      public IWorkbenchAction create(IWorkbenchWindow window,  IExplorerContextualViewPart explorerContextualView_p) {
          if (window == null) {
              throw new IllegalArgumentException();
          }
          IWorkbenchAction action = new ExplorerContextualHistoryAction(window, explorerContextualView_p, false);
          return action;
      }
  };
  
  /**
   * Workbench action (id "forwardHistory"): Forward in the explorer navigation
   * history. This action maintains its enablement state.
   */
  public static final ExplorerActionFactory FORWARD_HISTORY = new ExplorerActionFactory("forwardHistory") {//$NON-NLS-1$
      /**
       * @see org.eclipse.ui.actions.ActionFactory#create(org.eclipse.ui.IWorkbenchWindow)
       */
      @Override
      public IWorkbenchAction create(IWorkbenchWindow window,  IExplorerContextualViewPart explorerContextualView_p) {
          if (window == null) {
              throw new IllegalArgumentException();
          }
          IWorkbenchAction action = new ExplorerContextualHistoryAction(window, explorerContextualView_p, true);
          return action;
      }
  };
}
