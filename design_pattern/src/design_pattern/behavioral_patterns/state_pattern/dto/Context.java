package design_pattern.behavioral_patterns.state_pattern.dto;

import design_pattern.behavioral_patterns.state_pattern.interf.State;

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
