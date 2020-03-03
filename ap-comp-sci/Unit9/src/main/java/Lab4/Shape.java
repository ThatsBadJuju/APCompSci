package Lab4;

public abstract class Shape {
    private static int counter;
    private int idNumber;

    //0-arg constructor
    public Shape() {
        idNumber += counter;
    }

    //area calculation for other classes
    public double area() {
        return 0.0;
    }

    //abstract getName method
    public abstract String getName();
}
