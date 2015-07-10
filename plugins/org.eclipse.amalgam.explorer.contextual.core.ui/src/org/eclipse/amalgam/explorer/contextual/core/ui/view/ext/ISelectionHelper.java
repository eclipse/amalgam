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
package org.eclipse.amalgam.explorer.contextual.core.ui.view.ext;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

/**
 *
 */
public interface ISelectionHelper {

	/**
	 * Provide a list of object to handle by the Contextual Explorer
	 * @param part_p 
	 * @param selection_p
	 * @param selectedObject
	 * @return
	 */
	public Object getSelection(IWorkbenchPart part_p, ISelection selection_p, Object selectedObject);
}
