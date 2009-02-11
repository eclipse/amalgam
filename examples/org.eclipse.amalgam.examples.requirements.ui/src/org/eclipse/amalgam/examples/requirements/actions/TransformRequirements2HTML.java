package org.eclipse.amalgam.examples.requirements.actions;

import java.net.URL;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.amalgam.examples.requirements.ui.Messages;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.mwe.core.WorkflowRunner;
//import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class TransformRequirements2HTML implements IObjectActionDelegate {

	private IWorkbenchPart targetPart;
	private IFile file;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false || selection.isEmpty()) {
			return;
		}
		file = (IFile) ((IStructuredSelection) selection).getFirstElement();
		action.setEnabled(true);
	}

	public void run(IAction action) {
		try {
			EObject source = getInput();
			if (source == null) {
				String title = Messages.RunTransformationAction_title;
				String message = Messages.RunTransformationAction_message;

				MessageDialog.openInformation(getShell(), title, NLS.bind(message, file.getFullPath()));
			} else {
				URL url = FileLocator.toFileURL(new URL("platform:/plugin/org.eclipse.amalgam.examples.requirements.ui/templates/requirements2html.mwe"));
				Map<String, String> properties = new HashMap<String, String>();
				properties.put("model", URI.createPlatformResourceURI(file.getFullPath().toString(), true).toString());
				properties.put("out", Platform.getLocation().toOSString() + file.getParent().getFullPath());
//				new WorkflowRunner().run(url.getPath(), new NullProgressMonitor(), properties, null);
//				file.getParent().refreshLocal(IResource.DEPTH_ONE, new org.eclipse.core.runtime.NullProgressMonitor());
			}
		} catch (Exception ex) {
			handleError(ex);
		}
	}

	private EObject getInput() {
		ResourceSetImpl rs = new ResourceSetImpl();
		return rs.getEObject(URI.createPlatformResourceURI(file.getFullPath().toString(), true).appendFragment("/"), true);
	}

	private void handleError(Throwable ex) {
		MessageDialog.openError(getShell(), "Transformation failed", MessageFormat.format("{0}: {1}", ex.getClass().getSimpleName(), ex.getMessage() == null ? "no message" : ex.getMessage()));
	}

	private Shell getShell() {
		return targetPart.getSite().getShell();
	}
}
