package design_pattern.structural_patterns.facade_pattern.facade;

import design_pattern.structural_patterns.facade_pattern.dto.Circle;
import design_pattern.structural_patterns.facade_pattern.dto.Rectangle;
import design_pattern.structural_patterns.facade_pattern.dto.Square;
import design_pattern.structural_patterns.facade_pattern.interf.Shape;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}