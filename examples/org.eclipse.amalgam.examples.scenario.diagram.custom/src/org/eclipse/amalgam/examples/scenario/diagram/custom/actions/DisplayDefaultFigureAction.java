package org.eclipse.amalgam.examples.scenario.diagram.custom.actions;

import org.eclipse.amalgam.examples.scenario.diagram.custom.style.StylePackage;
import org.eclipse.gmf.runtime.diagram.ui.actions.BooleanPropertyAction;
import org.eclipse.gmf.runtime.emf.core.util.PackageUtil;
import org.eclipse.ui.IWorkbenchPage;


public class DisplayDefaultFigureAction extends BooleanPropertyAction {

	static public final String ID = "displayDefaultFigureAction";
	
	public DisplayDefaultFigureAction(IWorkbenchPage workbenchPage) {
		super(workbenchPage, PackageUtil.getID(StylePackage.eINSTANCE.getCustomStyle_Default()),
            "Display default image"); 
        setId(ID); 
        setText("Display default image");
		setToolTipText("Use the default image display for this element"); 
	}	
}
