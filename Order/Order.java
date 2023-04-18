package Order;

import java.util.List;

import Menu.MenuItem;

public class Order{
    private List<MenuItem> items;
    private double totalPrice;
    private String comment;

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

    public String getcomment(){
        return comment;
    }

}