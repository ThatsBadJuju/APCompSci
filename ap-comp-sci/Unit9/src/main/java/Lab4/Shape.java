package Lab4;

public abstract class Shape {
    private static int counter;
    private int idNumber;

    public Shape() {
        idNumber += counter;
    }

    public double area() {
        return 0.0;
    }

    public abstract String getName();
}
