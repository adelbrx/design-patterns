package com.adelbrx.iterator.exercice;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
