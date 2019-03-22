package design_pattern.creational_patterns.abstract_factory_pattern.shape.dto;

import design_pattern.creational_patterns.abstract_factory_pattern.shape.interf.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
