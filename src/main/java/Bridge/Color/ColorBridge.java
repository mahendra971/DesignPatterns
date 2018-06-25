package Bridge.Color;

public class ColorBridge {

    public static void main(String[] args){

        Colors redcolor = new RedColor();

        Colors greecolor = new GreenColor();

        Shape circle = new Circle(redcolor);
        Shape circlegreen = new Circle(greecolor);

        circle.applyColor();
        circlegreen.applyColor();


    }
}
