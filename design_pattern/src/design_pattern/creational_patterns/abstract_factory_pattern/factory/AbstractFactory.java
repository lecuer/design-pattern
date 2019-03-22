package design_pattern.creational_patterns.abstract_factory_pattern.factory;
import design_pattern.creational_patterns.abstract_factory_pattern.color.interf.Color;
import design_pattern.creational_patterns.abstract_factory_pattern.shape.interf.Shape;


public abstract class AbstractFactory {
    //abstract使用
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
