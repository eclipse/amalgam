package org.eclipse.amalgam.examples.scenario.diagram.edit.parts;

import org.eclipse.amalgam.examples.scenario.diagram.part.ScenarioVisualIDRegistry;
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
public class ScenarioEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ScenarioVisualIDRegistry.getVisualID(view)) {

			case ProcessEditPart.VISUAL_ID:
				return new ProcessEditPart(view);

			case DataObjectEditPart.VISUAL_ID:
				return new DataObjectEditPart(view);

			case DataObjectNameEditPart.VISUAL_ID:
				return new DataObjectNameEditPart(view);

			case EventEditPart.VISUAL_ID:
				return new EventEditPart(view);

			case GatewayEditPart.VISUAL_ID:
				return new GatewayEditPart(view);

			case TaskEditPart.VISUAL_ID:
				return new TaskEditPart(view);

			case TaskNameEditPart.VISUAL_ID:
				return new TaskNameEditPart(view);

			case Event2EditPart.VISUAL_ID:
				return new Event2EditPart(view);

			case EventNameEditPart.VISUAL_ID:
				return new EventNameEditPart(view);

			case Event3EditPart.VISUAL_ID:
				return new Event3EditPart(view);

			case Process2EditPart.VISUAL_ID:
				return new Process2EditPart(view);

			case ProcessNameEditPart.VISUAL_ID:
				return new ProcessNameEditPart(view);

			case Gateway2EditPart.VISUAL_ID:
				return new Gateway2EditPart(view);

			case Event4EditPart.VISUAL_ID:
				return new Event4EditPart(view);

			case Event5EditPart.VISUAL_ID:
				return new Event5EditPart(view);

			case Event6EditPart.VISUAL_ID:
				return new Event6EditPart(view);

			case Gateway3EditPart.VISUAL_ID:
				return new Gateway3EditPart(view);

			case Event7EditPart.VISUAL_ID:
				return new Event7EditPart(view);

			case Event8EditPart.VISUAL_ID:
				return new Event8EditPart(view);

			case AssociationEditPart.VISUAL_ID:
				return new AssociationEditPart(view);

			case SequenceFlowEditPart.VISUAL_ID:
				return new SequenceFlowEditPart(view);

			case SequenceFlowNameEditPart.VISUAL_ID:
				return new SequenceFlowNameEditPart(view);

			case MessageFlowEditPart.VISUAL_ID:
				return new MessageFlowEditPart(view);

			case MessageFlowNameEditPart.VISUAL_ID:
				return new MessageFlowNameEditPart(view);

			case SequenceFlow2EditPart.VISUAL_ID:
				return new SequenceFlow2EditPart(view);

			case SequenceFlowName2EditPart.VISUAL_ID:
				return new SequenceFlowName2EditPart(view);

			case Association2EditPart.VISUAL_ID:
				return new Association2EditPart(view);
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
