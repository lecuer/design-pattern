package design_pattern.behavioral_patterns.strategy_pattern;

import design_pattern.behavioral_patterns.strategy_pattern.dto.OperationAdd;
import design_pattern.behavioral_patterns.strategy_pattern.dto.OperationMultiply;
import design_pattern.behavioral_patterns.strategy_pattern.dto.OperationSubstract;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
