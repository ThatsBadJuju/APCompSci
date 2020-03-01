package Lab3;

public class Advance extends Ticket {
    private int days;

    //constructor that uses superclass constructor
    public Advance(int days) {
        super();
        this.days = days;
    }

    //finds price of advance ticket
    @Override
    public double getPrice() {
        if(days >= 10) {
            return 30;
        }
        else {
            return 40;
        }
    }

    //toString of advance
    public String toString() {
        return super.toString();
    }
}
