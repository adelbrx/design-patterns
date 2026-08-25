package com.adelbrx.proxy;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] filenames = { "a", "b", "c" };
        for (var filename : filenames)
            library.add(new LoggingEbookProxy(filename));

        library.openEbook("a");
        library.openEbook("b");
    }
}
