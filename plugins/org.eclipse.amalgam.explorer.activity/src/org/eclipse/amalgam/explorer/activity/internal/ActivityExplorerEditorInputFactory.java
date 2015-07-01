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
package org.eclipse.amalgam.explorer.activity.internal;

import org.eclipse.amalgam.explorer.activity.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.IElementFactory;
import org.eclipse.ui.IMemento;

/**
 * Activity Explorer editor input factory.
 * 
 */
public class ActivityExplorerEditorInputFactory implements IElementFactory {
	/**
	 * Id of the factory used to create {@link ActivityExplorerEditorInput}
	 */
	public static final String ID = ActivityExplorerEditorInputFactory.class.getName();

	/**
	 * @see org.eclipse.ui.IElementFactory#createElement(org.eclipse.ui.IMemento)
	 */
	public IAdaptable createElement(IMemento memento_p) {
		return ActivityExplorerEditorInput.create(memento_p);
	}
}
