package Order;
public class Customer {
    private String name;
    private int phoneNumber;
    private String deliveryAddress;
    private int orderID;
    
    public Customer(String name, int phoneNumber, String deliveryAddress, int orderID){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.deliveryAddress = deliveryAddress;
        this.orderID = orderID;
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

    public int getOrderID(){
        return orderID;
    }
}
