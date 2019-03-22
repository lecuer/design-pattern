package design_pattern.structural_patterns.bridge_pattern.dto;

import design_pattern.structural_patterns.bridge_pattern.interf.DrawAPI;
/*抽象类*/
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
