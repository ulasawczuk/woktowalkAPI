package Menu;

import java.util.ArrayList;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private ArrayList<Ingredient> ingredients;

    public MenuItem(String name, double price, String description, ArrayList<Ingredient> ingredients){
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
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

    public ArrayList<Ingredient> getingredients(){
        return ingredients;
    }

    //add calculatetotalprice from price interface

}
