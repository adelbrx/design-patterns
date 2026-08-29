package com.adelbrx.abstractFactory.material;

import com.adelbrx.abstractFactory.Button;
import com.adelbrx.abstractFactory.TextBox;
import com.adelbrx.abstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }
}
