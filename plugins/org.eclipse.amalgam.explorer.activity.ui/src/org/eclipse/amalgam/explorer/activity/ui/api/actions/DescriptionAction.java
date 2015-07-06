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
package org.eclipse.amalgam.explorer.activity.ui.api.actions;

import org.eclipse.swt.widgets.Shell;

/**
 * A concrete class of AbstractDescriptionAction
 * 
 *
 */
public class DescriptionAction extends AbstractDescriptionAction {

	public DescriptionAction(Shell shell_p, String description_p) {
		super(shell_p);
		this.description = description_p;
		setEnabled(null != getDescriptionContent());
	}

	private String description;

	@Override
	protected String getDescriptionContent() {
		return description;
	}

}
