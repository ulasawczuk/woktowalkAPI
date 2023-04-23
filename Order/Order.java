package Order;

import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.util.List;

import Menu.MenuItem;
import Pricing.Pricing;

/**
 * Abstract class representing an order with its attributes and get and set methods
 * Can be extended in order to have different kinds of orders
*/
public abstract class Order implements Pricing{
    private List<MenuItem> items;
    private double price;
    private String comment;
    private String status;
    private boolean paid;
    private Date date;
    private Time time;


    public List<MenuItem> getItems(){
        return items;
    }

    public void setItems(List<MenuItem> items){
        this.items = items;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public boolean getPaid(){
        return paid;
    }

    public void setPaid(Boolean paid){
        this.paid = paid;
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Time getTime(){
        return time;
    }

    public void setTime(Time time){
        this.time = time;
    }

    public Duration calculatePreparationTime(List<MenuItem> items){
        Duration time= Duration.ofSeconds(0);
        for(int i = 0; i<items.size(); i++){
            time.plus(items.get(i).getTimeToPrepare());
        }
        return time;
    }

    //to be chosen by a client whether to use a default way or a custom way to calculate the price
    @Override
    public double calculatePrice(){
        
        return price;
    }

}