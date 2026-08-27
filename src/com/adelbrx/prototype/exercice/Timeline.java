package com.adelbrx.prototype.exercice;

import java.util.ArrayList;
import java.util.List;

public class Timeline {
    private List<Component> timeline = new ArrayList<>();

    public void add(Component component) {
        timeline.add(component);
    }

    public void render() {
        for (var component : timeline)
            component.render();
    }
}
