package design_pattern.behavioral_patterns.state_pattern.state;

import design_pattern.behavioral_patterns.state_pattern.dto.Context;
import design_pattern.behavioral_patterns.state_pattern.interf.State;

public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
