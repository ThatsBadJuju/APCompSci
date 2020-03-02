package Lab4;

public class ChildrenBook extends Book {
    private int age;

    public ChildrenBook(int age, String publisher, double regularPrice, int yearPublished) {
        super(publisher, regularPrice, yearPublished);
        this.age = age;
    }


    public double computeSalePrice() {
        double salePrice = 0;
        if(age < 6) {
            salePrice = getRegularPrice() * 0.6;
        }
        else {
            salePrice = getRegularPrice() * 0.8;
        }
        return salePrice;
    }
}
