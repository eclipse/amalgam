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
package org.eclipse.amalgam.explorer.activity.api.dialog;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.PopupDialog;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.forms.IMessage;
import org.eclipse.ui.forms.widgets.FormText;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;

/**
 * Dialog that opens a popup dialog to display content in a {@link FormText}.
 * 
 */
public class SelectionDialog extends PopupDialog {
	/**
	 * Close the popup dialog.
	 * 
	 */
	private class CloseAction extends Action {
		/**
		 * @see org.eclipse.jface.action.Action#getImageDescriptor()
		 */
		@Override
		public ImageDescriptor getImageDescriptor() {
			return PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_TOOL_DELETE);
		}

		/**
		 * @see org.eclipse.jface.action.Action#getToolTipText()
		 */
		@Override
		public String getToolTipText() {
			return Messages.DescriptionDialog_CloseAction_Title;
		}

		/**
		 * @see org.eclipse.jface.action.Action#run()
		 */
		@Override
		public void run() {
			setReturnCode(CANCEL);
			close();
		}
	}

	private Point _anchor;
	private Composite _composite;
	private FormToolkit _toolkit;
	protected String _title;
	private Object _content;
	private Object selected;
	private ViewerFilter _filter;

	private ILabelProvider _labelProvider;
	private IContentProvider _contentProvider;

	/**
	 * Constructor.
	 * 
	 * @param parent
	 * @param content_p
	 */
	public SelectionDialog(Shell parent, Object content, ILabelProvider labelProvider, IContentProvider contentProvider) {
		this(parent, content, labelProvider, contentProvider, null, null);

	}

	public SelectionDialog(Shell parent, Object content, ILabelProvider labelProvider,
			IContentProvider contentProvider, ViewerFilter filter, String title) {
		super(parent, SWT.NONE, true, false, false, false, false, null, null);
		_anchor = parent.getDisplay().getCursorLocation();
		_toolkit = new FormToolkit(parent.getDisplay());
		_content = content;
		_filter = filter;
		_labelProvider = labelProvider;
		_contentProvider = contentProvider;
		_title = title;
	}

	/**
	 * @see org.eclipse.jface.dialogs.PopupDialog#close()
	 */
	@Override
	public boolean close() {
		if (_toolkit != null) {
			_toolkit.dispose();
			_toolkit = null;
		}
		return super.close();
	}

	/**
	 * @see org.eclipse.jface.dialogs.PopupDialog#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(Composite parent) {
		getShell().setBackground(getShell().getDisplay().getSystemColor(SWT.COLOR_DARK_GRAY));
		initializeBounds();
		return createDialogArea(parent);
	}

	/**
	 * @see org.eclipse.jface.dialogs.PopupDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@SuppressWarnings("synthetic-access")
	@Override
	protected Control createDialogArea(Composite parent) {
		_composite = (Composite) super.createDialogArea(parent);

		ScrolledForm form = _toolkit.createScrolledForm(_composite);

		_toolkit.decorateFormHeading(form.getForm());

		form.setMessage(getTitle(), IMessage.NONE);

		// add a Close button to the toolbar
		form.getToolBarManager().add(new CloseAction());
		form.getToolBarManager().update(true);
		GridLayout layout = new GridLayout();

		layout.marginLeft = 10;
		layout.marginRight = 10;
		layout.marginTop = 10;
		layout.verticalSpacing = 10;
		form.getBody().setLayout(layout);

		PatternFilter patternFilter = new TreeSelectionPatternFilter(_filter);
		FilteredTree filteredTree = new FilteredTree(form.getBody(), SWT.NONE | SWT.SINGLE | SWT.BORDER, patternFilter,
				true);

		_toolkit.adapt(filteredTree);
		// Get the tree viewer.
		final TreeViewer treeViewer = filteredTree.getViewer();

		// Set Content provider.
		treeViewer.setContentProvider(_contentProvider);
		// Set label provider.
		treeViewer.setLabelProvider(_labelProvider);

		// Set Input
		treeViewer.setInput(_content);

		// set Filter
		if (_filter != null)
			treeViewer.addFilter(_filter);
		form.setMinSize(getMinWidth(), getMinHeight());

		// container for button
		Composite container = new Composite(form.getBody(), SWT.NONE);
		container.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_END));
		container.setLayout(new GridLayout(2, true));
		container.setBackground(_toolkit.getColors().getBackground());
		GridDataFactory factory = GridDataFactory.fillDefaults().grab(true, false);

		// new ok button
		Button finish = _toolkit.createButton(container, Messages.SelectionDialog_0, form.getStyle());
		finish.setLayoutData(factory.create());
		// ok button listener
		finish.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				super.widgetSelected(e);
				ISelection selection = treeViewer.getSelection();
				if (selection instanceof IStructuredSelection) {
					selected = ((IStructuredSelection) selection).getFirstElement();
					setReturnCode(OK);
					close();

				}
			}
		});

		// new cancel button
		Button cancel = _toolkit.createButton(container, Messages.SelectionDialog_1, form.getStyle());
		cancel.setLayoutData(factory.create());
		// cancel button listener
		cancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				super.widgetSelected(e);
				setReturnCode(CANCEL);
				close();
			}
		});

		return _composite;
	}

	private int getMinWidth() {
		return 400;
	}

	protected int getMinHeight() {
		return 400;
	}

	protected String getTitle() {
		return _title;
	}

	/**
	 * @see org.eclipse.jface.dialogs.PopupDialog#getFocusControl()
	 */
	@Override
	protected Control getFocusControl() {
		return _composite;
	}

	/**
	 * @see org.eclipse.jface.dialogs.PopupDialog#getInitialLocation(org.eclipse.swt.graphics.Point)
	 */
	@Override
	protected Point getInitialLocation(Point size) {
		if (_anchor == null) {
			return super.getInitialLocation(size);
		}
		Point point = _anchor;
		Rectangle monitor = getShell().getMonitor().getClientArea();
		if (monitor.width < point.x + size.x) {
			point.x = Math.max(0, point.x - size.x);
		}
		if (monitor.height < point.y + size.y) {
			point.y = Math.max(0, point.y - size.y);
		}
		return point;
	}

	public Object getSelection() {
		return selected;
	}

	@Override
	public int open() {

		if (getShell() == null || getShell().isDisposed()) {

			// create the window
			create();
		}

		// limit the shell size to the display size
		constrainShellSize();

		// open the window
		getShell().open();

		// run the event loop if specified
		if (true) {
			runEventLoop(getShell());
		}

		return getReturnCode();
	}

	private void runEventLoop(Shell loopShell) {

		// Use the display provided by the shell if possible
		Display display;
		if (getShell() == null) {
			display = Display.getCurrent();
		} else {
			display = loopShell.getDisplay();
		}

		while (loopShell != null && !loopShell.isDisposed()) {
			try {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			} catch (Throwable e) {
				exceptionHandler.handleException(e);
			}
		}
		if (!display.isDisposed())
			display.update();
	}

	/**
	 * Defines a default exception handler.
	 */
	private static class DefaultExceptionHandler implements IExceptionHandler {
		/*
		 * (non-Javadoc)
		 * 
		 * @see
		 * org.eclipse.jface.window.Window.IExceptionHandler#handleException
		 * (java.lang.Throwable)
		 */
		public void handleException(Throwable t) {
			if (t instanceof ThreadDeath) {
				// Don't catch ThreadDeath as this is a normal occurrence when
				// the thread dies
				throw (ThreadDeath) t;
			}
			// Try to keep running.
			t.printStackTrace();
		}
	}

	private class TreeSelectionPatternFilter extends PatternFilter {

		private ViewerFilter filter;

		public TreeSelectionPatternFilter(ViewerFilter filter) {
			this.filter = filter;
		}

		@Override
		protected boolean isParentMatch(Viewer viewer, Object element) {
			Object[] children = ((ITreeContentProvider) ((AbstractTreeViewer) viewer).getContentProvider())
					.getChildren(element);
			// apply all filters
			if (filter != null && children != null) {
				// if one child match, show the parent in tree

				for (Object child : children) {
					if (filter.select(viewer, null, child)) {
						return super.isParentMatch(viewer, element);
					}
				}

				return false;
			} else {
				return super.isParentMatch(viewer, element);
			}
		}

		@Override
		protected boolean isLeafMatch(Viewer viewer, Object element) {
			if (element instanceof EObject) {
				String labelText = ((EObject) element).toString();
				if (labelText != null) {
					return wordMatches(labelText);
				}
			}
			return false;
		}
	}

	/**
	 * The exception handler for this application.
	 */
	private static IExceptionHandler exceptionHandler = new DefaultExceptionHandler();

}
