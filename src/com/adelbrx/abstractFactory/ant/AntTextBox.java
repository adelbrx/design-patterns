package com.adelbrx.abstractFactory.ant;

import com.adelbrx.abstractFactory.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
