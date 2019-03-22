package design_pattern.behavioral_patterns.null_object_pattern.dto;

public abstract class AbstractCustomer {
    protected String name;
    public abstract boolean isNil();
    public abstract String getName();
}