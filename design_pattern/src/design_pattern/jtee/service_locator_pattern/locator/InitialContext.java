package design_pattern.jtee.service_locator_pattern.locator;
/*为 JNDI 查询创建 InitialContext。*/
import design_pattern.jtee.service_locator_pattern.service.Service1;
import design_pattern.jtee.service_locator_pattern.service.Service2;
/*为 JNDI 查询创建 InitialContext。*/
public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}