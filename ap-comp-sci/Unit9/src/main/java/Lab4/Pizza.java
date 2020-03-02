package Lab4;

public class Pizza {
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private char size;

    public Pizza(boolean pepperoni, boolean sausage, boolean mushrooms, char size) {
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    public int getNumToppings() {
        int toppings = 0;
        if(pepperoni) {
            toppings++;
        }
        if(sausage) {
            toppings++;
        }
        if(mushrooms) {
            toppings++;
        }
        return toppings;
    }
}
