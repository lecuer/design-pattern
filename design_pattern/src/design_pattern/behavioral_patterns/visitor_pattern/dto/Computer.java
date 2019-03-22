package design_pattern.behavioral_patterns.visitor_pattern.dto;

import design_pattern.behavioral_patterns.visitor_pattern.interf.ComputerPart;
import design_pattern.behavioral_patterns.visitor_pattern.interf.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }


    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}