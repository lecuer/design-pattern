package design_pattern.structural_patterns.facade_pattern;

import design_pattern.structural_patterns.facade_pattern.facade.ShapeMaker;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}