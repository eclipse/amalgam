package org.eclipse.amalgam.examples.mindmap.diagram.edit.parts;

import org.eclipse.amalgam.examples.mindmap.diagram.edit.policies.Relationship2ItemSemanticEditPolicy;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Relationship2EditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public Relationship2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new Relationship2ItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RelationshipName2EditPart) {
			((RelationshipName2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRelationshipNameFigure());
			return true;
		}
		if (childEditPart instanceof RelationshipType2EditPart) {
			((RelationshipType2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureRelationshipTypeFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new RelationshipFigure();
	}

	/**
	 * @generated
	 */
	public RelationshipFigure getPrimaryShape() {
		return (RelationshipFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RelationshipFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureRelationshipNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureRelationshipTypeFigure;

		/**
		 * @generated
		 */
		public RelationshipFigure() {
			this.setLineStyle(Graphics.LINE_DASH);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureRelationshipNameFigure = new WrappingLabel();
			fFigureRelationshipNameFigure.setText("<...>");

			this.add(fFigureRelationshipNameFigure);

			fFigureRelationshipTypeFigure = new WrappingLabel();
			fFigureRelationshipTypeFigure.setText("<...>");

			this.add(fFigureRelationshipTypeFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRelationshipNameFigure() {
			return fFigureRelationshipNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureRelationshipTypeFigure() {
			return fFigureRelationshipTypeFigure;
		}

	}

}
