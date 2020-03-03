package Lab4;

public class Circle extends Point {
    protected double radius;

    //uses point constructor
    public Circle(double radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    //overrides getName abstract method
    @Override
    public String getName() {
        return "Circle";
    }

    //calculates area of circle
    public double area() {
        return 2 * Math.PI * radius;
    }
}
