package Order;

public class DeliveryOrder extends Order {
    private String deliveryAddress;
    private String client;

    public DeliveryOrder(){
    }

    public String getDeliveryAddress(){
        return deliveryAddress;
    }
    
    public void setDeliveryAddress(String deliveryAddress){
        this.deliveryAddress = deliveryAddress;
    }

    public String getClient(){
        return client;
    }

    public void setClient(String client){
        this.client = client;
    }

}
