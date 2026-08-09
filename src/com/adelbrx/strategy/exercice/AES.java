package com.adelbrx.strategy.exercice;

public class AES implements Encryptor {
    @Override
    public String encrypt(String content) {
        System.out.println("Encrypting message using AES");
        return "encryptedText";
    }
}
