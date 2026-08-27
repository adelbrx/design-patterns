package com.adelbrx.prototype.exercice;

public class Audio implements Component {
    @Override
    public void render() {
        System.out.println("Rendering Audio");
    }

    @Override
    public Component clone() {
        // Logic for creating a new Audio object based
        // on the current instance
        return new Audio();
    }
}
