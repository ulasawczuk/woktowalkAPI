package Menu;

import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menu;
    
    public Menu(ArrayList<MenuItem> menu){
        this.menu = menu;
    }

    public ArrayList<MenuItem> getMenu(){
        return menu;
    }

}
