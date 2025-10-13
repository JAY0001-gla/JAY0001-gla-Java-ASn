
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() { return itemId; }
    public void setItemId(String itemId) { this.itemId = itemId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public abstract int getLoanDuration(); 
    public void getItemDetails() {
        System.out.println("ID: " + itemId + " Title: " + title + " Author: " + author);
    }
}

interface Reservable {
    boolean reserveItem(String borrowerName);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() { return 21; }

    @Override
    public boolean reserveItem(String borrowerName) {
        if (available) { available = false; System.out.println(borrowerName + " reserved the book."); return true; }
        System.out.println("Book not available to reserve.");
        return false;
    }

    @Override
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem {
    public Magazine(String itemId, String title, String author) { super(itemId, title, author); }
    @Override public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String itemId, String title, String author) { super(itemId, title, author); }
    @Override public int getLoanDuration() { return 3; }
}

public class q5_LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem b = new Book("B100", "humanJava Programming", "Author A");
        LibraryItem m = new Magazine("M200", "humanTech Monthly", "Editor B");
        LibraryItem d = new DVD("D300", "humanMovie", "Director C");

        LibraryItem[] items = { b, m, d };
        for (LibraryItem it : items) {
            it.getItemDetails();
            System.out.println("Loan Duration (days): " + it.getLoanDuration());
            System.out.println("-----");
        }

        if (b instanceof Reservable) {
            Reservable r = (Reservable) b;
            r.reserveItem("humanReader");
            System.out.println("Available now? " + r.checkAvailability());
        }
    }
}
// 