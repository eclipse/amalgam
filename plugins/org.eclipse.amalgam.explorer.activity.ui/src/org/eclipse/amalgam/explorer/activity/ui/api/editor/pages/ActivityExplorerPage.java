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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.actions.AbstractDescriptionAction;
import org.eclipse.amalgam.explorer.activity.ui.api.actions.DescriptionAction;
import org.eclipse.amalgam.explorer.activity.ui.api.configuration.ActivityExplorerPageConfiguration;
import org.eclipse.amalgam.explorer.activity.ui.api.configuration.CommonActivityExplorerPageConfiguration;
import org.eclipse.amalgam.explorer.activity.ui.api.configuration.SectionConfiguration;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper.LayoutType;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.HTMLHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.sections.ActivityExplorerSection;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.actions.util.FormTextPageLinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.internal.actions.util.MDSashForm;
import org.eclipse.amalgam.explorer.activity.ui.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.util.ActivityExplorerLoggerService;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Sash;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

/**
 * Base class to implement architecture Activity Explorer page.
 */
public class ActivityExplorerPage extends CommonActivityExplorerPage implements IPropertyChangeListener {
    /**
     * Sash that layouts activities in one column and diagrams in another one.
     */
    private MDSashForm _sashForm;

    /**
     * Container that hosts all sections.
     */
    private Composite _sectionContainer;

    public ActivityExplorerPage() {
        createContributedSections();
    }

    @Override
    protected CommonActivityExplorerPageConfiguration createConfiguration() {
        return new ActivityExplorerPageConfiguration();
    }

    /**
     * Helper to access the configuration object with the correct type locally.
     * 
     * @return the configuration for this page, cast as an actual
     *         ActivityExplorerPageConfiguration.
     */
    private ActivityExplorerPageConfiguration getConfiguration() {
        return (ActivityExplorerPageConfiguration) config;
    }

    /**
     * Adjust image href.
     * 
     * @param richText
     * @param used
     *            to collect image.
     */
    protected void adjustImageHRef(FormText richText, ActivityExplorerActivator activator) {
        if (getConfiguration().getHeaderImageOff() != null) {
            adjustImageHRef(richText, getConfiguration().getHeaderImageOff(), getId());
        }
    }

    protected void adjustImageHRef(FormText richText, Image image, String id) {
        if (image != null) {
            richText.setImage(id, image);
        }
    }

