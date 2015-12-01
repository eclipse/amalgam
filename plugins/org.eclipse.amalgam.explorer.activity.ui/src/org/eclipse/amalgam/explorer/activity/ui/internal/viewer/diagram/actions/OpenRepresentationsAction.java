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
package org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.actions.runnable.OpenRepresentationsRunnable;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;

/**
 * The action allowing to open representations.
 * 
 */
public class OpenRepresentationsAction extends BaseSelectionListenerAction {
	// Make root diagram as the welcome page.

	// Log4j reference logger.
	// private static final Logger __logger =
	// ReportManagerRegistry.getInstance().subscribe(IReportManagerDefaultComponents.UI);

	/**
	 * Constructs the action allowing to open representations.
	 */
	public OpenRepresentationsAction() {
		super("Open"); //$NON-NLS-1$
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		List<DRepresentation> representations = getRepresentations(getStructuredSelection());
		// Precondition
		if (representations.isEmpty()) {
			return;
		}
		IRunnableWithProgress runnable = new OpenRepresentationsRunnable(representations, false);
		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell());
		try {
			progressDialog.run(false, false, runnable);
		} catch (InvocationTargetException ex_p) {
			// __logger.debug(new EmbeddedMessage(ex_p.getMessage(),
			// IReportManagerDefaultComponents.UI));
		} catch (InterruptedException ex_p) {
			// __logger.debug(new EmbeddedMessage(ex_p.getMessage(),
			// IReportManagerDefaultComponents.UI));
		}
	}

	// Filters representations.
	protected List<DRepresentation> getRepresentations(IStructuredSelection selection_p) {

		List<DRepresentation> representations = new ArrayList<DRepresentation>();
		Iterator<?> iterator = selection_p.iterator();
		while (iterator.hasNext()) {
			Object selectedObject = iterator.next();
			if (selectedObject instanceof DRepresentation) {
				representations.add((DRepresentation) selectedObject);
			}
		}
		return representations;
	}
}
