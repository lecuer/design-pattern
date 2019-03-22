package design_pattern.structural_patterns.facade_pattern.dto;

import design_pattern.structural_patterns.facade_pattern.interf.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}