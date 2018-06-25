package FlyWeight;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IntentorySystem {

    private final Catalog cat = new Catalog();
    private final List<Order> orders = new CopyOnWriteArrayList<Order>();

    void takeOrder(String itemName, int order_num){

        Item item = cat.itemLookup(itemName);
        Order od = new Order(order_num,item);
        orders.add(od);
    }

    void process(){
        for(Order od : orders){
            od.processOrder();
            orders.remove(od);
        }
    }

    String report()
    {
        return "\n Total Items made " + cat.totalItemsMade();
    }

}
