package Pricing;

import java.sql.Time;
import Order.Order;

//Customised way of calculating the price of an order, can be implemented with a clients
public class CustomPricing implements Pricing{
    private Order order;
    private Time time;
    private Time happyHourFrom;
    private Time happyHourTo;
    private int happyHourDiscountPercent;
    private boolean discount;
    private int discountPercent;

    public CustomPricing(Order order, Time happyFrom, Time happyTo, int happyDiscount, boolean discount, int discountPercent){
        this.order = order;
        this.time = order.getTime();
        this.happyHourFrom = happyFrom;
        this.happyHourTo = happyTo;
        this.happyHourDiscountPercent = happyDiscount;
        this.discount = discount;
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice() {
        double price = order.getPrice();
        if(time.compareTo(happyHourFrom) < 0 && time.compareTo(happyHourTo) > 0){
            price -= order.getPrice()*happyHourDiscountPercent/100;
        }
        if(discount){
            price -= order.getPrice()*discountPercent/100;
        }
        return price;
    }
    
}
