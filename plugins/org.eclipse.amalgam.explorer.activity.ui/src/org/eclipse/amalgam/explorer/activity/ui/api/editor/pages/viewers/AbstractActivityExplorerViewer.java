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
package org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.viewers;

import java.util.Collections;

import org.eclipse.amalgam.explorer.activity.ui.api.actions.ViewerFilteringAction;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.BasicSessionActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.CommonActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.Messages;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.sections.ActivityExplorerSection;
import org.eclipse.amalgam.explorer.activity.ui.internal.Couple;
import org.eclipse.amalgam.explorer.activity.ui.internal.DelegatedViewerFilter;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.Section;

public abstract class AbstractActivityExplorerViewer implements IPropertyListener {

  /** Parent Page **/
  protected BasicSessionActivityExplorerPage page;

  /** Jface Viewer **/
  protected TreeViewer viewer;

  /**
   * viewer filter.
   */
  private DelegatedViewerFilter viewerFilter;

  /**
   * UI action that triggers a diagram viewer filtering operation.
   */
  private ViewerFilteringAction sectionActionDrivingFilter;

  public AbstractActivityExplorerViewer(BasicSessionActivityExplorerPage page_p) {
    page = page_p;
    page.addPropertyListener(this);
  }

  protected abstract String getViewerSectionTitle();

  protected abstract Object getInput();

  protected abstract ILabelProvider getLabelProvider();

  protected abstract IContentProvider getContentProvider();

  /**
   * Create an action to remove the section filter.
   * @return
   */
  public Action getResetSectionFilter() {
    Action resetSectionFilter = new Action() {
      /**
       * @see org.eclipse.jface.action.Action#run()
       */
      @SuppressWarnings("synthetic-access")
      @Override
      public void run() {
        viewerFilter.setDelegatedFilter(null);
        uncheckSectionFilterAction();
        getViewer().refresh();
      }

      private StructuredViewer getViewer() {
        return viewer;
      }
    };
    resetSectionFilter.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
    resetSectionFilter.setToolTipText(Messages.BasicSessionActivityExplorerPage_2);
    return resetSectionFilter;
  }

  /**
   * Set a viewer filter on the diagram viewer.
   * @param filter_p <code>null</code> means reset the filter.
   * @param action_p
   */
  public void setViewerFilter(ViewerFilteringAction action_p) {

    final ViewerFilter filter_p = action_p != null ? getViewerFilter(action_p.getSection()) : null;

    // If given filter is null that means reset the filter.
    if (null == filter_p) {
      getResetSectionFilter().run();
      return;
    }

    viewerFilter.setDelegatedFilter(filter_p);
    Control control = viewer.getControl();

    try {
      // Switch off redraw
      control.setRedraw(false);
      viewer.collapseAll();
      viewer.refresh();
      viewer.expandAll();

      // Uncheck the previous action's section that drove the filter.
      uncheckSectionFilterAction();
      // Keep a reference on the action's section that drives the filter.
      sectionActionDrivingFilter = action_p;
    } finally {
      // Finally, redraw again.
      control.setRedraw(true);
    }
  }

  protected ViewerFilter getViewerFilter(ActivityExplorerSection section) {
    return null;
  }

  public Couple<TreeViewer, Section> createViewer(Composite viewerContainer_p, IManagedForm managedForm_p) {
    // Create the section.
    Couple<Section, Composite> section = FormHelper.createSectionWithDescription(managedForm_p.getToolkit(), viewerContainer_p, getViewerSectionTitle(), null);
    FormHelper.createSectionToolbar(section.getKey(), Collections.singletonList(getResetSectionFilter()));
    section.getKey().setLayoutData(new GridData(GridData.FILL_BOTH));
    // Create a tree viewer with a regular expression filter.
    PatternFilter patternFilter = new PatternFilter();

    FilteredTree filteredTree = new FilteredTree(section.getValue(), SWT.NONE | SWT.SINGLE | SWT.BORDER, patternFilter, true);

    managedForm_p.getToolkit().adapt(filteredTree);
    // Get the tree viewer.
    final TreeViewer treeViewer = filteredTree.getViewer();
    // Add double click listener to open double-clicked diagrams.
    addListenersOnViewer(treeViewer);
    // Add the filter driven by section.
    viewerFilter = new DelegatedViewerFilter();
    treeViewer.addFilter(viewerFilter);
    // Set content provider.
    treeViewer.setContentProvider(getContentProvider());
    // Set label provider.
    treeViewer.setLabelProvider(getLabelProvider());
    // Auto expand the root node.
    treeViewer.setAutoExpandLevel(2);
    viewer = treeViewer;
    // Set the initial input. Also make sure to refresh the viewer if
    // underlying
    // resources change.

    treeViewer.setInput(getInput());

    // Forward selection changes to the editor site selection provider to
    // notify the platform (e.g property view).
    treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
      /**
       * {@inheritDoc}
       */
      public void selectionChanged(SelectionChangedEvent event_p) {
        page.getEditorSite().getSelectionProvider().setSelection(event_p.getSelection());
      }
    });
    // Make a context menu for the tree viewer.
    initMenuToViewer(treeViewer);
    return new Couple<TreeViewer, Section>(treeViewer, section.getKey());
  }

  /**
   * Uncheck the previous action's section that drove the filter.
   */
  private void uncheckSectionFilterAction() {
    if (null != sectionActionDrivingFilter) {
      sectionActionDrivingFilter.setChecked(false);
      sectionActionDrivingFilter = null;
    }
  }

  protected abstract void addListenersOnViewer(TreeViewer viewer);

  /**
   * Refresh the diagram viewer.
   */
  public void refresh() {
    if ((page != null) && page.isActive()) {
      if ((null != viewer) && !viewer.getControl().isDisposed()) {
        viewer.refresh();
      }
    }
  }

  /**
   * Dispose viewer
   */
  public void dispose() {
    viewer.getControl().dispose();
  }

  /**
   * Make a contextual menu for specified viewer.
   * @param treeViewer_p
   */
  protected MenuManager initMenuToViewer(final TreeViewer treeViewer_p) {
    MenuManager contextMenuManager = new MenuManager("viewerPopup"); //$NON-NLS-1$

    Control control = treeViewer_p.getControl();
    // Add here some actions.
    declareViewerActions(contextMenuManager, treeViewer_p);
    Menu contextMenu = contextMenuManager.createContextMenu(control);
    control.setMenu(contextMenu);
    // Hook the menu into the Workbench and its declarative action
    // mechanisms.
    page.getEditorSite().registerContextMenu(contextMenuManager, treeViewer_p);
    return contextMenuManager;
  }

  /**
   * Declare viewer actions.<br>
   * This methods is called eache time the menu is pop-up.
   * @param contextMenuManager_p
   * @param treeViewer_p
   */
  protected abstract void declareViewerActions(MenuManager contextMenuManager_p, TreeViewer treeViewer_p);

  @Override
  public void propertyChanged(Object source, int propId) {
    if (CommonActivityExplorerPage.PROP_ACTIVE == propId) {
      refresh();
    }
    if (IEditorPart.PROP_DIRTY == propId) {
      refresh();
    }
  }
}
