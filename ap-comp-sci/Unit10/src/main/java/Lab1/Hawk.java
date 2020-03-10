package Lab1;

public class Hawk extends Animal implements Flyer {

    public Hawk() {
        super(true, true);
    }

    @Override
    protected void eat() {
        System.out.println("small animals");
    }

    @Override
    protected void hair() {
        System.out.println("feathers");
    }

    @Override
    protected void sound() {
        System.out.println("screeches");
    }

    @Override
    public void takeoff() {
        System.out.println("glides");
    }

    @Override
    public void land() {
        System.out.println("perches on a tree top");
    }
}
