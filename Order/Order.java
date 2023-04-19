package Order;

import java.util.List;

import Menu.MenuItem;

public abstract class Order{
    private List<MenuItem> items;
    private double totalPrice;
    private String comment;
    private String status;

    public Order(List<MenuItem> items, double totalPrice, String comment){
        this.items = items;
        this.totalPrice = totalPrice;
        this.comment = comment;
    }

    public List<MenuItem> getItems(){
        return items;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public String getComment(){
        return comment;
    }

    public String getStatus(){
        return status;
    }

    public void updateStatus(String status){
        this.status = status;
    }

}