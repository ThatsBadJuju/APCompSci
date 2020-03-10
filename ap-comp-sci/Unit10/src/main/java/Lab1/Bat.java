package Lab1;

public class Bat extends Animal implements Flyer {

    public Bat() {
        super(true, true);
    }

    @Override
    protected void eat() {
        System.out.println("fruit and insects");
    }

    @Override
    protected void hair() {
        System.out.println("fur");
    }

    @Override
    public void takeoff() {
        System.out.println("launches from the tree");
    }

    @Override
    public void land() {
        System.out.println("hangs on a rafter");
    }
}
