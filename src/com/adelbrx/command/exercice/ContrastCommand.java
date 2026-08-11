package com.adelbrx.command.exercice;

import com.adelbrx.command.exercice.framework.History;

public class ContrastCommand extends AbstractUndoableCommand {
    private float contrast;
    private float previousContrast;

    public ContrastCommand(float contrast, History history, VideoEditor videoEditor) {
        super(history, videoEditor);
        previousContrast = videoEditor.getContrast();
        this.contrast = contrast;
    }

    @Override
    protected void doExecute() {
        videoEditor.setContrast(contrast);
    }

    @Override
    public void undo() {
        videoEditor.setContrast(previousContrast);
    }
}
