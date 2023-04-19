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

    public void addItem(MenuItem item){
        menu.add(item);
    }

    public void removeItem(MenuItem item){
        menu.remove(item);
    }

    public MenuItem getItem(MenuItem item){
        return menu.get(menu.indexOf(item));
    }

}
