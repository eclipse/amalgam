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
package org.eclipse.amalgam.explorer.contextual.sirius.ui.focus;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.view.focus.IFocusInEditor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.sirius.table.metamodel.table.DLine;
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.table.metamodel.table.LineContainer;
import org.eclipse.sirius.table.ui.tools.internal.editor.DTableEditionEditor;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.ui.IEditorPart;

/**
 *
 */
@SuppressWarnings("restriction")
public class FocusInTableEditor implements IFocusInEditor {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.view.focus.IFocusInEditor#accept(org.eclipse.ui.IEditorPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean accept(IEditorPart activeEditor_p, ISelection selection_p) {
		Object firstElement = ((IStructuredSelection) selection_p).getFirstElement();
		boolean selectableElement  = (firstElement instanceof EObject) && (false == firstElement instanceof DRepresentation);
		return activeEditor_p instanceof DTableEditionEditor && selectableElement;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.view.focus.IFocusInEditor#focusInEditor(org.eclipse.ui.IEditorPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean focusInEditor(IEditorPart activeEditor_p, ISelection selection_p) {
		DTableEditionEditor tableEditor = (DTableEditionEditor) activeEditor_p;
		DRepresentation representation = tableEditor.getRepresentation();
		if (representation instanceof DTable)
		{
			DTable table = (DTable) representation;
			EList<DRepresentationElement> tableElements = table.getRepresentationElements();
			for (DRepresentationElement dRepresentationElement : tableElements) 
			{
				if (dRepresentationElement instanceof DLine)
				{
					DLine dLine = (DLine) dRepresentationElement;
					EObject target = dLine.getTarget();
					IStructuredSelection selection = (IStructuredSelection) selection_p;
					Object selectionElement = selection.getFirstElement();
					if (null != selectionElement && EcoreUtil.equals(target, (EObject) selectionElement))
					{
						if (dLine.isVisible())
						{
							// 1. Construct a List containing all parents of the selected DLine
							List<Object> parents = new ArrayList<Object>();
							parents.add(dLine);
							while (null != dLine.getContainer()) 
							{
								LineContainer lineContainer = dLine.getContainer();
								if (lineContainer instanceof DLine)
								{
									// Continue to loop over parents 
									dLine = (DLine) lineContainer;
									parents.add(0, dLine);
								}
								else
								{
									// Break the while loop because current element in not a DLine. this means 
									// that the element a DTableSpec object  
									break;
								}
							}
							
							// 2. Create a TreePath containing all parents of the selected DLine
							TreePath treePath = new TreePath(parents.toArray());
							// 3. Create a TreeSelection.
							TreeSelection treeSelection = new TreeSelection(treePath);
							// 4. Fire selection and reveal of the selected DLine
							tableEditor.getTableViewer().setSelection(treeSelection, true);
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}
