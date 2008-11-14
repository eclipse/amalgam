package org.eclipse.amalgam.examples.dnc.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * @generated
 */
public class Activator extends AbstractUIPlugin {

	/**
	 * @generated
	 */
	public static final String PLUGIN_ID = "org.eclipse.amalgam.examples.dnc.ui";

	/**
	 * @generated
	 */
	private static Activator plugin;

	/**
	 * @generated
	 */
	public Activator() {
	}

	/**
	 * @generated
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * @generated
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * @generated
	 */
	public static Activator getDefault() {
		return plugin;
	}
}
