package Lab3;

public class DoctorDoom extends SuperHero{
    //2-arg constructor
    public DoctorDoom(String suitColor, boolean hasCape) {
        super(suitColor, hasCape);
    }

    @Override
    //overrides abstract motto method
    public String motto() {
        return "Fool! Doctor Doom toots as he pleases!";
    }
}
