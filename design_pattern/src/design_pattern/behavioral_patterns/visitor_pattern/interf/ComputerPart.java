package design_pattern.behavioral_patterns.visitor_pattern.interf;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}