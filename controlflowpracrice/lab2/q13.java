import java.util.Scanner;
public class Q13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number below 100: ");
        int n = sc.nextInt();
        if(n<=0 || n>=100){ System.out.println("Invalid input"); return; }
        int counter = n-1;
        while(counter>1){
            if(n%counter==0) System.out.println(counter);
            counter--;
        }
    }
}