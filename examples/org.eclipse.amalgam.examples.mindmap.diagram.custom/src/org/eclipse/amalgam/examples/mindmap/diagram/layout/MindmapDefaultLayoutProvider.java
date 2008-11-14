/******************************************************************************
 * Copyright (c) 2006, 2007 Borland Software Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Richard Gronback (Borland) - initial API and implementation 
 ****************************************************************************/

package org.eclipse.amalgam.examples.mindmap.diagram.layout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicSubtopicsEditPart;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.draw2d.graph.Edge;
import org.eclipse.draw2d.graph.EdgeList;
import org.eclipse.draw2d.graph.Node;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ListItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.providers.LeftRightProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNode;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.ILayoutNodeOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.layout.LayoutType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * 
 * Custom provider that lays out the Mindmap Diagram in a left
 * to right manner.
 */

public class MindmapDefaultLayoutProvider extends LeftRightProvider {

	public static String DEFAULT_LAYOUT = "Default";

	public boolean provides(IOperation operation) {
		// enable this provider only on mindmap diagrams
		if (operation instanceof ILayoutNodeOperation) {
			Iterator<?> nodes = ((ILayoutNodeOperation) operation).getLayoutNodes().listIterator();
			if (nodes.hasNext()) {
				View node = ((ILayoutNode) nodes.next()).getNode();
				Diagram container = node.getDiagram();
				if (container == null || !(container.getType().equalsIgnoreCase("mindmap"))) //$NON-NLS-1$
					return false;
			}
		} else {
			return false;
		}
		IAdaptable layoutHint = ((ILayoutNodeOperation) operation).getLayoutHint();
		String layoutType = (String) layoutHint.getAdapter(String.class);
		return LayoutType.DEFAULT.equals(layoutType);
	}
	
	protected EdgeList build_edges(List selectedObjects, Map editPartToNodeDict) {

        EdgeList edges = new EdgeList();

        // Do "topdown" relationships first. Since they traditionally
        // go upward on a diagram, they are reversed when placed in the graph
        // for
        // layout. Also, layout traverses the arcs from each node in the order
        // of their insertion when finding a spanning tree for its constructed
        // hierarchy. Therefore, arcs added early are less likely to be
        // reversed.
        // In fact, since there are no cycles in these arcs, adding
        // them to the graph first should guarantee that they are never
        // reversed,
        // i.e., the inheritance hierarchy is preserved graphically.
        ArrayList objects = new ArrayList();
        objects.addAll(selectedObjects);
        ListIterator li = objects.listIterator();
        ArrayList notTopDownEdges = new ArrayList();
        boolean shouldHandleListItems = shouldHandleConnectableListItems();
        while (li.hasNext()) {
            EditPart gep = (EditPart) li.next();
            if (gep instanceof TopicSubtopicsEditPart) {
                ConnectionEditPart poly = (ConnectionEditPart) gep;

                if (layoutTopDown(poly)) {
                    EditPart from = poly.getSource();
                    EditPart to = poly.getTarget();
                    if (from instanceof IBorderItemEditPart)
                        from = from.getParent();
                    else if (shouldHandleListItems && from instanceof ListItemEditPart)
                        from = getFirstAnscestorinNodesMap(from, editPartToNodeDict);
                    if (to instanceof IBorderItemEditPart)
                        to = to.getParent();
                    else if (shouldHandleListItems && to instanceof ListItemEditPart)
                        to = getFirstAnscestorinNodesMap(to, editPartToNodeDict);
                    Node fromNode = (Node) editPartToNodeDict.get(from);
                    Node toNode = (Node) editPartToNodeDict.get(to);

                    if (fromNode != null && toNode != null
                        && !fromNode.equals(toNode)) {
                        addEdge(edges, poly, toNode, fromNode);
                    }
                }else{
                    notTopDownEdges.add(poly);
                }
            }
        }

        // third pass for all other connections
        li = notTopDownEdges.listIterator();
        while (li.hasNext()) {
            ConnectionEditPart poly = (ConnectionEditPart) li.next();
            EditPart from = poly.getSource();
            EditPart to = poly.getTarget();
            if (from instanceof IBorderItemEditPart)
                from = from.getParent();
            else if (shouldHandleListItems && from instanceof ListItemEditPart)
                from = getFirstAnscestorinNodesMap(from, editPartToNodeDict);
            if (to instanceof IBorderItemEditPart)
                to = to.getParent();
            else if (shouldHandleListItems && to instanceof ListItemEditPart)
                to = getFirstAnscestorinNodesMap(to, editPartToNodeDict);
            Node fromNode = (Node) editPartToNodeDict.get(from);
            Node toNode = (Node) editPartToNodeDict.get(to);
            
            if (fromNode != null && toNode != null
                && !fromNode.equals(toNode)) {
                addEdge(edges, poly, fromNode, toNode);
            }
        }
        return edges;
    }
	
	 private void addEdge(EdgeList edges, ConnectionEditPart connectionEP,
	            Node fromNode, Node toNode) {
	        Edge edge = new Edge(connectionEP, fromNode, toNode);
	        initializeEdge(connectionEP, edge);
	        
	        edges.add(edge);
	    }
	 
	 private EditPart getFirstAnscestorinNodesMap(EditPart editPart,Map editPartToNodeDict) {
	        EditPart ancestor =  editPart;
	        while (ancestor!=null){
	            if (editPartToNodeDict.get(ancestor)!=null)
	                return ancestor;
	            ancestor = ancestor.getParent();
	        }
	        return null;
	    }

}
