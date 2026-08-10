package com.adelbrx.template;

import com.adelbrx.template.tasks.TransferMoneyTask;

public class Main {
    public static  void main(String[] args) {
        var transferMoney = new TransferMoneyTask();
        transferMoney.execute();

    }
}
