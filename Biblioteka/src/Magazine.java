public class Magazine extends LibraryItem implements Borrowable {
    private int issueNumber;
    private String month;
    private boolean borrowed;

    public Magazine(String title, int id, int issueNumber, String month) {
        super(title, id);
        this.issueNumber = issueNumber;
        this.month = month;
        this.borrowed = false;
    }

    @Override
    public void borrow() {
        if (!borrowed && isAvailable()) {
            borrowed = true;
            setAvailable(false);
            System.out.println("Wypożyczono magazyn: " + getTitle() + " (" + month + " - numer " + issueNumber + ")");
        } else {
            System.out.println("Magazyn " + getTitle() + " jest niedostępny.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            setAvailable(true);
            System.out.println("Zwrócono magazyn: " + getTitle());
        } else {
            System.out.println("Magazyn " + getTitle() + " nie był wypożyczony.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Numer wydania: " + issueNumber + " | Miesiąc: " + month);
    }

    @Override
    public String getType() {
        return "Magazyn";
    }
}
