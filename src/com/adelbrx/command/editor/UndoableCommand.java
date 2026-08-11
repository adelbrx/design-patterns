package com.adelbrx.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
