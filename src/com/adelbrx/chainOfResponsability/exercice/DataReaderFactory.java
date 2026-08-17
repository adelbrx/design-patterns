package com.adelbrx.chainOfResponsability.exercice;

public class DataReaderFactory {
    public static DataReader getDataReaderChain() {
        var excelReader = new ExcelReader();
        var numbersReader = new NumbersReader();
        var quickBooksReader = new QuickBooksReader();

        excelReader.setNext(numbersReader);
        numbersReader.setNext(quickBooksReader);

        return excelReader;
    }
}
