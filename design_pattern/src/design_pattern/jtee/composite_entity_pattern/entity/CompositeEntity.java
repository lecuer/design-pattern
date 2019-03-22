package design_pattern.jtee.composite_entity_pattern.entity;

import design_pattern.jtee.composite_entity_pattern.dto.CoarseGrainedObject;
/*创建组合实体。*/
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}

