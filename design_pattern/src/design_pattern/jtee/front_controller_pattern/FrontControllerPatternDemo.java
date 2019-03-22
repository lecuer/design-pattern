package design_pattern.jtee.front_controller_pattern;

import design_pattern.jtee.front_controller_pattern.controller.FrontController;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
