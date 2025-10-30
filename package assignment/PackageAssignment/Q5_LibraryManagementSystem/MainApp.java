import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;
public class MainApp {
    public static void main(String[] args){
        Book b = new Book("B001","Learning Java","John Doe");
        Member m = new Member("M001","Ravi");
        b.display();
        System.out.println();
        m.display();
        System.out.println();
        Transaction t = new Transaction(b,m);
        t.issue();
    }
}
