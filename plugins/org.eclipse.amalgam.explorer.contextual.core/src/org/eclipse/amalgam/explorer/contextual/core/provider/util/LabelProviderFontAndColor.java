/******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *****************************************************************************/
package org.eclipse.amalgam.explorer.contextual.core.provider.util;

import org.eclipse.amalgam.explorer.contextual.core.provider.wrapper.CategoryWrapper;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.IFontProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;

public class LabelProviderFontAndColor implements IColorProvider, IFontProvider {
	/**
	 * The font used for category, to not forget to dispose it
	 */
	private Font _font;

	/**
	 * @see org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
	 */
	@Override
	public Color getBackground(Object element_p) {
		// Do nothing.
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
	 */
	@Override
	public Color getForeground(Object element_p) {
		if (element_p instanceof CategoryWrapper) 
		{
			return PlatformUI.getWorkbench().getDisplay().getSystemColor(SWT.COLOR_BLACK);
		}
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.IFontProvider#getFont(java.lang.Object)
	 */
	@Override
	public Font getFont(Object element_p) {
		if (element_p instanceof CategoryWrapper) 
		{
			if (null == _font) 
			{
				Display defaultDisplay = Display.getDefault();
				Font result = defaultDisplay.getSystemFont();
				FontData fontData = result.getFontData()[0];
				fontData.setStyle(SWT.BOLD);
				_font = new Font(defaultDisplay, fontData);
			}
			return _font;
		}
		return null;
	}

	/**
	 * Dispose Font object
	 */
	public void dispose() {
		if (null != _font) 
		{
			_font.dispose();
			_font = null;
		}
	}
}
