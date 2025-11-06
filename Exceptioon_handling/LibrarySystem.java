import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter book name to borrow: ");
            String bookName = sc.nextLine();

            System.out.print("Is the book available? (yes/no): ");
            String availability = sc.nextLine();

            System.out.print("How many books has the user already borrowed? ");
            int borrowedBooks = sc.nextInt();

            if (availability.equalsIgnoreCase("no")) {
                throw new Exception("Book not available");
            }

            if (borrowedBooks >= 5) {
                throw new Exception("User limit exceeded");
            }

            System.out.println("Book '" + bookName + "' borrowed successfully.");
        } catch (Exception e) {
            System.out.println("Library error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}