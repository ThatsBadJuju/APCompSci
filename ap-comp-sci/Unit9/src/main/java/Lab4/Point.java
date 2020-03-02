package Lab4;

public class Point extends Shape {
    private int x;
    private int y;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public String getName() {
        return "Point";
    }
}
