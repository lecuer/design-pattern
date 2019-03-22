package design_pattern.structural_patterns.filter_pattern.impl;

import design_pattern.structural_patterns.filter_pattern.dto.Person;
import design_pattern.structural_patterns.filter_pattern.interf.Criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
