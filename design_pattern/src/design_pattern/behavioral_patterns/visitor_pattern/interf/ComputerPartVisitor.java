package design_pattern.behavioral_patterns.visitor_pattern.interf;

import design_pattern.behavioral_patterns.visitor_pattern.dto.Computer;
import design_pattern.behavioral_patterns.visitor_pattern.dto.Keyboard;
import design_pattern.behavioral_patterns.visitor_pattern.dto.Monitor;
import design_pattern.behavioral_patterns.visitor_pattern.dto.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}