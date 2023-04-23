package Pricing;

import java.util.List;

import Menu.MenuItem;

//Class to calculate the price of an order in a default way
public class DefaultPricing implements Pricing{
    List<MenuItem> items;

    public DefaultPricing(List<MenuItem> items){
        this.items = items;
    }

    @Override
    public double calculatePrice() {
        double price = 0;
        for(int i = 0;i< items.size(); i++){
            price += items.get(i).getPrice();
        }
        return price;
    }
    
}
