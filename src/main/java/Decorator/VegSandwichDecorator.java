package Decorator;

public class VegSandwichDecorator extends SandwichDecorator {
    VegSandwichDecorator(Sandwich customSandwich) {
        super(customSandwich);
    }

    public String make() {
        return customSandwich.make()+"+"+addVeg();
    }

    private String addVeg() {
        return "cabbage";
    }
}
