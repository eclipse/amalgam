package org.eclipse.amalgam.examples.scenario.diagram.custom.actions;

import org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.diagram.ui.internal.actions.PropertyChangeAction;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;

public class SetHyperlinkAction extends PropertyChangeAction {

	static public final String ID = "setHyperlinkAction";

	public SetHyperlinkAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage, PackageUtil.getID(StylePackage.eINSTANCE.getCustomStyle_Hyperlink()), "Set hyperlink...");
		setId(ID);
		setText("Set hyperlink...");
		setToolTipText("Set a navigable hyperlink on this element");
	}

	@Override
	protected void doRun(IProgressMonitor progressMonitor) {
		String value = (String) getOperationSetPropertyValue(getPropertyId());
		ChangePropertyValueRequest request = (ChangePropertyValueRequest) getTargetRequest();
		final InputDialog inputDialog = new InputDialog(Display.getCurrent().getActiveShell(), "Hyperlink", "Enter the URL:", value, null);
		if (InputDialog.OK == inputDialog.open()) {
			request.setValue(inputDialog.getValue());
		} else {
			return;
		}
		super.doRun(progressMonitor);
	}

	@Override
	protected Object getNewPropertyValue() {
		String value = (String) getOperationSetPropertyValue(getPropertyId());
		if (value != null) {
			return value;
		}
		return null;
	}
}
