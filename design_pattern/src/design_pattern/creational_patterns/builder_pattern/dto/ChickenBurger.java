package design_pattern.creational_patterns.builder_pattern.dto;

import design_pattern.creational_patterns.builder_pattern.wapper.Burger;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
