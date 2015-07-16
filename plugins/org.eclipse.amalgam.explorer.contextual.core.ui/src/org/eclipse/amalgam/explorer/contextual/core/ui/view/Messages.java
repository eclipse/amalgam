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
package org.eclipse.amalgam.explorer.contextual.core.ui.view;

import org.eclipse.osgi.util.NLS;

/**
 * I18n support.
 */
public class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.eclipse.amalgam.explorer.contextual.core.ui.view.messages"; //$NON-NLS-1$
  /**
   * Text of the label for Current Elements explorer.
   */
  public static String ExplorerContextualView_Current_Element_Title;
  /**
   * The default title name for the Contextual Explorer. This title is displayed when no element is selected.
   */
  public static String ExplorerContextualView_Default_Name;
  public static String ExplorerContextualView_ListeningToPageSelectionEventsAction_Title;
  public static String ExplorerContextualView_ListeningToPageSelectionEventsAction_Tooltip;
  public static String ExplorerContextualView_ShowPatternsAction_Tooltip;
  public static String ExplorerContextualView_ShowDiagramsAction_Tooltip;
  public static String ExplorerContextualView_LimitateTreeExpansionAction_Tooltip;
  
  /**
   * Text of the label for Referenced Elements explorer.
   */
  public static String ExplorerContextualView_Referenced_Elements_Title;
  public static String ExplorerContextualView_Referencing_Elements_Title;
  static {
    // initialize resource bundle
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
    // Do nothing.
  }
}
