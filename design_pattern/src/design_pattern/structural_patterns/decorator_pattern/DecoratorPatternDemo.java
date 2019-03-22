package design_pattern.structural_patterns.decorator_pattern;

import design_pattern.structural_patterns.decorator_pattern.decorator.RedShapeDecorator;
import design_pattern.structural_patterns.decorator_pattern.dto.Circle;
import design_pattern.structural_patterns.decorator_pattern.dto.Rectangle;
import design_pattern.structural_patterns.decorator_pattern.interf.Shape;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
