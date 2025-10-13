import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n <= 1){ System.out.println(n + " is not prime"); return; }
        boolean isPrime = true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){ isPrime=false; break; }
        }
        System.out.println(n + (isPrime ? " is Prime" : " is not Prime"));
    }
}