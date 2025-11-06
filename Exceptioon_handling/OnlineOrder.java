import java.util.Scanner;

public class OnlineOrder {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

       
        System.out.print("Enter product name: ");
        String product = sc.nextLine();

        System.out.print("Is the product in stock? (yes/no): ");
        String stockInput = sc.nextLine();

        System.out.print("Did the payment go through? (yes/no): ");
        String paymentInput = sc.nextLine();

        try {
            if (stockInput.equalsIgnoreCase("no")) {
                throw new Exception("Product is out of stock");
            }

            if (paymentInput.equalsIgnoreCase("no")) {
                throw new Exception("Payment failed");
            }

            System.out.println("Order placed successfully for: " + product);
        } catch (Exception e) {
            System.out.println("Order error: " + e.getMessage());
        }
        }
    }
}