import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count=0, temp=num;
        while(temp!=0){ temp/=10; count++; }
        System.out.println("Number of digits in " + num + " is " + count);
    }
}