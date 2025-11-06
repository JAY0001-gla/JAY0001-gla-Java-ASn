import java.util.Scanner;

public class ProductReview {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rating (1 to 5): ");
        int rating = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your comment: ");
        String comment = sc.nextLine();

        try {
            if (rating < 1 || rating > 5) {
                throw new Exception("Invalid rating");
            }

            if (comment == null || comment.trim().isEmpty()) {
                throw new Exception("Empty review");
            }

            System.out.println("Review submitted successfully!");
            System.out.println("Rating: " + rating);
            System.out.println("Comment: " + comment);
        } catch (Exception e) {
            System.out.println("Review error: " + e.getMessage());
        }
    }
}