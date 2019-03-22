package design_pattern.behavioral_patterns.observer_pattern.dto;

import design_pattern.behavioral_patterns.observer_pattern.obj.Observer;
import design_pattern.behavioral_patterns.observer_pattern.obj.Subject;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}