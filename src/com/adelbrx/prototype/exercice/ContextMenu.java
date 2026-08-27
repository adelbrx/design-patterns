package com.adelbrx.prototype.exercice;

public class ContextMenu {
    private Timeline timeline = new Timeline();

    public ContextMenu(Timeline timeline) {
        this.timeline = timeline;
    }

    public void duplicate(Component component) {
        Component newComponent = component.clone();
        timeline.add(newComponent);
    }
}
