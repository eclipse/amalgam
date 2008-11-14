package org.eclipse.amalgam.examples.requirements.presentation;

import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

public class SelectionTreeEditorPart extends RequirementsEditorPart {

	  protected TreeViewer viewer;

	  public SelectionTreeEditorPart(RequirementsEditor parent) {
	    super(parent);
	  }

	  public void setInput(Object input) {
	    viewer.setInput(input);
	  }

	  public void createPartControl(Composite parent) {
	    viewer = new TreeViewer(parent, SWT.MULTI);
	    viewer.setContentProvider(new 
	      AdapterFactoryContentProvider(getAdapterFactory()));
	    viewer.setLabelProvider(new 
	      AdapterFactoryLabelProvider(getAdapterFactory()));
	    viewer.setSelection(new 
	      StructuredSelection(getEditingDomain().getResourceSet()
	        .getResources().get(0)), true);
	    ViewerFilter[] outlineFilters = new ViewerFilter[1];
	    outlineFilters[0] = new ViewerFilter() {
	      @Override
	      public boolean select(Viewer viewer, Object parentElement, Object 
	        element) {
	        return !(element instanceof Diagram);
	      }
	    };
	    viewer.setFilters(outlineFilters);

	    getEditorSite().setSelectionProvider(viewer);
	    new AdapterFactoryTreeEditor(viewer.getTree(),
	      getAdapterFactory());		
	    createContextMenuFor(viewer);
		}

	  public void setFocus() {
	    viewer.getTree().setFocus();
	  }
	}
