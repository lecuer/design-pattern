package design_pattern.structural_patterns.filter_pattern.interf;

import design_pattern.structural_patterns.filter_pattern.dto.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}