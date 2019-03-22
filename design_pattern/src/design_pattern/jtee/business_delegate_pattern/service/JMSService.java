package design_pattern.jtee.business_delegate_pattern.service;

import design_pattern.jtee.business_delegate_pattern.interf.BusinessService;

public class JMSService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
