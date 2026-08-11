package com.adelbrx.command.exercice;

import com.adelbrx.command.exercice.framework.Command;
import com.adelbrx.command.exercice.framework.History;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size() > 0)
            history.pop().undo();
    }
}
