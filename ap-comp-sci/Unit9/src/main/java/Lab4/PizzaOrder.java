package Lab4;

public class PizzaOrder extends Pizza {
    private Pizza[] maxPizzas;
    private int numPizzas;

    //uses superclass constructor
    public PizzaOrder(int numPizzas, boolean pepperoni, boolean sausage, boolean mushrooms, char size) {
        super(pepperoni, sausage, mushrooms, size);
        this.numPizzas = numPizzas;
        maxPizzas = new Pizza[numPizzas];
    }

    //adds customized pizza to empty space in array
    public void addPizzaToOrder(char size, boolean pepperoni, boolean sausage, boolean mushrooms) {
        Pizza pizza = new Pizza(pepperoni, sausage, mushrooms, size);
        for(int i = 0; i < maxPizzas.length; i++) {
            if(maxPizzas[i] == null) {
                maxPizzas[i] = pizza;
                break;
            }
        }
    }

    //finds the cost of all pizzas in array
    public int calcCost() {
        int cost = 0;
        for(int i = 0; i < maxPizzas.length; i++) {
            if(maxPizzas[i] == null) {
                continue;
            }
            if(maxPizzas[i].getSize() == 's') {
                cost += 8;
            }
            else if(maxPizzas[i].getSize() == 'm') {
                cost += 10;
            }
            else {
                cost += 12;
            }

            cost += maxPizzas[i].getNumToppings();
        }
        return cost;
    }

    //prints out entire order
    public String printOrder() {
        String output = "";
        for(int i = 0; i < maxPizzas.length; i++) {
            output += maxPizzas[i] + "\n";
        }
        return output;
    }
}
