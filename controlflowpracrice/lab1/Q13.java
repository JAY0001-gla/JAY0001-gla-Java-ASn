import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println(n + " is not a natural number.");
            return;
        }
        int sumFor = 0;
        for (int i = 1; i <= n; i++) sumFor += i;
        int sumFormula = n * (n + 1) / 2;
        System.out.println("Sum using for loop: " + sumFor);
        System.out.println("Sum using formula: " + sumFormula);
    }
}