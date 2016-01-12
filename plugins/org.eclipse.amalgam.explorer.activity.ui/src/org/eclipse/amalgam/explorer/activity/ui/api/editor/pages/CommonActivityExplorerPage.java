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
package org.eclipse.amalgam.explorer.activity.ui.api.editor.pages;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.IImageKeys;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.ui.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IOrdered;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IVisibility;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.editor.SharedHeaderFormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;

/**
 * Base class to implement ActivityExplorer pages in an {@link ActivityExplorerEditor}.
 */
public class CommonActivityExplorerPage extends FormPage implements IExecutableExtension, IOrdered, IVisibility, IPropertyListener {

  private boolean overview;
  private Image overviewImageOff;
  private String overviewText;
  private Image overviewImageOn;
  private String overviewImageOnPath;
  private String overviewImageOffPath;
  protected IPredicate predicate;

  public static final int PROP_ACTIVE = 0x185;

  private int index;

  private static String ids;

  public static void setID(String id) {
    ids = id;
  }

  public CommonActivityExplorerPage() {
    this(null, ids, ""); //$NON-NLS-1$
  }

  public CommonActivityExplorerPage(FormEditor editor, String id, String title) {
    super(editor, id, title);

  }

  /**
   * @see org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui.forms.IManagedForm)
   */
  @Override
  protected void createFormContent(IManagedForm managedForm) {
    FormToolkit toolkit = managedForm.getToolkit();
    toolkit.decorateFormHeading(managedForm.getForm().getForm());
    // For performance optimization.
    // managedForm.getForm().setDelayedReflow(true);

    getEditor().addPropertyListener(this);

  }

  /**
   * @see org.eclipse.ui.forms.editor.FormPage#getEditor()
   */
  @Override
  public SharedHeaderFormEditor getEditor() {
    return (SharedHeaderFormEditor) super.getEditor();
  }

  @Override
  public void setInitializationData(IConfigurationElement cfig, String propertyName, Object data) {

    super.setInitializationData(cfig, propertyName, data);

    String title = ActivityExplorerExtensionManager.getTitle(cfig);
    String tabName = ActivityExplorerExtensionManager.getTabName(cfig);

    if (tabName == null) {
      tabName = title;
    }
    setPartName(tabName);

    overview = ActivityExplorerExtensionManager.getOverviewElement(cfig) != null;
    if (overview) {

      overviewImageOffPath = ActivityExplorerExtensionManager.getOverviewImageOff(cfig);
      overviewImageOnPath = ActivityExplorerExtensionManager.getOverviewImageOn(cfig);

      String plugin_id = ActivityExplorerExtensionManager.getPluginId(cfig);

      if ((overviewImageOffPath.equals(IImageKeys.IMAGE_DEFAULT_OVERVIEW_OFF))) {
        plugin_id = ActivityExplorerActivator.ID;
      }

      setOverviewImageOff(ActivityExplorerActivator.getDefault().getImage(plugin_id, overviewImageOffPath));

      if ((overviewImageOnPath.equals(IImageKeys.IMAGE_DEFAULT_OVERVIEW_ON))) {
        plugin_id = ActivityExplorerActivator.ID;
      }

      setOverviewImageOn(ActivityExplorerActivator.getDefault().getImage(plugin_id, overviewImageOnPath));

      setOverViewText(ActivityExplorerExtensionManager.getOverviewDescription(cfig));
    }

    predicate = ActivityExplorerExtensionManager.getPredicate(cfig);

    String indice = ActivityExplorerExtensionManager.getIndex(cfig);
    setIndex(Integer.parseInt(indice));
  }

  private void setOverviewImageOn(Image image) {
    overviewImageOn = image;

  }

  public String getOverViewImageOnPath() {
    return overviewImageOnPath;

  }

  public String getOverViewImageOffPath() {
    return overviewImageOffPath;

  }

  public Image getOverViewImageOn() {
    return overviewImageOn;

  }

  private void setOverViewText(String text) {
    overviewText = text;

  }

  public String getOverViewText() {
    return overviewText;

  }

  private void setOverviewImageOff(Image image) {
    overviewImageOff = image;
  }

  public Image getOverviewImageOff() {
    return overviewImageOff;
  }

  public boolean contributeToOverview() {
    return overview;
  }

  public void contributeToOverview(boolean contribute) {
    overview = contribute;
  }

  /**
   * Return true this page is visible.
   */
  @Override
  public boolean isVisible() {
    boolean result = ActivityExplorerActivator.getDefault().getPreferenceStore().getBoolean(getId());

    if (predicate != null) {
      result &= predicate.isOk();
    }
    return result;
  }

  public int getPosition() {
    return index;
  }

  public void setPosition(int index) {
    this.index = index;

  }

  @Override
  public int getIndex() {
    return index;
  }

  @Override
  public void setIndex(int index) {
    this.index = index;

  }

  public int compareTo(IOrdered arg0) {
    int result = 1;
    if (null != arg0) {
      result = new Integer(getPosition()).compareTo(new Integer(arg0.getPosition()));
    }
    return result;

  }

  @Override
  public void setActive(boolean active) {
    super.setActive(active);
    if (active) {
      markAsActive();
    }
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.ui.IPropertyListener#propertyChanged(java.lang.Object, int)
   */
  @Override
  public void propertyChanged(Object source, int propId) {
    if (IEditorPart.PROP_DIRTY == propId) {
      markAsDirty();
    }
  }

  public void markAsDirty() {
    firePropertyChange(IEditorPart.PROP_DIRTY);
  }

  public void markAsActive() {
    firePropertyChange(PROP_ACTIVE);
  }

}
