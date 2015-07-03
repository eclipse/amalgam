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
package org.eclipse.amalgam.explorer.activity.api.editor.sections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.amalgam.explorer.activity.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.api.editor.activities.ExplorerActivity;
import org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.FormHelper;
import org.eclipse.amalgam.explorer.activity.api.editor.pages.helper.HTMLHelper;
import org.eclipse.amalgam.explorer.activity.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.internal.Couple;
import org.eclipse.amalgam.explorer.activity.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.internal.intf.IOrdered;
import org.eclipse.amalgam.explorer.activity.internal.intf.IVisibility;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

/**
 * This Class defined a Section for the DashBaord.
 * 
 *
 */
public class ActivityExplorerSection implements IVisibility, IOrdered, IPropertyChangeListener {

	/**
	 * Constructor.
	 * 
	 * @param contributor_p
	 */
	public ActivityExplorerSection(IConfigurationElement contributor_p) {
		this.id = ActivityExplorerExtensionManager.getId(contributor_p);
		this.name = ActivityExplorerExtensionManager.getName(contributor_p);
		this.isExpanded = ActivityExplorerExtensionManager.getIsExpanded(contributor_p);
		String desc = ActivityExplorerExtensionManager.getDescription(contributor_p);
		if (null != desc)
			this.description = HTMLHelper.formWrapper(desc);
		this.index = Integer.parseInt(ActivityExplorerExtensionManager.getIndex(contributor_p));
		this.isFiltering = ActivityExplorerExtensionManager.getIsFiltering(contributor_p);
		createActivities(contributor_p);

	}

	/**
	 * Constructor.
	 * 
	 * @param id
	 * @param name
	 * @param index
	 * @param isExpanded
	 * @param description
	 * @param activities_p
	 */

	public ActivityExplorerSection(String id, String name, int index, boolean isExpanded, boolean isFiltering,
			String description, List<ExplorerActivity> activities_p) {
		super();
		this.id = id;
		this.name = name;
		this.index = index;
		this.isExpanded = isExpanded;
		this.isFiltering = isFiltering;
		this.activities.addAll(activities_p);
	}

	private TreeSet<ExplorerActivity> activities;

	/**
	 * Create theirs Activities.
	 * 
	 * @param contributor_p
	 */

	private void createActivities(IConfigurationElement contributor_p) {

		activities = new TreeSet<ExplorerActivity>();

		List<IConfigurationElement> activities = ActivityExplorerExtensionManager.getActivities(contributor_p);
		for (IConfigurationElement element : activities) {
			this.activities.add(new ExplorerActivity(element));
		}
	}

	/**
	 * Get all activities defined for the Section.
	 * 
	 * @return Set<ExplorerActivity>
	 */

	public Set<ExplorerActivity> getActivities() {
		return activities;
	}

	/**
	 * Get an particular activity from its ID.
	 * 
	 * @param id
	 * @return {@link ExplorerActivity}
	 */

	public ExplorerActivity getActivityById(final String id) {
		ExplorerActivity result = null;
		for (ExplorerActivity activity : getActivities()) {
			if (activity.getId().equals(id)) {
				result = activity;
			}
		}
		return result;
	}

	/**
	 * Set a Collections of {@link ExplorerActivity} in the
	 * {@link ActivityExplorerSection}.
	 * 
	 * @param activities
	 */

	public void setActivities(TreeSet<ExplorerActivity> activities) {
		this.activities = activities;
	}

	/**
	 * Get its ID.
	 * 
	 * @return String
	 */

	public String getId() {
		return id;
	}

	/**
	 * Get its Name.
	 * 
	 * @return String
	 */

	public String getName() {
		return name;
	}

	private String id;
	private String name;
	private int index;
	private boolean isExpanded;
	private boolean isFiltering;
	private String description;
	private IAction[] toolbarActions;
	private Section widget;

	/**
	 * Return true if the section is defined as expanded.
	 * 
	 * @return
	 */
	public boolean isExpanded() {
		return isExpanded;
	}

	/**
	 * Return true if the section should support the filtering.
	 * 
	 * @return
	 */
	public boolean isFiltering() {
		return isFiltering;
	}

	/**
	 * Get its description.
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Return true this section is visible.
	 */

	public boolean isVisible() {
		return ActivityExplorerActivator.getDefault().getPreferenceStore().getBoolean(getId())
				&& !getVisibleActivities().isEmpty();
	}

	/**
	 * Get the position defined in the extension point.
	 */

	public int getPosition() {
		return index;
	}

	/**
	 * Set the position.
	 */

	public void setPosition(int index) {
		this.index = index;

	}

	private FormToolkit toolkit;
	private Composite activityContainer;
	private IFormPage page;

