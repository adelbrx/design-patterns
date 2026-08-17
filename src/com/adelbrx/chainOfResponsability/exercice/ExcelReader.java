package com.adelbrx.chainOfResponsability.exercice;

public class ExcelReader extends DataReader {
    @Override
    protected String getExtension() {
        return ".xls";
    }

    @Override
    protected boolean doRead(String filename) {
        System.out.println("Reading data from an Excel spreadsheet.");
        return false;
    }
}
