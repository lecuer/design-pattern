package design_pattern.creational_patterns.abstract_factory_pattern.color.dto;

import design_pattern.creational_patterns.abstract_factory_pattern.color.interf.Color;

public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
