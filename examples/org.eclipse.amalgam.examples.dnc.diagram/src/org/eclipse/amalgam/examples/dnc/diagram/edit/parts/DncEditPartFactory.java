package org.eclipse.amalgam.examples.dnc.diagram.edit.parts;

import org.eclipse.amalgam.examples.dnc.diagram.part.DncVisualIDRegistry;
import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

/**
 * @generated
 */
public class DncEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (DncVisualIDRegistry.getVisualID(view)) {

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case MomentIntervalEditPart.VISUAL_ID:
				return new MomentIntervalEditPart(view);

			case MomentIntervalNameEditPart.VISUAL_ID:
				return new MomentIntervalNameEditPart(view);

			case MomentIntervalDescriptionEditPart.VISUAL_ID:
				return new MomentIntervalDescriptionEditPart(view);

			case MIDetailEditPart.VISUAL_ID:
				return new MIDetailEditPart(view);

			case MIDetailNameEditPart.VISUAL_ID:
				return new MIDetailNameEditPart(view);

			case MIDetailDescriptionEditPart.VISUAL_ID:
				return new MIDetailDescriptionEditPart(view);

			case RoleEditPart.VISUAL_ID:
				return new RoleEditPart(view);

			case RoleNameEditPart.VISUAL_ID:
				return new RoleNameEditPart(view);

			case RoleDescriptionEditPart.VISUAL_ID:
				return new RoleDescriptionEditPart(view);

			case PartyEditPart.VISUAL_ID:
				return new PartyEditPart(view);

			case PartyNameEditPart.VISUAL_ID:
				return new PartyNameEditPart(view);

			case PartyDescriptionEditPart.VISUAL_ID:
				return new PartyDescriptionEditPart(view);

			case PlaceEditPart.VISUAL_ID:
				return new PlaceEditPart(view);

			case PlaceNameEditPart.VISUAL_ID:
				return new PlaceNameEditPart(view);

			case PlaceDescriptionEditPart.VISUAL_ID:
				return new PlaceDescriptionEditPart(view);

			case ThingEditPart.VISUAL_ID:
				return new ThingEditPart(view);

			case ThingNameEditPart.VISUAL_ID:
				return new ThingNameEditPart(view);

			case ThingDescriptionEditPart.VISUAL_ID:
				return new ThingDescriptionEditPart(view);

			case DescriptionEditPart.VISUAL_ID:
				return new DescriptionEditPart(view);

			case DescriptionNameEditPart.VISUAL_ID:
				return new DescriptionNameEditPart(view);

			case DescriptionDescriptionEditPart.VISUAL_ID:
				return new DescriptionDescriptionEditPart(view);

			case PluginPointEditPart.VISUAL_ID:
				return new PluginPointEditPart(view);

			case PluginPointNameEditPart.VISUAL_ID:
				return new PluginPointNameEditPart(view);

			case PluginPointDescriptionEditPart.VISUAL_ID:
				return new PluginPointDescriptionEditPart(view);

			case Package2EditPart.VISUAL_ID:
				return new Package2EditPart(view);

			case PackageNameEditPart.VISUAL_ID:
				return new PackageNameEditPart(view);

			case PackageName2EditPart.VISUAL_ID:
				return new PackageName2EditPart(view);

			case AnnotationEditPart.VISUAL_ID:
				return new AnnotationEditPart(view);

			case AnnotationKeyValueEditPart.VISUAL_ID:
				return new AnnotationKeyValueEditPart(view);

			case AnnotationKeyEditPart.VISUAL_ID:
				return new AnnotationKeyEditPart(view);

			case AttributeEditPart.VISUAL_ID:
				return new AttributeEditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case Package3EditPart.VISUAL_ID:
				return new Package3EditPart(view);

			case MomentIntervalAttributesEditPart.VISUAL_ID:
				return new MomentIntervalAttributesEditPart(view);

			case MomentIntervalOperationsEditPart.VISUAL_ID:
				return new MomentIntervalOperationsEditPart(view);

			case MIDetailAttributesEditPart.VISUAL_ID:
				return new MIDetailAttributesEditPart(view);

			case MIDetailOperationsEditPart.VISUAL_ID:
				return new MIDetailOperationsEditPart(view);

			case RoleAttributesEditPart.VISUAL_ID:
				return new RoleAttributesEditPart(view);

			case RoleOperationsEditPart.VISUAL_ID:
				return new RoleOperationsEditPart(view);

			case PartyAttributesEditPart.VISUAL_ID:
				return new PartyAttributesEditPart(view);

			case PartyOperationsEditPart.VISUAL_ID:
				return new PartyOperationsEditPart(view);

			case PlaceAttributesEditPart.VISUAL_ID:
				return new PlaceAttributesEditPart(view);

			case PlaceOperationsEditPart.VISUAL_ID:
				return new PlaceOperationsEditPart(view);

			case ThingAttributesEditPart.VISUAL_ID:
				return new ThingAttributesEditPart(view);

			case ThingOperationsEditPart.VISUAL_ID:
				return new ThingOperationsEditPart(view);

			case DescriptionAttributesEditPart.VISUAL_ID:
				return new DescriptionAttributesEditPart(view);

			case DescriptionOperationsEditPart.VISUAL_ID:
				return new DescriptionOperationsEditPart(view);

			case PluginPointAttributesEditPart.VISUAL_ID:
				return new PluginPointAttributesEditPart(view);

			case PluginPointOperationsEditPart.VISUAL_ID:
				return new PluginPointOperationsEditPart(view);

			case PackagePackagesEditPart.VISUAL_ID:
				return new PackagePackagesEditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case AssociationLowerBoundUpperBoundEditPart.VISUAL_ID:
				return new AssociationLowerBoundUpperBoundEditPart(view);

			case ClassSuperclassesEditPart.VISUAL_ID:
				return new ClassSuperclassesEditPart(view);

			case Association2EditPart.VISUAL_ID:
				return new Association2EditPart(view);

			case AssociationLowerBoundUpperBound2EditPart.VISUAL_ID:
				return new AssociationLowerBoundUpperBound2EditPart(view);

			case AnnotatedElementAnnotationsEditPart.VISUAL_ID:
				return new AnnotatedElementAnnotationsEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
