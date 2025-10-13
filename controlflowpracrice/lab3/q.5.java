import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num, sum=0;
        while(original!=0){
            int digit = original%10;
            sum += digit*digit*digit;
            original/=10;
        }
        System.out.println(num + (sum==num ? " is an Armstrong Number" : " is not an Armstrong Number"));
    }
}