package design_pattern.structural_patterns.flyweight_pattern;

import design_pattern.structural_patterns.flyweight_pattern.dto.Circle;
import design_pattern.structural_patterns.flyweight_pattern.interf.Shape;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}