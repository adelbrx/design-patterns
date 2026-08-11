package com.adelbrx.command.editor;

public class BoldCommand implements UndoableCommand {
    private String previousContent;
    private HtmlDocument document;
    private History history;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }

    @Override
    public void unexecute() {
        if (previousContent != null)
            document.setContent(previousContent);
    }

    @Override
    public void execute() {
        previousContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
