package com.adelbrx.singleton.exercice;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private String filename;
    private static Map<String, Logger> instances = new HashMap();

    private Logger(String filename) {
        this.filename = filename;
    }

    public static Logger getInstance(String filename) {
        if (!instances.containsKey(filename))
            instances.put(filename, new Logger(filename));
        return instances.get(filename);
    }

    public void write(String message) {
        System.out.println("Writing a message to the log.");
    }
}
