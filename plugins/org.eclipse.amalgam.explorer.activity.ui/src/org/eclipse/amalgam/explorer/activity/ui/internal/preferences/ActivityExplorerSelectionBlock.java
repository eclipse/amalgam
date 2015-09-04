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
package org.eclipse.amalgam.explorer.activity.ui.internal.preferences;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.ActivityExplorerEditor;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ICheckable;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.widgets.FormText;

public class ActivityExplorerSelectionBlock {

	private LabelProvider labelProvider;
	private ITreeContentProvider contentProvider;
	private ICheckStateProvider checkStateProvider;
	public Controller controller;
	
	private static final Pattern P_FORM = Pattern.compile("<form>.*</form>"); //$NON-NLS-1$
	private final Map<String, Boolean> deferredPreferencesValues = new HashMap<String, Boolean>();

	public ActivityExplorerSelectionBlock() {
		this.labelProvider = new ExtensionLabelProvider();
		this.contentProvider = new ExtensionTreeContentProvider();
		this.checkStateProvider = new CheckStateProvider();

		/*
		 * ActivityExplorerActivator.getDefault().getPreferenceStore().
		 * addPropertyChangeListener(new IPropertyChangeListener() {
		 * 
		 * 
		 * public void propertyChange(PropertyChangeEvent event) { //if(even)
		 * controller.checkStateChanged(new CheckStateChangedEvent(treeArea,
		 * event.getOldValue(), true));
		 * 
		 * } });
		 */
	}

	private CheckboxTreeViewer treeArea;
	private CheckboxTableViewer listArea;
	private FormText detailsArea;

	/**
	 * Create the Composed Widget
	 * 
	 * @param parent
	 * @return the composite result
	 */
	public Composite createWidget(Composite parent) {
		SashForm result = new SashForm(parent, SWT.VERTICAL);
		result.setFont(parent.getFont());
		SashForm topPart = new SashForm(result, SWT.HORIZONTAL);
		createTreeViewer(topPart);
		createPageListViewer(topPart);
		createDetailsView(result);
		return result;
	}
	
  public void performDefaults() {
    deferredPreferencesValues.clear();
  }
	  
  public void performOk() {
    // Defer the property page to the end so that all children prefs must be set before.
    Set<String> propertyPages = new HashSet<String>();
    for (String id : deferredPreferencesValues.keySet()) {
      if (ActivityExplorerExtensionManager.isPage(id)) {
        propertyPages.add(id);
      } else {
        ActivityExplorerActivator.getDefault().getPreferenceStore().setValue(id, deferredPreferencesValues.get(id));
      }
    }
    for (String propertyPage : propertyPages) {
      ActivityExplorerActivator.getDefault().getPreferenceStore()
          .setValue(propertyPage, deferredPreferencesValues.get(propertyPage));
    }
    deferredPreferencesValues.clear();
  }

	/**
	 * Create the Details Viewer Widget
	 * 
	 * @param parent
	 */
	private void createDetailsView(SashForm parent) {
		detailsArea = new FormText(parent, SWT.V_SCROLL | SWT.BORDER);
		detailsArea.setText("", false, true); //$NON-NLS-1$
		Display d = Display.getCurrent();
		if (d != null)
			detailsArea.setBackground(d.getSystemColor(SWT.COLOR_WHITE));
	}

	/**
	 * Create the Table Viewer Widget
	 * 
	 * @param parent
	 */
	private void createPageListViewer(Composite parent) {
		Composite form = new Composite(parent, SWT.NONE);
		FormLayout layout = new FormLayout();
		form.setLayout(layout);
		Label prompt = new Label(form, SWT.NONE);
		prompt.setText(Messages.ActivityExplorerSelectionBlock_0);
		FormData data = new FormData();
		data.top = new FormAttachment(0, 0);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		prompt.setLayoutData(data);

		listArea = CheckboxTableViewer.newCheckList(form, SWT.BORDER);
		data = new FormData();
		data.top = new FormAttachment(prompt, 4);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		data.bottom = new FormAttachment(100, 0);
		listArea.getControl().setLayoutData(data);
		listArea.setContentProvider(contentProvider);
		listArea.setLabelProvider(labelProvider);

		listArea.addSelectionChangedListener(getInstance());
		listArea.addCheckStateListener(getInstance());
		listArea.setCheckStateProvider(checkStateProvider);
	}

