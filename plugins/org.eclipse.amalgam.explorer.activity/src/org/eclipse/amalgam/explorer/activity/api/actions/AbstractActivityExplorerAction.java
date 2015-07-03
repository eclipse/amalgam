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
package org.eclipse.amalgam.explorer.activity.api.actions;

import org.eclipse.amalgam.explorer.activity.internal.actions.util.PopupMenuLinkAdapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.business.api.session.Session;

/**
 * Base class to implement actions triggered by {@link PopupMenuLinkAdapter}.
 * 
 */
public abstract class AbstractActivityExplorerAction extends Action {
	/**
	 * project.
	 */
	private EObject _project;
	/**
	 * Sirius session.
	 */
	private Session _session;

	/**
	 * Constructor.
	 * 
	 * @param text_p
	 * @param image_p
	 * @param project_p
	 * @param session_p
	 */
	public AbstractActivityExplorerAction(String text_p, ImageDescriptor image_p, EObject project_p, Session session_p) {
		super(text_p, image_p);
		_project = project_p;
		_session = session_p;
	}

	/**
	 * @see org.eclipse.jface.action.Action#run()
	 */
	@Override
	public void run() {
		doRun(_project, _session);
	}

	/**
	 * Do run this action.
	 * 
	 * @param project_p
	 * @param session_p
	 */
	protected abstract void doRun(EObject project_p, Session session_p);
}
