package shapes;

import util.Input;

public class circleApp {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Let's get a radius for our circle:");
        Circle circle = new Circle(input.getDouble());
        System.out.printf("Circle's area: %f; Circle's circumference: %f.%n", circle.getArea(), circle.getCircumference());
    }
}
