package Lab1;

public class Monkey extends Animal implements NonFlyer {

    public Monkey() {
        super(false, true);
    }

    @Override
    protected void eat() {
        System.out.println("fruit");
    }

    @Override
    protected void hair() {
        System.out.println("fur");
    }

    @Override
    protected void sound() {
        System.out.println("chatters");
    }

    @Override
    public void movement() {
        System.out.println("jumps");
    }
}
