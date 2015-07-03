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
package org.eclipse.amalgam.explorer.activity.api.dialog;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.widgets.FormText;

/**
 * 
 * Defined a Dialog for EMF Objects that opens a popup dialog to display content
 * in a {@link FormText}
 * 
 * 
 */
public class EMFSelectionDialog extends SelectionDialog {

	public EMFSelectionDialog(Shell parent, EObject content, ViewerFilter filter) {

		super(parent, content, (ILabelProvider) new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE)),
				(IContentProvider) new AdapterFactoryContentProvider(new ComposedAdapterFactory(
						ComposedAdapterFactory.Descriptor.Registry.INSTANCE)), filter, null);

	}

	public EMFSelectionDialog(Shell parent, EObject content, ViewerFilter filter, String title) {

		super(parent, content, (ILabelProvider) new AdapterFactoryLabelProvider(new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE)),
				(IContentProvider) new AdapterFactoryContentProvider(new ComposedAdapterFactory(
						ComposedAdapterFactory.Descriptor.Registry.INSTANCE)), filter, title);

	}
}
