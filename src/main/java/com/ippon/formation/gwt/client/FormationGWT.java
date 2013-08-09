package com.ippon.formation.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.ippon.formation.gwt.client.ui.view.BasicUiBinder;

public class FormationGWT implements EntryPoint {

    public void onModuleLoad() {
        Document.get().getBody().appendChild(new BasicUiBinder().getElement());
    }

}
