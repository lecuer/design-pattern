package design_pattern.creational_patterns.abstract_factory_pattern.factory;
import design_pattern.creational_patterns.abstract_factory_pattern.color.interf.Color;
import design_pattern.creational_patterns.abstract_factory_pattern.shape.interf.Shape;
import design_pattern.creational_patterns.abstract_factory_pattern.color.dto.Red;
import design_pattern.creational_patterns.abstract_factory_pattern.color.dto.Green;
import design_pattern.creational_patterns.abstract_factory_pattern.color.dto.Blue;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
