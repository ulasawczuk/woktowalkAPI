package Menu;

import java.util.ArrayList;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private ArrayList<Product> products;

    public MenuItem(String name, double price, String description, ArrayList<Product> products){
        this.name = name;
        this.price = price;
        this.products = products;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDescription(){
        return description;
    }

    public ArrayList<Product> getProducts(){
        return products;
    }

}
