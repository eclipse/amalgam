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
package org.eclipse.amalgam.explorer.contextual.core.ui.internal;

import java.util.Map;

import org.eclipse.amalgam.explorer.contextual.core.ui.action.ExplorerContextualHistoryAction;
import org.eclipse.amalgam.explorer.contextual.core.ui.view.IExplorerContextualViewPart;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.IElementUpdater;
import org.eclipse.ui.menus.UIElement;


/**
 * Base class to implement the handler for backward & forward navigation in the Contextual Explorer.
 */
public abstract class AbstractNavigateBackHandler extends AbstractHandler implements IElementUpdater {
  /**
   * {@inheritDoc}
   */
  public Object execute(ExecutionEvent event_p) throws ExecutionException {
    IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
    IWorkbenchPage activePage = activeWorkbenchWindow.getActivePage();
    IWorkbenchPart activePart = activePage.getActivePart();
//  String id = activePart.getSite().getId();
//  IExplorerContextualViewPart explorerContextual = (IExplorerContextualViewPart) activePage.findView(ExplorerContextualView.getExplorerContextualViewID());
//  IViewPart findView = activePage.findView(id);
    if (null != activePart && activePart instanceof IExplorerContextualViewPart)
    {
    	IExplorerContextualViewPart explorerContextual = (IExplorerContextualViewPart) activePart;
    	ExplorerContextualHistoryAction explorerContextualHistoryAction = new ExplorerContextualHistoryAction(activeWorkbenchWindow, explorerContextual, isForwardNavigation());
		explorerContextualHistoryAction.run();
		explorerContextualHistoryAction.dispose();
		explorerContextualHistoryAction = null;
    }
    
    return null;
  }
  
  @SuppressWarnings({ "rawtypes" })
@Override
	public void updateElement(UIElement element, Map parameters) {
		// TODO Auto-generated method stub
	}
  
  /**
   * Is given action the forward action ?
   * @return <code>true</code> means yes;<code>false</code> means backward navigation.
   */
  protected abstract boolean isForwardNavigation();
}
