package Lab4;

public class Pizza {
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private char size;

    //multi-arg constructor
    public Pizza(boolean pepperoni, boolean sausage, boolean mushrooms, char size) {
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.size = size;
    }

    //getter method for size
    public char getSize() {
        return size;
    }

    //gets total number of toppings
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

    //toString for Pizza class
    public String toString() {
        return "Pizza - " +
                "pepperoni: " + pepperoni +
                ", sausage: " + sausage +
                ", mushrooms: " + mushrooms +
                ", size: " + size;
    }
}
