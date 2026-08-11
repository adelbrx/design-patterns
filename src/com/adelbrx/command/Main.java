package com.adelbrx.command;

import com.adelbrx.command.editor.*;
import com.adelbrx.command.framework.Button;

public class Main {
    public static void main(String[] args) {
        // Command Pattern
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        var button = new Button(command);

        button.execute();

        // Composite Command Pattern
        var compositeCommand = new CompositeCommand();
        compositeCommand.add(new ResizeCommand());
        compositeCommand.add(new BlackAndWhiteCommand());
        compositeCommand.execute();

        //Undoable Command Pattern
        var history = new History();

        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document,history);
        boldCommand.execute();
        System.out.println(document.getContent());

        boldCommand.unexecute();
        System.out.println(document.getContent());

        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
