package com.adelbrx.state;

public class Context {
    private State currentState;

    public void handle() {
        currentState.handle();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
