package com.adelbrx.state;

public class ConcreteStateB implements State{
    @Override
    public void handle() {
        System.out.println("handle ConcreteState B");
    }
}
