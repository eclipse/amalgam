package org.eclipse.amalgam.examples.requirements.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private Messages() {
	}

	private static final String BUNDLE_NAME = "org.eclipse.amalgam.examples.requirements.ui.messages"; //$NON-NLS-1$

	public static String RunTransformationAction_message;

	public static String RunTransformationAction_title;

	public static String RequirementsProjectWizard_wizard_title;

	public static String RequirementsProjectWizard_perform_title;

	public static String RequirementsProjectWizard_error;

	public static String ProjectPage_title;

	public static String ProjectPage_descr;

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}
}
