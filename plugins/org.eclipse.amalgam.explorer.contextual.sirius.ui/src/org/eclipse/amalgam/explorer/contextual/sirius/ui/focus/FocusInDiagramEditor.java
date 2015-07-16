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

import java.util.Iterator;
import java.util.List;

import org.eclipse.amalgam.explorer.contextual.view.focus.IFocusInEditor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.diagram.DDiagram;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.business.api.query.DDiagramElementQuery;
import org.eclipse.sirius.diagram.ui.edit.api.part.IDiagramEdgeEditPart;
import org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditor;
import org.eclipse.sirius.diagram.ui.tools.api.editor.DDiagramEditor;
import org.eclipse.sirius.diagram.ui.tools.api.part.IDiagramDialectGraphicalViewer;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;

/**
 *
 */
public class FocusInDiagramEditor implements IFocusInEditor {
	/** The opened diagram editor **/
	private SiriusDiagramEditor _diagramEditor = null;
	
	/** **/
	private IDiagramGraphicalViewer _diagramGraphicalViewer;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.view.focus.IFocusInEditor#accept(org.eclipse.ui.IEditorPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean accept(IEditorPart activeEditor_p, ISelection selection_p) {
		Object firstElement = ((IStructuredSelection) selection_p).getFirstElement();
		boolean selectableElement  = (firstElement instanceof EObject) && (false == firstElement instanceof DRepresentation);
		return activeEditor_p instanceof DDiagramEditor && selectableElement;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.view.focus.IFocusInEditor#focusInEditor(org.eclipse.ui.IEditorPart, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public boolean focusInEditor(IEditorPart activeEditor_p, ISelection selection_p) {
		initdiagramEditor();
		Object firstElement = ((IStructuredSelection)selection_p).getFirstElement();
		DSemanticDecorator views = getView((EObject) firstElement);
		boolean result = true;
		if (null != views)
		{
			result = selectViewsInEditor(views);
		}
		else
		{
			result = false;
		}
		_diagramEditor = null;
		_diagramGraphicalViewer = null;
		return result;
	}
	

	/**
	 * Find a {@link DSemanticDecorator} in the current open diagram editor.
	 * @param semantic_p the selected {@link EObject} element in the Contextual Explorer View.
	 * @return If it exists, the corresponding {@link DSemanticDecorator} available in the opened diagram editor.
	 */
	protected DSemanticDecorator getView(EObject semantic_p) {
		if (null != _diagramEditor) 
		{
			DSemanticDiagram diagram = (DSemanticDiagram) _diagramEditor.getDiagram().getElement();
			EList<DRepresentationElement> representationElements = diagram.getRepresentationElements();
			for (DRepresentationElement dRepresentationElement : representationElements) 
			{
				EObject target = dRepresentationElement.getTarget();
				if (EcoreUtil.equals(target, semantic_p))
					return dRepresentationElement;
			}
		}
		return null;
	}

	/**
	 * Focus on the <code>view_p</code>.
	 * @param view_p a {@link DSemanticDecorator} to focus on in the current open diagram editor.
	 */
	protected boolean selectViewsInEditor(DSemanticDecorator view_p){
		if (view_p == null) 
		{
			//ShowInDiagramAction_UnknownElement_Message
			return false;
		} 
		else 
		{
			if (view_p instanceof DDiagramElement) 
			{
				DDiagramElementQuery query = new DDiagramElementQuery((DDiagramElement) view_p);
				if (query.isFolded() || query.isHidden() || query.isCollapsed() || query.isFiltered()) 
				{
					return false;
				} 
				
				IGraphicalEditPart selectedPart = getGraphicalPart(view_p);
				if (null == selectedPart) 
				{
					return false;
				} 
				else 
				{
					_diagramGraphicalViewer.select(selectedPart);
					_diagramGraphicalViewer.reveal(selectedPart);
					return true;
				}
			} 
			else
			{
				if (view_p instanceof DDiagram) 
				{
					// ShowInDiagramAction_UnknownElement_Message);
				}
				return false;
			}
		}
	}
	
	/**
	 * @param view_p a {@link DSemanticDecorator} to focus on in the current open diagram editor.
	 * @return the <code>view_p</code> corresponding {@link IGraphicalEditPart}
	 */
	protected IGraphicalEditPart getGraphicalPart(DSemanticDecorator view_p) {
		//A crossReferencer should be enough to retrieve these elements, but in some buggy case, 2 GMF diagrams for one DDiagram
		IGraphicalEditPart graphicalEditPart = null;
		if (null != _diagramEditor) 
		{
			// Check it is a Sirius one.
			if (_diagramGraphicalViewer instanceof IDiagramDialectGraphicalViewer) 
			{
				IDiagramDialectGraphicalViewer dialectViewer = (IDiagramDialectGraphicalViewer) _diagramGraphicalViewer;
				// Search all edit parts linked to selected object.
				List<IGraphicalEditPart> editParts = dialectViewer.findEditPartsForElement(view_p.getTarget(), IGraphicalEditPart.class);
				// Iterate over retrieved edit parts to remove the ones related to 'label' edit part.
				for (Iterator<IGraphicalEditPart> iterator = editParts.iterator(); iterator.hasNext();) 
				{
					IGraphicalEditPart editPart = iterator.next();
					// Filter out label edit part.
					
					if (false == editPart.isSelectable()) 
					{
						iterator.remove();
					}
				}

				if (editParts.size() == 1) 
				{
					// Select directly this one.
					graphicalEditPart = editParts.get(0);
				} 
				else 
				{
					// Multiple edit parts are found.
					// In some cases, 2 UI representations can point to the same target e.g an DEdge and a AbstractDNode.
					// Priority is done to the AbstractDNode vs an DEdge.
					for (IGraphicalEditPart currentGraphicalEditPart : editParts) 
					{
						if (!(currentGraphicalEditPart instanceof IDiagramEdgeEditPart)) 
						{
							graphicalEditPart = currentGraphicalEditPart;
							break;
						}
					}
				}
			}
		}
		return graphicalEditPart;
	}
	
	/**
	 * initialize {@link #_diagramEditor} and  {@link #_diagramGraphicalViewer} properties.
	 */
	private void initdiagramEditor(){
		IEditorPart activeEditor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if ((null != activeEditor) && (activeEditor instanceof SiriusDiagramEditor)) 
		{
			_diagramEditor = (SiriusDiagramEditor) activeEditor;
			_diagramGraphicalViewer = _diagramEditor.getDiagramGraphicalViewer();
		}
	}
}
