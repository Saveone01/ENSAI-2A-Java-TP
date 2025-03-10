package fr.ensai.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("ENSAI Library");

        // Charger les livres depuis le CSV
        library.loadBooksFromCSV("books.csv");

        // Afficher les livres chargés
        library.displayBooks();
    }
}