	/**
	 * Initialize the DashBaord Section
	 * 
	 * @param sectionContainer_p
	 * @param page
	 * @param managedForm_p
	 * @return Control
	 */
	public Control init(Composite sectionContainer_p, IFormPage page, IManagedForm managedForm_p) {
		this.page = page;
		toolkit = managedForm_p.getToolkit();
		Couple<Section, Composite> section = FormHelper.createTwistieSectionWithToolbar(sectionContainer_p,
				managedForm_p, getName(), null, isExpanded, Arrays.asList(getToolBarActions()));

		widget = (Section) section.getKey();

		activityContainer = section.getValue();

		// Register as property listener, to live refresh check / unckeck
		// sections.
		ActivityExplorerActivator.getDefault().getPreferenceStore().addPropertyChangeListener(this);
		return widget;
	}

	/**
	 * Initialise the DashBaordSection.
	 * 
	 * @param sectionContainer_p
	 * @param page
	 * @param managedForm_p
	 * @return Control
	 */
	public Control initialize(Composite sectionContainer_p, IFormPage page, IManagedForm managedForm_p) {

		// init the section
		init(sectionContainer_p, page, managedForm_p);

		// add/init activities
		initOwnActivities(activityContainer, toolkit);
		return widget;
	}

	/**
	 * Get its Widget.
	 * 
	 * @return Section
	 */

	public Section getWidget() {
		return widget;
	}

	/**
	 * Get all visible activities.
	 * 
	 * @return List<ExplorerActivity>
	 */
	public List<ExplorerActivity> getVisibleActivities() {
		List<ExplorerActivity> visibleActivities = new ArrayList<ExplorerActivity>();
		for (ExplorerActivity activity : getActivities()) {
			if (activity.isVisible())
				visibleActivities.add(activity);

		}
		return visibleActivities;

	}

	/**
	 * Init own ExplorerActivity.
	 * 
	 * @param activityContainer_p
	 * @param toolkit_p
	 */

	private void initOwnActivities(Composite activityContainer_p, FormToolkit toolkit_p) {
		for (ExplorerActivity activity : getVisibleActivities()) {
			activity.init(activityContainer_p, toolkit_p);
		}
	}

	/**
	 * Get the ToolBarActions
	 * 
	 * @return IAction[]
	 */
	protected IAction[] getToolBarActions() {
		return toolbarActions;
	}

	/**
	 * @see org.eclipse.jface.util.IPropertyChangeListener#propertyChange(org.eclipse.jface.util.PropertyChangeEvent)
	 */
	@Override
	public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
		String property = event.getProperty();
		boolean value = ((Boolean) event.getNewValue()).booleanValue();
		if (doPropertyChange(event, value, property)) {
			if (ActivityExplorerManager.INSTANCE.getEditor() != null)
				ActivityExplorerManager.INSTANCE.getEditor().getActivePageInstance().getManagedForm().reflow(true);
		}

	}

	protected boolean doPropertyChange(PropertyChangeEvent event_p, boolean value_p, String property_p) {
		boolean result = false;

		if (isActivity(property_p)) {
			updateSectionForm();
			result = true;
		}

		return result;
	}

	/*
	 * private boolean doPropertyChange(PropertyChangeEvent event, boolean
	 * value, String property) {
	 * 
	 * 
	 * ExplorerActivity activity = getActivityById(property); if (null !=
	 * activity) { if (value) { if (!activityContainer.isDisposed() &&
	 * !(widget.isDisposed())) {
	 * 
	 * // we layout all widgets ! sorry daddy! updateSectionForm();
	 * widget.getParent().layout(true, true); } }else { activity.dispose();
	 * //widget.getParent().layout(true, true); } } return true; }
	 */

	/**
	 * Test if the id is a Activity.
	 * 
	 * @param id
	 * @return boolean
	 */
	private boolean isActivity(String id) {
		return ActivityExplorerExtensionManager.isActivity(page.getId(), this.getId(), id);
	}

	/**
	 * Dispose the Activity Explorer Section.
	 */
	public void dispose() {
		// dispose the section widget
		if (widget != null && !widget.isDisposed())
			widget.dispose();
		/*
		 * for(ExplorerActivity activity: getActivities()){ activity.dispose();
		 * }
		 */
		// dispose the preference property listener
		ActivityExplorerActivator.getDefault().getPreferenceStore().removePropertyChangeListener(this);
	}

	/**
	 * Allows to Compare Two ActivityExplorerSection.
	 */
	public int compareTo(IOrdered arg0) {
		int value = new Integer(getPosition()).compareTo(new Integer(arg0.getPosition()));
		return value == 0 ? 1 : value;
	}

	public void updateSectionForm() {
		if (!activityContainer.isDisposed()) {
			for (Control c : activityContainer.getChildren()) {
				c.dispose();
			}
			initOwnActivities(activityContainer, toolkit);
		}
		// widget.getParent().layout(true, true);
	}
}
