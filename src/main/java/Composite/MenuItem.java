package Composite;

public class MenuItem extends MenuComponent {

    MenuItem(String name, String url){
        this.name=name;
        this.url = url;
    }
    public String toString() {
        return print(this);
    }
}
