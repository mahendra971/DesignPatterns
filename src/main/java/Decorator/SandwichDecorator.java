package Decorator;

public abstract class SandwichDecorator implements Sandwich  {

    protected Sandwich customSandwich;

    SandwichDecorator(Sandwich customSandwich){
        this.customSandwich = customSandwich;
    }

    public abstract String make();
}
