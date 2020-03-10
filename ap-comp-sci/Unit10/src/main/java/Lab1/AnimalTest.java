package Lab1;

public class AnimalTest {
    public static void main(String[] args) {
        Snake s = new Snake();
        Bat b = new Bat();
        Hawk h = new Hawk();
        Monkey m = new Monkey();
        //can't instantiate this b/c abstract class
    //    Animal a = new Animal(true,false);
        Animal z = new Hawk();
        NonFlyer f = new Monkey();
        s.movement();
        System.out.println("Snakes have legs? " + s.legs + " Snakes have wings? " + s.wings);
        b.takeoff();
        z.eat();
        z.hair();
        z.sound();
        f.movement();
    }
}
