package design_pattern.creational_patterns.abstract_factory_pattern.factory;
import design_pattern.creational_patterns.abstract_factory_pattern.color.interf.Color;
import design_pattern.creational_patterns.abstract_factory_pattern.shape.interf.Shape;
import design_pattern.creational_patterns.abstract_factory_pattern.shape.dto.Circle;
import design_pattern.creational_patterns.abstract_factory_pattern.shape.dto.Rectangle;
import design_pattern.creational_patterns.abstract_factory_pattern.shape.dto.Square;
/*
* 创建扩展了 AbstractFactory 的工厂类，基于给定的信息生成实体类的对象。
* */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
