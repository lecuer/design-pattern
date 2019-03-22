package design_pattern.creational_patterns.factory_pattern.dto;

import design_pattern.creational_patterns.factory_pattern.interf.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
