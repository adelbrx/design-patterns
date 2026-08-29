package com.adelbrx.abstractFactory.material;

import com.adelbrx.abstractFactory.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
