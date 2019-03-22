package design_pattern.creational_patterns.builder_pattern.dto;

import design_pattern.creational_patterns.builder_pattern.wapper.Burger;

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }

}
