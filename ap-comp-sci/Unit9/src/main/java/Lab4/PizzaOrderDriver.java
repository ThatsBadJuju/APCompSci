package Lab4;

public class PizzaOrderDriver {
    public static void main(String[] args) {

        //tests object pizzaOrder, addPizzaToOrder & calcCost methods
        PizzaOrder pizzaOrder = new PizzaOrder(3, true, true, false, 'l');
        System.out.println(pizzaOrder.printOrder());
        pizzaOrder.addPizzaToOrder('m', true, false, true);
        pizzaOrder.addPizzaToOrder('l', true, true, false);
        System.out.println(pizzaOrder.printOrder() + pizzaOrder.calcCost());
    }
}
