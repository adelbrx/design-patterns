package com.adelbrx.strategy.exercice;

public class Demo {
    public static void show() {
        var chatClient = new ChatClient(new AES());
        chatClient.send("msg");
    }
}
