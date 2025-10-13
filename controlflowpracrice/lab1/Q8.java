import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter countdown start: ");
        int count = sc.nextInt();
        while (count >= 1) {
            System.out.println(count);
            count--;
        }
    }
}