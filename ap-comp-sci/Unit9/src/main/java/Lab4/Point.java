package Lab4;

public class Point extends Shape {
    private int x;
    private int y;

    //calls on shape constructor
    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    //overrides shape abstract getName method
    @Override
    public String getName() {
        return "Point";
    }
}
