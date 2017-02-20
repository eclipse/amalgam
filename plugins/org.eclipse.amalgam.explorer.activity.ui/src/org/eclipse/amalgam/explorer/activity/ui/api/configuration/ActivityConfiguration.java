/*******************************************************************************
 * Copyright (c) 2017 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.amalgam.explorer.activity.ui.api.configuration;

import org.eclipse.amalgam.explorer.activity.ui.api.editor.predicates.IPredicate;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.forms.events.IHyperlinkListener;

/**
 * Represents the configuration of an Activity inside a Section.
 * 
 * @author pcdavid
 */
public class ActivityConfiguration {
    private String id;

    private String name;

    private IHyperlinkListener listener;

    private int index;

    private Image image;

    private String description;

    private IPredicate predicate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IHyperlinkListener getListener() {
        return listener;
    }

    public void setListener(IHyperlinkListener listener) {
        this.listener = listener;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IPredicate getPredicate() {
        return predicate;
    }

    public void setPredicate(IPredicate predicate) {
        this.predicate = predicate;
    }
}
