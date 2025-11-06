import java.util.Scanner;

public class BankingTransaction {
    public static void main(String[] args) {
        int balance = 5000;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter transaction amount: ");
            int amount = sc.nextInt();

            System.out.print("Is network stable? (yes/no): ");
            String network = sc.next();

            try {
                if (amount < 0) {
                    throw new Exception("Negative amount");
                }

                if (amount > balance) {
                    throw new Exception("Insufficient balance");
                }

                if (network.equalsIgnoreCase("no")) {
                    throw new Exception("Network failure");
                }

                balance -= amount;
                System.out.println("Transaction successful. Remaining balance: ₹" + balance);
            } catch (Exception e) {
                System.out.println("Transaction error: " + e.getMessage());
            }
        }
    }
}