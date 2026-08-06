package com.adelbrx.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> states = new ArrayList<>();

    public void push(Memento state) {
        states.add(state);
    }

    public Memento pop() {
        var lastState = states.getLast();
        states.removeLast();
        return lastState;
    }
}
