package design_pattern.jtee.service_locator_pattern.service;

import design_pattern.jtee.service_locator_pattern.interf.Service;

public class Service2 implements Service {
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}