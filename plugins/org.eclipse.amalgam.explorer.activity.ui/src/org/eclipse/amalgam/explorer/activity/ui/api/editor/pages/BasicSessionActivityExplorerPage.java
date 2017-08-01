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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.actions.DescriptionAction;
import org.eclipse.amalgam.explorer.activity.ui.api.actions.OpenActivityExplorerAction2;
import org.eclipse.amalgam.explorer.activity.ui.api.actions.ViewerFilteringAction;
import org.eclipse.amalgam.explorer.activity.ui.api.configuration.BasicSessionActivityExplorerPageConfiguration;
import org.eclipse.amalgam.explorer.activity.ui.api.configuration.CommonActivityExplorerPageConfiguration;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.activities.ExplorerActivity;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper.LayoutType;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.viewers.AbstractActivityExplorerViewer;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.viewers.DiagramViewer;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.sections.ActivityExplorerSection;
import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractNewDiagramHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.internal.actions.util.MDSashForm;
import org.eclipse.amalgam.explorer.activity.ui.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.util.ActivityExplorerLoggerService;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuListener2;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.events.IHyperlinkListener;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * Base class to implement basic session Activity Explorer page.
 */
public class BasicSessionActivityExplorerPage extends ActivityExplorerPage {
    /**
     * Diagrams Viewer weight (used by the sash).ContentProvider
     */
    private static final int DIAGRAMS_VIEWER_WEIGHT = 40;

    /**
     * ActivityExplorerSection weight (used by the sash).
     */
    private static final int SECTION_WEIGHT = 60;

    /**
     * Container that hosts the viewer.
     */
    private Composite _viewerContainer;

    /**
     * List of Viewers in the current page
     */
    private Set<AbstractActivityExplorerViewer> viewers = new HashSet<AbstractActivityExplorerViewer>();

    @Override
    protected CommonActivityExplorerPageConfiguration createConfiguration() {
        return new BasicSessionActivityExplorerPageConfiguration();
    }

    private BasicSessionActivityExplorerPageConfiguration getConfiguration() {
        return (BasicSessionActivityExplorerPageConfiguration) config;
    }

    @Override
    protected void createHeaderSections(Composite sectionContainer_p, IManagedForm managedForm_p) {

        // Create Overview section.

        final Form formWidget = managedForm_p.getForm().getForm();

        // init
        formWidget.getMenuManager().add(new Separator("empty-list")); //$NON-NLS-1$

        // add listener
        formWidget.getMenuManager().addMenuListener(new IMenuListener2() {

            public void menuAboutToShow(IMenuManager manager) {

                manager.removeAll();

                for (Session session : SessionManager.INSTANCE.getSessions()) {

                    if (!session.equals(BasicSessionActivityExplorerPage.this.getEditorInput().getSession())) {
                        formWidget.getMenuManager().add(new OpenActivityExplorerAction2(session));
                    }
                }

            }

            public void menuAboutToHide(IMenuManager manager) {

            }

        });

        formWidget.getToolBarManager().update(true);

        createOverviewSection(sectionContainer_p, managedForm_p);
    }

    @Override
    protected void createFormContent(IManagedForm managedForm_p) {
        super.createFormContent(managedForm_p);

        if (getConfiguration().isDisplayViewer()) {
            MDSashForm sashForm = (MDSashForm) getSectionContainer().getParent();
            _viewerContainer = createViewerContainer(sashForm, managedForm_p);
            _viewerContainer.setLayoutData(new GridData(GridData.FILL_BOTH));

            // create viewers
            createViewers(_viewerContainer, managedForm_p);

            // Hook resize listener for the sash behavior.
            hookResizeListener();

            // 66% 34 % weights for the sash.
            sashForm.setWeights(new int[] { SECTION_WEIGHT, DIAGRAMS_VIEWER_WEIGHT });

            // Force a layout to make sure, page is well refreshed.
            managedForm_p.reflow(true);

        }
    }

    /**
     * defines the type of particular viewer that should be adding to the page.
     */
    @SuppressWarnings("unchecked")
    protected Class<? extends AbstractActivityExplorerViewer>[] addViewersTypeInPage() {
        return new Class[] { DiagramViewer.class };
    }

    /**
     * create and add a viewer in the page.
     * 
     * @param viewerContainer_p
     * @param managedForm_p
     */
    private void createViewers(Composite viewerContainer_p, IManagedForm managedForm_p) {
        Class<? extends AbstractActivityExplorerViewer>[] viewerTab = addViewersTypeInPage();
        for (Class<? extends AbstractActivityExplorerViewer> viewer : viewerTab) {
            AbstractActivityExplorerViewer newViewer = addNewViewer(viewer);
            newViewer.createViewer(viewerContainer_p, managedForm_p);
        }
    }

    /**
     * Allows to add a new Viewer
     * 
     * @param viewer
     */
    protected final AbstractActivityExplorerViewer addNewViewer(Class<? extends AbstractActivityExplorerViewer> viewer) {
        AbstractActivityExplorerViewer newViewer = null;
        try {
            newViewer = viewer.getConstructor(BasicSessionActivityExplorerPage.class).newInstance(this);
            viewers.add(newViewer);
        } catch (Exception ex) {
            ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, ex.toString(), ex);
        }

