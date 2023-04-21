package Delivery;

import java.time.Duration;

import Order.Order;

public class Delivery {
    private DeliveryPerson deliveryPerson;
    private Order order;
    private Duration deliveryTime;

    public Delivery(){
    }

    public DeliveryPerson getDeliveryPerson(){
        return deliveryPerson;
    }

    public void setDeliveryPerson(DeliveryPerson deliveryPerson){
        this.deliveryPerson = deliveryPerson;
    }

    public Order getOrder(){
        return order;
    }

    public void setOrder(Order order){
        this.order = order;
    }

    public Duration getDeliveryTime(){
        return deliveryTime;
    }

    public void setDeliveryTime(Duration time){
        this.deliveryTime = time;
    }
}
