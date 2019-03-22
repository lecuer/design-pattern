package design_pattern.behavioral_patterns.command_pattern.dto;

import design_pattern.behavioral_patterns.command_pattern.interf.Order;
import design_pattern.behavioral_patterns.command_pattern.command.Stock;

public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}