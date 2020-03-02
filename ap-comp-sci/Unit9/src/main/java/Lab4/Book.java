package Lab4;

public class Book {
    private String publisher;
    private double regularPrice;
    private int yearPublished;

    public Book(String publisher, double regularPrice, int yearPublished) {
        this.publisher = publisher;
        this.regularPrice = regularPrice;
        this.yearPublished = yearPublished;
    }

    public double getRegularPrice() {
        return regularPrice;
    }
}
