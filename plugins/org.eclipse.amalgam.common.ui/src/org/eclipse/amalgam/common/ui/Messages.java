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
package org.eclipse.amalgam.common.ui;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {

	private Messages() {
		// Do not instantiate
	}
	
	private static final String BUNDLE_NAME= "org.eclipse.amalgam.common.ui.Messages";//$NON-NLS-1$

	public static String ShowSampleAction_title = null;
	public static String SampleWizard_title = null;
	public static String SampleWizard_overwrite = null;
	public static String SampleOperation_creating = null;
	public static String ReviewPage_title = null;
	public static String ReviewPage_desc = null;
	public static String ReviewPage_descContent = null;
	public static String ReviewPage_content = null;
	public static String ReviewPage_noSampleFound = null;
	public static String ProjectNamesPage_title = null;
	public static String ProjectNamesPage_desc = null;
	public static String ProjectNamesPage_projectName = null;
	public static String ProjectNamesPage_multiProjectName = null;
	public static String ProjectNamesPage_noSampleFound = null;
	public static String ProjectNamesPage_emptyName = null;
	public static String ProjectNamesPage_duplicateNames = null;
	public static String ShowSampleAction_msgTitle = null;
	public static String ShowSampleAction_msgDesc = null;
		
	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
