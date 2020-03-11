package Lab2;

public class HDTV extends TV implements Digital {

    public String tvType() {
        return "I'm a High Def 24 million color TV";
    }

    public String connectHDMI() {
        return "HDMI cable connected";
    }
}
