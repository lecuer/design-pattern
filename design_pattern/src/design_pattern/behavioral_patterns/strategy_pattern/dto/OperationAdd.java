package design_pattern.behavioral_patterns.strategy_pattern.dto;

import design_pattern.behavioral_patterns.strategy_pattern.interf.Strategy;

public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}