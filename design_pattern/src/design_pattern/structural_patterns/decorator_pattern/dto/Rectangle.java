package design_pattern.structural_patterns.decorator_pattern.dto;

import design_pattern.structural_patterns.decorator_pattern.interf.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
