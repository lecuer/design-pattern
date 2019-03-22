package design_pattern.behavioral_patterns.strategy_pattern;

import design_pattern.behavioral_patterns.strategy_pattern.interf.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}