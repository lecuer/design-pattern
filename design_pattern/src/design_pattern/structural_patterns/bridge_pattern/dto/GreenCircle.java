package design_pattern.structural_patterns.bridge_pattern.dto;

import design_pattern.structural_patterns.bridge_pattern.interf.DrawAPI;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
