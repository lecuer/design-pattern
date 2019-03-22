package design_pattern.behavioral_patterns.command_pattern;

import design_pattern.behavioral_patterns.command_pattern.command.Broker;
import design_pattern.behavioral_patterns.command_pattern.command.Stock;
import design_pattern.behavioral_patterns.command_pattern.dto.BuyStock;
import design_pattern.behavioral_patterns.command_pattern.dto.SellStock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}