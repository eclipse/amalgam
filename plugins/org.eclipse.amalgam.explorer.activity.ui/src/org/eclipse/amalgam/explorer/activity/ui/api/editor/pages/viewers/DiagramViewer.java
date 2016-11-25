/*******************************************************************************
 * Copyright (c)  2006, 2016 THALES GLOBAL SERVICES.
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
import org.eclipse.amalgam.explorer.activity.ui.api.hyperlinkadapter.IRepresentationProvider;
import org.eclipse.amalgam.explorer.activity.ui.internal.util.ActivityExplorerLoggerService;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.CloneAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.DeleteRepresentationAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.MoveRepresentationAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.OpenRepresentationsAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.actions.RenameRepresentationAction;
import org.eclipse.amalgam.explorer.activity.ui.internal.viewer.diagram.providers.DiagramViewerContentProvider;
import org.eclipse.core.runtime.IStatus;
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
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.BaseSelectionListenerAction;
import org.eclipse.ui.forms.events.IHyperlinkListener;

public class DiagramViewer extends AbstractActivityExplorerViewer {

	private static final String GROUP_MOVE = "Move"; //$NON-NLS-1$
	private MoveRepresentationAction moveDiagramAction;
	private OpenRepresentationsAction openRepresentation;
	private RenameRepresentationAction renameRepresentationAction;
	private BaseSelectionListenerAction showInModelExplorerAction;
	private CloneAction cloneAction;
	private DeleteRepresentationAction deleteRepresentationAction;

	public DiagramViewer(BasicSessionActivityExplorerPage page) {
		super(page);
	}

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
		  @Override
			public void doubleClick(DoubleClickEvent event) {
				IStructuredSelection selection = (IStructuredSelection) event.getSelection();
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
		if (null != renameRepresentationAction) {
			selectionProvider.removeSelectionChangedListener(renameRepresentationAction);
			renameRepresentationAction = null;
		}
		if (null != deleteRepresentationAction) {
			selectionProvider.removeSelectionChangedListener(deleteRepresentationAction);
			deleteRepresentationAction = null;
		}
		if (null != openRepresentation) {
			selectionProvider.removeSelectionChangedListener(openRepresentation);
			openRepresentation = null;
		}
		if (null != moveDiagramAction) {
			selectionProvider.removeSelectionChangedListener(moveDiagramAction);
			moveDiagramAction.dispose();
			moveDiagramAction = null;
		}
		if (null != cloneAction) {
			selectionProvider.removeSelectionChangedListener(cloneAction);
			cloneAction = null;
		}
		if (null != showInModelExplorerAction) {
			selectionProvider.removeSelectionChangedListener(showInModelExplorerAction);
			showInModelExplorerAction = null;
		}

	}

	/**
	 * Make a contextual menu for specified viewer.
	 * 
	 * @param treeViewer
	 */
	@Override
	protected MenuManager initMenuToViewer(final TreeViewer treeViewer) {
		MenuManager contextMenuManager = super.initMenuToViewer(treeViewer);
		contextMenuManager.addMenuListener(new IMenuListener2() {
			/**
			 * {@inheritDoc}
			 */
		  @Override
			@SuppressWarnings("synthetic-access")
			public void menuAboutToHide(IMenuManager manager) {
				manager.remove(MoveRepresentationAction.MOVE_DIAGRAMS_MENU_ID);
				// Make sure action contained list are freed at each selection
				// time.
				moveDiagramAction.dispose();
			}

			/**
			 * {@inheritDoc}
			 */
		  @Override
			@SuppressWarnings("synthetic-access")
			public void menuAboutToShow(IMenuManager manager) {
				manager.appendToGroup(GROUP_MOVE,
						moveDiagramAction.fillContextMenu((IStructuredSelection) treeViewer.getSelection()));
			}
		});

		return contextMenuManager;

	}

	/**
	 * Declare viewer actions.<br>
	 * This methods is called eache time the menu is pop-up.
	 * 
	 * @param contextMenuManager
	 * @param treeViewer
	 */
	@Override
	protected void declareViewerActions(MenuManager contextMenuManager, TreeViewer treeViewer) {
		// Menu manager is not extensible at the moment.
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();
		ISelectionProvider selectionProvider = page.getEditorSite().getSelectionProvider();

		showInModelExplorerAction = new BaseSelectionListenerAction(Messages.BasicSessionActivityExplorerPage_1) {
			/**
			 * {@inheritDoc}
			 */
			@SuppressWarnings("synthetic-access")
			@Override
			public void run() {
				LocateInExplorerAction callback = new LocateInExplorerAction();
				callback.setSite(page.getEditorSite());
				callback.run(showInModelExplorerAction);
			}

			/**
			 * {@inheritDoc}
			 */
			@Override
			protected boolean updateSelection(IStructuredSelection selection) {
				return containsOnlyRepresentations(selection);
			}
		};

		SelectionHelper.registerToSelectionChanges(showInModelExplorerAction, selectionProvider);
		contextMenuManager.add(showInModelExplorerAction);

		contextMenuManager.add(new Separator());
		openRepresentation = new OpenRepresentationsAction() {
			/**
			 * {@inheritDoc}
			 */
			@Override
			protected boolean updateSelection(IStructuredSelection selection) {
				return containsOnlyRepresentations(selection);
			}
		};
		SelectionHelper.registerToSelectionChanges(openRepresentation, selectionProvider);
		contextMenuManager.add(openRepresentation);
		contextMenuManager.add(new Separator());

		cloneAction = new CloneAction(treeViewer);
		cloneAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
		SelectionHelper.registerToSelectionChanges(cloneAction, selectionProvider);
		contextMenuManager.add(cloneAction);

		deleteRepresentationAction = new DeleteRepresentationAction() {
			/**
			 * {@inheritDoc}
			 */
			@Override
			protected boolean updateSelection(IStructuredSelection selection) {
				return containsOnlyRepresentations(selection);
			}
		};
		deleteRepresentationAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		deleteRepresentationAction
				.setDisabledImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE_DISABLED));
		SelectionHelper.registerToSelectionChanges(deleteRepresentationAction, selectionProvider);
		contextMenuManager.add(deleteRepresentationAction);

		contextMenuManager.add(new Separator(GROUP_MOVE));
		moveDiagramAction = new MoveRepresentationAction();
		SelectionHelper.registerToSelectionChanges(moveDiagramAction, selectionProvider);
		renameRepresentationAction = new RenameRepresentationAction() {
			/**
			 * {@inheritDoc}
			 */
			@Override
			protected boolean updateSelection(IStructuredSelection selection) {
				return containsOnlyRepresentations(selection);
			}
		};
		SelectionHelper.registerToSelectionChanges(renameRepresentationAction, selectionProvider);
		contextMenuManager.add(renameRepresentationAction);

		updateActionBars();
	}

	private void updateActionBars() {
		IActionBars editorActionBars = page.getEditorSite().getActionBars();
		editorActionBars.setGlobalActionHandler(ActionFactory.DELETE.getId(), deleteRepresentationAction);
		editorActionBars.setGlobalActionHandler(ActionFactory.RENAME.getId(), renameRepresentationAction);
		// Update action bars to make sure global ActionHandler are updated accordingly.
		editorActionBars.updateActionBars();
	}

	/**
	 * Returns <code>true</code> if specified selection contains only
	 * {@link DRepresentation}.
	 * 
	 * @param selection
	 * @return
	 */
	@SuppressWarnings("unchecked")
	protected boolean containsOnlyRepresentations(final IStructuredSelection selection) {
		boolean result = true;
		Iterator<Object> iterator = selection.toList().iterator();
		while (iterator.hasNext()) {
			Object representation = iterator.next();
			if (representation instanceof ItemWrapper) {
				representation = ((ItemWrapper) representation).getWrappedObject();
			}
			if (!(representation instanceof DRepresentation || representation instanceof DRepresentationDescriptor)) {
				result = false;
				break;
			}
		}
		return result;
	}

	/*************/

	@Override
	protected ViewerFilter getViewerFilter(final ActivityExplorerSection section) {
		return new ViewerFilter() {

			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				boolean selected = true;
				// Filter out viewpoint if any.
				if (element instanceof ViewpointItem) {
					ViewpointItem viewpointItem = (ViewpointItem) element;
					Viewpoint viewpoint = (Viewpoint) viewpointItem.getWrappedObject();
					if (viewpoint.getName().equals(getFilteredViewpoint())) {
						selected = false;
					}
				}
				// Filter representations.
				else if (element instanceof RepresentationDescriptionItem) {
					selected = isRepresentationDescriptionItemTypeSelected((RepresentationDescriptionItem) element,
							getRetainedRepresentationDescriptions());
				}
				// Filter diagrams.
				else if (element instanceof DSemanticDiagram) {
					DSemanticDiagram semanticDiagram = (DSemanticDiagram) element;
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
					if (listener instanceof IRepresentationProvider) {
						try {
							representations.addAll(((IRepresentationProvider) listener).getRepresentationNames());
						} catch (Throwable e) {
							StringBuilder message = new StringBuilder();

							message.append("DiagramViewer.getRetainedRepresentationDescriptions() _ "); //$NON-NLS-1$
							message.append("Could not retrieve a representation name from contribution "); //$NON-NLS-1$
							message.append(activity.getId());
							message.append(" See the error stack for more details."); //$NON-NLS-1$

							ActivityExplorerLoggerService.getInstance().log(IStatus.ERROR, message.toString(), e);
						}
					}
				}
				return representations;
			}

			protected boolean isDiagramSelected(EObject semanticElement, DiagramDescription diagramDescription) {
				return true;
			}

			/**
			 * Is a {@link RepresentationDescriptionItem} selected ?
			 * 
			 * @param representationDescriptionItem
			 * @return <code>true</code> means given
			 *         <code>representationDescriptionItem</code> is selected
			 *         i.e not filtered.
			 */
			protected boolean isRepresentationDescriptionItemTypeSelected(
					RepresentationDescriptionItem representationDescriptionItem,
					Set<String> retainedDiagramTypeNames) {
				boolean selected = true;
				if (retainedDiagramTypeNames != null) {
					RepresentationDescription representationDescription = (RepresentationDescription) representationDescriptionItem
							.getWrappedObject();
					String diagramTypeName = representationDescription.getName();
					if (retainedDiagramTypeNames.contains(diagramTypeName)) {
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
