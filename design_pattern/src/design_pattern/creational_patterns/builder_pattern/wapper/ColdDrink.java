package design_pattern.creational_patterns.builder_pattern.wapper;
import design_pattern.creational_patterns.builder_pattern.interf.Packing;
import design_pattern.creational_patterns.builder_pattern.interf.Item;

public abstract  class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
