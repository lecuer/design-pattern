package design_pattern.jtee.composite_entity_pattern.client;

import design_pattern.jtee.composite_entity_pattern.entity.CompositeEntity;
import design_pattern.jtee.intercepting_filter_pattern.filter.FilterManager;

public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData(){
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2){
        compositeEntity.setData(data1, data2);
    }


}
