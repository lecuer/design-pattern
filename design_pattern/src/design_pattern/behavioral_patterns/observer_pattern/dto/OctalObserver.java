package design_pattern.behavioral_patterns.observer_pattern.dto;

import design_pattern.behavioral_patterns.observer_pattern.obj.Observer;
import design_pattern.behavioral_patterns.observer_pattern.obj.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}