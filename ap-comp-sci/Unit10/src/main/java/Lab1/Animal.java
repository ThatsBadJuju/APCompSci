package Lab1;

public abstract class Animal {
    protected boolean wings;
    protected boolean legs;

    public Animal() {
        wings = false;
        legs = false;
    }

    public Animal(boolean wings, boolean legs) {
        this.wings = wings;
        this.legs = legs;
    }

    protected abstract void eat();
    protected abstract void hair();

    protected void sound() {
        System.out.println("default_noise.mp3");
    }
}
