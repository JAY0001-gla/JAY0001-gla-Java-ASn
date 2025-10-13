import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum=0, temp=num;
        while(temp!=0){
            sum += temp%10;
            temp/=10;
        }
        System.out.println(num + ((num%sum==0) ? " is a Harshad Number" : " is not a Harshad Number"));
    }
}