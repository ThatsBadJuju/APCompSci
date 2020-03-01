package Lab3;

public class StudentAdvance extends Advance {

    //constructor calling on superclass constructor
    public StudentAdvance(int days) {
        super(days);
    }

    //finds price of student advance ticket
    @Override
    public double getPrice() {
        return super.getPrice() / 2;
    }


    //toString of superclass + student id required
    @Override
    public String toString() {
        return super.toString() + "\n(student ID required)";
    }
}