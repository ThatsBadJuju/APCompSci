package Lab4;

public class Cartoon extends Book {
    private String name;

    public Cartoon(String name, String publisher, double regularPrice, int yearPublished) {
        super(publisher, regularPrice, yearPublished);
        this.name = name;
    }

    public double computeSalePrice() {
        double salePrice = 0;
        if(getRegularPrice() < 100) {
            salePrice = getRegularPrice() * .75;
        }
        else {
            salePrice = getRegularPrice() * .6;
        }
        return salePrice;
    }
}
