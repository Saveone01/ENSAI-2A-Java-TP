package fr.ensai.library;

public class Main {
    public static void main(String[] args) {
        // Création d'une instance de Library
        Library library = new Library("Librairie ENSAI");

        // Ajout d'un livre
        Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");
        Book fellowshipOfTheRing = new Book(
                "978-0-618-26025-6",
                "The Fellowship of the Ring",
                tolkien,
                1954,
                423);
        library.addItem(fellowshipOfTheRing);

        // Ajout de deux magazines
        Magazine scienceMag = new Magazine("Science Weekly", 2024, 50, "1234-5678", 12);
        Magazine techMag = new Magazine("Tech Today", 2023, 30, "8765-4321", 45);
        library.addItem(scienceMag);
        library.addItem(techMag);

        // Affichage des items de la bibliothèque
        library.displayItems();
    }
}
