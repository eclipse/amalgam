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
package org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.viewers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.amalgam.explorer.activity.ui.api.actions.LocateInExplorerAction;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.activities.ExplorerActivity;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.BasicSessionActivityExplorerPage;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.Messages;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.pages.helper.SelectionHelper;
import org.eclipse.amalgam.explorer.activity.ui.api.editor.sections.ActivityExplorerSection;
import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.AbstractNewDiagramHyperlinkAdapter;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.CloneAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.DeleteRepresentationAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.MoveRepresentationAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.OpenRepresentationsAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.RenameRepresentationAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.providers.DiagramViewerContentProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IMenuListener2;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.ui.tools.api.views.common.item.ItemWrapper;
import org.eclipse.sirius.ui.tools.api.views.common.item.RepresentationDescriptionItem;
import org.eclipse.sirius.ui.tools.api.views.common.item.ViewpointItem;
import org.eclipse.sirius.ui.tools.internal.views.common.navigator.SiriusCommonLabelProvider;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.eclipse.ui.forms.events.IHyperlinkListener;

public class DiagramViewer extends AbstractActivityExplorerViewer {

	public DiagramViewer(BasicSessionActivityExplorerPage page_p) {
		super(page_p);
	}

	/** Actions **/

	private static final String GROUP_MOVE = "Move"; //$NON-NLS-1$
	private MoveRepresentationAction _moveDiagramAction;
	private OpenRepresentationsAction _openRepresentation;
	private RenameRepresentationAction _renameRepresentationAction;
	private BaseSelectionListenerAction _showInModelExplorerAction;
	private CloneAction _cloneAction;
	private DeleteRepresentationAction _deleteRepresentationAction;

	@Override
	protected String getViewerSectionTitle() {
		return Messages.BasicSessionActivityExplorerPage_0;
	}

	@Override
	protected Object getInput() {
		return page.getEditorInput().getSession();
	}

	@Override
	protected ILabelProvider getLabelProvider() {
		return new SiriusCommonLabelProvider();
	}

	@Override
	protected IContentProvider getContentProvider() {
		return new DiagramViewerContentProvider(page.getHandledViewpoint());
	}

	@Override
	protected void addListenersOnViewer(TreeViewer viewer) {
		viewer.addDoubleClickListener(new IDoubleClickListener() {
			/**
			 * @see org.eclipse.jface.viewers.IDoubleClickListener#doubleClick(org.eclipse.jface.viewers.DoubleClickEvent)
			 */
			public void doubleClick(DoubleClickEvent event_p) {
				IStructuredSelection selection = (IStructuredSelection) event_p.getSelection();
				// Open selected representations.
				OpenRepresentationsAction action = new OpenRepresentationsAction();
				action.selectionChanged(selection);
				action.run();
			}
		});
	}

	@Override
	public void dispose() {
		super.dispose();

		ISelectionProvider selectionProvider = page.getEditorSite().getSelectionProvider();
		if (null != _renameRepresentationAction) {
			selectionProvider.removeSelectionChangedListener(_renameRepresentationAction);
			_renameRepresentationAction = null;
		}
		if (null != _deleteRepresentationAction) {
			selectionProvider.removeSelectionChangedListener(_deleteRepresentationAction);
			_deleteRepresentationAction = null;
		}
		if (null != _openRepresentation) {
			selectionProvider.removeSelectionChangedListener(_openRepresentation);
			_openRepresentation = null;
		}
		if (null != _moveDiagramAction) {
			selectionProvider.removeSelectionChangedListener(_moveDiagramAction);
			_moveDiagramAction.dispose();
			_moveDiagramAction = null;
		}
		if (null != _cloneAction) {
			selectionProvider.removeSelectionChangedListener(_cloneAction);
			_cloneAction = null;
		}
		if (null != _showInModelExplorerAction) {
			selectionProvider.removeSelectionChangedListener(_showInModelExplorerAction);
			_showInModelExplorerAction = null;
		}

	}

	/**
	 * Make a contextual menu for specified viewer.
	 * 
	 * @param treeViewer_p
	 */
	@Override
	protected MenuManager initMenuToViewer(final TreeViewer treeViewer_p) {
		MenuManager contextMenuManager = super.initMenuToViewer(treeViewer_p);
		contextMenuManager.addMenuListener(new IMenuListener2() {
			/**
			 * {@inheritDoc}
			 */
			@SuppressWarnings("synthetic-access")
			public void menuAboutToHide(IMenuManager manager_p) {
				manager_p.remove(MoveRepresentationAction.MOVE_DIAGRAMS_MENU_ID);
				// Make sure action contained list are freed at each selection
				// time.
				_moveDiagramAction.dispose();
			}

			/**
			 * {@inheritDoc}
			 */
			@SuppressWarnings("synthetic-access")
			public void menuAboutToShow(IMenuManager manager_p) {
				manager_p.appendToGroup(GROUP_MOVE,
						_moveDiagramAction.fillContextMenu((IStructuredSelection) treeViewer_p.getSelection()));
			}
		});

		return contextMenuManager;

	}

