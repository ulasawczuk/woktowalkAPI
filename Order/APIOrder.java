package Order;

public class APIOrder extends Order {
    private String deliveryService;

    public APIOrder(){
    }

    public String getDeliveryService(){
        return deliveryService;
    }

    public void setDeliveryService(String deliveryService){
        this.deliveryService = deliveryService;
    }
    
}
