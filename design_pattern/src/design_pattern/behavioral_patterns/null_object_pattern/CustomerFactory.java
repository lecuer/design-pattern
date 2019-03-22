package design_pattern.behavioral_patterns.null_object_pattern;

import design_pattern.behavioral_patterns.null_object_pattern.dto.AbstractCustomer;
import design_pattern.behavioral_patterns.null_object_pattern.dto.NullCustomer;
import design_pattern.behavioral_patterns.null_object_pattern.dto.RealCustomer;

public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}