package com.adelbrx.abstractFactory.ant;

import com.adelbrx.abstractFactory.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
