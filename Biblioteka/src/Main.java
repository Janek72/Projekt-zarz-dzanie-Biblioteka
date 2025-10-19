import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Witaj w systemie biblioteki");

        while (running) {
            System.out.println("Co chcesz zrobić?");
            System.out.println("1. Dodaj książkę");
            System.out.println("2. Dodaj magazyn");
            System.out.println("3. Dodaj DVD");
            System.out.println("4. Pokaż wszystkie pozycje");
            System.out.println("5. Pokaż dostępne pozycje");
            System.out.println("6. Wypożycz pozycję");
            System.out.println("7. Zwróć pozycję");
            System.out.println("8. Wyjdź z programu");
            System.out.print("Wybierz opcję (1-8): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Podaj tytuł książki: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Podaj ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Podaj autora: ");
                    String author = scanner.nextLine();
                    System.out.print("Podaj liczbę stron: ");
                    int pages = scanner.nextInt();
                    scanner.nextLine();
                    library.addItem(new Book(bookTitle, bookId, author, pages));
                    break;

                case 2:
                    System.out.print("Podaj tytuł magazynu: ");
                    String magTitle = scanner.nextLine();
                    System.out.print("Podaj ID: ");
                    int magId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Podaj numer wydania: ");
                    int issue = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Podaj miesiąc wydania: ");
                    String month = scanner.nextLine();
                    library.addItem(new Magazine(magTitle, magId, issue, month));
                    break;

                case 3:
                    System.out.print("Podaj tytuł DVD: ");
                    String dvdTitle = scanner.nextLine();
                    System.out.print("Podaj ID: ");
                    int dvdId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Podaj reżysera: ");
                    String director = scanner.nextLine();
                    System.out.print("Podaj czas trwania (minuty): ");
                    int duration = scanner.nextInt();
                    scanner.nextLine();
                    library.addItem(new DVD(dvdTitle, dvdId, duration, director));
                    break;

                case 4:
                    library.showAllItems();
                    break;

                case 5:
                    library.showAvailableItems();
                    break;

                case 6:
                    System.out.print("Podaj ID pozycji do wypożyczenia: ");
                    int borrowId = scanner.nextInt();
                    scanner.nextLine();
                    LibraryItem borrowItem = library.findItemById(borrowId);
                    if (borrowItem instanceof Borrowable item) {
                        item.borrow();
                    } else {
                        System.out.println("Nie znaleziono takiego elementu lub nie można go wypożyczyć.");
                    }
                    break;

                case 7:
                    System.out.print("Podaj ID pozycji do zwrotu: ");
                    int returnId = scanner.nextInt();
                    scanner.nextLine();
                    LibraryItem returnItem = library.findItemById(returnId);
                    if (returnItem instanceof Borrowable item) {
                        item.returnItem();
                    } else {
                        System.out.println("Nie znaleziono takiego elementu lub nie można go zwrócić.");
                    }
                    break;

                case 8:
                    running = false;
                    System.out.println("Zamykanie systemu");
                    break;

                default:
                    System.out.println("Nieprawidłowy wybór, Spróbuj ponownie.");
            }
        }

        scanner.close();
    }
}
