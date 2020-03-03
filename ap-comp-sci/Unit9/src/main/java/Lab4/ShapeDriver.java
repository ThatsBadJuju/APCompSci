package Lab4;

public class ShapeDriver {
    public static void main(String[] args) {

        //point and circle objects
        Point point = new Point(-1, 4);
        Circle circle = new Circle(5,2, -3);

        //prints names and area
        System.out.println(point.getName() + ", " + circle.getName());
        System.out.println("Area of Circle: " + circle.area());
    }
}
