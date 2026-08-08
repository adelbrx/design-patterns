package com.adelbrx.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public String pop() {
        return urls.getLast();
    }

    public void push(String url) {
        urls.add(url);
    }

    public Iterator<String> createIterator(){
        return new ListIterator(this);
    }

    class ListIterator implements Iterator<String> {
        private final BrowseHistory history;
        private int index;

        ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
