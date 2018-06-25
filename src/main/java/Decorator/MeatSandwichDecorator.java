package Decorator;

public class MeatSandwichDecorator extends SandwichDecorator {
    MeatSandwichDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make() +"+" + addMeat();
    }

    private String addMeat() {
        return "Meat";
    }
}
