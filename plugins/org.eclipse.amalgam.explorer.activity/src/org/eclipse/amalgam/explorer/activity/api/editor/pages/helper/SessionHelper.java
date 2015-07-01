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
package org.eclipse.amalgam.explorer.activity.api.editor.pages.helper;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.amalgam.explorer.activity.internal.util.EcoreUtil2;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.danalysis.DAnalysisSession;

public class SessionHelper {
	public static IFile getFirstAnalysisFile(DAnalysisSession session_p) {
		IFile result = null;
		Resource resource = session_p.getSessionResource();

		// Precondition.
		if (null == resource) {
			return result;
		}
		result = WorkspaceSynchronizer.getFile(resource);
		return result;
	}

	/**
	 * Get the project (only one instance) for given session.
	 * 
	 * @param session_p
	 * @return must be not <code>null</code>.
	 */
	public static EObject getRootSemanticModel(Session session_p) {

		EObject result = null;
		Iterator<Resource> semanticResources = session_p.getSemanticResources().iterator();
		// Iterate over semantic resources to search for a project.
		while (semanticResources.hasNext()) {
			Resource semanticResource = semanticResources.next();
			result = semanticResource.getContents().get(0);
			break;
		}
		return result;
	}

	/**
	 * Get a session for given diagram file (i.e aird file).<br>
	 * Only compare the given file with the first diagram resource.
	 * 
	 * @param firstDiagramResourceFile_p
	 *            the file is expected to be the first diagram file contained in
	 *            a session.
	 * @return <code>null</code> if no session found among all active sessions.
	 */
	public static Session getSession(IFile firstDiagramResourceFile_p) {
		Session result = null;
		// Iterate over active sessions to search the ones that semantic
		// resources are contained by the project.
		if (firstDiagramResourceFile_p != null) {
			Iterator<Session> allActiveSessions = SessionManager.INSTANCE.getSessions().iterator();
			while (allActiveSessions.hasNext() && (null == result)) {
				Session session = allActiveSessions.next();
				if (session instanceof DAnalysisSession) {
					IFile sessionAnalysisFile = getFirstAnalysisFile((DAnalysisSession) session);
					if (firstDiagramResourceFile_p.equals(sessionAnalysisFile)) {
						// Found.
						result = session;
					}
				}
			}
		}
		return result;
	}

	/**
	 * Get a session for given analysis file.<br>
	 * 
	 * @param selectedElement_p
	 * @return <code>null</code> if no session found among all active sessions.
	 */
	public static Session getSessionForDiagramFile(IFile diagramResourceFile_p) {
		Session result = null;
		// Iterate over active sessions to search the ones that semantic
		// resources are contained by the project.
		Iterator<Session> allActiveSessions = SessionManager.INSTANCE.getSessions().iterator();
		while (allActiveSessions.hasNext() && (null == result)) {
			Session session = allActiveSessions.next();
			if (session instanceof DAnalysisSession) {
				if (isAnalysisFileInvolvedIn((DAnalysisSession) session, diagramResourceFile_p)) {
					// Found.
					result = session;
				}
			}
		}
		return result;
	}

	public static boolean isAnalysisFileInvolvedIn(DAnalysisSession session_p, IFile analysisFile_p) {
		boolean result = false;
		// Precondition.
		if ((null == session_p) || (null == analysisFile_p)) {
			return result;
		}
		// Get all resources involved in the session.
		Collection<Resource> allAnalysisResources = getAllAirdResources(session_p);

		Iterator<Resource> analysisResources = allAnalysisResources.iterator();
		while (analysisResources.hasNext()) {
			Resource resource = analysisResources.next();
			if (analysisFile_p.equals(EcoreUtil2.getFile(resource))) {
				result = true;
				break;
			}
		}
		return result;
	}

	/**
	 * Get all aird resources contained in specified session.
	 * 
	 * @param session_p
	 * @return a not <code>null</code> collection.
	 */
	public static Collection<Resource> getAllAirdResources(Session session_p) {
		Collection<Resource> allAnalysisResources = new HashSet<Resource>(session_p.getReferencedSessionResources());
		allAnalysisResources.add(session_p.getSessionResource());
		return allAnalysisResources;
	}
}
