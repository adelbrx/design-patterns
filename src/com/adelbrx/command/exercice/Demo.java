package com.adelbrx.command.exercice;

import com.adelbrx.command.exercice.framework.History;

public class Demo {
    public static void show() {
        var videoEditor = new VideoEditor();
        var history = new History();

        var setTextCommand = new TextCommand("Video Title", history, videoEditor);
        setTextCommand.execute();
        System.out.println("TEXT: " + videoEditor);

        var setContrast = new ContrastCommand(1, history, videoEditor);
        setContrast.execute();
        System.out.println("CONTRAST: " + videoEditor);

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);

        undoCommand.execute();
        System.out.println("UNDO: " + videoEditor);
    }
}
