package com.adelbrx.command.exercice.framework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class History {
    private List<UndoableCommand> commands = new ArrayList<>();

    public void push(UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        return commands.removeLast();
    }

    public int size() {
        return commands.size();
    }
}
