package library.books;
public class Book {
    private String title;
    private String author;
    private String id;
    public Book(String id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }
    public String getId(){ return id; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
    public void display(){ 
        System.out.println("Book ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
