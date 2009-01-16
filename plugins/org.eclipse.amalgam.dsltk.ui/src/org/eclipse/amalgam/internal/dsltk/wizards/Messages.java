/*******************************************************************************
 * Copyright (c) 2008 Borland Software Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Borland Software Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.internal.dsltk.wizards;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {

	private Messages() {
	}
	
	private static final String BUNDLE_NAME= "org.eclipse.amalgam.internal.dsltk.wizards.Messages";//$NON-NLS-1$

	public static String XpandWizard_description = null;
	public static String XpandWizard_title = null;
	public static String CreatingFolder = null;
	public static String NewProjectCreationOperation_creating = null;
	public static String DSLProjectWizard_title = null;
	public static String DSLProjectWizard_description = null;
	public static String DSLProjectWizard_op_error_create_message = null;
	public static String DSLProjectWizard_op_error_title = null;
	
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
