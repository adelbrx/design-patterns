package com.adelbrx.abstractFactory.ant;

import com.adelbrx.abstractFactory.Button;
import com.adelbrx.abstractFactory.TextBox;
import com.adelbrx.abstractFactory.WidgetFactory;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }
}
