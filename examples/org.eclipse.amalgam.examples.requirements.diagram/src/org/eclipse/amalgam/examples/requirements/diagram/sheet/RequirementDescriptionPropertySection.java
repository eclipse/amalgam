package org.eclipse.amalgam.examples.requirements.diagram.sheet;

import org.eclipse.amalgam.examples.requirements.Requirement;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.util.StringStatics;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractBasicTextPropertySection;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

/**
 * @generated NOT
 */
public class RequirementDescriptionPropertySection extends
		AbstractBasicTextPropertySection {

	@Override
	protected String getPropertyChangeCommandName() {
		return "RequirementDescriptionChangeCommand";
	}

	@Override
	protected String getPropertyNameLabel() {
		return "";
	}

	@Override
	protected String getPropertyValueString() {
		String description = ((Requirement) getEObject()).getDescription();
		return description == null ? "" : description;
	}

	@Override
	protected void setPropertyValue(EObject object, Object value) {
		((Requirement) getEObject()).setDescription((String) value);
	}

	protected Text createTextWidget(Composite parent) {
		Text text = getWidgetFactory().createText(parent, StringStatics.BLANK,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.WRAP);
		FormData data = new FormData();

		data.left = new FormAttachment(0, 0);
		data.right = new FormAttachment(100, 0);
		data.top = new FormAttachment(0, 0);
		data.bottom = new FormAttachment(100, 0);
		data.height = 100;
		data.width = 100;

		text.setLayoutData(data);
		if (isReadOnly()) {
			text.setEditable(false);
		}
		return text;
	}

	@Override
	protected EObject unwrap(Object object) {
		if (object instanceof Requirement) {
			return (EObject) object;
		}
		if (object instanceof EditPart) {
			Object model = ((EditPart) object).getModel();
			return model instanceof View ? ((View) model).getElement() : null;
		}
		if (object instanceof View) {
			return ((View) object).getElement();
		}
		if (object instanceof IAdaptable) {
			View view = (View) ((IAdaptable) object).getAdapter(View.class);
			if (view != null) {
				return view.getElement();
			}
		}
		return null;
	}
}
