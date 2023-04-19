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

    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void addIngridient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void removeIngridient(Ingredient ingredient){

    }

    //add calculatetotalprice from price interface

}
