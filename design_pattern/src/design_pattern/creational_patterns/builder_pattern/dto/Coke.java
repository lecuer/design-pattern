package design_pattern.creational_patterns.builder_pattern.dto;

import design_pattern.creational_patterns.builder_pattern.wapper.ColdDrink;


public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}