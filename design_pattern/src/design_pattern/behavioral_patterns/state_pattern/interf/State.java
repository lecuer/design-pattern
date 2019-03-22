package design_pattern.behavioral_patterns.state_pattern.interf;

import design_pattern.behavioral_patterns.state_pattern.dto.Context;

public interface State {
    public void doAction(Context context);
}
