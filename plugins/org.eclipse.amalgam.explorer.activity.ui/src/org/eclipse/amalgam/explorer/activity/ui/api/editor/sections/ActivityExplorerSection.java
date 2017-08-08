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
package org.eclipse.amalgam.explorer.activity.ui.api.editor.sections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.configuration.SectionConfiguration;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.activities.ExplorerActivity;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.Couple;
import org.eclipse.amalgam.explorer.activity.ui.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IOrdered;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IVisibility;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * Represents a titled section inside a page, which can contain a number of
 * activities.
 */
public class ActivityExplorerSection implements IVisibility, IOrdered, IPropertyChangeListener {
    /**
     * The configuration for this section.
     */
    private final SectionConfiguration config;

    /**
     * The preference store where to look for visibility configuration (can be
     * changed the the end-user).
     */
    private final IPreferenceStore preferenceStore = ActivityExplorerActivator.getDefault().getPreferenceStore();

    /**
     * The parent page in which the section is displayed.
     */
    private IFormPage page;

    /**
     * The toolkit to use for widget creation & styling.
     */
    private FormToolkit toolkit;

    /**
     * The actual widget representing the section in the UI.
     */
    private Section widget;

    /**
     * The composite for the content of the section.
     */
    private Composite activityContainer;

    /**
     * Constructor.
     *
     * @param cfg
     *            the configuration.
     */
    public ActivityExplorerSection(SectionConfiguration cfg) {
        this.config = cfg;
    }

    public String getId() {
        return this.config.getId();
    }

    public String getName() {
        return this.config.getName();
    }

    /**
     * Get all activities defined for the Section.
     *
     * @return Set<ExplorerActivity>
     */
    public Set<ExplorerActivity> getActivities() {
        return this.config.activities;
    }

    /**
     * Return true if the section should support the filtering.
     *
     * @return
     */
    public boolean isFiltering() {
        return this.config.isFiltering();
    }

    /**
     * Get its description.
     *
     * @return
     */
    public String getDescription() {
        return this.config.getDescription();
    }

    /**
     * Return true this section is visible. Empty sections (with no visible
     * activities) are automatically hidden.
     */
    @Override
    public boolean isVisible() {
        return preferenceStore.getBoolean(getId()) && !getVisibleActivities().isEmpty();
    }

    /**
     * Get the position defined in the extension point.
     */
    @Override
    public int getPosition() {
        return this.config.getIndex();
    }

    /**
     * Set the position.
     */
    @Override
    public void setPosition(int index) {
        this.config.setIndex(index);
    }

    /**
     * Allows to Compare Two ActivityExplorerSection.
     */
    @Override
    public int compareTo(IOrdered other) {
        int value = Integer.valueOf(getPosition()).compareTo(Integer.valueOf(other.getPosition()));
        return value == 0 ? 1 : value;
    }

    /**
     * Initialize the section.
     *
     * @param sectionContainer
     * @param page
     * @param managedForm
     * @return Control
     */
    public Control initialize(Composite sectionContainer, IFormPage page, IManagedForm managedForm) {
        // Create the widgets.
        this.page = page;
        this.toolkit = managedForm.getToolkit();
        Couple<Section, Composite> section = FormHelper.createTwistieSectionWithToolbar(sectionContainer, managedForm, getName(), null, this.config.isExpanded(), Arrays.asList(getToolBarActions()));
        this.widget = section.getKey();
        this.activityContainer = section.getValue();

        // Register as property listener, to live refresh check / unckeck sections.
        this.preferenceStore.addPropertyChangeListener(this);

        // Add/init activities
        initOwnActivities(this.activityContainer, this.toolkit);
        return this.widget;
    }

    /**
     * Dispose the Activity Explorer Section.
     */
    public void dispose() {
        // dispose the section widget
        if (widget != null && !widget.isDisposed()) {
            widget.dispose();
        }
        // dispose the editor
        ActivityExplorerManager.INSTANCE.getEditor().dispose();
        // dispose the preference property listener
        preferenceStore.removePropertyChangeListener(this);
    }

    /**
     * Get all visible activities.
     *
     * @return List<ExplorerActivity>
     */
    public List<ExplorerActivity> getVisibleActivities() {
        List<ExplorerActivity> visibleActivities = new ArrayList<ExplorerActivity>();
        for (ExplorerActivity activity : getActivities()) {
            if (activity.isVisible()) {
                visibleActivities.add(activity);
            }
        }
        return visibleActivities;
    }

    /**
     * Init own ExplorerActivity.
     *
     * @param activityContainer
     * @param toolkit
     */

    private void initOwnActivities(Composite activityContainer, FormToolkit toolkit) {
        for (ExplorerActivity activity : getVisibleActivities()) {
            activity.init(activityContainer, toolkit);
        }
    }

    /**
     * Get the ToolBarActions
     *
     * @return IAction[]
     */
    protected IAction[] getToolBarActions() {
        return new IAction[0];
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        String property = event.getProperty();
        boolean value = Boolean.valueOf(event.getNewValue().toString());
        if (doPropertyChange(event, value, property)) {
            ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditor();
            if (editor != null && editor.getActivePageInstance() != null) {
                editor.getActivePageInstance().getManagedForm().reflow(true);
            }
        }
    }

    protected boolean doPropertyChange(PropertyChangeEvent event, boolean value, String property) {
        boolean result = false;
        if (ActivityExplorerExtensionManager.isActivity(page.getId(), this.getId(), property)) {
            updateSectionForm();
            result = true;
        }
        return result;
    }

    private void updateSectionForm() {
        if (!activityContainer.isDisposed()) {
            for (Control c : activityContainer.getChildren()) {
                c.dispose();
            }
            initOwnActivities(activityContainer, toolkit);
        }
    }
}
