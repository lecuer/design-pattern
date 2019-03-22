package design_pattern.jtee.business_delegate_pattern.client;

public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
