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
package org.eclipse.amalgam.explorer.activity.internal.viewer.diagram.actions;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "org.eclipse.amalgam.explorer.activity.internal.viewer.diagram.actions.messages"; //$NON-NLS-1$
	public static String CloneAction_0;
	public static String DeleteRepresentationAction_2;
	public static String DeleteRepresentationAction_3;
	public static String CloneDiagramCommand_0;
	public static String MoveRepresentationAction_1;
	public static String MoveRepresentationAction_2;
	public static String RenameRepresentationAction_0;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
