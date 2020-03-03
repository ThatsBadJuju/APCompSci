package Lab4;

public class BookDriver {
    public static void main(String[] args) {

        //children book object
        ChildrenBook butterBattleBook = new ChildrenBook(8, "Random House", 19.99, 1984);
        System.out.println(butterBattleBook.computeSalePrice());

        //cartoon object
        Cartoon garfield = new Cartoon("Garfield", "Penguin Random House", 9.99, 1978);
        System.out.println(garfield.computeSalePrice());
    }
}
