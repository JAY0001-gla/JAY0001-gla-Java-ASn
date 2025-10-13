import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number below 100: ");
        int n = sc.nextInt();
        if(n<=0 || n>=100){ System.out.println("Invalid input"); return; }
        for(int i=100;i>=1;i--){
            if(i%n==0) System.out.println(i);
        }
    }
}