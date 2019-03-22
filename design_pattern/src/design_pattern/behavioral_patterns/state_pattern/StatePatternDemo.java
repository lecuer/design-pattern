package design_pattern.behavioral_patterns.state_pattern;

import design_pattern.behavioral_patterns.state_pattern.dto.Context;
import design_pattern.behavioral_patterns.state_pattern.state.StartState;
import design_pattern.behavioral_patterns.state_pattern.state.StopState;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}