package com.adelbrx.abstractFactory.material;

import com.adelbrx.abstractFactory.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
