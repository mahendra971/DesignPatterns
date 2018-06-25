package FlyWeight;

public class FlyWeightDemo {
    public static void main(String[] args){

        IntentorySystem inv = new IntentorySystem();

        inv.takeOrder("Tv",1);
        inv.takeOrder("Laptop",2);
        inv.takeOrder("Tv",3);
        inv.takeOrder("Laptop",4);
        inv.takeOrder("Laptop",5);

        System.out.println(inv.report());
        inv.process();
    }
}
