package com.adelbrx.strategy.exercice;

public class DES implements Encryptor {
    @Override
    public String encrypt(String content) {
        System.out.println("Encrypting message using DES");
        return "encryptedText";
    }
}
