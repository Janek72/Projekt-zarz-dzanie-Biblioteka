public class DVD extends LibraryItem implements Borrowable {
    private int duration; // minuty
    private String director;
    private boolean borrowed;

    public DVD(String title, int id, int duration, String director) {
        super(title, id);
        this.duration = duration;
        this.director = director;
        this.borrowed = false;
    }

    @Override
    public void borrow() {
        if (!borrowed && isAvailable()) {
            borrowed = true;
            setAvailable(false);
            System.out.println("Wypożyczono DVD: " + getTitle() + " (reżyser: " + director + ")");
        } else {
            System.out.println("DVD " + getTitle() + " jest już wypożyczone.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            setAvailable(true);
            System.out.println("Zwrócono DVD: " + getTitle());
        } else {
            System.out.println("DVD " + getTitle() + " nie było wypożyczone.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Reżyser: " + director + " | Czas trwania: " + duration + " min");
    }

    @Override
    public String getType() {
        return "DVD";
    }
}