	/**
	 * Declare viewer actions.<br>
	 * This methods is called eache time the menu is pop-up.
	 * 
	 * @param contextMenuManager_p
	 * @param treeViewer_p
	 */
	protected void declareViewerActions(MenuManager contextMenuManager_p, TreeViewer treeViewer_p) {
		// Menu manager is not extensible at the moment.
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		ISelectionProvider selectionProvider = page.getEditorSite().getSelectionProvider();

		_showInModelExplorerAction = new BaseSelectionListenerAction(Messages.BasicSessionActivityExplorerPage_1) {
			/**
			 * {@inheritDoc}
			 */
			@SuppressWarnings("synthetic-access")
			@Override
			public void run() {
				LocateInExplorerAction callback = new LocateInExplorerAction();
				callback.setSite(page.getEditorSite());
				callback.run(_showInModelExplorerAction);
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			protected boolean updateSelection(IStructuredSelection selection_p) {
				return containsOnlyRepresentations(selection_p);
			}
		};

		SelectionHelper.registerToSelectionChanges(_showInModelExplorerAction, selectionProvider);
		contextMenuManager_p.add(_showInModelExplorerAction);

		contextMenuManager_p.add(new Separator());
		_openRepresentation = new OpenRepresentationsAction() {
			/**
			 * {@inheritDoc}
			 */
			@Override
			protected boolean updateSelection(IStructuredSelection selection_p) {
				return containsOnlyRepresentations(selection_p);
			}
		};
		SelectionHelper.registerToSelectionChanges(_openRepresentation, selectionProvider);
		contextMenuManager_p.add(_openRepresentation);
		contextMenuManager_p.add(new Separator());

		_cloneAction = new CloneAction(treeViewer_p);
		_cloneAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
		SelectionHelper.registerToSelectionChanges(_cloneAction, selectionProvider);
		contextMenuManager_p.add(_cloneAction);

		_deleteRepresentationAction = new DeleteRepresentationAction() {
			/**
			 * {@inheritDoc}
			 */
			@Override
			protected boolean updateSelection(IStructuredSelection selection_p) {
				return containsOnlyRepresentations(selection_p);
			}
		};
		_deleteRepresentationAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		_deleteRepresentationAction.setDisabledImageDescriptor(sharedImages
				.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
		SelectionHelper.registerToSelectionChanges(_deleteRepresentationAction, selectionProvider);
		contextMenuManager_p.add(_deleteRepresentationAction);

		contextMenuManager_p.add(new Separator(GROUP_MOVE));
		_moveDiagramAction = new MoveRepresentationAction();
		SelectionHelper.registerToSelectionChanges(_moveDiagramAction, selectionProvider);
		_renameRepresentationAction = new RenameRepresentationAction() {
			/**
			 * {@inheritDoc}
			 */
			@Override
			protected boolean updateSelection(IStructuredSelection selection_p) {
				return containsOnlyRepresentations(selection_p);
			}
		};
		SelectionHelper.registerToSelectionChanges(_renameRepresentationAction, selectionProvider);
		contextMenuManager_p.add(_renameRepresentationAction);
	}

	/**
	 * Returns <code>true</code> if specified selection contains only
	 * {@link DRepresentation}.
	 * 
	 * @param selection_p
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected boolean containsOnlyRepresentations(final IStructuredSelection selection_p) {
		boolean result = true;
		Iterator<Object> iterator = selection_p.toList().iterator();
		while (iterator.hasNext() && result) {
			Object representation = iterator.next();
			if (representation instanceof ItemWrapper) {
				representation = ((ItemWrapper) representation).getWrappedObject();
			}
			if (!(representation instanceof DRepresentation)) {
				result = false;
				break;
			}
		}
		return result;
	}

	/*************/

	protected ViewerFilter getViewerFilter(final ActivityExplorerSection section) {
		return new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer_p, Object parentElement_p, Object element_p) {
				boolean selected = true;
				// Filter out viewpoint if any.
				if (element_p instanceof ViewpointItem) {
					ViewpointItem viewpointItem = (ViewpointItem) element_p;
					Viewpoint viewpoint = (Viewpoint) viewpointItem.getWrappedObject();
					if (viewpoint.getName().equals(getFilteredViewpoint())) {
						selected = false;
					}
				}
				// Filter representations.
				else if (element_p instanceof RepresentationDescriptionItem) {
					selected = isRepresentationDescriptionItemTypeSelected((RepresentationDescriptionItem) element_p,
							getRetainedRepresentationDescriptions());
				}
				// Filter diagrams.
				else if (element_p instanceof DSemanticDiagram) {
					DSemanticDiagram semanticDiagram = (DSemanticDiagram) element_p;
					selected = isDiagramSelected(semanticDiagram.getTarget(), semanticDiagram.getDescription());
				}
				return selected;
			}

			private Object getFilteredViewpoint() {
				return null;
			}

			protected Set<String> getRetainedRepresentationDescriptions() {
				final Set<String> representations = new HashSet<String>();
				for (ExplorerActivity activity : section.getActivities()) {
					IHyperlinkListener listener = activity.getListener();
					if (listener instanceof AbstractNewDiagramHyperlinkAdapter)
						representations.add(((AbstractNewDiagramHyperlinkAdapter) listener).getRepresentationName());
				}
				return representations;
			}

			protected boolean isDiagramSelected(EObject semanticElement_p, DiagramDescription diagramDescription_p) {
				return true;
			}

			/**
			 * Is a {@link RepresentationDescriptionItem} selected ?
			 * 
			 * @param representationDescriptionItem_p
			 * @return <code>true</code> means given
			 *         <code>representationDescriptionItem_p</code> is selected
			 *         i.e not filtered.
			 */
			protected boolean isRepresentationDescriptionItemTypeSelected(
					RepresentationDescriptionItem representationDescriptionItem_p,
					Set<String> retainedDiagramTypeNames_p) {
				boolean selected = true;
				if (retainedDiagramTypeNames_p != null) {
					RepresentationDescription representationDescription = (RepresentationDescription) representationDescriptionItem_p
							.getWrappedObject();
					String diagramTypeName = representationDescription.getName();
					if (retainedDiagramTypeNames_p.contains(diagramTypeName)) {
						selected = true;
					} else {
						selected = false;
					}
				}
				return selected;
			}
		};
	}
}
