package design_pattern.creational_patterns.builder_pattern.wapper;
import design_pattern.creational_patterns.builder_pattern.interf.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
