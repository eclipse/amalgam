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
package org.eclipse.amalgam.explorer.activity.api.actions;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;

/**
 * Provider that declares actions for the Project Explorer.
 * 
 */
public class ActivityExplorerActionProvider extends CommonActionProvider {
	/**
	 * Action used to open Activity Explorer.
	 */
	private OpenActivityExplorerAction _openActivityExplorerAction;
	/**
	 * Action used to go to Activity Explorer.
	 */
	private GoToActivityExplorerAction _gottoActivityExplorerAction;

	/**
	 * @see org.eclipse.ui.actions.ActionGroup#dispose()
	 */
	@Override
	public void dispose() {
		ISelectionProvider selectionProvider = getActionSite().getViewSite().getSelectionProvider();
		if (null != _openActivityExplorerAction) {
			selectionProvider.removeSelectionChangedListener(_openActivityExplorerAction);
			_openActivityExplorerAction = null;
		}
		if (null != _gottoActivityExplorerAction) {
			selectionProvider.removeSelectionChangedListener(_gottoActivityExplorerAction);
			_gottoActivityExplorerAction = null;
		}
		super.dispose();
	}

	/**
	 * @see org.eclipse.ui.actions.ActionGroup#fillActionBars(org.eclipse.ui.IActionBars)
	 */
	@Override
	public void fillActionBars(IActionBars actionBars_p) {
		// Do nothing.
	}

	/**
	 * @see org.eclipse.ui.actions.ActionGroup#fillContextMenu(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	public void fillContextMenu(IMenuManager menu_p) {
		updateActionBars();
		if (_openActivityExplorerAction.canAddedToMenu())
			menu_p.insertBefore(ICommonMenuConstants.GROUP_NEW, _openActivityExplorerAction);
		if (_gottoActivityExplorerAction.canAddedToMenu())
			menu_p.insertBefore(ICommonMenuConstants.GROUP_NEW, _gottoActivityExplorerAction);

		menu_p.insertBefore(ICommonMenuConstants.GROUP_NEW, new Separator());
	}

	/**
	 * @see org.eclipse.ui.navigator.CommonActionProvider#init(org.eclipse.ui.navigator.ICommonActionExtensionSite)
	 */
	@Override
	public void init(ICommonActionExtensionSite site_p) {
		super.init(site_p);

		ISelectionProvider selectionProvider = site_p.getViewSite().getSelectionProvider();
		ISelection selection = selectionProvider.getSelection();
		_openActivityExplorerAction = new OpenActivityExplorerAction();
		selectionProvider.addSelectionChangedListener(_openActivityExplorerAction);

		if (!selection.isEmpty()) {
			_openActivityExplorerAction.selectionChanged(new SelectionChangedEvent(selectionProvider, selection));
		}
		_gottoActivityExplorerAction = new GoToActivityExplorerAction();

		if (!selection.isEmpty()) {
			_openActivityExplorerAction.selectionChanged(new SelectionChangedEvent(selectionProvider, selection));
		}
	}

	/**
	 * @see org.eclipse.ui.actions.ActionGroup#updateActionBars()
	 */
	@Override
	public void updateActionBars() {
		IStructuredSelection selection = (IStructuredSelection) getContext().getSelection();
		_openActivityExplorerAction.selectionChanged(selection);
		_gottoActivityExplorerAction.selectionChanged(selection);
	}
}
