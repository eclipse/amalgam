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
package org.eclipse.amalgam.explorer.activity.internal.viewer.diagram.actions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.common.tools.api.util.StringUtil;
import org.eclipse.sirius.common.ui.tools.api.dialog.RenameDialog;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

/**
 * The action allowing to rename representations.
 * 
 */
public class RenameRepresentationAction extends BaseSelectionListenerAction {
	/**
	 * Constructs the action allowing to rename representations.
	 */
	public RenameRepresentationAction() {
		super("Rename"); //$NON-NLS-1$
		setActionDefinitionId("org.eclipse.ui.edit.rename"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		// Gets all the selected representations.
		List<DRepresentation> representations = new ArrayList<DRepresentation>();
		IStructuredSelection structuredSelection = getStructuredSelection();
		for (Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();) {
			Object selectedObject = iterator.next();
			if (selectedObject instanceof DRepresentation) {
				representations.add((DRepresentation) selectedObject);
			}
		}

		// Parses the selected representations and rename them.
		for (DRepresentation representation : representations) {
			final String oldName = (representation.getName() != null) ? representation.getName()
					: StringUtil.EMPTY_STRING;
			// To provide a title we need sub-classing the RenameDialog.
			RenameDialog dialog = new RenameDialog(Display.getDefault().getActiveShell(), oldName) {

				@Override
				public int open() {
					// The super class calls create() too late, let's call it as
					// the super super class does.
					create();
					return super.open();
				}

				/**
				 * @see org.eclipse.ui.dialogs.SelectionStatusDialog#create()
				 */
				@Override
				public void create() {
					super.create();
					setTitle(Messages.RenameRepresentationAction_0);
					// Set the old name here allow to have the preferred size
					// correctly computed, even if the old name was already
					// provided with the constructor.
					setOldName(oldName);
					// Force the window to compute its preferred size.
					getShell().setSize(getShell().computeSize(SWT.DEFAULT, SWT.DEFAULT));
				}
			};
			if (Window.OK == dialog.open()) {
				String newName = dialog.getNewName();
				if (!oldName.equals(newName)) {
					TransactionUtil.getEditingDomain(representation).getCommandStack()
							.execute(new RenameRepresentationCommand(representation, newName));
				}
			}
		}
	}

	// The rename representation command.
	private class RenameRepresentationCommand extends RecordingCommand {
		// The new name to apply.
		private String _name;
		// The selected representation.
		private DRepresentation _representation;

		/**
		 * Constructs the command allowing to rename the selected
		 * representation.
		 * 
		 * @param representation_p
		 *            The representation.
		 * @param name_p
		 *            The new name to apply.
		 */
		public RenameRepresentationCommand(DRepresentation representation_p, String name_p) {
			super(TransactionUtil.getEditingDomain(representation_p));
			_name = name_p;
			_representation = representation_p;
		}

		/**
		 * @see java.lang.Runnable#run()
		 */

		@Override
		protected void doExecute() {
			_representation.setName(_name);

		}
	}
}
