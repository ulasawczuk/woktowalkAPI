import java.util.List;

import Menu.Menu;
import Order.APIOrder;

public class API{
    private Menu menu;
    private APIOrder order;

    public Menu getMenu(){
        return menu;
    }

    public void setMenu(Menu menu){
        this.menu = menu;
    }

    public APIOrder getOrder(){
        return order;
    }

    public void setOrder(APIOrder order){
        this.order = order;
    }
}