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
package org.eclipse.amalgam.explorer.activity.ui.api.editor;

import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import org.eclipse.amalgam.explorer.activity.ui.ActivityExplorerActivator;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.input.ActivityExplorerEditorInput;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.CommonActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.DocumentationActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.OverviewActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.manager.ActivityExplorerManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.extension.point.manager.ActivityExplorerExtensionManager;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IActivityExplorerEditorSessionListener;
import org.eclipse.amalgam.explorer.activity.ui.internal.intf.IVisibility;
import org.eclipse.amalgam.explorer.activity.ui.internal.util.ActivityExplorerLoggerService;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionListener;
import org.eclipse.sirius.business.api.session.SessionStatus;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.IFormPage;
import org.eclipse.ui.forms.editor.SharedHeaderFormEditor;
import org.eclipse.ui.part.IPageSite;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * Base class to implement Activity Explorer.
 */
public class ActivityExplorerEditor extends SharedHeaderFormEditor implements ITabbedPropertySheetPageContributor,
		IPropertyChangeListener, IActivityExplorerEditorSessionListener {

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
		ActivityExplorerManager.INSTANCE.addActivityExplorerEditorListener(this);
		_partListener = new ActivityExplorerEditorPartListener(this);
	}

	@Override
	public void setFocus() {
		super.setFocus();
		getContainer().setFocus();
		ActivityExplorerManager.INSTANCE.setEditor(this);
	}

	/**
	 * @see org.eclipse.ui.forms.editor.FormEditor#addPages()
	 */
	@Override
	protected void addPages() {
		try {

			// set editor in the Activity Explorer Manager
			ActivityExplorerManager.INSTANCE.setEditor(this);

			// Add other Pages (plug-ins contribution)
			createContributedPages();

		} catch (PartInitException exception) {
			StringBuilder loggerMessage = new StringBuilder("ActivityExplorerEditor.addPages(..) _ "); //$NON-NLS-1$
			loggerMessage.append(exception.getMessage());

			ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, loggerMessage.toString(), exception);

		} catch (Exception exception) {
			StringBuilder loggerMessage = new StringBuilder("ActivityExplorerEditor.addPages(..) _ "); //$NON-NLS-1$
			loggerMessage.append(exception.getMessage());

			ActivityExplorerLoggerService.getInstance().log(IStatus.WARNING, loggerMessage.toString(), exception);

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
		Vector<CommonActivityExplorerPage> result = new Vector<CommonActivityExplorerPage>(pages.size());
		for (Object obj : pages) {
			if (obj instanceof CommonActivityExplorerPage) {
				result.add((CommonActivityExplorerPage) obj);
			}
		}
		return result;
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
		List<CommonActivityExplorerPage> contributedPages = ActivityExplorerExtensionManager.getAllPages();
		Collections.sort(contributedPages);
		addOverviewPage(contributedPages);
		addContributedPages(contributedPages);
	}

	private void addContributedPages(List<CommonActivityExplorerPage> contributedPages) {
		for (CommonActivityExplorerPage page : contributedPages) {
			if ((page instanceof IVisibility) && !(page.getPosition() == 0)) {
				try {
					if (page.isVisible()) {
						addNewPage(page);
					}
				} catch (Throwable e) {

					StringBuilder loggerMessage = new StringBuilder(
							"ActivityExplorerEditor.addContributedPages(..) _ "); //$NON-NLS-1$
					loggerMessage
							.append("An error was occured at the evaluation of the predicat or the adding of page ") //$NON-NLS-1$
							.append(page.getId());
					loggerMessage.append(". Refer to the exception stack for more details"); //$NON-NLS-1$

					ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, loggerMessage.toString(), e);
				}
			}
		}
	}

	/**
	 * Find a first visible overview page which it index is 0
	 * 
	 * @param contributedPages
	 * @throws PartInitException
	 */
	private void addOverviewPage(List<CommonActivityExplorerPage> contributedPages) throws PartInitException {
		OverviewActivityExplorerPage overviewPage = null;

		for (CommonActivityExplorerPage page : contributedPages) {

			try {
				// Force to accept only overview page at the index 0.
				if (page.getPosition() == 0) {

					// bug 485652: check the visibility
					if ((page instanceof OverviewActivityExplorerPage) && (page.isVisible())) {
						overviewPage = (OverviewActivityExplorerPage) page;
						break;
					} else {
						// Log visibile pages with index 0 which are not
						// Overview pages
						if (page.isVisible()) {
							StringBuilder loggerMessage = new StringBuilder(
									"ActivityExplorerEditor.addOverviewPage(..) _ "); //$NON-NLS-1$
							loggerMessage.append("Page ").append(page.getId()); //$NON-NLS-1$
							loggerMessage
									.append(" is not an overview page. Only overview pages are allowed to index 0"); //$NON-NLS-1$

							ActivityExplorerLoggerService.getInstance().log(IStatus.WARNING, loggerMessage.toString(),
									null);
						}
					}
				} else {
					// Focus only on pages with index 0.
					// The list is sorted, if the first page has an index
					// different from 0, we stop.
					break;
				}
			} catch (Throwable e) {
				// Unknown errors from contributions
				StringBuilder loggerMessage = new StringBuilder("ActivityExplorerEditor.addOverviewPage(..) _ "); //$NON-NLS-1$
				loggerMessage.append("An error was occured at the evaluation of the predicat of page ") //$NON-NLS-1$
						.append(page.getId());
				loggerMessage.append(". Refer to the exception stack for more details"); //$NON-NLS-1$

				ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, loggerMessage.toString(), e);
			}
		}

		// Add the overview page
		if (overviewPage != null) {
			overviewPage.initialize(this);
		} else {
			// default page
			overviewPage = new OverviewActivityExplorerPage(this);
		}

		addPage(overviewPage);
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
	@Deprecated
	protected OverviewActivityExplorerPage getOrCreateOverviewActivityExplorerPage() {
		List<CommonActivityExplorerPage> contributedPages = ActivityExplorerExtensionManager.getAllPages();
		Collections.sort(contributedPages);
		if (!contributedPages.isEmpty()) {
			CommonActivityExplorerPage page = contributedPages.get(0);
			if ((page instanceof OverviewActivityExplorerPage) && (page.getPosition() == 0)) {
				page.initialize(this);
				return (OverviewActivityExplorerPage) page;
			}
		}
		return new OverviewActivityExplorerPage(this);
	}

	/**
	 * @see org.eclipse.ui.forms.editor.FormEditor#dispose()
	 */
	@Override
	public void dispose() {
		ActivityExplorerManager.INSTANCE.removeActivityExplorerEditorListener(this);

		// Dispose the editor from part listener
		if (null != _partListener) {
			((ActivityExplorerEditorPartListener) _partListener).dispose();
		}

		// If the editor is not initialized yet, the editorSite may be null
		// (i.e, at restarting time)
		IEditorSite editorSite = getEditorSite();
		if (editorSite != null) {
			// Dispose the property sheet page.
			if (null != _propertySheetPage) {
				_propertySheetPage.dispose();
				_propertySheetPage = null;
			}
			// Unregister Sirius session listener.
			unregisterSession();
			// Remove part listener.
			if (null != _partListener) {
				editorSite.getPage().removePartListener(_partListener);
				_partListener = null;
				// Remove preference listener
				ActivityExplorerActivator.getDefault().getPreferenceStore().removePropertyChangeListener(this);

				super.dispose();
			}
		}

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
      try {
        getEditorInput().getSession().save(new NullProgressMonitor());
      } catch (RuntimeException ite) {
        StatusManager.getManager().handle(new Status(IStatus.ERROR, getBundleId(ite), ite.getMessage(), ite), StatusManager.BLOCK);
      }
    }
  }
  
	/**
	 * @param obj
	 * @return the bundle containing the object's class or the class's name if it's not contained in a bundle
	 */
  private String getBundleId(Object obj) {
    Bundle bundle = FrameworkUtil.getBundle(obj.getClass());
    if (bundle != null)
    {
      return bundle.getSymbolicName();
    }
    return obj.getClass().getCanonicalName();
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

		IStatus status = ((ActivityExplorerEditorInput) input).getStatus();
		if (!status.isOK()) {
			throw new PartInitException(status);
		}

		super.init(site, input);

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
	 * Unregister the session listener and set the session to <code>null</code>.
	 */
	private void unregisterSession() {
		ActivityExplorerEditorInput editorInput = getEditorInput();
		if (null != editorInput) {
			Session session = editorInput.getSession();
			if (null != session) {
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
			StringBuilder loggerMessage = new StringBuilder("ActivityExplorerEditor.addNewPage(..) _ "); //$NON-NLS-1$
			loggerMessage.append(e.getMessage());

			ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, loggerMessage.toString(), e);
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
			ListIterator<? extends Object> it = pages.listIterator(i);
			if (it.hasPrevious()) {
				Object prev = it.previous();
				if (prev instanceof IFormPage) {
					previousPage = (IFormPage) prev;
				}
			}
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
			ListIterator<Object> it = pages.listIterator(i + 1);
			if (it.hasNext()) {
				Object obj = it.next();
				if (obj instanceof IFormPage) {
					nextPage = (IFormPage) obj;
				}
			}

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
		boolean value = (Boolean.valueOf(event.getNewValue().toString()));
		if (doPropertyChange(event, value, property)) {
			if (ActivityExplorerManager.INSTANCE.getEditor() != null) {
				ActivityExplorerManager.INSTANCE.getEditor().getActivePageInstance().getManagedForm().reflow(true);
			}
		}

	}

	@Override
	public void executeRequest(int request, Session session) {

		ActivityExplorerEditorInput editorInput = getEditorInput();

		if (editorInput != null) {
			Session session2 = editorInput.getSession();
			switch (request) {
			case SessionListener.CLOSING:
				if (session2 != null && session2.equals(session)) {
					Runnable runnable = new Runnable() {
						public void run() {
							close(false);
							ActivityExplorerManager.INSTANCE
									.removeActivityExplorerEditorListener(ActivityExplorerEditor.this);
						}
					};
					run(runnable);
				}
				break;
			case SessionListener.SELECTED_VIEWS_CHANGE_KIND:
				if (session2 != null && session2.equals(session) && session.isOpen()) {
					Runnable runnable = new Runnable() {
						public void run() {
							updateEditorPages(0);
						}
					};
					run(runnable);
				}
				break;
			case SessionListener.REPRESENTATION_CHANGE:
				if (session2 != null && session2.equals(session) && session.isOpen()) {
					_editorDirtyStateChanged();
				}
				break;
			case SessionListener.OPENED:
				break;
			case SessionListener.DIRTY:
			case SessionListener.SYNC:
			case SessionListener.SEMANTIC_CHANGE: // Listening to changes to
													// mark
				if (session2 != null && session2.equals(session) && session.isOpen()) {
					_editorDirtyStateChanged();
				}
				break;
			case SessionListener.REPLACED:
				if (session2 != null && session2.equals(session) && session.isOpen()) {
					_editorDirtyStateChanged();
				}
				break;
			}
		} else {
			// Remove the editors with no editor input
			ActivityExplorerManager.INSTANCE.removeActivityExplorerEditorListener(this);
		}
	}

	private void _editorDirtyStateChanged() {
		Runnable runnable = new Runnable() {
			public void run() {
				IManagedForm headerForm = getHeaderForm();
				if (headerForm != null)
					headerForm.dirtyStateChanged();
			}
		};
		run(runnable);
	}

	protected void run(Runnable runnable) {
		if (null != runnable) {
			Display display = Display.getCurrent();
			if (null == display) {
				PlatformUI.getWorkbench().getDisplay().asyncExec(runnable);
			} else {
				runnable.run();
			}
		}
	}
}
