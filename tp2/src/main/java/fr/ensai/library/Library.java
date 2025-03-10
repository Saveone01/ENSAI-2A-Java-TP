package fr.ensai.library;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a library.
 */
public class Library {
    private String name;
    private List<Item> items;

    public Library(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("✅ Added: " + item);
    }

    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("🚫 No items available.");
        } else {
            System.out.println("📚 Library Items:");
            for (Item item : items) {
                System.out.println("   - " + item);
            }
        }
    }
}
