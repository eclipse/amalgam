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
package org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter;

import java.util.Collections;
import java.util.Set;

import org.eclipse.amalgam.explorer.activity.ui.internal.QuickMenuCreator;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;

/**
 * An {@link HyperlinkAdapter} implementation that displays a popup menu on link
 * activation.
 * 
 */
public abstract class PopupMenuLinkAdapter extends HyperlinkAdapter implements IRepresentationProvider {

	/**
	 * @see org.eclipse.ui.forms.events.HyperlinkAdapter#linkActivated(org.eclipse.ui.forms.events.HyperlinkEvent)
	 */
	@Override
	final public void linkActivated(HyperlinkEvent event_p) {
		// Create a context menu.
		QuickMenuCreator menuCreator = new QuickMenuCreator() {
			@Override
			protected void fillMenu(IMenuManager menuManager_p) {
				fillPopupMenu(menuManager_p);
			}
		};
		// Create and open the menu.
		menuCreator.createMenu();
	}

	/**
	 * Fill the popup menu.
	 * 
	 * @param menuManager
	 */
	protected abstract void fillPopupMenu(IMenuManager menuManager);

  /**
   * @see org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.IRepresentationProvider#getRepresentationNames()
   */
  public Set<String> getRepresentationNames() {
    return Collections.emptySet();
  }
}
