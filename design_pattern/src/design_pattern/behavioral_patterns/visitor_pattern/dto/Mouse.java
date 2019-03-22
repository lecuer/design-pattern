package design_pattern.behavioral_patterns.visitor_pattern.dto;

import design_pattern.behavioral_patterns.visitor_pattern.interf.ComputerPart;
import design_pattern.behavioral_patterns.visitor_pattern.interf.ComputerPartVisitor;

public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}