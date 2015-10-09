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

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Collection;
import java.util.MissingResourceException;

import org.eclipse.amalgam.explorer.contextual.core.category.ICategory;
import org.eclipse.amalgam.explorer.contextual.core.model.IExplorerContextualModel;
import org.eclipse.amalgam.explorer.contextual.core.provider.AbstractContentProvider;
import org.eclipse.amalgam.explorer.contextual.core.provider.AbstractContentProviderFactory;
import org.eclipse.amalgam.explorer.contextual.core.provider.AbstractLabelProviderFactory;
import org.eclipse.amalgam.explorer.contextual.core.provider.wrapper.CategoryWrapper;
import org.eclipse.amalgam.explorer.contextual.core.provider.wrapper.ExplorerElementWrapper;
import org.eclipse.amalgam.explorer.contextual.core.ui.ExplorerContextualActivator;
import org.eclipse.amalgam.explorer.contextual.core.ui.ExplorerContextualPreferences;
import org.eclipse.amalgam.explorer.contextual.core.ui.IImageKeys;
import org.eclipse.amalgam.explorer.contextual.core.ui.action.ExplorerActionFactory;
import org.eclipse.amalgam.explorer.contextual.core.ui.action.ExplorerHistory;
import org.eclipse.amalgam.explorer.contextual.core.ui.model.ExplorerContextualModel;
import org.eclipse.amalgam.explorer.contextual.core.ui.view.ext.SelectionHelpersManager;
import org.eclipse.amalgam.explorer.contextual.core.util.ViewerHelper;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.bindings.keys.IKeyLookup;
import org.eclipse.jface.bindings.keys.KeyLookupFactory;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.util.LocalSelectionTransfer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.LabelProviderChangedEvent;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionManagerListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.XMLMemento;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.internal.views.properties.tabbed.view.TabbedPropertyTitle;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

/**
 * Contextual Explorer View. Load by extension point.
 */
