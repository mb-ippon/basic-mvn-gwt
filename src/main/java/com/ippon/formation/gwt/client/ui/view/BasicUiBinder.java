package com.ippon.formation.gwt.client.ui.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ImageElement;
import com.google.gwt.dom.client.LabelElement;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.UIObject;
import com.ippon.formation.gwt.client.ui.resources.ApplicationResources;

public class BasicUiBinder extends UIObject {

    private static BasicUiBinderUiBinder uiBinder = GWT.create(BasicUiBinderUiBinder.class);

    interface BasicUiBinderUiBinder extends UiBinder<Element, BasicUiBinder> {
    }

    @UiField
    SpanElement nameSpan;

    @UiField
    ImageElement imgWelcome;

    @UiField
    LabelElement welcomeLabel;

    public BasicUiBinder() {
        CssResources.INSTANCE.myCss().ensureInjected();
        setElement(uiBinder.createAndBindUi(this));
        nameSpan.setInnerText("FormationGWT");
        welcomeLabel.setInnerText(ApplicationResources.i18NMessages.welcome());
    }
}
