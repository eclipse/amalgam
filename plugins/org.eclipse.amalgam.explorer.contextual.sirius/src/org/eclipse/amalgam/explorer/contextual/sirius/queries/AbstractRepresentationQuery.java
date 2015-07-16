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
package org.eclipse.amalgam.explorer.contextual.sirius.queries;

import java.util.Collection;

import org.eclipse.amalgam.explorer.contextual.core.query.IQuery;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

/**
 *
 */
public abstract class AbstractRepresentationQuery implements IQuery{

	/** Sirius representation file extension. **/
	protected static final String _AIRD_FILE_EXTENSION = "aird";
	
	/**
	 * @param representation_p
	 * @param element_p
	 * @return True by default. Derived classes can override this method to control 
	 * displaying the representation or not
	 */
	protected boolean isElementVisibleInRepresentation(DRepresentation representation_p, DRepresentationElement element_p){
		return true;
	}
	/**
	 * 
	 * @param element_p
	 * @param session_p
	 * @return
	 */
	protected Collection<DRepresentation> getAllRepresentation(EObject element_p, Session session_p){
		Collection<DRepresentation> representations = DialectManager.INSTANCE.getRepresentations(element_p, session_p);
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session_p);
		for (DRepresentation dRepresentation : allRepresentations) 
		{
			EList<DRepresentationElement> representationElements = dRepresentation.getRepresentationElements();
			for (DRepresentationElement dRepresentationElement : representationElements) 
			{
				if (EcoreUtil.equals(dRepresentationElement.getTarget(), element_p))
				{
					if (isElementVisibleInRepresentation(dRepresentation, dRepresentationElement))
					{
						representations.add(dRepresentation);
						break;
					}
				}
			}
		}
		return representations;
	}
	
	/**
	 * Return a candidate session for a given {@link EObject}
	 * @param eObject_p an {@link EObject}
	 * @return {@link Session} if it exist, null otherwise.
	 */
	protected Session getSession(EObject eObject_p){
		Session session = SessionManager.INSTANCE.getSession(eObject_p);
		
		if (null == session)
		{// Try the get a session for a representation file sharing the same name of the resource containing object_p
//			URI uri = eObject_p.eResource().getURI().trimFileExtension().appendFileExtension(_AIRD_FILE_EXTENSION);
//			session = SessionManager.INSTANCE.getSession(uri, new NullProgressMonitor());
			
			Collection<Session> sessions = SessionManager.INSTANCE.getSessions();
			for (Session iSession : sessions) 
			{
				Collection<Resource> sResources = iSession.getSemanticResources();
				for (Resource iResource : sResources) 
				{
					TreeIterator<EObject> allContents = iResource.getAllContents();
					while (allContents.hasNext()) 
					{
						EObject eObject = (EObject) allContents.next();
						if (EcoreUtil.equals(eObject, eObject_p))
							return iSession;
					}
				}
			}
		}
		return session;
	}
}
