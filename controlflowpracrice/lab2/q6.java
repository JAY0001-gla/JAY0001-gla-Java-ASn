import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ages of Amar, Akbar, Anthony: ");
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();
        int youngest = Math.min(age1, Math.min(age2, age3));
        System.out.println("Youngest age: " + youngest);
        
        System.out.print("Enter heights of Amar, Akbar, Anthony: ");
        int h1 = sc.nextInt();
        int h2 = sc.nextInt();
        int h3 = sc.nextInt();
        int tallest = Math.max(h1, Math.max(h2, h3));
        System.out.println("Tallest height: " + tallest);
    }
}