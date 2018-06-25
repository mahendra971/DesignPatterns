package Composite;

public class MenuComposite {

    public static void main(String[] args){

        Menu mainmenu = new Menu("Main Menu","MainUrl");
        MenuItem m1 = new MenuItem("item1","item1url");
        mainmenu.add(m1);

        Menu m2 = new Menu("item2","item2url");
        mainmenu.add(m2);

        MenuItem m21 = new MenuItem("item21","item21url");

        m2.add(m21);

        System.out.println(mainmenu.toString());

    }
}
