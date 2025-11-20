import java.util.*;
public class Library {
    public static void main(String[] args) {
        Map<String,String> books = new TreeMap<>();
        books.put("978-1234","Java Basics");
        books.put("978-9876","Python Guide");
        System.out.println(books.getOrDefault("978-1234","Not found"));
        books.remove("978-9876");
        for(String isbn : books.keySet())
            System.out.println(isbn+" -> "+books.get(isbn));
    }
}
