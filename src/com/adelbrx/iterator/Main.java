package com.adelbrx.iterator;

public class Main {
    public static void main(String[] args){
        BrowseHistory history = new BrowseHistory();

        history.push("a");
        history.push("b");
        history.push("c");

        Iterator<String> iterator = history.createIterator();

        while (iterator.hasNext()) {
            var item = iterator.current();
            System.out.println(item);
            iterator.next();
        }
    }
}
