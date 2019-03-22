package design_pattern.structural_patterns.bridge_pattern.bridge;

import design_pattern.structural_patterns.bridge_pattern.dto.Shape;
import design_pattern.structural_patterns.bridge_pattern.interf.DrawAPI;

public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}