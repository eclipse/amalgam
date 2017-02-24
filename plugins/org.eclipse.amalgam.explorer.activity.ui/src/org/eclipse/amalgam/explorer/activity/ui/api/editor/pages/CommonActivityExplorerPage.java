/*******************************************************************************
 * Copyright (c)  2006, 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.editor.pages;

import java.text.MessageFormat;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.IImageKeys;
import org.eclipse.amalgam.explorer.activity.ui.api.configuration.CommonActivityExplorerPageConfiguration;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
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
 * Base class to implement ActivityExplorer pages in an
 * {@link ActivityExplorerEditor}.
 */
public class CommonActivityExplorerPage extends FormPage implements IExecutableExtension, IOrdered, IVisibility, IPropertyListener {

    public static final int PROP_ACTIVE = 0x185;

    private static String ids;

    public static void setID(String id) {
        ids = id;
    }

    protected final CommonActivityExplorerPageConfiguration config = createConfiguration();

    private Image overviewImageOff;

    private Image overviewImageOn;

    public CommonActivityExplorerPage() {
        this(null, ids, ""); //$NON-NLS-1$
    }

    public CommonActivityExplorerPage(FormEditor editor, String id, String title) {
        super(editor, id, title);
    }

    protected CommonActivityExplorerPageConfiguration createConfiguration() {
        return new CommonActivityExplorerPageConfiguration();
    }

    @Override
    protected void createFormContent(IManagedForm managedForm) {
        FormToolkit toolkit = managedForm.getToolkit();
        toolkit.decorateFormHeading(managedForm.getForm().getForm());
        // For performance optimization.
        // managedForm.getForm().setDelayedReflow(true);
        getEditor().addPropertyListener(this);
    }

    @Override
    public SharedHeaderFormEditor getEditor() {
        return (SharedHeaderFormEditor) super.getEditor();
    }

    @Override
    public void setInitializationData(IConfigurationElement cfg, String propertyName, Object data) {
        super.setInitializationData(cfg, propertyName, data);

        parseConfiguration(cfg);
        setPartName(config.getTabName());

        String plugin_id = config.pluginId;
        if (config.getOverviewImageOffPath().equals(IImageKeys.IMAGE_DEFAULT_OVERVIEW_OFF)) {
            plugin_id = ActivityExplorerActivator.ID;
        }
        overviewImageOff = ActivityExplorerActivator.getDefault().getImage(plugin_id, config.getOverviewImageOffPath());
        if (config.getOverviewImageOnPath().equals(IImageKeys.IMAGE_DEFAULT_OVERVIEW_ON)) {
            plugin_id = ActivityExplorerActivator.ID;
        }
        overviewImageOn = ActivityExplorerActivator.getDefault().getImage(plugin_id, config.getOverviewImageOnPath());

        setIndex(config.getIndex());
    }

    private void parseConfiguration(IConfigurationElement cfig) {
        config.setTitle(ActivityExplorerExtensionManager.getTitle(cfig));
        config.setTabName(ActivityExplorerExtensionManager.getTabName(cfig));
        if (config.getTabName() == null) {
            config.setTabName(config.getTitle());
        }
        config.setOverview(ActivityExplorerExtensionManager.getOverviewElement(cfig) != null);
        config.pluginId = ActivityExplorerExtensionManager.getPluginId(cfig);
        if (config.isOverview()) {
            config.setOverviewImageOffPath(ActivityExplorerExtensionManager.getOverviewImageOff(cfig));
            config.setOverviewImageOnPath(ActivityExplorerExtensionManager.getOverviewImageOn(cfig));
            config.setOverviewText(ActivityExplorerExtensionManager.getOverviewDescription(cfig));
        }
        config.setPredicate(ActivityExplorerExtensionManager.getPredicate(cfig));

        String indice = ActivityExplorerExtensionManager.getIndex(cfig);
        try {
            this.config.setIndex(Integer.parseInt(indice));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(MessageFormat.format("Attribute ''{0}'' of page {1} must be an int, but was ''{2}''", ActivityExplorerExtensionManager.ATT_INDEX,
                    ActivityExplorerExtensionManager.getId(cfig), indice));
        }
    }

    public String getOverViewImageOnPath() {
        return config.getOverviewImageOnPath();
    }

    public String getOverViewImageOffPath() {
        return config.getOverviewImageOffPath();
    }

    public Image getOverViewImageOn() {
        return overviewImageOn;
    }

    public String getOverViewText() {
        return config.getOverviewText();
    }

    public Image getOverviewImageOff() {
        return overviewImageOff;
    }

    public boolean contributeToOverview() {
        return config.isOverview();
    }

    public void contributeToOverview(boolean contribute) {
        config.setOverview(contribute);
    }

    /**
     * Return true this page is visible.
     */
    @Override
    public boolean isVisible() {
        boolean result = ActivityExplorerActivator.getDefault().getPreferenceStore().getBoolean(getId());
        if (config.getPredicate() != null) {
            result &= config.getPredicate().isOk();
        }
        return result;
    }

    public int getPosition() {
        return config.getIndex();
    }

    public void setPosition(int index) {
        this.config.setIndex(index);
    }

    @Override
    public int getIndex() {
        return config.getIndex();
    }

    @Override
    public void setIndex(int index) {
        this.config.setIndex(index);
    }

    public int compareTo(IOrdered other) {
        int result = 1;
        if (null != other) {
            result = Integer.valueOf(getPosition()).compareTo(Integer.valueOf(other.getPosition()));
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
