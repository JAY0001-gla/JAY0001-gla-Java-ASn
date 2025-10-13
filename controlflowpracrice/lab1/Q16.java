import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.println(i + " is Even");
            else System.out.println(i + " is Odd");
        }
    }
}