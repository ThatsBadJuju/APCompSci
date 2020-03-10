package Lab5;

public class Marketer extends Employee {

    @Override
    public void showSalary() {
        System.out.println("My salary is $40,000.");
    }

    public void advertise() {
        System.out.println("Act now, while supplies last!");
    }
}
