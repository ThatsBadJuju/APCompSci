package Lab4;

public class PizzaOrder extends Pizza {
    private Pizza[] maxPizzas;
    private int numPizzas;

    public PizzaOrder(int numPizzas, boolean pepperoni, boolean sausage, boolean mushrooms, char size) {
        super(pepperoni, sausage, mushrooms, size);
        this.numPizzas = numPizzas;
        maxPizzas = new Pizza[numPizzas];
    }

    public void addPizzaToOrder(char size, boolean pepperoni, boolean sausage, boolean mushrooms) {
        Pizza pizza = new Pizza(pepperoni, sausage, mushrooms, size);
        for(int i = 0; i < maxPizzas.length; i++) {
            if(!maxPizzas[i].equals(null)) {
                maxPizzas[i] = pizza;
                break;
            }
        }
    }

    public int calcCost() {
        int cost = 0;
        for(int i = 0; i < maxPizzas.length; i++) {
            if(maxPizzas[i].getSize() == 's') {
                cost += 8;
            }
        }
        return cost;
    }
}
