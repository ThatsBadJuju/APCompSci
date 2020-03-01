package Lab3;

public abstract class Ticket {
    private int serialNumber; //unique ticket id number

    public Ticket() {
        serialNumber = getNextSerialNumber();
    }

    //returns price
    public abstract double getPrice();

    //returns a new unique serial number (1-1000)
    private static int getNextSerialNumber() {
        int randomIntGen = (int)(Math.random() * 1000 + 1);
        return randomIntGen;
    }

    //returns string with info on ticket
    public String toString() {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }
}
