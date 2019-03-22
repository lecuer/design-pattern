package design_pattern.behavioral_patterns.observer_pattern;

import design_pattern.behavioral_patterns.observer_pattern.dto.BinaryObserver;
import design_pattern.behavioral_patterns.observer_pattern.dto.HexaObserver;
import design_pattern.behavioral_patterns.observer_pattern.dto.OctalObserver;
import design_pattern.behavioral_patterns.observer_pattern.obj.Subject;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}