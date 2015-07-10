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
package org.eclipse.amalgam.explorer.contextual.sirius.selection;

import java.util.List;

import org.eclipse.amalgam.explorer.contextual.core.ui.view.ext.ISelectionHelper;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IWorkbenchPart;

public class SiriusSelectionHelper implements ISelectionHelper{

	@Override
	public Object getSelection(IWorkbenchPart part_p, ISelection selection_p, Object selectedObject) {
		Object result = null;
		if (selectedObject instanceof EditPart) 
		{
			// Selection of a graphical element in a GMF-based diagram editor.
			EditPart selectedEditPart = (EditPart) selectedObject;
			View view = (View) selectedEditPart.getModel();
			if (view.getElement() instanceof DSemanticDecorator) 
			{
				DSemanticDecorator diagram = (DSemanticDecorator) view.getElement();
				if (null != diagram) 
				{
					// diagram may be null when there is a note in the diagram
					// So here, there is a test to check whether this instance is null or not
					result = diagram.getTarget();
				}
			}
		} 
		else 
		{
			if (selectedObject instanceof DSemanticDecorator) 
			{
				DSemanticDecorator vpe = (DSemanticDecorator) selectedObject;
				result = vpe.getTarget();
			} 
			else 
			{
				if (selectedObject instanceof DRepresentationElement) 
				{
					DRepresentationElement vpe = (DRepresentationElement) selectedObject;
					List<EObject> elements = vpe.getSemanticElements();
					for (EObject element : elements) 
						result = element;
				} 
			}
		}
		
		return result;
	}

}
