package design_pattern.creational_patterns.builder_pattern.wapper;
import design_pattern.creational_patterns.builder_pattern.interf.Item;
import design_pattern.creational_patterns.builder_pattern.interf.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}