        return newViewer;
    }

    /**
     * Create viewer container that hosts the viewer.<br>
     * This one layouts its content using a {@link GridLayout}.
     * 
     * @param parent_p
     * @param managedForm_p
     * @return
     */
    protected Composite createViewerContainer(Composite parent_p, IManagedForm managedForm_p) {
        return FormHelper.createCompositeWithLayoutType(managedForm_p.getToolkit(), parent_p, LayoutType.GRID_LAYOUT, 1, true);
    }

    /**
     * @see org.eclipse.ui.forms.editor.FormPage#dispose()
     */
    @Override
    public void dispose() {
        // Unregister as property listener.
        ActivityExplorerActivator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
        // Dispose viewer actions.

        for (AbstractActivityExplorerViewer viewer : viewers) {
            viewer.dispose();
        }
        // clean the viewers' list
        viewers.clear();

        super.dispose();
    }

    /**
     * Get the viewpoint handled by this page.
     * 
     * @return an empty string.
     */
    public Set<String> getHandledViewpoint() {
        Set<String> vps = new HashSet<String>();
        for (org.eclipse.amalgam.explorer.activity.ui.api.editor.sections.ActivityExplorerSection section : getSections()) {
            for (ExplorerActivity activity : section.getActivities()) {
                IHyperlinkListener listener = activity.getListener();
                if (listener instanceof AbstractNewDiagramHyperlinkAdapter) {
                    try {
                        vps.add(((AbstractNewDiagramHyperlinkAdapter) listener).getRepresentationName());
                    } catch (Throwable e) {
                        StringBuilder message = new StringBuilder();

                        message.append("BasicSessionActivityExplorerPage.getHandledViewpoint() _ "); //$NON-NLS-1$
                        message.append("Could not retrieve a representation name from contribution. See the error stack for more details."); //$NON-NLS-1$

                        ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, message.toString(), e);
                    }
                }
            }
        }
        return vps;
    }

    /**
     * Handle contributed sections for specified ActivityExplorerPagesProvider.
     * 
     * @param contributor_p
     * @param sectionContainer_p
     * @param managedForm_p
     */
    @Override
    protected void handleContributedSectionsFor(IConfigurationElement contributor_p) {

        // create the session
	  ActivityExplorerSection newSection = new ActivityExplorerSection(contributor_p) {
            @Override
            protected IAction[] getToolBarActions() {

                IAction[] toolbarActions = new IAction[] { new DescriptionAction(BasicSessionActivityExplorerPage.this.getSite().getShell(), getDescription()),
                        new ViewerFilteringAction(BasicSessionActivityExplorerPage.this, this) };

                if (!isFiltering()) {
                    toolbarActions = new IAction[] { new DescriptionAction(BasicSessionActivityExplorerPage.this.getSite().getShell(), getDescription()), };
                }

                return toolbarActions;
            }
        };

        // inserts sections in page
        boolean value = getSections().add(newSection);
        if (!value) {

            StringBuilder message = new StringBuilder();
            message.append("The declared section: ");
            message.append(newSection.getId());
            message.append(" has the same index of a another section. Changes it!");

            ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, message.toString(), null);
        }

    }

    /**
     * @see org.eclipse.ui.forms.editor.FormPage#setActive(boolean)
     */
    @Override
    public void setActive(boolean active_p) {
        super.setActive(active_p);
        if (active_p) {
            // Set a new selection to the property sheet page on Activity
            // Explorer page
            // activation.
            setCurrentPageSelectionToPropertySheetPage();
        }
    }

    /**
     * Refresh the property sheet page according to the current viewer
     * selection.<br>
     * {@link #getViewer()}.
     */
    protected void setCurrentPageSelectionToPropertySheetPage() {
        // Call the property sheet page without loading it.
        // Indeed, we won't load it if the view is not displayed.
        TabbedPropertySheetPage propertySheetPage = getEditor().getPropertySheetPage();

        if ((null != propertySheetPage) && getConfiguration().isDisplayViewer()) {
            /*
             * Viewer viewer = getViewer(); if(null!= viewer){ ISelection
             * currentSelection = viewer.getSelection(); if(currentSelection !=
             * null) propertySheetPage.selectionChanged(getEditor(),
             * currentSelection); }
             */// TODO:A modifier pour la prise en compte de plusieurs viewer
        }
    }

    /**
     * Set a viewer filter on the diagram viewer.
     * 
     * @param filter_p
     *            <code>null</code> means reset the filter.
     * @param action_p
     */
    public void callViewersFilter(ViewerFilteringAction action_p) {
        // If given filter is null that means reset the filter.
        for (AbstractActivityExplorerViewer viewer : viewers) {
            viewer.setViewerFilter(action_p);
        }
    }

    /**
     * Update action bars (handlers).
     * 
     * @param editorActionBars
     */
    @Override
    public void updateActionBars() {
        IActionBars editorActionBars = getEditorSite().getActionBars();
        // Update action bars to make sure global ActionHandler are updated
        // accordingly.
        editorActionBars.updateActionBars();
    }

    /**
     * Test if a viewer should be displayed in the page.
     * 
     * @return boolean
     */
    protected boolean isDisplayViewerInPage() {
        return getConfiguration().isDisplayViewer();
    }

    @Override
    public void setInitializationData(IConfigurationElement cfig, String propertyName, Object data) {
        super.setInitializationData(cfig, propertyName, data);
        getConfiguration().setDisplayViewer(ActivityExplorerExtensionManager.getIsDisplayViewerInPage(cfig));
    }

    /**
     * Test if the page should be visible. if no sections is visible the page is
     * not visible.
     * 
     * @return boolean
     */
    @Override
    public boolean isVisible() {
        boolean result = super.isVisible();
        result &= !getVisibleSections().isEmpty();
        return result;
    }

}
