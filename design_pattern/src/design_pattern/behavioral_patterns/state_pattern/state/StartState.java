package design_pattern.behavioral_patterns.state_pattern.state;

import design_pattern.behavioral_patterns.state_pattern.dto.Context;
import design_pattern.behavioral_patterns.state_pattern.interf.State;

public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
