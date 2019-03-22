package design_pattern.structural_patterns.decorator_pattern.decorator;

import design_pattern.structural_patterns.decorator_pattern.interf.Shape;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}