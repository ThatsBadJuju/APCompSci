package Lab3;

public class AsteroidMan extends SuperHero{
    //2-arg constructor
    public AsteroidMan(String suitColor, boolean hasCape) {
        super(suitColor, hasCape);
    }

    @Override
    //overrides abstract motto method
    public String motto() {
        return "I'm gonna rock your world!";
    }
}

