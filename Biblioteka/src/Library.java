import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Dodano: " + item.getTitle() + " (" + item.getType() + ")");
    }

    public LibraryItem findItemById(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    public void showAllItems() {
        System.out.println("Wszystkie pozycje w bibliotece");
        if (items.isEmpty()) {
            System.out.println("(Brak pozycji, dodaj coś z menu 1–3.)");
            return;
        }
        for (LibraryItem item : items) {
            item.displayInfo();
            System.out.println("----------------------------------------");
        }
    }

    public void showAvailableItems() {
        System.out.println("Dostępne pozycje do wypożyczenia");
        if (items.isEmpty()) {
            System.out.println("(Brak pozycji. Dodaj coś z menu 1–3.)");
            return;
        }
        boolean any = false;
        for (LibraryItem item : items) {
            if (item.isAvailable()) {
                any = true;
                System.out.println("- " + item.getTitle() + " (" + item.getType() + "), ID: " + item.getId());
            }
        }
        if (!any) {
            System.out.println("(Aktualnie nic nie jest dostępne.)");
        }
    }
}