    /**
     * Create contributed sections but not initialize it
     */
    private void createContributedSections() {
        // Loop over pages contributors.
        List<IConfigurationElement> sections = ActivityExplorerExtensionManager.getSectionsFromPageId(getId());

        if (sections != null) {

            for (IConfigurationElement contributor : sections) {
                try {
                    handleContributedSectionsFor(contributor);
                } catch (NumberFormatException e) {

                    StringBuilder message = new StringBuilder();
                    message.append("ActivityExplorerPage.createContributedSections() _ "); //$NON-NLS-1$
                    message.append("The contribution ");
                    message.append(ActivityExplorerExtensionManager.getId(contributor));
                    message.append(" has wrong index format (");
                    message.append(ActivityExplorerExtensionManager.getIndex(contributor));
                    message.append("). Only integers are valid");

                    ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, message.toString(), e);

                }
            }
        }
    }

    private void initContributedSections(Composite sectionContainer, IManagedForm managedForm) {
        // init and display the sessions in the page
        for (ActivityExplorerSection s : getVisibleSections()) {
            initializeSection(s, sectionContainer, managedForm);
        }
    }

    protected List<ActivityExplorerSection> getVisibleSections() {
        List<ActivityExplorerSection> visibleSections = new ArrayList<ActivityExplorerSection>();
        for (ActivityExplorerSection s : getSections()) {
            if (s.isVisible()) {
                visibleSections.add(s);
            }
        }
        return visibleSections;
    }

    /**
     * Initialize the sections
     * 
     * @param section
     * @param sectionContainer
     * @param managedForm
     */
    protected void initializeSection(ActivityExplorerSection section, Composite sectionContainer, IManagedForm managedForm) {
        section.initialize(sectionContainer, this, managedForm);
    }

    @Override
    protected void createFormContent(IManagedForm managedForm) {
        super.createFormContent(managedForm);
        // Set the header title.
        ScrolledForm form = managedForm.getForm();
        form.setText(getHeaderTitle());
        // Install a default layout.
        GridLayout layout = new GridLayout();
        Composite body = form.getBody();
        body.setLayout(layout);
        _sashForm = new MDSashForm(body, SWT.NULL);
        _sashForm.setData("form", managedForm); //$NON-NLS-1$
        managedForm.getToolkit().adapt(_sashForm, false, false);
        _sashForm.setMenu(form.getBody().getMenu());
        // Install a default layout based on two columns.
        _sashForm.setLayout(new GridLayout(2, false));
        _sashForm.setLayoutData(new GridData(GridData.FILL_BOTH));
        // The left one contains sections.
        _sectionContainer = createSectionContainer(_sashForm, managedForm);

        // Create header sections.
        createHeaderSections(_sectionContainer, managedForm);

        // init contributes sections.
        initContributedSections(_sectionContainer, managedForm);

        // Hook resize listener for the sash behavior.
        hookResizeListener();
        // Register as property listener, to live refresh check / unckeck
        // sections.
        ActivityExplorerActivator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
        // Force a layout to make sure, page is well refreshed.
        managedForm.reflow(true);
    }

    /**
     * Rebuild the page.
     */
    public void updatePageForm() {
        if (!_sectionContainer.isDisposed()) {
            for (Control c : _sectionContainer.getChildren()) {
                c.dispose();
            }
            createHeaderSections(_sectionContainer, getManagedForm());
            initContributedSections(_sectionContainer, getManagedForm());
        }
    }

    /**
     * Create the overview section.
     * 
     * @param sectionContainer
     * @param managedForm
     * @return
     */
    protected void createOverviewSection(Composite sectionContainer, IManagedForm managedForm) {

        final IFormPage previousPage = getEditor().getPreviousPage(this);
        final IFormPage nextPage = getEditor().getNextPage(this);

        // create rich text
        String body = HTMLHelper.breadcrumbForm(previousPage, this, nextPage);

        FormText richText = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper.createRichText(managedForm.getToolkit(), sectionContainer, body,
                new FormTextPageLinkAdapter(getEditor()));

        // attach image to link
        adjustImageHRef(richText, getHeaderImageOn(), getId());

        if ((previousPage != null) && (previousPage instanceof ActivityExplorerPage)) {
            adjustImageHRef(richText, ((ActivityExplorerPage) previousPage).getHeaderImageOff(), previousPage.getId());
        }
        if ((nextPage != null) && (nextPage instanceof ActivityExplorerPage)) {
            adjustImageHRef(richText, ((ActivityExplorerPage) nextPage).getHeaderImageOff(), nextPage.getId());
        }

        richText.marginHeight = 0;
        richText.marginWidth = 0;

    }

    /**
     * Create the container that hosts sections.<br>
     * This one layouts its content using a {@link TableWrapLayout} to allow
     * sections to have wrapped hyper controls.
     * 
     * @param parent
     * @param managedForm
     */
    protected Composite createSectionContainer(Composite parent, IManagedForm managedForm) {
        Composite container = org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.FormHelper.createCompositeWithLayoutType(managedForm.getToolkit(), parent, LayoutType.TABLEWRAP_LAYOUT,
                1, true);
        container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, true));
        return container;
    }

    /**
     * Create section displayed in this page.<br>
     * Default implementation return <code>null</code>.
     * 
     * @param sectionContainer
     * @return First created section. This one is used to enable UI alignment
     *         with Diagram viewer section.
     */
    protected void createHeaderSections(final Composite sectionContainer, IManagedForm managedForm) {

        // Create Overview section.
        AbstractDescriptionAction displayDescription = new DescriptionAction(sectionContainer.getShell(), getPageDescription());
        Form formWidget = managedForm.getForm().getForm();
        formWidget.getMenuManager().add(displayDescription);
        formWidget.getToolBarManager().add(displayDescription);
        formWidget.getToolBarManager().update(true);

        createOverviewSection(sectionContainer, managedForm);
    }

    /**
     * @see org.eclipse.ui.forms.editor.FormPage#dispose()
     */
    @Override
    public void dispose() {
        // Unregister as property listener.
        ActivityExplorerActivator.getDefault().getPreferenceStore().removePropertyChangeListener(this);

        super.dispose();
    }

    /**
     * Handle property change.<br>
     * 
     * @param event
     * @param value
     * @param property
     * @return boolean
     */

    protected boolean doPropertyChange(PropertyChangeEvent event, boolean value, String property) {
        boolean result = false;

        if (isSection(property)) {
            updatePageForm();
            result = true;
        }

        return result;
    }

    /**
     * Test if the id is a Activity Explorer page.
     * 
     * @param id
     * @return boolean
     */
    private boolean isSection(String id) {
        return ActivityExplorerExtensionManager.isSection(getId(), id);
    }

    /**
     * Get a ActivityExplorerSection in the page from its id.
     * 
     * @param id
     */
    protected ActivityExplorerSection getSectionById(final String id) {
        ActivityExplorerSection result = null;
        for (ActivityExplorerSection section : getSections()) {
            if (section.getId().equals(id)) {
                result = section;
            }
        }
        return result;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActivityExplorerEditor getEditor() {
        return (ActivityExplorerEditor) super.getEditor();
    }

    /**
     * @see org.eclipse.ui.part.EditorPart#getEditorInput()
     */
    @Override
    public ActivityExplorerEditorInput getEditorInput() {
        return (ActivityExplorerEditorInput) super.getEditorInput();
    }

    /**
     * Get the header page title.
     * 
     * @return
     */
    protected String getHeaderTitle() {
        return getConfiguration().getHeaderTitle();
    }

    /**
     * Set the header page title.
     * 
     * @param title
     */
    protected void setHeaderTitle(String title) {
        getConfiguration().setHeaderTitle(title);
    }

    /**
     * Get the XML file that defines the form text content for the description
     * of the page.<br>
     * Returned path must be relative to
     * <code>org.eclipse.amalgam.explorer.activity.ui/xml</code> folder.<br>
     * 
     * @return
     */
    public String getPageDescription() {
        return getConfiguration().getDescription();
    }

    /**
     * Get the section container.
     * 
     * @return the sectionContainer
     */
    protected Composite getSectionContainer() {
        return _sectionContainer;
    }

    public Set<ActivityExplorerSection> getSections() {
        return getConfiguration().getSections();
    }

    /**
     * Handle contributed sections for specified Activity Explorer page
     * provider.
     * 
     * @param contributor
     */
    protected void handleContributedSectionsFor(IConfigurationElement contributor) {
        // create a Activity Explorer section
        SectionConfiguration cfg = ActivityExplorerExtensionManager.parseSectionConfiguration(contributor);
        ActivityExplorerSection section = new ActivityExplorerSection(cfg) {
            @Override
            protected IAction[] getToolBarActions() {
                ActivityExplorerPage page = ActivityExplorerPage.this;
                return new IAction[] { new DescriptionAction(page.getSite().getShell(), getConfiguration().getDescription()) };
            }
        };

        // sort
        getConfiguration().getSections().add(section);
    }

    /**
     * Hook resize listener for sash form.
     */
    protected void hookResizeListener() {
        Listener listener = _sashForm.getListener();
        Control[] children = _sashForm.getChildren();
        for (Control element : children) {
            if (element instanceof Sash) {
                continue;
            }
            element.addListener(SWT.Resize, listener);
        }
    }

    /**
     * @see org.eclipse.jface.util.IPropertyChangeListener#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
     */
    public void propertyChange(PropertyChangeEvent event) {
        String property = event.getProperty();
        boolean value = ((Boolean) event.getNewValue()).booleanValue();

        if (doPropertyChange(event, value, property)) {
            if (ActivityExplorerManager.INSTANCE.getEditor() != null && ActivityExplorerManager.INSTANCE.getEditor().getActivePageInstance() != null) {
                ActivityExplorerManager.INSTANCE.getEditor().getActivePageInstance().getManagedForm().reflow(true);
            }
        }
    }

    /**
     * @see org.eclipse.ui.forms.editor.FormPage#setActive(boolean)
     */
    @Override
    public void setActive(boolean active) {
        super.setActive(active);
        if (active) {
            updateActionBars();
        }
    }

    /**
     * Update action bars (handlers).
     * 
     * @param editorActionBars
     */
    public void updateActionBars() {
        IActionBars editorActionBars = getEditorSite().getActionBars();
        // Update action bars to make sure global ActionHandler are updated
        // accordingly.
        editorActionBars.updateActionBars();
    }

    /**
     * Initialize the Page with parameters.
     */
    @Override
    public void setInitializationData(IConfigurationElement cfig, String propertyName, Object data) {
        super.setInitializationData(cfig, propertyName, data);
        // Complete the page's configuration with ActivityExplorerPage-specific elements
        ActivityExplorerExtensionManager.parseActivityExplorerPageConfiguration(cfig, getConfiguration());
    }

    /**
     * Set Header Image Off.
     * 
     * @param image
     */
    protected void setHeaderImageOff(Image image) {
        getConfiguration().setHeaderImageOff(image);

    }

    /**
     * Set Header Image On.
     * 
     * @param image
     */
    protected void setHeaderImageOn(Image image) {
        getConfiguration().setHeaderImageOn(image);

    }

    /**
     * Get Image Off.
     * 
     * @return Image
     */
    public Image getHeaderImageOff() {
        return getConfiguration().getHeaderImageOff();
    }

    /**
     * Get header image On.
     * 
     * @return Image
     */
    public Image getHeaderImageOn() {
        return getConfiguration().getHeaderImageOn();
    }

    /**
     * Get the applied Predicate.
     * 
     * @return {@link IPredicate}
     */
    public IPredicate getPredicate() {
        return getConfiguration().getPredicate();
    }

}