	/**
	 * Create the Tree Viewer widget
	 * 
	 * @param parent
	 */
	private void createTreeViewer(Composite parent) {
		Composite form = new Composite(parent, SWT.NONE);
		FormLayout layout = new FormLayout();
		form.setLayout(layout);
		Label prompt = new Label(form, SWT.NONE);
		prompt.setText(Messages.ActivityExplorerSelectionBlock_1);
		FormData data = new FormData();
		data.top = new FormAttachment(0, 0);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		prompt.setLayoutData(data);

		treeArea = new CheckboxTreeViewer(form);
		data = new FormData();
		data.top = new FormAttachment(prompt, 4);
		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		data.bottom = new FormAttachment(100, 0);
		treeArea.getControl().setLayoutData(data);

		treeArea.setLabelProvider(labelProvider);
		treeArea.setContentProvider(contentProvider);
		treeArea.addFilter(new ViewerFilter() {
      
      @Override
      public boolean select(Viewer viewer, Object parentElement, Object element) {
        // Don't show the overview page (i.e. page with index 0)
        return (element instanceof IConfigurationElement) && !ActivityExplorerExtensionManager.getIndex((IConfigurationElement)element).equals("0");
      }
    });

		treeArea.setInput(ActivityExplorerExtensionManager.getExtensionPoint(ActivityExplorerExtensionManager.PROVIDER_PAGES_EXT));
		treeArea.addSelectionChangedListener(getInstance());
		treeArea.addCheckStateListener(getInstance());
		treeArea.addDoubleClickListener(new IDoubleClickListener() {

			public void doubleClick(DoubleClickEvent event) {
				ISelection iselection = event.getSelection();
				if (iselection instanceof IStructuredSelection) {
					IStructuredSelection selection = (IStructuredSelection) iselection;
					Object obj = selection.getFirstElement();
					if (obj instanceof IConfigurationElement) {
						IConfigurationElement elt = (IConfigurationElement) obj;
						if (elt.getName().equals(ActivityExplorerExtensionManager.PAGE)) {
							String id = ActivityExplorerExtensionManager.getId(elt);
							ActivityExplorerEditor editor = ActivityExplorerManager.INSTANCE.getEditor();
							if (editor != null) {
								IFormPage page = editor.findPage(id);
								if (page != null) {
									ActivityExplorerManager.INSTANCE.getEditor().setActivePage(id);
								}
							}
						}
					}
				}

			}
		});
		treeArea.setCheckStateProvider(checkStateProvider);

	}

	/**
	 * A basic label provider fo {@link IConfigurationElement}I
	 * 
	 * 
	 */
	private class ExtensionLabelProvider extends LabelProvider {
		@Override
		public String getText(Object element) {

			if (element instanceof IConfigurationElement) {

				IConfigurationElement elt = (IConfigurationElement) element;
				return ActivityExplorerExtensionManager.getName(elt);

			}

			return super.getText(element);
		}
	}

	/**
	 * A basic tree content provider for {@link IConfigurationElement}
	 * 
	 * 
	 */
	private class ExtensionTreeContentProvider implements ITreeContentProvider {

		public void dispose() {
			// do nothing
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			// do nothing
		}

		public Object[] getElements(Object inputElement) {
			return getChildren(inputElement);
		}

		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof IExtensionPoint) {
				return ActivityExplorerExtensionManager.getAllProviderExtensions();
			}
			if (parentElement instanceof IConfigurationElement) {
				String category = ActivityExplorerExtensionManager.SECTION;
				IConfigurationElement elt = (IConfigurationElement) parentElement;
				if (elt.getName().equals(ActivityExplorerExtensionManager.PAGE)) {
					category = ActivityExplorerExtensionManager.SECTION;
					List<IConfigurationElement> result = ActivityExplorerExtensionManager
							.getAllSectionsExtensionForPageId(ActivityExplorerExtensionManager.getId(elt));
					result.addAll(Arrays.asList(elt.getChildren(category)));

					return result.toArray();
				}
				if (elt.getName().equals(ActivityExplorerExtensionManager.SECTION)) {
					category = ActivityExplorerExtensionManager.ACTIVITY;
					List<IConfigurationElement> result = ActivityExplorerExtensionManager
							.getAllActivitiesExtensionForSectionId(ActivityExplorerExtensionManager.getId(elt));
					result.addAll(Arrays.asList(elt.getChildren(category)));
					return result.toArray();
				}

			}

