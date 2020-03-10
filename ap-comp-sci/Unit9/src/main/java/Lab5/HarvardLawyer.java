package Lab5;

public class HarvardLawyer extends Lawyer {
    @Override
    public void applyForVacation() {
        for(int i = 0; i < 4; i++) {
            super.applyForVacation();
        }
    }

    @Override
    public void showVacation() {
        System.out.println("I receive 3 weeks and 3 days vacation.");
    }

    public void showSalary() {
        System.out.println("My salary is $48,000.");
    }
}
