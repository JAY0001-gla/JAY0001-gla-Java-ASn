import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int greatestFactor = 1;
        for(int i=n-1;i>=1;i--){
            if(n%i==0){ greatestFactor=i; break; }
        }
        System.out.println("Greatest factor beside itself: " + greatestFactor);
    }
}