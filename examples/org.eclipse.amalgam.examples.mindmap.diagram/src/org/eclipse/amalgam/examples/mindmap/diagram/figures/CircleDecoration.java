/******************************************************************************
 * Copyright (c) 2006, 2008 Borland Software Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation 
 ****************************************************************************/
package org.eclipse.amalgam.examples.mindmap.diagram.figures;

import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public class CircleDecoration extends Ellipse implements RotatableDecoration {
	private int myRadius = 5;
	private Point myCenter = new Point();

	public void setRadius(int radius) {
		erase();
		myRadius = Math.abs(radius);
		bounds = null;
		repaint();
	}

	public void setLineWidth(int width) {
		super.setLineWidth(width);
	}

	public Rectangle getBounds() {
		if (bounds == null) {
			int diameter = myRadius * 2;
			bounds = new Rectangle(myCenter.x - myRadius,
					myCenter.y - myRadius, diameter, diameter);
			bounds.expand(lineWidth / 2, lineWidth / 2);
		}
		return bounds;
	}

	public void setLocation(Point p) {
		if (myCenter.equals(p)) {
			return;
		}
		myCenter.setLocation(p);
		bounds = null;
	}

	public void setReferencePoint(Point p) {
		// ignore, does not make sense to rotate circle
	}
}
