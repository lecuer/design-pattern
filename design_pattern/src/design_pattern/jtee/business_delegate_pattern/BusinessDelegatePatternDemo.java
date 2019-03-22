package design_pattern.jtee.business_delegate_pattern;

import design_pattern.jtee.business_delegate_pattern.client.BusinessDelegate;
import design_pattern.jtee.business_delegate_pattern.client.Client;
/*使用 BusinessDelegate 和 Client 类来演示业务代表模式。*/
public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
