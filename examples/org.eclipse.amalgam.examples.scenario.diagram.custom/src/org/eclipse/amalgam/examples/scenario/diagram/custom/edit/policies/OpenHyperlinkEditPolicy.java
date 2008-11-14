package org.eclipse.amalgam.examples.scenario.diagram.custom.edit.policies;

import org.eclipse.amalgam.examples.scenario.diagram.custom.style.CustomStyle;
import org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.swt.program.Program;

public class OpenHyperlinkEditPolicy extends OpenEditPolicy {

	protected Command getOpenCommand(Request request) {
		return new Command("OpenHyperlinkCommand") {
			public void execute() {
				IGraphicalEditPart gep = (IGraphicalEditPart) getHost();
				CustomStyle style = (CustomStyle) gep.getNotationView().getStyle(StylePackage.eINSTANCE.getCustomStyle());
				if (style != null) {
					String location = style.getHyperlink();
					Program.launch(location);
				}
			}
		};
	}
}
