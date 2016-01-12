/*******************************************************************************
 * Copyright (c)  2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.editor;

import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.forms.editor.IFormPage;

public class ActivityExplorerEditorPartListener implements IPartListener {
	
	private ActivityExplorerEditor editor;
	
	public ActivityExplorerEditorPartListener(ActivityExplorerEditor editor){
		this.editor = editor;
	}

	public void partActivated(IWorkbenchPart part) {
        if (editor == part) {
          IFormPage activePageInstance = editor.getActivePageInstance();
          if (activePageInstance != null && !activePageInstance.isActive())
        	  activePageInstance.setActive(true);
        }
      }

      /**
       * {@inheritDoc}
       */

      public void partBroughtToTop(IWorkbenchPart part) {
      }

      /**
       * {@inheritDoc}
       */

      public void partClosed(IWorkbenchPart part) {
      }

      /**
       * {@inheritDoc}
       */

      public void partDeactivated(IWorkbenchPart part) {
      }

      /**
       * {@inheritDoc}
       */
      public void partOpened(IWorkbenchPart part) {
      }
      
      public void dispose(){
    	  editor = null;
      }

}