@SuppressWarnings("restriction")
public abstract class ExplorerContextualView extends ViewPart implements IExplorerContextualViewPart, 
																	  ITabbedPropertySheetPageContributor{
	/**
	 * Contextual Explorer contributor ID
	 */
	public static final String EXPLORER_CONTEXTUAL_CONTRIBUTOR_ID = "org.eclipse.amalgam.explorer.contextual.core.ui.propertyContributorID";
	
	public static String getExplorerContextualViewID(){
		return "";
	}
	
	/**
	 * Whether or not the view is listening page selection events.<br>
	 * Hopefully there is only one instance of a Contextual Explorer at runtime.
	 */
	private static volatile boolean __isListeningToPageSelectionEvents;

	/**
	 * Category name displayed in Current Viewer.<br>
	 */
	private static final String ALL_RELATED_DIAGRAMS = "All Related Diagrams"; //$NON-NLS-1$
	/**
	 * Category name displayed in Current Viewer.<br>
	 */
	private static final String ALL_RELATED_TABLES = "All Related Tables"; //$NON-NLS-1$
	/**
	 * Constant used to persist if the view is listening workbench page selection events.
	 */
	private static final String LISTENING_TO_WORKBENCH_PAGE_SELECTION_EVENTS = "listeningToWorkbenchPageSelectionEvents"; //$NON-NLS-1$
	/**
	 * Text of the label for Referencing Elements explorer.
	 */
	private static final String REFERENCING_ELEMENTS_LABEL_TXT = Messages.ExplorerContextualView_Referencing_Elements_Title;

	/**
	 * Memento persistence tag.
	 */
	private static final String TAG_MEMENTO = "memento"; //$NON-NLS-1$
	/**
	 * Back navigation action.
	 */
	private IWorkbenchAction _backAction;

	private TreeViewer _currentViewer;
	private DelegateSelectionProvider _delegateSelectionProvider;
	/**
	 * Forward navigation action.
	 */
	private IWorkbenchAction _forwardAction;

	/**
	 * Navigation history.
	 */
	private ExplorerHistory _history;

	/**
	 * Is CTRL key pressed when a double click is emitted ?
	 */
	private boolean _isCtrlKeyPressed;
	/**
	 * Memento used to persist view states between sessions.
	 */
	private IMemento _memento;
  private SessionManagerListener _semCloseSessionListener;
	private TabbedPropertySheetPage _propertySheetPage;
	private TreeViewer _referencedViewer;
	/**
	 * Default viewers embedded into the view.
	 */
	private TreeViewer _referencingViewer;
	private ISelectionListener _selectionListener;
	private TabbedPropertyTitle _explorerContextualTitle;

	/**
	 * Used to drive setFocus from setInput.
	 */
	private boolean _shouldSetFocus;
	private IDoubleClickListener _viewerDoubleClickListener;

	private ISelectionChangedListener _viewerSelectionListener;

	/**
	 * Dialog settings for this view.
	 */
	private IDialogSettings _viewSettings;

	protected IExplorerContextualModel model;

	/**
	 * Constructor.
	 */
	public ExplorerContextualView() {
		// Get the dialog settings section for this view.
		_viewSettings = getDialogSettingsSection();
		model = new ExplorerContextualModel();
	}

	@Override
	public IExplorerContextualModel getModel() {
		return model;
	}
	
	/**
	 * Activate the listening to page selection events.
	 */
	public void activateListeningToPageSelectionEvents() {
		_selectionListener = getSelectionListener();
		if (null != _selectionListener) {
			getSite().getPage().addSelectionListener(_selectionListener);
		}
		__isListeningToPageSelectionEvents = true;
	}

	/**
	 * Adds drag support to given viewer. The drag transfer type is LocalSelectionTransfer.
	 * @param viewer_p
	 */
	protected void addDndDragSupport(final TreeViewer viewer_p) {
		int operations = DND.DROP_MOVE | DND.DROP_COPY;
		Transfer[] transferTypes = new Transfer[] { LocalSelectionTransfer.getTransfer() };
		// The DragSourceListener implementation is inspired by org.eclipse.debug.internal.ui.views.variables.SelectionDragAdapter.
		viewer_p.addDragSupport(operations, transferTypes, new DragSourceListener() {
			/**
			 * {@inheritDoc}
			 */
			@Override
			public void dragSetData(DragSourceEvent event_p) {
				event_p.data = LocalSelectionTransfer.getTransfer().getSelection();
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void dragStart(DragSourceEvent event_p) {
				// Check selection to drag is a Semantic Element.
				ISelection selection = viewer_p.getSelection();
				if ((selection != null) && (selection instanceof IStructuredSelection)
						&& (isSemanticElements(((IStructuredSelection) selection).toList()))) {
					// Fill LocalSelectionTransfer.
					LocalSelectionTransfer.getTransfer().setSelection(selection);
					LocalSelectionTransfer.getTransfer().setSelectionSetTime(event_p.time & 0xFFFFFFFFL);
					// Allow drag operation.
					event_p.doit = true;
				} else {
					// Forbid drag operation.
					event_p.doit = false;
				}
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void dragFinished(DragSourceEvent event_p) {
				// Clean LocalSelectionTranfer.
				LocalSelectionTransfer.getTransfer().setSelection(null);
				LocalSelectionTransfer.getTransfer().setSelectionSetTime(0);
			}
		});
	}

	/**
	 * <p>
	 * Adds a double click listeners to the given viewer.
	 * </p>
	 * @param viewer_p The viewer
	 */
	protected void addListeners(TreeViewer viewer_p) {
		// Lazy creation pattern.
		if (null == _viewerSelectionListener) {
			_viewerSelectionListener = new ISelectionChangedListener() {
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					ISelectionProvider provider = event.getSelectionProvider();
					refreshPropertyPage(provider);
				}
			};
		}
		// Register the listener.
		viewer_p.addSelectionChangedListener(_viewerSelectionListener);

		// Add a focus listener to update the selection provider.
		viewer_p.getControl().addFocusListener(new FocusAdapter() {
			@SuppressWarnings("synthetic-access")
			@Override
			public void focusGained(FocusEvent event_p) {
				Object source = event_p.getSource();
				ISelectionProvider newSelectionProvider = null;
				if (source.equals(_currentViewer.getControl())) {
					newSelectionProvider = _currentViewer;
				} else if (source.equals(_referencedViewer.getControl())) {
					newSelectionProvider = _referencedViewer;
				} else if (source.equals(_referencingViewer.getControl())) {
					newSelectionProvider = _referencingViewer;
				}
				if (null != newSelectionProvider) {
					updateSelectionProvider(newSelectionProvider);
					refreshPropertyPage(newSelectionProvider);
          // viewer_p.addSelectionChangedListener(getSite().getWorkbenchWindow());
          // viewer_p.addSelectionChangedListener(WindowSelectionService);
          try {
            getViewSite().getPage().showView(getExplorerContextualViewID(), null, org.eclipse.ui.IWorkbenchPage.VIEW_CREATE);
          } catch (PartInitException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
				}
			}
		});

		// Lazy creation pattern.
		if (null == _viewerDoubleClickListener) {
			_viewerDoubleClickListener = new IDoubleClickListener() {
				@SuppressWarnings("synthetic-access")
				@Override
				public void doubleClick(DoubleClickEvent event_p) {
					try {
						handleDoubleClick(event_p);
					} catch (RuntimeException exception_p) {
						StringBuilder loggerMessage = new StringBuilder("ExplorerContextualView.addListeners(..) _ "); //$NON-NLS-1$
						loggerMessage.append(exception_p.getMessage());
						logError(loggerMessage.toString(), exception_p);
					}
				}
			};
		}
		// Register the listener.
		viewer_p.addDoubleClickListener(_viewerDoubleClickListener);
		viewer_p.getControl().addKeyListener(new KeyAdapter() {
			/**
			 * Is CTRL pressed for specified key event.
			 * @param event_p
			 * @return
			 */
			protected boolean isCtrlPressed(KeyEvent event_p) {
				IKeyLookup keyLookup = KeyLookupFactory.getSWTKeyLookup();
				return keyLookup.getCtrl() == event_p.stateMask || keyLookup.getCtrl() == event_p.keyCode;
			}
			/**
			 * {@inheritDoc}
			 */
			@Override
			public void keyPressed(KeyEvent keyEvent_p) {
				if (isCtrlPressed(keyEvent_p)) {
					_isCtrlKeyPressed = true;
				}
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void keyReleased(KeyEvent keyEvent_p) {
				if (isCtrlPressed(keyEvent_p)) {
					_isCtrlKeyPressed = false;
				}
			}
		});
	}

	/**
	 * @see org.eclipse.amalgam.explorer.contextual.core.ui.view.IExplorerContextualViewPart#clean()
	 */
	@Override
	public void clean() {
		// No need to set focus.
		boolean restoreState = _shouldSetFocus ? true : false;
		_shouldSetFocus = false;
		setInput(null);
		if (restoreState) {
			_shouldSetFocus = true;
		}
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent_p) {
		// Create and set a layout on the parent.
		GridLayout layout = new GridLayout();
		// No blank space.
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		layout.verticalSpacing = 0;
		layout.horizontalSpacing = 0;
		parent_p.setLayout(layout);
		// Creates the title composite
		_explorerContextualTitle = new TabbedPropertyTitle(parent_p, new TabbedPropertySheetWidgetFactory());
		GridData titleLayoutData = new GridData(GridData.FILL_HORIZONTAL);
		// Do grab excess vertical space.
		titleLayoutData.grabExcessVerticalSpace = false;
		_explorerContextualTitle.setLayoutData(titleLayoutData);
		// Sets a default name with no image
		_explorerContextualTitle.setTitle(Messages.ExplorerContextualView_Default_Name, null);

		// Create the main sash form that host inner viewers.
		SashForm mainSashForm = new SashForm(parent_p, SWT.HORIZONTAL);
		Layout gridLayoutTop = new GridLayout(3, true);
		mainSashForm.setLayout(gridLayoutTop);
		mainSashForm.setLayoutData(new GridData(GridData.FILL_BOTH));

		// set the model in the AbstractContentProviderFactory
		AbstractContentProviderFactory.getInstance().setModel(model);

		// Initialize referencing viewer as first element of the main sash form.
		ViewerSorter sorter = new ViewerSorter();
		AbstractContentProvider treeProvider = (AbstractContentProvider) AbstractContentProviderFactory.getInstance().getReferencingContentProvider();
		_referencingViewer = createViewer(mainSashForm, REFERENCING_ELEMENTS_LABEL_TXT, 3, treeProvider.getExplorerId());
		initializeViewer(_referencingViewer, (IContentProvider) treeProvider, AbstractLabelProviderFactory.getInstance().getReferencingLabelProvider(), sorter);

		// Create a sash form as second element of the main sash form.
		// Initialize current viewer as first element of the center sash form.
		treeProvider = (AbstractContentProvider) AbstractContentProviderFactory.getInstance().getCurrentContentProvider();
		_currentViewer = createViewer(mainSashForm, Messages.ExplorerContextualView_Current_Element_Title, 3, treeProvider.getExplorerId());
		initializeViewer(_currentViewer, treeProvider, AbstractLabelProviderFactory.getInstance().getCurrentLabelProvider(), new ViewerSorter() {
			/**
			 * Overridden to force All Related Diagrams and All Related Tables to be located at the end of the tree. {@inheritDoc}
			 */
			@Override
			public int compare(Viewer viewer_p, Object e1_p, Object e2_p) {
				if ((e1_p instanceof CategoryWrapper) && isRepresentationCategory((CategoryWrapper) e1_p)) {
					return 1;
				}
				if ((e2_p instanceof CategoryWrapper) && isRepresentationCategory((CategoryWrapper) e2_p)) {
					return -1;
				}
				return super.compare(viewer_p, e1_p, e2_p);
			}

			/**
			 * Is given category used to displayed diagrams or tables ?
			 * @param categoryWrapper_p
			 * @return
			 */
			private boolean isRepresentationCategory(CategoryWrapper categoryWrapper_p) {
				ICategory category = (ICategory) (categoryWrapper_p).getElement();
				String categoryName = category.getName();
				return categoryName.equals(ALL_RELATED_DIAGRAMS) || categoryName.equals(ALL_RELATED_TABLES);
			}
		});

		// Initialize the referenced viewer as third element of the main sash
		// form.
		treeProvider = (AbstractContentProvider) AbstractContentProviderFactory.getInstance().getReferencedContentProvider();
		_referencedViewer = createViewer(mainSashForm, Messages.ExplorerContextualView_Referenced_Elements_Title, 3, treeProvider.getExplorerId());
		initializeViewer(_referencedViewer, treeProvider, AbstractLabelProviderFactory.getInstance().getReferencedLabelProvider(), sorter);

		initializeContextMenus();
		// Create and set a delegate selection provider, initialized on current
		// viewer.
		_delegateSelectionProvider = new DelegateSelectionProvider(_currentViewer);
		getViewSite().setSelectionProvider(_delegateSelectionProvider);
		makeActions();
    // Listen to Closing/Close session events.
    _semCloseSessionListener = new SemClosedSessionListener();
    SessionManager.INSTANCE.addSessionsListener(_semCloseSessionListener);
	}

	/**
	 * Create a composite widget which contains a treeviewer.
	 * @param parent_p
	 * @param label_p
	 * @param autoExpandLevel_p
	 * @param explorerID
	 * @return the referenced treeviewer
	 */
	protected TreeViewer createViewer(Composite parent_p, String label_p, int autoExpandLevel_p, String explorerID) {
		ExplorerComposite composite = new ExplorerComposite(parent_p, model, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL, label_p, explorerID);
		TreeViewer treeViewer = composite.getTreeviewer();
		// treeViewer.setAutoExpandLevel(autoExpandLevel_p);
		treeViewer.setUseHashlookup(true);
		ColumnViewerToolTipSupport.enableFor(treeViewer, ToolTip.RECREATE);
		addListeners(treeViewer);
		addDndDragSupport(treeViewer);
		return treeViewer;
	}

	/**
	 * Deactivate listening to page selection events.
	 */
	public void deactivateListeningToPageSelectionEvents() {
		if (null != _selectionListener) {
			getSite().getPage().removeSelectionListener(_selectionListener);
			_selectionListener = null;
		}
		__isListeningToPageSelectionEvents = false;
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#dispose()
	 */
	@Override
	public void dispose() {
		// Save view settings.
		saveViewSettings();
		deactivateListeningToPageSelectionEvents();
		if (null != _propertySheetPage) {
			_propertySheetPage.dispose();
			_propertySheetPage = null;
		}
		if (null != _referencingViewer) {
			removeListeners(_referencingViewer);
			_referencingViewer = null;
		}
		if (null != _referencedViewer) {
			removeListeners(_referencedViewer);
			_referencedViewer = null;
		}
		if (null != _currentViewer) {
			removeListeners(_currentViewer);
		}
		_viewerSelectionListener = null;
		_viewerDoubleClickListener = null;
		if (null != _history) {
			_history.dispose();
			_history = null;
		}

		// Remove Closing/Close session listener.
    SessionManager.INSTANCE.removeSessionsListener(_semCloseSessionListener);
    _semCloseSessionListener = null;

		model = null;
		super.dispose();
	}

	/**
	 * @see org.eclipse.ui.navigator.CommonNavigator#getAdapter(java.lang.Class)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter_p) {
		if (IPropertySheetPage.class.equals(adapter_p)) {
			return getPropertySheetPage();
		} 
		if (Control.class.equals(adapter_p)) {
			return getParentControl();
		}
		return super.getAdapter(adapter_p);
	}

	/**
	 * @return the currentViewer
	 */
	@Override
	public TreeViewer getCurrentViewer() {
		return _currentViewer;
	}

	/**
	 * Get dialog settings for this view.
	 * @return
	 */
	private IDialogSettings getDialogSettingsSection() {
		IDialogSettings dialogSettings = ExplorerContextualActivator.getDefault().getDialogSettings();
		String sectionName = getClass().getName();
		// Get the dialog setting for this view.
		IDialogSettings section = dialogSettings.getSection(sectionName);
		if (null == section) {
			section = dialogSettings.addNewSection(sectionName);
		}
		return section;
	}

	/**
	 * @see org.eclipse.amalgam.explorer.contextual.core.ui.view.IExplorerContextualViewPart#getHistory()
	 */
	@Override
	public ExplorerHistory getHistory() {
		if (null == _history) {
			_history = new ExplorerHistory();
		}
		return _history;
	}

	/**
	 * Get parent control, if accessible.
	 * @return <code>null</code> if control could not be resolved.
	 */
	protected Control getParentControl() {
		if (null != _explorerContextualTitle) {
			return _explorerContextualTitle.getParent();
		}
		return null;
	}

	/**
	 * Gets the property sheet page.
	 */
	protected TabbedPropertySheetPage getPropertySheetPage() {
		if (null == _propertySheetPage) {
			_propertySheetPage = new TabbedPropertySheetPage(this) {
				/**
				 * {@inheritDoc}
				 */
				@Override
				public void labelProviderChanged(LabelProviderChangedEvent event_p) {
					if (!getControl().isDisposed()) {
						super.labelProviderChanged(event_p);
					}
				}

				/**
				 * @see org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage#refresh()
				 */
				@Override
				public void refresh() {
					if (getCurrentTab() != null) {
						super.refresh();
					}
				}
				/**
				 * {@inheritDoc}
				 */
				@SuppressWarnings("synthetic-access")
				@Override
				public void dispose() {
					super.dispose();
					_propertySheetPage = null;
				}

				/**
				 * {@inheritDoc}
				 */
				@Override
				public void init(IPageSite pageSite_p) {
					super.init(pageSite_p);
					pageSite_p.setSelectionProvider(ExplorerContextualView.this.getViewSite().getSelectionProvider());
				}
			};
		}
		return _propertySheetPage;
	}

	/**
	 * @return the referencedViewer
	 */
	@Override
	public TreeViewer getReferencedViewer() {
		return _referencedViewer;
	}

	/**
	 * @return the referencingViewer
	 */
	@Override
	public TreeViewer getReferencingViewer() {
		return _referencingViewer;
	}

	/**
	 * Get the current viewer root element.
	 * @see org.eclipse.amalgam.explorer.contextual.core.ui.view.IExplorerContextualViewPart#getRootElement()
	 */
	@Override
	public EObject getRootElement() {
		return ((AbstractContentProvider) _currentViewer.getContentProvider()).getRootElement();
	}

	/**
	 * Get the selection listener to handle {@link IWorkbenchPage} selection events.
	 * @return
	 */
	protected ISelectionListener getSelectionListener() {
		return new ISelectionListener() {
			/**
			 * @see org.eclipse.ui.ISelectionListener#selectionChanged(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
			 */
			@SuppressWarnings("synthetic-access")
			@Override
			public void selectionChanged(IWorkbenchPart part_p, ISelection selection_p) {
				Object newInput = handleWorkbenchPageSelectionEvent(part_p, selection_p);
				// Set the selected object as new input only if it is an EObject
				final String viewIDToIgnore = ingoredViewAsSelectionProvider();
				if ((null != newInput) && (newInput instanceof EObject)) 
				{
					// Avoid the property view to be selection provider.
					if (viewIDToIgnore != null &&viewIDToIgnore.equals(part_p.getSite().getId())) 
					{
						//clean();
						return;
					}
					// Check the input is different from current one.
					try {
						_shouldSetFocus = false;
						setInput(newInput);
					} finally {
						_shouldSetFocus = true;
					}
				} 
				else 
				{
					if (viewIDToIgnore != null && (part_p != ExplorerContextualView.this) && 
						false == viewIDToIgnore.equals(part_p.getSite().getId())) 
					{ 
						// Avoid the property view to be selection provider.
						// Event sent by another part apart from the Property Sheet view
						// Prevent from displaying elements not related to the workbench current selection.
						clean();
					}
				}
			}
		};
	}

	/**
	 * Handle double click event in the viewpart.
	 * @param event_p
	 */
	protected void handleDoubleClick(DoubleClickEvent event_p) {
		ITreeSelection selection = (ITreeSelection) event_p.getSelection();
		if (!selection.isEmpty()) 
		{
			Object doubleClickedElement = selection.getFirstElement();
			// do nothing if element of the wrapper is the root element.
			// change
			if (doubleClickedElement instanceof ExplorerElementWrapper) 
				doubleClickedElement = ((ExplorerElementWrapper) doubleClickedElement).getElement();

			// Handle an EObject double click event.
			if (doubleClickedElement instanceof EObject) 
			{
				if (_isCtrlKeyPressed) 
					handleDoubleClickWithCtrlKeyPressed(event_p, doubleClickedElement);
				else 
					handleDoubleClickWithCtrlKeyNotPressed(event_p, doubleClickedElement);
			}
		}
	}

	/**
	 * @see org.eclipse.ui.part.ViewPart#init(org.eclipse.ui.IViewSite, org.eclipse.ui.IMemento)
	 */
	@Override
	public void init(IViewSite site_p, IMemento memento_p) throws PartInitException {
		// Specified memento could be null :
		// 1) if the view was not shown when the previous workbench session
		// exited.
		// 2) the view is open by the end-user whereas the workbench is already
		// loaded.
		_memento = restoreViewSettings(memento_p);
		super.init(site_p, _memento);
		Integer value = null;
		if (null != _memento) {
			// Get state of listening to Page selection events.
			value = _memento.getInteger(LISTENING_TO_WORKBENCH_PAGE_SELECTION_EVENTS);
		}

		boolean isListeningOnStartup =
				!ExplorerContextualActivator.getDefault().getPreferenceStore().getBoolean(ExplorerContextualPreferences.PREFS_DISABLE_CONTEXTUAL_EXPLORER_SYNC_ON_STARTUP);
		__isListeningToPageSelectionEvents = (null != value) ? value.intValue() == 1 : isListeningOnStartup;
	}

	/**
	 * Initialize a context menu for given viewer.
	 * @param menuManagerText_p
	 * @param menuManagerId_p
	 * @param viewer_p
	 */
	private void initializeContextMenu(String menuManagerText_p, String menuManagerId_p, TreeViewer viewer_p) {
		MenuManager menuManager = new MenuManager(menuManagerText_p, menuManagerId_p);
		menuManager.setRemoveAllWhenShown(true);
		Tree tree = viewer_p.getTree();
		Menu currentMenu = menuManager.createContextMenu(tree);
		tree.setMenu(currentMenu);
		getSite().registerContextMenu(menuManager, viewer_p);
	}

	/**
	 * Initialize contextual menus of internal viewers.
	 */
	private void initializeContextMenus() {
		initializeContextMenu("current#PopupMenu", null, _currentViewer); //$NON-NLS-1$
		initializeContextMenu("referenced#PopupMenu", null, _referencedViewer); //$NON-NLS-1$
		initializeContextMenu("referencing#PopupMenu", null, _referencingViewer); //$NON-NLS-1$
	}

	/**
	 * Initialize given viewer with specified parameter.<br>
	 * The viewer layout data is set to a {@link GridData#FILL_BOTH}.
	 * @param viewer_p
	 * @param contentProvider_p
	 * @param labelProvider_p
	 * @param sorter_p
	 */
	private void initializeViewer(TreeViewer viewer_p, IContentProvider contentProvider_p, IBaseLabelProvider labelProvider_p, ViewerSorter sorter_p) {
		viewer_p.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
		viewer_p.setContentProvider(contentProvider_p);
		viewer_p.setLabelProvider(labelProvider_p);
		viewer_p.setSorter(sorter_p);
	}

	/**
	 * @return the isCtrlKeyPressed
	 */
	protected boolean isCtrlKeyPressed() {
		return _isCtrlKeyPressed;
	}

	public ImageDescriptor getImageDescriptor(String key_p) {
	    ImageRegistry imageRegistry = ExplorerContextualActivator.getDefault().getImageRegistry();
	    ImageDescriptor imageDescriptor = imageRegistry.getDescriptor(key_p);

	    if (null == imageDescriptor) 
	    {
	      imageDescriptor = AbstractUIPlugin.imageDescriptorFromPlugin(ExplorerContextualActivator.PLUGIN_ID, "icons/" + key_p);
	      imageRegistry.put(key_p, imageDescriptor);
	    }
	    return imageDescriptor;
	  }
	
	protected IAction limitateTreeExpansionAction;
	
	/**
	 * Make actions.
	 */
	protected void makeActions() {
		IActionBars actionBars = getViewSite().getActionBars();
		IToolBarManager toolBarManager = actionBars.getToolBarManager();
		// Add history actions.
		_backAction = ExplorerActionFactory.BACKWARD_HISTORY.create(getViewSite().getWorkbenchWindow(), this);
		_backAction.setActionDefinitionId("org.eclipse.amalgam.explorer.contextual.core.ui.backwardNavigation"); //$NON-NLS-1$
		toolBarManager.add(_backAction);

		_forwardAction = ExplorerActionFactory.FORWARD_HISTORY.create(getViewSite().getWorkbenchWindow(), this);
		_forwardAction.setActionDefinitionId("org.eclipse.amalgam.explorer.contextual.core.ui.forwardNavigation"); //$NON-NLS-1$
		toolBarManager.add(_forwardAction);

		// Add limitate tree expansion action.
		limitateTreeExpansionAction = new Action(null, IAction.AS_CHECK_BOX) {
			@Override
			public void run() {
				model.setLimitateTreeExpansion(isChecked());
				Object input = getCurrentViewer().getInput();
				setInputOnViewers(input);
			}
		};
		limitateTreeExpansionAction.setChecked(model.doesLimitateTreeExpansion());
		limitateTreeExpansionAction.setToolTipText(Messages.ExplorerContextualView_LimitateTreeExpansionAction_Tooltip);
		limitateTreeExpansionAction.setImageDescriptor(getImageDescriptor(IImageKeys.IMG_COLLAPSE_CATEGORIES));
		toolBarManager.add(limitateTreeExpansionAction);    

		// Add refresh action.
		IAction refreshAction = new Action(null, getImageDescriptor(IImageKeys.IMG_REFRESH)) {
			@Override
			public void run() {
				Object input = getCurrentViewer().getInput();
				refreshTitleBar(input);
				setInputOnViewers(input);
			};
		};
		toolBarManager.add(refreshAction);

		// Add the listening action (i.e button synch checked button).
		IAction listeningToPageSelectionEventsAction = new Action(null, IAction.AS_CHECK_BOX) {
			private ISelection getSelection(IWorkbenchPart part_p) {
				return part_p.getSite().getSelectionProvider().getSelection();
			}

			private boolean isSomethingSelectable(ISelection selection) {
				return (null != selection) && !selection.isEmpty();
			}

			/**
			 * @see org.eclipse.jface.action.Action#run()
			 */
			@SuppressWarnings("synthetic-access")
			@Override
			public void run() {
				if (isChecked()) 
				{
					activateListeningToPageSelectionEvents();
					// Get the current selection.
					IWorkbenchPage activePage = getSite().getPage();
					// Get the active part to get something selectable.
					IWorkbenchPart activePart = activePage.getActivePart();
					IWorkbenchPart part = null;
					ISelection selection = null;
					if ((null != activePart) && (ExplorerContextualView.this != activePart)) 
					{
						// Handle selection at view creation time.
						ISelectionProvider selectionProvider = activePart.getSite().getSelectionProvider();
						if (null != selectionProvider) {
							selection = selectionProvider.getSelection();
							if (isSomethingSelectable(selection)) {
								part = activePart;
							}
						}
					} 
					else 
					{
						String viewIDForSyncAction = getViewIDForSyncAction();
						if (null != viewIDForSyncAction && false == viewIDForSyncAction.isEmpty())
						{
							IViewPart viewPart = activePage.findView(viewIDForSyncAction);
							if (null != viewPart) 
							{
								// The viewPart is displayed.
								selection = getSelection(viewPart);
								if (isSomethingSelectable(selection)) 
								{
									part = viewPart;
								}
							}
							if (null == part) 
							{
								// Try to get a selection from active editor.
								IEditorPart activeEditor = activePage.getActiveEditor();
								if (null != activeEditor) 
								{
									selection = getSelection(activeEditor);
									if (isSomethingSelectable(selection)) 
									{
										part = activeEditor;
									}
								}
							}
						}
						
					}
					if (null != part) 
					{
						// Something to select.
						_selectionListener.selectionChanged(part, selection);
					}
				} 
				else 
				{
					deactivateListeningToPageSelectionEvents();
				}
			}
		};
		
		listeningToPageSelectionEventsAction.setText(Messages.ExplorerContextualView_ListeningToPageSelectionEventsAction_Title);
		listeningToPageSelectionEventsAction.setToolTipText(Messages.ExplorerContextualView_ListeningToPageSelectionEventsAction_Tooltip);
		listeningToPageSelectionEventsAction.setImageDescriptor(getImageDescriptor(IImageKeys.IMG_LISTENING_TO_PAGE_SELECTION_EVENTS));
		toolBarManager.add(listeningToPageSelectionEventsAction);
		// Restore state from boolean that keeps the state.
		listeningToPageSelectionEventsAction.setChecked(__isListeningToPageSelectionEvents);
		// If enable, listen to selection events.
		if (__isListeningToPageSelectionEvents) {
			// Run the action enables the listening and get the current
			// selection.
			listeningToPageSelectionEventsAction.run();
		}
	}

	/**
	 * @see org.eclipse.amalgam.explorer.contextual.core.ui.view.IExplorerContextualViewPart#refresh()
	 */
	@Override
	public void refresh() {
		ViewerHelper.refresh(_referencingViewer);
		ViewerHelper.refresh(_referencedViewer);
		ViewerHelper.refresh(_currentViewer);
	}

	protected void refreshPropertyPage(ISelectionProvider selectionProvider_p) {
		// Notify the property page to refresh with the new selection.
		// Be careful, the properties view can be closed, don't send it
		// selection changes.
		IStructuredSelection selection = (IStructuredSelection) selectionProvider_p.getSelection();
		if ((null != _propertySheetPage) && (!_propertySheetPage.getControl().isDisposed())) {
			ISelectionProvider pageSelectionProvider = _propertySheetPage.getSite().getSelectionProvider();
			if ((null == pageSelectionProvider) || (pageSelectionProvider != selectionProvider_p)) {
				_propertySheetPage.getSite().setSelectionProvider(selectionProvider_p);
			}
			_propertySheetPage.selectionChanged(ExplorerContextualView.this, selection);
		}
	}

	/**
	 * @param input_p
	 */
	@SuppressWarnings("synthetic-access")
	public void setInputOnViewers(final Object input_p) {
		TreeViewer currentViewer = getCurrentViewer();

		if ((currentViewer != null) && ((currentViewer.getControl() != null) && !(currentViewer.getControl().isDisposed()))) {
			Display display = currentViewer.getControl().getDisplay();

			BusyIndicator.showWhile(display, new Runnable() {
				@Override
				public void run() {

					// Broadcast "set input" signal to all viewers.
					ViewerHelper.run(_referencingViewer, new Runnable() {
						@Override
						public void run() {
							if ((_referencingViewer.getControl() != null) && !_referencingViewer.getControl().isDisposed()) {
								_referencingViewer.setInput(input_p);
							}
						}
					});
					ViewerHelper.run(_referencedViewer, new Runnable() {
						@Override
						public void run() {
							if ((_referencedViewer.getControl() != null) && !_referencedViewer.getControl().isDisposed()) {
								_referencedViewer.setInput(input_p);
							}
						}
					});
					ViewerHelper.run(_currentViewer, new Runnable() {
						@Override
						public void run() {
							if ((_currentViewer.getControl() != null) && !_currentViewer.getControl().isDisposed()) {
								_currentViewer.setInput(input_p);
							}
						}
					});
				}
			});
		}
	}
	
	/**
	 * Return the title to display in the Contextual Explorer View depending on the selected element.
	 * @param object_p the selected element that is the current input of Contextual Explorer View
	 * @return A Title composed of <code>object_p</code> EClass name and <code>object_p</code> text as displayed in the view.
	 */
	public static String getTitle(EObject object_p){
		String title = AbstractLabelProviderFactory.getInstance().getCurrentLabelProvider().getText(object_p);
		AdapterFactoryEditingDomain editingDomain = (AdapterFactoryEditingDomain) AdapterFactoryEditingDomain.getEditingDomainFor(object_p);
		if (editingDomain != null) 
		{
			IEditingDomainItemProvider provider = AdapterFactoryEditingDomain.getEditingDomainItemProviderFor(object_p);
			if (provider instanceof ItemProviderAdapter) 
			{
				EClass eClass = object_p.eClass();
				try {
					String className = ((ItemProviderAdapter)provider).getString("_UI_" + eClass.getName() + "_type");
					if (null != className && 
						false == className.isEmpty())
					{
						className = "[" + className + "]";
					}

					if (false == title.equals(className))
					{
						title = className +  " "+ title;
					}
				}
				catch (MissingResourceException e) {
				}
			}
		}

		return title;
	}

	/**
	 * Updates the title bar.
	 */
	protected void refreshTitleBar(Object selectedElement_p) {
		String title = Messages.ExplorerContextualView_Default_Name;
		Image image = null;
		if (null != selectedElement_p) {
			// Get title to display
			title = getTitle((EObject) selectedElement_p);

			// The image to display
			image = AbstractLabelProviderFactory.getInstance().getCurrentLabelProvider().getImage(selectedElement_p);
		}
		
		if (!_explorerContextualTitle.isDisposed()) 
		{
			_explorerContextualTitle.setRedraw(false);
			_explorerContextualTitle.setTitle(title, image);
			_explorerContextualTitle.setRedraw(true);
		}
	}

	/**
	 * Remove listeners registered on given viewer.
	 */
	protected void removeListeners(TreeViewer viewer_p) {
		viewer_p.removeDoubleClickListener(_viewerDoubleClickListener);
		viewer_p.removeSelectionChangedListener(_viewerSelectionListener);
	}

	/**
	 * Restore view settings.
	 */
	private IMemento restoreViewSettings(IMemento memento_p) {
		IMemento memento_l = memento_p;
		// Specified memento is null, let's get it from view settings
		// persistence.
		if (null == memento_l) {
			// Indeed, if the view was not shown when the previous workbench
			// session exited, no memento is provided.
			// The only chance to restore current state is to get the memento
			// from its persisted representation in view settings (if any).
			String persistedMemento = _viewSettings.get(TAG_MEMENTO);
			if (null != persistedMemento) {
				try {
					memento_l = XMLMemento.createReadRoot(new StringReader(persistedMemento));
				} catch (WorkbenchException exception_p) {
					// Don't do anything. Simply don't restore the settings
				}
			}
		}
		return memento_l;
	}

	/**
	 * @see org.eclipse.ui.part.ViewPart#saveState(org.eclipse.ui.IMemento)
	 */
	@Override
	public void saveState(IMemento memento_p) {
		memento_p.putInteger(LISTENING_TO_WORKBENCH_PAGE_SELECTION_EVENTS, __isListeningToPageSelectionEvents ? 1 : 0);
	}

	/**
	 * Save the dialog settings for this view.
	 */
	private void saveViewSettings() {
		String rootName = getClass().getSimpleName();
		// Create a new memento.
		XMLMemento memento = XMLMemento.createWriteRoot(rootName);
		// Save current state in it.
		// Notice, that the saveState() method is also called by the workbench
		// when exiting before the dispose() method.
		// Nevertheless, we keep this call here, to make sure current state is
		// stored within a running workbench session where the saveState()
		// method is not called.
		saveState(memento);
		StringWriter writer = new StringWriter();
		try {
			memento.save(writer);
			_viewSettings.put(TAG_MEMENTO, writer.getBuffer().toString());
		} catch (IOException exception_p) {
			// Don't do anything. Simply don't store the settings
		}
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		ISelectionProvider selectionProvider = _delegateSelectionProvider.getDelegate();
		// Make sure the selection provider is tree viewer.
		if ((null != selectionProvider) && (selectionProvider instanceof TreeViewer)) {
			((TreeViewer) selectionProvider).getControl().setFocus();
		} else {
			_currentViewer.getControl().setFocus();
		}
	}

	/**
	 * @see org.eclipse.amalgam.explorer.contextual.core.ui.view.IExplorerContextualViewPart#setInput(java.lang.Object)
	 */
	@Override
	public void setInput(final Object input_p) {
		// Precondition: do not set the same input twice.
		TreeViewer currentViewer = getCurrentViewer();
		Object lastInput = currentViewer.getInput();
		if ((null != lastInput) && (lastInput.equals(input_p))) {
			return;
		}
		refreshTitleBar(input_p);
		// Set the selection provider with currentViewer as selection provider.
		_delegateSelectionProvider.setDelegate(_currentViewer);

		// Broadcast "set input" signal to all viewers.
		setInputOnViewers(input_p);

		onSetNewInput((EObject) input_p, (EObject) lastInput);

		// Update history mechanism.
		getHistory().update(input_p);
		// Force to reset the focus and the underlying selection provider.
		// From platform selection changed event, the setFocus is disabled.
		if (_shouldSetFocus) 
		{
			// Set focus in another thread UI processing.
			setFocus();
		}
	}

	/**
	 * Update the view site selection provider with specified one.
	 * @param newSelectionProvider_p
	 */
	protected void updateSelectionProvider(ISelectionProvider newSelectionProvider_p) {
		// Set the selection provider if necessary.
		ISelectionProvider currentSelectionProvider = _delegateSelectionProvider.getDelegate();
		if ((null == currentSelectionProvider) || (currentSelectionProvider != newSelectionProvider_p)) {
			_delegateSelectionProvider.setDelegate(newSelectionProvider_p);
		}
	}

	/**
	 * Is Contextual Explorer listening to {@link IWorkbenchPage} selection events.
	 * @return the isListeningToPageSelectionEvents
	 */
	public static boolean isListeningToPageSelectionEvents() {
		return __isListeningToPageSelectionEvents;
	}


	/**
	 * Handle workbench page selection events.<br>
	 * @param part_p
	 * @param selection_p
	 * @return <code>null</code> means no element found from selection.
	 */
	protected Object handleWorkbenchPageSelectionEvent(IWorkbenchPart part_p, ISelection selection_p){
		Object result = null;
		if (!selection_p.isEmpty() && !(part_p instanceof ExplorerContextualView))
		{
			if (selection_p instanceof IStructuredSelection) 
			{
				IStructuredSelection selection_l = (IStructuredSelection) selection_p;
				Object firstElement = selection_l.getFirstElement();
				result = SelectionHelpersManager.getInstance().getSelection(part_p, selection_p, firstElement);
			}
		}
		
		return result;
	}
	
	/**********************************************************************************************/
	/******************************* new methods **************************************************/
	/**********************************************************************************************/
	
	/**
	 * This log an error message in the console. Derived classes can use their own way to log errors
	 * @param message the error message to log
	 * @param throwable the {@link Throwable} 
	 */
	public void logError(String message, Throwable throwable){
		ExplorerContextualActivator.getDefault().getLog().log(new Status(IStatus.ERROR,ExplorerContextualActivator.PLUGIN_ID,message,throwable));
	}

	/**
	 * Derived classes can't change this method behavior.
	 * 
	 * When Ctrl key is pressed and when user double click on an element, so this element is used as 
	 * new input for Contextual Explorer 
	 * @param event_p the {@link DoubleClickEvent} event
	 * @param object_p the double clicked element
	 */
	protected final void handleDoubleClickWithCtrlKeyPressed(DoubleClickEvent event_p, Object object_p){
		if (getRootElement() != object_p) 
		{
			// CTRL is pressed, let's navigate...
			setInput(object_p);
			// Set and reveal the focused element.
			_currentViewer.setSelection(new StructuredSelection(object_p), true);
		}
	}
	
	/**
	 * By default, Contextual Explorer Contributor ID is used, but derived classes can use their own contributor ID.
	 */
	@Override
	public String getContributorId() {
		return EXPLORER_CONTEXTUAL_CONTRIBUTOR_ID;
	}
	
	/**
	 * Allows to do action when Ctrl key is'nt pressed and user double click on one element.
	 * @param event_p The {@link DoubleClickEvent} Event
	 * @param object_p concerned element
	 */
	protected void handleDoubleClickWithCtrlKeyNotPressed(DoubleClickEvent event_p, Object object_p){
		// Nothing to do
		// Derived classes can implement this method.
	}
	
	/**
	 * Custom actions to do when Contextual Explorer input element changes
	 * @param input_p the new input
	 * @param lastInput_p the previous input
	 */
	protected void onSetNewInput(Object input_p, Object lastInput_p){
		// Nothing to do
		// Derived classes can implement this method.
	}

	public abstract boolean isSemanticElements(Collection<?> objects_p);

	/**
	 * The ID of the view to synchronize with Contextual Explorer selection change
	 * @return the view ID
	 */
	protected abstract String getViewIDForSyncAction();
	
	/**
	 * The ID of the view to ignore when listening to selection changes
	 * @return the view ID
	 */
	protected abstract String ingoredViewAsSelectionProvider();
	
  /**
   * Listener that listens to closing and closed session events.
   */
	class SemClosedSessionListener extends SessionManagerListener.Stub {
    @Override
    public void notify(final Session updated_p, final int notification_p) {
      switch (notification_p) {
        case SessionListener.CLOSING:
          Object currentInput = getCurrentViewer().getInput();
          if (currentInput instanceof EObject) {
            // Get the session of current displayed object.
            Session session = SessionManager.INSTANCE.getSession((EObject) currentInput);
            if (updated_p.equals(session)) {
              clean();
            }
          }
        break;
        case SessionListener.CLOSED:
          // Update history to clean dead entries.
          getHistory().update(null);
        break;
      }
    }
	}
}
