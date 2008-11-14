/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: OpenScenarioDBEditor.java,v 1.1 2008/11/14 17:38:22 rgronback Exp $
 */
package org.eclipse.amalgam.examples.scenario.diagram.db;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.amalgam.examples.scenario.Process;
import org.eclipse.amalgam.examples.scenario.ScenarioFactory;
import org.eclipse.amalgam.examples.scenario.diagram.edit.parts.ProcessEditPart;
import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioDiagramEditor;
import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioDiagramEditorPlugin;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.hibernate.resource.HibernateXMLResource;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

/**
 * Rather generic class which opens an editor using the static ID member in the
 * ScenarioDiagramDBEditor class.
 * 
 * @author mtaal@elver.org
 */
public class OpenScenarioDBEditor implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
		StoreController.getInstance().initializeDataStore();
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	public void run(IAction action) {

		try {
			initializeData();
			final IWorkbenchPage page = window.getActivePage();
			page.openEditor(new URIEditorInput(StoreController.DATABASE_URI), ScenarioDiagramEditor.ID);
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	// Ensure that the resource at least contains a Process and a Diagram object
	private void initializeData() {
		try {
			final Resource res = new HibernateXMLResource(StoreController.DATABASE_URI);
			res.load(Collections.EMPTY_MAP);
			boolean addMap = true;
			boolean addDiagram = true;
			Process process = null;
			for (Object o : res.getContents()) {
				if (o instanceof Process) {
					addMap = false;
					process = (Process) o;
				}
				if (o instanceof Diagram) {
					addDiagram = false;
				}
			}
			if (addMap) {
				process = ScenarioFactory.eINSTANCE.createProcess();
				res.getContents().add(process);
			}
			if (addDiagram) {
				Diagram diagram = ViewService.createDiagram(process, ProcessEditPart.MODEL_ID, ScenarioDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				res.getContents().add(diagram);
				diagram.setName("scenario");
				diagram.setElement(process);
			}
			if (addMap || addDiagram) {
				res.save(Collections.EMPTY_MAP);
			}
			res.unload();
		} catch (IOException e) {
			throw new IllegalStateException(e);
		}
	}
}