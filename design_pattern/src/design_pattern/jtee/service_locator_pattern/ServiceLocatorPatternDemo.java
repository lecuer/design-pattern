package design_pattern.jtee.service_locator_pattern;

import design_pattern.jtee.service_locator_pattern.interf.Service;
import design_pattern.jtee.service_locator_pattern.locator.ServiceLocator;

public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}