package design_pattern.behavioral_patterns.observer_pattern.obj;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}