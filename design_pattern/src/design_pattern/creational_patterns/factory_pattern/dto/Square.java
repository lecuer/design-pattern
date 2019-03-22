package design_pattern.creational_patterns.factory_pattern.dto;

import design_pattern.creational_patterns.factory_pattern.interf.Shape;

public class Square implements Shape {
    @Override
    public void draw() {

        System.out.println("Inside Square::draw() method.");
    }
}
