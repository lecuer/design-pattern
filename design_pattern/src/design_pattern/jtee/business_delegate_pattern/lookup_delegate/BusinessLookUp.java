package design_pattern.jtee.business_delegate_pattern.lookup_delegate;

import design_pattern.jtee.business_delegate_pattern.interf.BusinessService;
import design_pattern.jtee.business_delegate_pattern.service.EJBService;
import design_pattern.jtee.business_delegate_pattern.service.JMSService;
/*创建业务查询服务。*/
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
