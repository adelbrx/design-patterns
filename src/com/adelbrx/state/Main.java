package com.adelbrx.state;

public class Main {
    public static  void main(String[] args) {
        var context = new Context();
        context.setCurrentState(new ConcreteStateA());
        context.handle();
    }
}
