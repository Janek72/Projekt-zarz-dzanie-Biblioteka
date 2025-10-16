import java.time.LocalDate;

public class LibraryItem {
    private String title;
    private int id;
    private boolean available;
    private LocalDate addedDate;

    public LibraryItem(String title, int id) {
        this.title = title;
        this.id = id;
        this.available = true;
        this.addedDate = LocalDate.now();
    }

    public String getTitle() { return title; }
    public int getId() { return id; }
    public boolean isAvailable() { return available; }
    public LocalDate getAddedDate() { return addedDate; }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void displayInfo() {
        String status = available ? "Dostępny" : "Wypożyczony";
        System.out.println("ID: " + id + " | Tytuł: " + title + " | Status: " + status + " | Dodano: " + addedDate);
    }

    public String getType() {
        return "Ogólny element biblioteki";
    }
}

