package design_pattern.behavioral_patterns.command_pattern.dto;

import design_pattern.behavioral_patterns.command_pattern.interf.Order;
import design_pattern.behavioral_patterns.command_pattern.command.Stock;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}