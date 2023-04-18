package Order;

import java.util.List;

import Menu.MenuItem;

public class Order{
    private List<MenuItem> items;
    private double totalPrice;
    private String status;

    public Order(List<MenuItem> items, double totalPrice, String status){
        this.items = items;
        this.totalPrice = totalPrice;
        this.status = status;
    }

    public List<MenuItem> getItems(){
        return items;
    }

    public double getTotalPrice(){
        return totalPrice;
    }

    public String getStatus(){
        return status;
    }

}