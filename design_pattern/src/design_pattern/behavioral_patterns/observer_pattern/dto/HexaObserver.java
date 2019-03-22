package design_pattern.behavioral_patterns.observer_pattern.dto;

import design_pattern.behavioral_patterns.observer_pattern.obj.Observer;
import design_pattern.behavioral_patterns.observer_pattern.obj.Subject;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
