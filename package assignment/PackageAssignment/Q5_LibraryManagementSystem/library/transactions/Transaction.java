package library.transactions;
import library.books.Book;
import library.members.Member;
import java.time.LocalDate;
public class Transaction {
    private Book book;
    private Member member;
    private LocalDate date;
    public Transaction(Book book, Member member){
        this.book = book;
        this.member = member;
        this.date = LocalDate.now();
    }
    public void issue(){
        System.out.println("Issuing book "" + book.getTitle() + "" to " + member.getName() + " on " + date);
    }
}
