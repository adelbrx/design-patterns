package com.adelbrx.template.exercice.windows;

public class ChatWindow extends Window {
    @Override
    protected void afterClose() {
        System.out.println("Disconnecting from the server...");
    }
}
