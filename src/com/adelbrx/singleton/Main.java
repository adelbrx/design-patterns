package com.adelbrx.singleton;

public class Main {
    static void main(String[] args) {
        ConfigManager manager = ConfigManager.getInstance();
        manager.set("name","Adel");

        ConfigManager other = ConfigManager.getInstance();
        System.out.println(other.get("name"));
    }
}
