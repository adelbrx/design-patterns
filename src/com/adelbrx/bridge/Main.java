package com.adelbrx.bridge;

public class Main {
    static void main(String[] args) {
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
    }
}
