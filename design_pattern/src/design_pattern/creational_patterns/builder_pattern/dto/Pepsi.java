package design_pattern.creational_patterns.builder_pattern.dto;

import design_pattern.creational_patterns.builder_pattern.wapper.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}