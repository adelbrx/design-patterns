package com.adelbrx.chainOfResponsability.exercice;

public class QuickBooksReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".qbw";
    }

    @Override
    protected boolean doRead(String filename) {
        System.out.println("Reading data from a QuickBooks file.");
        return false;
    }
}
