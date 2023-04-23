package Menu;

//Class representing ingredients of a dish in a menu
public class Ingredient {
    private String name;
    private double price;


    public Ingredient(){
        
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

}
