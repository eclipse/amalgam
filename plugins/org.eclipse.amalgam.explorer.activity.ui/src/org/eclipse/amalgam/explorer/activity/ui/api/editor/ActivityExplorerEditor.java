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
package org.eclipse.amalgam.explorer.activity.ui.api.editor;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.CommonActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.ActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.BasicSessionActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.DocumentationActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.OverviewActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IVisibility;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.business.api.session.SessionStatus;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.editor.SharedHeaderFormEditor;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

/**
 * Base class to implement Activity Explorer.
 * 
 */
public class ActivityExplorerEditor extends SharedHeaderFormEditor implements ITabbedPropertySheetPageContributor,
		IPropertyChangeListener {
	/**
	 * Logger.
	 */
	// private static final Logger __logger =
	// ReportManagerRegistry.getInstance().subscribe(IReportManagerDefaultComponents.UI);
	/**
	 * Editor ID.
	 */
	public static final String ID = "org.eclipse.amalgam.explorer.activity.ui.editor.activityExplorerEditor"; //$NON-NLS-1$
	/**
	 * Part listener to detect editor activation.
	 */
	private IPartListener _partListener;
	/**
	 * Property Sheet page.
	 */
	private TabbedPropertySheetPage _propertySheetPage;

	public ActivityExplorerEditor() {
		ActivityExplorerManager.INSTANCE.setEditor(this);
	}

	/**
	 * @see org.eclipse.ui.forms.editor.FormEditor#addPages()
	 */
	@Override
	protected void addPages() {
		try {

			// OVERVIEW IS FIRST PAGE (Default or contributed)
			OverviewActivityExplorerPage overViewPage = getOrCreateOverviewActivityExplorerPage();
			addPage(overViewPage);

			// set editor in the  Activity Explorer Manager
			ActivityExplorerManager.INSTANCE.setEditor(this);
			// Add other Pages (plug-ins contribution)
			createContributedPages();

		} catch (PartInitException exception) {
			StringBuilder loggerMessage = new StringBuilder("ActivityExplorerEditor.addPages(..) _ "); //$NON-NLS-1$
			loggerMessage.append(exception.getMessage());
		}
		// Add a control listener to force reflow
		getContainer().addControlListener(new ControlListener() {
			public void controlMoved(ControlEvent cevent) {
				// Do nothing.

			}

			public void controlResized(ControlEvent cevent) {
				IFormPage activePageInstance = ActivityExplorerEditor.this.getActivePageInstance();
				IManagedForm managedForm = activePageInstance.getManagedForm();
				managedForm.reflow(true);
			}
		});
		// Refresh dirty state when the part is activated : open time for
		// instance.
		getHeaderForm().dirtyStateChanged();
		ActivityExplorerActivator.getDefault().getPreferenceStore().addPropertyChangeListener(this);

		// because the pages is update later
		pages.remove(null);

	}

	/**
	 * Returns all pages in the Editor
	 * 
	 * @return Vector<AbstractActivityExplorerPage>
	 */
	@SuppressWarnings("unchecked")
	public Vector<CommonActivityExplorerPage> getPages() {
		return pages;
	}

	/**
	 * Remove all Pages contained in this editor.
	 */
	public void removeAllPages() {
		int count = super.getPageCount();
		for (int i = 0; i < count; i++) {
			this.removePage(0);
		}
	}

	/**
	 * Create and Insert Contributed pages in the editor
	 */
	private void createContributedPages() throws PartInitException {
		List<CommonActivityExplorerPage> temp = ActivityExplorerExtensionManager.getAllPages();
		Collections.sort(temp);
		for (CommonActivityExplorerPage page : temp) {
			if (page instanceof IVisibility && !(page.getPosition() == 0))
				if (page.isVisible()) {
					addNewPage(page);

				}
		}
	}

	/**
	 * Create a documentation page.
	 * 
	 * @return a not <code>null</code> instance.
	 */
	protected IFormPage createDocumentationPage() {
		return new DocumentationActivityExplorerPage(this);
	}

	/**
	 * Get or create the main Overview page
	 * 
	 * @return a not <code>null</code> instance.
	 */
	protected OverviewActivityExplorerPage getOrCreateOverviewActivityExplorerPage() {
	  List<CommonActivityExplorerPage> contributedPages = ActivityExplorerExtensionManager.getAllPages();
    Collections.sort(contributedPages);
    if(!contributedPages.isEmpty()){
      CommonActivityExplorerPage page = contributedPages.get(0);
      if(page instanceof OverviewActivityExplorerPage && page.getPosition() == 0){
        page.initialize(this);
        return (OverviewActivityExplorerPage)page;
      }
    }
		return new OverviewActivityExplorerPage(this);
	}

	/**
	 * @see org.eclipse.ui.forms.editor.FormEditor#dispose()
	 */
	@Override
	public void dispose() {
		// Dispose the property sheet page.
		if (null != _propertySheetPage) {
			_propertySheetPage.dispose();
			_propertySheetPage = null;
		}
		// Unregister Sirius session listener.
		unregisterSession();
		// Remove part listener.
		if (null != _partListener) {
			getEditorSite().getPage().removePartListener(_partListener);
			_partListener = null;
		}
		super.dispose();

		if (null != getEditorInput()) {
			getEditorInput().dispose();
		}
	}

	/**
	 * @see org.eclipse.ui.part.EditorPart#doSave(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public void doSave(IProgressMonitor monitor) {
		if (isDirty()) {
			getEditorInput().getSession().save(new NullProgressMonitor());
		}
	}

	/**
	 * @see org.eclipse.ui.part.EditorPart#doSaveAs()
	 */
	@Override
	public void doSaveAs() {
		// Do nothing.
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		if (IPropertySheetPage.class.equals(adapter)) {
			return getOrCreatePropertySheetPage();
		}
		return super.getAdapter(adapter);
	}

	public static final String PROPERTIES_CONTRIBUTOR = "org.eclipse.amalgam.explorer.activity.ui.editor.properties"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 */
	public String getContributorId() {
		return getSite().getId();// PROPERTIES_CONTRIBUTOR;
	}

	/**
	 * @see org.eclipse.ui.part.EditorPart#getEditorInput()
	 */
	@Override
	public ActivityExplorerEditorInput getEditorInput() {
		return (ActivityExplorerEditorInput) super.getEditorInput();
	}

	/**
	 * Get or create (first call) the property sheet page.
	 */
	private IPropertySheetPage getOrCreatePropertySheetPage() {
		if ((null == _propertySheetPage)) {
			_propertySheetPage = new TabbedPropertySheetPage(this) {
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
				public void init(IPageSite pageSite) {
					super.init(pageSite);
					pageSite.setSelectionProvider(ActivityExplorerEditor.this.getEditorSite().getSelectionProvider());
				}
			};
		}
		return _propertySheetPage;
	}

	/**
	 * @see org.eclipse.ui.part.WorkbenchPart#getPartName()
	 */
	@Override
	public String getPartName() {
		return getEditorInput().getName() + Messages.ActivityExplorerEditor_Title_Suffix;
	}

	/**
	 * Get property sheet page accessor.
	 * 
	 * @return <code>null</code> if the property sheet view is not displayed.
	 */
	public TabbedPropertySheetPage getPropertySheetPage() {
		return _propertySheetPage;
	}

	/**
	 * @see org.eclipse.ui.forms.editor.FormEditor#init(org.eclipse.ui.IEditorSite,
	 *      org.eclipse.ui.IEditorInput)
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		if (null == ((ActivityExplorerEditorInput) input).getRootSemanticElement()) {
			throw new PartInitException(new Status(IStatus.WARNING, ActivityExplorerActivator.ID,
					Messages.ActivityExplorerEditor_1));
		}
		super.init(site, input);

		// PArt listener to detect when this editor is activated.
		_partListener = new IPartListener() {
			/**
			 * {@inheritDoc}
			 */
			public void partActivated(IWorkbenchPart part) {
				if (ActivityExplorerEditor.this == part) {
					IFormPage activePageInstance = ActivityExplorerEditor.this.getActivePageInstance();
					// Make sure action bars

					// send Fake Notification to SessionListener
					if (activePageInstance instanceof CommonActivityExplorerPage) {

						Session session = getEditorInput().getSession();
						if (session != null)
							SessionManager.INSTANCE.notifyRepresentationCreated(session);
					}

					if (activePageInstance instanceof ActivityExplorerPage)
						((ActivityExplorerPage) activePageInstance).updateActionBars();
				}
			}

			/**
			 * {@inheritDoc}
			 */

			public void partBroughtToTop(IWorkbenchPart part) {
				// Do nothing.
			}

			/**
			 * {@inheritDoc}
			 */

			public void partClosed(IWorkbenchPart part) {
				// Do nothing.
			}

			/**
			 * {@inheritDoc}
			 */

			public void partDeactivated(IWorkbenchPart part) {
				// Do nothing.
			}

			/**
			 * {@inheritDoc}
			 */
			public void partOpened(IWorkbenchPart part) {
				// Do nothing.
			}
		};
		getEditorSite().getPage().addPartListener(_partListener);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isDirty() {
		final Session session = getEditorInput().getSession();
		if (null != session) {
			return SessionStatus.DIRTY.equals(session.getStatus());
		}
		return false;
	}

	/**
	 * @see org.eclipse.ui.part.EditorPart#isSaveAsAllowed()
	 */
	@Override
	public boolean isSaveAsAllowed() {
		// Not applicable in this editor.
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isSaveOnCloseNeeded() {
		// See with SBo, we don't want to save on close.
		return false;
	}

	/**
	 * Mark given page as dirty.
	 * 
	 * @param page
	 */
	@SuppressWarnings("unused")
	private void markArchitecturePageAsDirty(BasicSessionActivityExplorerPage page) {
		if (null != page) {
			page.markAsDirty();
		}
	}

	/**
	 * Unregister the session listener and set the session to <code>null</code>.
	 */
	private void unregisterSession() {
		ActivityExplorerEditorInput editorInput = getEditorInput();
		if (null != editorInput) {
			Session session = editorInput.getSession();
			if (null != session) {
				// Remove the session listener.
				// SessionManager.INSTANCE.removeSessionsListener(this);
				session = null;
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Image getTitleImage() {
		ILabelDecorator decorator = PlatformUI.getWorkbench().getDecoratorManager().getLabelDecorator();
		Image decoratedImage = decorator.decorateImage(super.getTitleImage(), getEditorInput().getSession());

		return decoratedImage;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void setTitleImage(Image titleImage) {
		super.setTitleImage(titleImage);
	}

	private int addNewPage(IFormPage page) {
		int index = 0;

		page.initialize(this);

		try {
			index = addPage(page);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		return index;
	}

	/**
	 * Get the previous page
	 * 
	 * @param current
	 * @return the previous page or null
	 */
	@SuppressWarnings("unchecked")
	public IFormPage getPreviousPage(IFormPage current) {
		IFormPage previousPage = null;
		int i = pages.indexOf(current);
		if (i > -1) {
			ListIterator<CommonActivityExplorerPage> it = pages.listIterator(i);
			if (it.hasPrevious())
				previousPage = it.previous();
		}
		return previousPage;
	}

	/**
	 * Get the next page
	 * 
	 * @param current
	 * @return the next page or null
	 */
	@SuppressWarnings("unchecked")
	public IFormPage getNextPage(IFormPage current) {
		IFormPage nextPage = null;
		int i = pages.indexOf(current);
		if (i > -1) {
			ListIterator<CommonActivityExplorerPage> it = pages.listIterator(i + 1);
			if (it.hasNext())
				nextPage = it.next();
		}
		return nextPage;
	}

	/**
	 * Update the editor Remove and Create pages
	 */
	public void updateEditorPages(int activatedPage) {

		removeAllPages();
		addPages();
		setActivePage(activatedPage); // we set the page ProcessMap activate
		setPartName(getPartName());
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
		if (ActivityExplorerExtensionManager.isPage(property)) {
			this.updateEditorPages(0);
			result = true;
		}
		return result;
	}

	@Override
	public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
		String property = event.getProperty();
		boolean value = ((Boolean) event.getNewValue()).booleanValue();
		if (doPropertyChange(event, value, property)) {
			if (ActivityExplorerManager.INSTANCE.getEditor() != null)
				ActivityExplorerManager.INSTANCE.getEditor().getActivePageInstance().getManagedForm().reflow(true);
		}

	}

}
