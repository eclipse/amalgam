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
import org.eclipse.sirius.table.metamodel.table.DTable;
import org.eclipse.sirius.viewpoint.DRepresentation;

/**
 *
 */
public class RelatedTableQuery extends AbstractRepresentationQuery {

	@Override
	public List<Object> compute(Object object_p) {
		List<Object> result = new ArrayList<Object>();
		if (object_p instanceof EObject)
		{
			EObject eObject = (EObject) object_p;
			Session session = getSession(eObject);
			
			if (null != session)
			{// There is an open session containing the object_p
				Collection<DRepresentation> allRepresentation = getAllRepresentation(eObject, session);
				if (allRepresentation != null && allRepresentation.isEmpty() == false)
				{
					for (DRepresentation dRepresentation : allRepresentation) 
					{
						if (dRepresentation instanceof DTable)
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

}
