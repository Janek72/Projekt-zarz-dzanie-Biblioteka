biblioteka/
│
├── LibraryItem.java
├── Borrowable.java
├── Book.java
├── Magazine.java
├── DVD.java
├── Library.java
└── Main.java

LibraryItem.java

Rola: Klasa bazowa dla wszystkich pozycji w bibliotece.
Cel: Przechowywać wspólne dane (tytuł, ID, dostępność).

Borrowable.java

Rola: Interfejs określający możliwość wypożyczania.
Cel: Zdefiniować metody borrow() i returnItem() dla klas, które można wypożyczyć.

Book.java

Rola: Klasa reprezentująca książkę.
Cel: Rozszerzyć klasę bazową o pole autora i umożliwić wypożyczanie.

Magazine.java

Rola: Klasa reprezentująca magazyn lub czasopismo.
Cel: Rozszerzyć klasę bazową o numer wydania i umożliwić wypożyczanie.

DVD.java

Rola: Klasa reprezentująca płytę DVD.
Cel: Rozszerzyć klasę bazową o czas trwania filmu i umożliwić wypożyczanie.

Library.java

Rola: Klasa zarządzająca zbiorami biblioteki.
Cel: Przechowywać i obsługiwać obiekty (dodawanie, wyszukiwanie, wypożyczanie).

Main.java

Rola: Punkt startowy programu.
Cel: Tworzyć obiekty, wykonywać operacje wypożyczeń i zwrotów, wypisywać wyniki.
