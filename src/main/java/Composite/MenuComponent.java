package Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {


    String name;
    String url;
    List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
    public abstract String toString();
    public String print(MenuComponent menuc){
        StringBuilder data = new StringBuilder(name);
        data.append(":");
        data.append(url);
        data.append("\n");
        return data.toString();


    }
}


