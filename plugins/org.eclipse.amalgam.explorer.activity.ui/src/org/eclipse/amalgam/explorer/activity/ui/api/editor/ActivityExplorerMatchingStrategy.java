/*******************************************************************************
 * Copyright (c) 2018 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.editor;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorMatchingStrategy;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;

/**
 * A matching editor strategy allowing to match an activity explorer editor belonging to the same file. 
 * It will prevent to open a secondary editor if we call openEditor with an input related to the same file.
 */
public class ActivityExplorerMatchingStrategy implements IEditorMatchingStrategy {

	@Override
	public boolean matches(IEditorReference editorRef, IEditorInput input) {
		try {
			IEditorInput u = editorRef.getEditorInput();
			if (u instanceof FileEditorInput && input instanceof FileEditorInput) {
				FileEditorInput fu = (FileEditorInput) u;
				FileEditorInput fi = (FileEditorInput) input;
				return fu.getURI() != null && fu.getURI().equals(fi.getURI());
			}
			return input != null && input.equals(u);
		} catch (PartInitException e) {
			return false;
		}
	}

}
