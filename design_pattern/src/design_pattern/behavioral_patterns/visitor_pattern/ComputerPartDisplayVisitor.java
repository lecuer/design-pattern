package design_pattern.behavioral_patterns.visitor_pattern;

import design_pattern.behavioral_patterns.visitor_pattern.dto.Computer;
import design_pattern.behavioral_patterns.visitor_pattern.dto.Keyboard;
import design_pattern.behavioral_patterns.visitor_pattern.dto.Monitor;
import design_pattern.behavioral_patterns.visitor_pattern.dto.Mouse;
import design_pattern.behavioral_patterns.visitor_pattern.interf.ComputerPartVisitor;
/*使用 ComputerPartDisplayVisitor 来显示 Computer 的组成部分。*/
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }
}