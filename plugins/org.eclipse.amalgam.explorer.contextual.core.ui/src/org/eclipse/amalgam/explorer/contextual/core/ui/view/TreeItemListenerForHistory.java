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
package org.eclipse.amalgam.explorer.contextual.core.ui.view;

import org.eclipse.amalgam.explorer.contextual.core.category.CategoryImpl;
import org.eclipse.amalgam.explorer.contextual.core.model.IExplorerContextualModel;
import org.eclipse.amalgam.explorer.contextual.core.provider.wrapper.CategoryWrapper;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Widget;

public class TreeItemListenerForHistory implements Listener {

  protected boolean hasBeenExpanded;
  protected String explorerID;
  protected IExplorerContextualModel model;
  protected ExplorerContextualTree explorer;

  public TreeItemListenerForHistory(boolean hasBeenExpanded_p, String explorerID_p, IExplorerContextualModel model_p, ExplorerContextualTree explorer_p) {
    hasBeenExpanded = hasBeenExpanded_p;
    explorerID = explorerID_p;
    model = model_p;
    explorer = explorer_p;
  }

  @Override
  public void handleEvent(Event e) {
    if (!model.containsExpandedHistory(explorerID)) {
      explorer.initializeHistory();
    }
    Widget widget = e.item;
    if (widget instanceof TreeItem) {
      TreeItem item = (TreeItem) widget;
      Object data = item.getData();
      if ((data != null) && (data instanceof CategoryWrapper)) {
        CategoryImpl category = (CategoryImpl) ((CategoryWrapper) data).getElement();
        model.saveExpandedState(category, explorerID, hasBeenExpanded);
      }
    }
  }
}
