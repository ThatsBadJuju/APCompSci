package Lab4;

public class Circle extends Point {
    protected double radius;

    public Circle(double radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    public double area() {
        return 2 * Math.PI * radius;
    }
}
