package Order;

import java.sql.Date;
import java.time.Duration;
import java.util.List;

import Menu.MenuItem;
import Pricing.Pricing;

public abstract class Order implements Pricing{
    private List<MenuItem> items;
    private double price;
    private String comment;
    private String status;
    private boolean paid;
    private Date date;


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

    public Duration calculatePreparationTime(List<MenuItem> items){
        Duration time= Duration.ofSeconds(0);
        for(int i = 0; i<items.size(); i++){
            time.plus(items.get(i).getTimeToPrepare());
        }
        return time;
    }
    

}