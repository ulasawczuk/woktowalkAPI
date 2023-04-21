package Menu;

import java.time.Duration;
import java.util.List;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private List<Ingredient> ingredients;
    private Duration timeToPrepare;

    public MenuItem(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public List<Ingredient> getIngredients(){
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients){
        this.ingredients = ingredients;
    }
    

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient){

    }

    public Duration getTimeToPrepare(){
        return timeToPrepare;
    }

    public void setTimeToPrepare(Duration time){
        this.timeToPrepare = time;
    }

}
