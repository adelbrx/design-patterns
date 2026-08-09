package com.adelbrx.strategy.exercice;

public class ChatClient {
    private final Encryptor encryptor;

    public ChatClient(Encryptor encryptor) {
        this.encryptor = encryptor;
    }

    public void send(String message) {
        encryptor.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
