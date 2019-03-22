package design_pattern.jtee.business_delegate_pattern.client;

import design_pattern.jtee.business_delegate_pattern.lookup_delegate.BusinessLookUp;
import design_pattern.jtee.business_delegate_pattern.interf.BusinessService;
/*创建业务代表。*/
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
