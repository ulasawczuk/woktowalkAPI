package Menu;

import java.util.List;

//Class representing the menu for a restaurant
public class Menu {
    private List<MenuItem> menu;
    
    public Menu(){
    }

    public List<MenuItem> getMenu(){
        return menu;
    }

    public void setMenu(List<MenuItem> menu){
        this.menu = menu;
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
