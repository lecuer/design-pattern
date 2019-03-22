package design_pattern.creational_patterns.abstract_factory_pattern.shape.dto;

import design_pattern.creational_patterns.abstract_factory_pattern.shape.interf.Shape;

public class Square implements Shape {
    @Override
    public void draw() {

        System.out.println("Inside Square::draw() method.");
    }
}
