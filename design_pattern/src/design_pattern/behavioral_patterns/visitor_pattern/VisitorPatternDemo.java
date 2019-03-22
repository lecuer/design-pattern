package design_pattern.behavioral_patterns.visitor_pattern;

import design_pattern.behavioral_patterns.visitor_pattern.dto.Computer;
import design_pattern.behavioral_patterns.visitor_pattern.interf.ComputerPart;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}