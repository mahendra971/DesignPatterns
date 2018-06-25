package Decorator;

public class DecoratorDemo {

    public static void main(String[] args)
    {
        Sandwich nsand = new VegSandwichDecorator(new MeatSandwichDecorator(new SimpleSandwich()));
        System.out.print(nsand.make());
    }
}
