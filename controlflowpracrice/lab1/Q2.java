import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if (n1 < n2 && n1 < n3) {
            System.out.println("The first number is the smallest.");
        } else {
            System.out.println("The first number is not the smallest.");
        }
    }
}