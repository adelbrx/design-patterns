package com.adelbrx.observer;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var spreadSheet1 = new SpreadSheet();
        var spreadSheet2 = new SpreadSheet();
        var chart = new Chart();

        dataSource.addObserver(spreadSheet1);
        dataSource.addObserver(spreadSheet2);
        dataSource.addObserver(chart);

        dataSource.setValue("adel");
    }
}
