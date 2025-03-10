package fr.ensai.library;

/**
 * Abstract class representing a library item (book or magazine).
 */
public abstract class Item {
    protected String title;
    protected int year;
    protected int pageCount;

    public Item(String title, int year, int pageCount) {
        this.title = title;
        this.year = year;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public abstract String toString();
}
