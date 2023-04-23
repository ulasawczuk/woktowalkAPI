package Delivery;

//Class representing the delivery person for an order
public class DeliveryPerson {
    private String name;
    private int id;
    private boolean available;

    public DeliveryPerson(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public boolean getAvailable(){
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }
}
