package com.adelbrx.command.exercice;

import com.adelbrx.command.exercice.framework.History;
import com.adelbrx.command.exercice.framework.UndoableCommand;

public abstract class AbstractUndoableCommand implements UndoableCommand {
    protected History history;
    protected VideoEditor videoEditor;

    public AbstractUndoableCommand(History history, VideoEditor videoEditor) {
        this.history = history;
        this.videoEditor = videoEditor;
    }

    @Override
    public void execute() {
        doExecute();
        history.push(this);
    }

    protected abstract void doExecute();
}
