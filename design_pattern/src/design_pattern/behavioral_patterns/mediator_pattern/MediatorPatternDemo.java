package design_pattern.behavioral_patterns.mediator_pattern;

import design_pattern.behavioral_patterns.mediator_pattern.dto.User;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}