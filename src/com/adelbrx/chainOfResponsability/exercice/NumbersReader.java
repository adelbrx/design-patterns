package com.adelbrx.chainOfResponsability.exercice;

public class NumbersReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".numbers";
    }

    @Override
    protected boolean doRead(String filename) {
        System.out.println("Reading data from a Numbers spreadsheet.");
        return false;
    }
}
