import java.util.Scanner;
public class AtmWidrawsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int balance = 10000;

        try {
            if (amount > balance) {
                throw new Exception("Insufficient funds");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining: ₹" + balance);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        
    }
}