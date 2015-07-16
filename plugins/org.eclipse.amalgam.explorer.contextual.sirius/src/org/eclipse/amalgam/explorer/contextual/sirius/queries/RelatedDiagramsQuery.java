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

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationElement;

/**
 *
 */
public class RelatedDiagramsQuery extends AbstractRepresentationQuery {

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.core.query.IQuery#compute(java.lang.Object)
	 */
	@Override
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		if (object_p instanceof EObject)
		{
			EObject eObject = (EObject) object_p;
			Session session = getSession(eObject);
			
			if (null != session && session.isOpen())
			{// There is an open session containing the object_p
				Collection<DRepresentation> allRepresentation = getAllRepresentation(eObject, session);
				if (allRepresentation != null && allRepresentation.isEmpty() == false)
				{
					for (DRepresentation dRepresentation : allRepresentation) 
					{
						if (dRepresentation instanceof DSemanticDiagram)
						{
							result.add(dRepresentation);
						}
					}
				}
			}
			else
			{// There is no open session containing the object_p
				
			}
		}
		return result;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.amalgam.explorer.contextual.sirius.queries.AbstractRepresentationQuery#isElementVisibleInRepresentation(org.eclipse.sirius.viewpoint.DRepresentation, org.eclipse.sirius.viewpoint.DRepresentationElement)
	 */
	@Override
	protected boolean isElementVisibleInRepresentation(DRepresentation representation_p, DRepresentationElement element_p) {
		// check if a diagram element is visible. This means that is owning layer is active
		if (representation_p instanceof DSemanticDiagram && element_p instanceof DDiagramElement)
		{
			DDiagramElement diagramElement = (DDiagramElement) element_p;
			return diagramElement.isVisible();
		}
		
		return false;
	}

}
