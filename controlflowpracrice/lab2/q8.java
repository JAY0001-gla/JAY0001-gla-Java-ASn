import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        if(n<=0){ System.out.println("Invalid input"); return; }
        int i=1;
        while(i<n){
            if(n%i==0) System.out.println(i);
            i++;
        }
    }
}