/******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.provider;

/**
 */
public interface IExplorerContentProvider {
  /**
   * Explorer IDs.
   */
  static String ID_CURRENT_CP = "CurrentElementExplorer"; //$NON-NLS-1$
  static String ID_REFERENCED_CP = "ReferencedElementExplorer"; //$NON-NLS-1$
  static String ID_REFERENCING_CP = "ReferencingElementExplorer"; //$NON-NLS-1$

  /**
   * IdAccessor
   * @return
   */
  String getExplorerId();
}
