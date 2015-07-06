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
package org.eclipse.amalgam.explorer.activity.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.sirius.table.metamodel.table.provider.TableUIPlugin;
import org.eclipse.sirius.viewpoint.provider.SiriusEditPlugin;
import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Image constants definition.
 * 
 */
public interface IImageKeys {

	/**
	 * Image Descriptor for new diagram creation.
	 */
	public final static ImageDescriptor IMAGE_DESCRIPTOR_NEW_DIAGRAM = ActivityExplorerActivator.imageDescriptorFromPlugin(
			SiriusEditPlugin.ID, "/icons/full/obj16/DAnalysis.gif"); //$NON-NLS-1$
	/**
	 * Image Descriptor for new diagram creation.
	 */
	public final static ImageDescriptor IMAGE_DESCRIPTOR_NEW_TABLE = AbstractUIPlugin.imageDescriptorFromPlugin(
			TableUIPlugin.ID, "/icons/full/obj16/CrossTableDescription.gif"); //$NON-NLS-1$
	/**
	 * Image Descriptor for description actions.
	 */
	public final static String IMAGE_DESCRIPTOR_DESCRIPTION = "icons/full/obj16/showdesc_co.gif"; //$NON-NLS-1$

	/**
	 * Synchronize the viewer according to a section image id.
	 */
	public final static String IMG_SYNCRONIZE_VIEWER = "icons/full/obj16/synced.gif"; //$NON-NLS-1$
	/**
	 * ActivityExplorer Overview image id.
	 */
	public final static String IMG_MENU_OVERVIEW = "icons/full/obj16/menu-overview.gif"; //$NON-NLS-1$s

	/**
	 * Overview OFF Image (if not specified)
	 */
	public final static String IMAGE_DEFAULT_OVERVIEW_ON = "icons/full/overview/logo_on.png"; //$NON-NLS-1$

	/**
	 * Overview OFF Image (if not specified)
	 */
	public final static String IMAGE_DEFAULT_OVERVIEW_OFF = "icons/full/overview/logo_off.png"; //$NON-NLS-1$
}
