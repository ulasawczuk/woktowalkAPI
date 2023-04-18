package Order;
public class Customer {
    private String name;
    private int phoneNumber;
    private String deliveryAddress;
    private Order order;
    
    public Customer(String name, int phoneNumber, String deliveryAddress, Order order){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.deliveryAddress = deliveryAddress;
        this.order = order;
    }

    public String getName(){
        return name;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public String getDeliveryAddress(){
        return deliveryAddress;
    }

    public Order getOrder(){
        return order;
    }
}
