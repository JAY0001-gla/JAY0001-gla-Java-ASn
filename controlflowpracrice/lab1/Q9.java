import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int count = sc.nextInt();
        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }
    }
}