package design_pattern.jtee.composite_entity_pattern;

import design_pattern.jtee.composite_entity_pattern.client.Client;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
