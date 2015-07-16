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
package org.eclipse.amalgam.explorer.contextual.core.provider.wrapper;

import org.eclipse.jface.util.Util;

/**
 * Each object of the treeview shall be unique. The wrapper will give an object a unique address. By this way, different categories could not own the same
 * object : parent of a wrapper instance is unique & filters could be applied also.
 */
public abstract class ExplorerElementWrapper {
  /**
   * Element wrapped. Could be a ICategory or EObject.
   */
  private Object element;

  /**
   * Constructor.
   */
  public ExplorerElementWrapper(Object element_p) {
    element = element_p;
  }

  /**
   * Get underlying element.
   * @return the element_p
   */
  public Object getElement() {
    return element;
  }

  @Override
  public boolean equals(final Object object) {
    if (object instanceof ExplorerElementWrapper) {
      return Util.equals(this.element, ((ExplorerElementWrapper) object).element);
    }
    return false;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Util.hashCode(element);
  }
}
