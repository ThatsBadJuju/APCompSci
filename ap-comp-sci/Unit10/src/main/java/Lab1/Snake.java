package Lab1;

public class Snake extends Animal implements NonFlyer {

    public Snake() {
        super(false, false);
    }

    @Override
    protected void eat() {
        System.out.println("rats");
    }

    @Override
    protected void hair() {
        System.out.println("none");
    }

    @Override
    protected void sound() {
        System.out.println("hisses");
    }

    @Override
    public void movement() {
        System.out.println("slithers");
    }
}
