import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Dodano do biblioteki: " + item.getTitle() + " (" + item.getType() + ")");
    }

    public LibraryItem findItemById(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    public void showAllItems() {
        System.out.println("\n=== Lista wszystkich pozycji w bibliotece ===");
        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println("----------------------------------------");
        }
    }

    public void showAvailableItems() {
        System.out.println("\n=== Dostępne pozycje ===");
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                System.out.println(item.getTitle() + " (" + item.getType() + ")");
            }
        }
    }
}
