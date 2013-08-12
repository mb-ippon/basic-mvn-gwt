package com.ippon.formation.gwt.client.ui.view;

import com.google.gwt.junit.client.GWTTestCase;

public class GwtTestBasicUi extends GWTTestCase {

    public void testBasicUi() {
        BasicUiBinder ui = new BasicUiBinder();
        assertNotNull(ui);
        assertEquals(ui.nameSpan.getClassName(), "important");
    }

    @Override
    public String getModuleName() {
        return "com.ippon.formation.gwt.Formation_GWT";
    }

}
