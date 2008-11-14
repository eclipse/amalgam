/******************************************************************************
 * Copyright (c) 2006, 2008 Borland Software Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Richard Gronback (Borland) - initial API and implementation 
 *    Cherie Revells (IBM)
 ****************************************************************************/
package org.eclipse.amalgam.examples.mindmap.diagram.part;

import java.util.List;

import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.MapEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.Topic2EditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.edit.parts.TopicEditPart;
import org.eclipse.amalgam.examples.mindmap.diagram.providers.MindmapElementTypes;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class MindmapCreateSubtopicAction implements IObjectActionDelegate {

	public final static String ID = "org.eclipse.amalgam.examples.mindmap.popup.MindmapCreateSubtopicActionID";

	private ShapeNodeEditPart selectedElement;

	public void run(IAction action) {
		if (selectedElement == null) {
			return;
		}
		CompoundCommand cc = new CompoundCommand("Create Subtopic and Link");

		// Create the new topic for the other end.
		CreateViewRequest topicRequest = CreateViewRequestFactory
				.getCreateShapeRequest(MindmapElementTypes.Topic_2001,
						selectedElement.getDiagramPreferencesHint());
		MapEditPart mapEditPart = (MapEditPart) selectedElement.getParent();
		Command createTopicCmd = mapEditPart.getCommand(topicRequest);
		cc.add(createTopicCmd);

		// create the subtopics link command
		IAdaptable topicViewAdapter = (IAdaptable) ((List) topicRequest
				.getNewObject()).get(0);
		CreateConnectionViewAndElementRequest ccver = new CreateConnectionViewAndElementRequest(
				MindmapElementTypes.TopicSubtopics_4001,
				((IHintedType) MindmapElementTypes.TopicSubtopics_4001)
						.getSemanticHint(), selectedElement
						.getDiagramPreferencesHint());
		ICommand createSubTopicsCmd = new DeferredCreateConnectionViewAndElementCommand(
				ccver,
				new EObjectAdapter((EObject) selectedElement.getModel()),
				topicViewAdapter, selectedElement.getViewer());

		cc.add(new ICommandProxy(createSubTopicsCmd));
		selectedElement.getDiagramEditDomain().getDiagramCommandStack()
				.execute(cc);

		// Here, update view to subtopic
		final EditPartViewer viewer = selectedElement.getViewer();
		final EditPart ep = (EditPart) mapEditPart.getChildren().get(
				mapEditPart.getChildren().size() - 1);
		if (ep != null) {
			viewer.setSelection(new StructuredSelection(ep));
			viewer.reveal(ep);
			Display.getCurrent().syncExec(new Runnable() {
				public void run() {
					Request der = new Request(RequestConstants.REQ_DIRECT_EDIT);
					ep.performRequest(der);
				}
			});
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		selectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof TopicEditPart
					|| structuredSelection.getFirstElement() instanceof Topic2EditPart) {
				selectedElement = (ShapeNodeEditPart) structuredSelection
						.getFirstElement();
			}
		}
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
