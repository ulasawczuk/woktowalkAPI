package Order;

import Delivery.DeliveryPerson;

public class WorkerOrder extends Order {
    private int table;
    private DeliveryPerson deliveryPerson;

    public WorkerOrder(){
    }

    public int getTable(){
        return table;
    }

    public void setTable(int table){
        this.table = table;
    }

    public DeliveryPerson getDeliveryPerson(){
        return deliveryPerson;
    }

    public void setDeliveryPerson(DeliveryPerson deliveryPerson){
        this.deliveryPerson = deliveryPerson;
    }
}
