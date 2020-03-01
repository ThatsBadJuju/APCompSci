package Lab3;

public class UnderGrad extends Student {

    //3-arg constructor taken from Student superclass
    public UnderGrad(String name, String major, int unitsTaken) {
        super(name, major, unitsTaken);
    }

    //overrides Student abstract method
    @Override
    public int calculateTuition(int units) {
        return units * 250;
    }
}
