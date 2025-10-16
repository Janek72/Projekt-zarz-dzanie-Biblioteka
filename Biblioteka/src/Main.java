public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addItem(book1);
        library.addItem(mag1);
        library.addItem(dvd1);

        library.showAllItems();

        book1.borrow();
        mag1.borrow();
        dvd1.borrow();

        System.out.println();
        library.showAvailableItems();

        book1.returnItem();
        System.out.println();
        library.showAvailableItems();
    }
}