			return null;
		}

		public Object getParent(Object element) {
			Object parent = null;
			if (element instanceof IExtensionPoint) {
				parent = ((IExtensionPoint) element);
			}
			if (element instanceof IConfigurationElement) {
				parent = ((IConfigurationElement) element).getParent();
			}
			return parent;
		}

		public boolean hasChildren(Object element) {

			if (element instanceof IConfigurationElement) {
				IConfigurationElement elt = (IConfigurationElement) element;
				return elt.getName().equals(ActivityExplorerExtensionManager.PAGE) && elt.getChildren().length > 0;
			}
			return false;
		}

	}

	/**
	 * Get the Tree Viewer instance
	 * 
	 * @return {@link Viewer}
	 */
	public Viewer getTreeViewer() {
		return treeArea;
	}

	/**
	 * Get the Table Viewer instance
	 * 
	 * @return {@link Viewer}
	 */
	public Viewer getTableViewer() {
		return listArea;
	}

	/**
	 * Get the Singleton controller
	 * 
	 * @return the Controller
	 */
	private Controller getInstance() {
		if (controller == null)
			controller = new Controller();
		return controller;
	}

	/**
	 * A basic Controller Class It implements {@link ISelectionChangedListener}
	 * and {@link ICheckStateListener}
	 * 
	 * 
	 */
	public class Controller implements ISelectionChangedListener, ICheckStateListener {

		protected void setDefaultValue(Object element) {

			boolean defaultValue = ActivityExplorerActivator.getDefault().getPreferenceStore()
					.getDefaultBoolean(ActivityExplorerExtensionManager.getId((IConfigurationElement) element));

			checkStateChanged(new CheckStateChangedEvent((ICheckable) getTableViewer(), element, defaultValue));

		}

		public void checkStateChanged(CheckStateChangedEvent event) {
			Object element = event.getElement();
			boolean checked = event.getChecked();
			ICheckable source = (ICheckable) event.getSource();

			if (element instanceof IConfigurationElement) {
				IConfigurationElement configElement = (IConfigurationElement) element;
				String configElementId = ActivityExplorerExtensionManager.getId(configElement);
				{ // !!! Order matter; do not change !!!
          updateCheckedStateChildren(configElement, source, checked);
          deferredPreferencesValues.put(configElementId, checked);
          updateCheckedStateParent(configElement, source, checked);
          refreshVisual();
        }
			}
		}

		private void refreshVisual() {
			treeArea.refresh();
			listArea.refresh();
		}

		private void updateCheckedStateChildren(IConfigurationElement elt, ICheckable source, boolean state) {
			ITreeContentProvider provider = (ITreeContentProvider) treeArea.getContentProvider();
			Object[] children = provider.getElements(elt);
			if (null != children) {
				for (Object child : children) {
					checkStateChanged(new CheckStateChangedEvent(source, child, state));
				}
			}

		}

		private void updateCheckedStateParent(IConfigurationElement elt, ICheckable source, boolean state) {
			ITreeContentProvider provider = (ITreeContentProvider) treeArea.getContentProvider();
			Object parent = provider.getParent(elt);
			if (null != parent && !(parent instanceof IExtension) && state) {
				IConfigurationElement p = (IConfigurationElement) parent;
				String id = ActivityExplorerExtensionManager.getId(p);
				deferredPreferencesValues.put(id, state);
			}
		}

		public void selectionChanged(SelectionChangedEvent event) {
			ISelection selection = event.getSelection();
			Object source = event.getSource();
			if (null != selection && selection instanceof IStructuredSelection) {
				IStructuredSelection selected = (IStructuredSelection) selection;
				IConfigurationElement elt = (IConfigurationElement) selected.getFirstElement();

				if (source.equals(ActivityExplorerSelectionBlock.this.getTreeViewer())) {
					listArea.setInput(elt);
				}
				String description = ActivityExplorerExtensionManager.getDescription(elt);
				if (description == null) {
					detailsArea.setText("", false, false);//$NON-NLS-1$
				} else {
					
					boolean isWellFormed = P_FORM.matcher(description).find();
					if (isWellFormed){
						detailsArea.setText(description, true, false);
					} else {
						description = "<form>" + description + "</form>";
						detailsArea.setText(description, true, false);
					}
				}

			}

		}

	}

	/**
	 * A basic Cheched State Provider Class It implements
	 * {@link ICheckStateProvider}
	 * 
	 * 
	 */
	private class CheckStateProvider implements ICheckStateProvider {

		public boolean isGrayed(Object element) {
			return false;
		}

		public boolean isChecked(Object element) {
			boolean value = false;
			IConfigurationElement elt = (IConfigurationElement) element;
			String id = ActivityExplorerExtensionManager.getId(elt);
			if(deferredPreferencesValues.containsKey(id)){
			  return deferredPreferencesValues.get(id);
			}
			IPreferenceStore prefs = ActivityExplorerActivator.getDefault().getPreferenceStore();
			value = prefs.getBoolean(id);
			return value;
		}
	}
}
