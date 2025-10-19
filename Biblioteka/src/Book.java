public class Book extends LibraryItem implements Borrowable {
    private String author;
    private int pages;
    private boolean borrowed;

    public Book(String title, int id, String author, int pages) {
        super(title, id);
        this.author = author;
        this.pages = pages;
        this.borrowed = false;
    }

    @Override
    public void borrow() {
        if (!borrowed && isAvailable()) {
            borrowed = true;
            setAvailable(false);
            System.out.println("Wypożyczono książkę: " + getTitle() + " (autor: " + author + ")");
        } else {
            System.out.println("Książka " + getTitle() + " jest już wypożyczona.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            setAvailable(true);
            System.out.println("Zwrócono książkę: " + getTitle());
        } else {
            System.out.println("Książka " + getTitle() + " nie była wypożyczona.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Autor: " + author + " | Liczba stron: " + pages);
    }

    @Override
    public String getType() {
        return "Książka";
    }
}
