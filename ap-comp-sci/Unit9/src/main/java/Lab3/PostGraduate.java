package Lab3;

public class PostGraduate extends Graduate {

    //3-arg constructor taken from Student superclass
    public PostGraduate(String name, String major, int unitsTaken) {
        super(name, major, unitsTaken);
    }

    //overrides Student abstract method
    @Override
    public int calculateTuition(int units) {
        return units * 750;
    }
}
