package com.adelbrx.command;

import com.adelbrx.command.framework.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resize");
    }
}
