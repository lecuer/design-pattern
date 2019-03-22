package design_pattern.structural_patterns.bridge_pattern;

import design_pattern.structural_patterns.bridge_pattern.bridge.Circle;
import design_pattern.structural_patterns.bridge_pattern.dto.GreenCircle;
import design_pattern.structural_patterns.bridge_pattern.dto.RedCircle;
import design_pattern.structural_patterns.bridge_pattern.dto.Shape;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}