package com.adelbrx.prototype.exercice;

public class Clip implements Component {
    @Override
    public void render() {
        System.out.println("Rendering Clip");
    }

    @Override
    public Component clone() {
        // Logic for creating a new Audio object based
        // on the current instance
        return new Clip();
    }
}
