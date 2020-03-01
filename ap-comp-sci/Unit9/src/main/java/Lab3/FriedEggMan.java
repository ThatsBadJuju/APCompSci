package Lab3;

public class FriedEggMan extends SuperHero{
    //2-arg constructor
    public FriedEggMan(String suitColor, boolean hasCape) {
        super(suitColor, hasCape);
    }

    @Override
    //overrides abstract motto method
    public String motto() {
        return "You'll get burned!";
    }
}

