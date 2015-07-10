/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.contextual.view.focus;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;

/**
 *
 */
public interface IFocusInEditor {

	/**
	 * This method allows a contributor to accept or not to handle focus.
	 * @param activeEditor_p the active {@link IEditorPart}
	 * @param selection_p the {@link ISelection} to use to change <code>activeEditor_p</code> selection.
	 * @return True if contributor accept to handle focus, false otherwise.
	 */
	public boolean accept(IEditorPart activeEditor_p, ISelection selection_p);
	
	/**
	 * Set the focus on the element provided by <code>selection_p</code> in the <code>activeEditor_p</code>
	 * @param activeEditor_p the active {@link IEditorPart}
	 * @param selection_p the {@link ISelection} to use to change selection on <code>activeEditor_p</code>.
	 * @return True if selection is done with success, false otherwise.
	 */
	public boolean focusInEditor(IEditorPart activeEditor_p, ISelection selection_p);
}
