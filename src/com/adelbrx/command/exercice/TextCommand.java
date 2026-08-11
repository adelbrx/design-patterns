package com.adelbrx.command.exercice;

import com.adelbrx.command.editor.UndoableCommand;
import com.adelbrx.command.exercice.framework.History;

public class TextCommand extends AbstractUndoableCommand {
    private String text;

    public TextCommand(String text, History history, VideoEditor videoEditor) {
        super(history, videoEditor);
        this.text = text;
    }

    @Override
    protected void doExecute() {
        videoEditor.setText(text);
    }

    @Override
    public void undo() {
        videoEditor.removeText();
    }
}
