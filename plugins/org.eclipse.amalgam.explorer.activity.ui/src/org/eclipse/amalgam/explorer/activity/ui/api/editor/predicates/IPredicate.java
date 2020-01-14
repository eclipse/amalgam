/*******************************************************************************
 * Copyright (c)  2006, 2020 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.activities.ExplorerActivity;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.CommonActivityExplorerPage;

public interface IPredicate {

  public default boolean isOk() {
    return true;
  }
  
	public default boolean isActivityOk(ExplorerActivity activity) {
	  return true;
	}

	public default boolean isPageOk(CommonActivityExplorerPage page) {
    return true;
  }
}
