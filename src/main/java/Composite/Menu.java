package Composite;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public  Menu(String name, String url){
        this.name = name;
        this.url = url;
    }

    public  MenuComponent add(MenuComponent mc)
    {
        menuComponents.add(mc);
        return mc;
    }

    public  MenuComponent remove(MenuComponent mc)
    {
        menuComponents.remove(mc);
        return mc;
    }
    public String toString() {
        StringBuilder data = new StringBuilder();
        data.append(print(this));
        Iterator<MenuComponent> menus = menuComponents.iterator();
        while (menus.hasNext())
        {
            MenuComponent mc1 = menus.next();
            data.append(mc1.toString());
        }
         return data.toString();
    }
}
