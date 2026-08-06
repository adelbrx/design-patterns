package com.adelbrx.memento.exercice;


import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentMemento> states = new ArrayList<>();

    public void push(DocumentMemento state) {
        states.add(state);
    }

    public DocumentMemento pop() {
        var lastState = states.getLast();
        states.removeLast();
        return lastState;
    }
}
