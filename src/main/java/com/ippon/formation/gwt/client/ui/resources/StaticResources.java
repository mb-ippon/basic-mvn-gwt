package com.ippon.formation.gwt.client.ui.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface StaticResources extends ClientBundle {
    public static final StaticResources INSTANCE = GWT.create(StaticResources.class);

    @Source("federer_01.jpg")
    public ImageResource welcome();
}
