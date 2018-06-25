package FlyWeight;

public class Order {
private  final int order_num;
private final Item item;

Order(int order_num, Item item){

    this.order_num= order_num;
    this.item = item;
}

void processOrder()
{
    System.out.println("Processing Order: "+ order_num +" item : "+ item);
}
}
