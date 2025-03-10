package fr.ensai.library;

/**
 * Represents a book in the library.
 */
public class Book extends Item {
    private String isbn;
    private Author author;

    public Book(String isbn, String title, Author author, int year, int pageCount) {
        super(title, year, pageCount);
        this.isbn = isbn;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "📖 Book: " + title + " by " + author.getName() + " (" + year + "), " + pageCount + " pages, ISBN: " + isbn;
    }
}
