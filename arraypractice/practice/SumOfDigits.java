import java.util.*;
public class SumOfDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the size: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for( int i = 0 ; i < size ; i++){
            System.out.print("Enter the number "+i+": ");
            numbers[i] = sc.nextInt();
        }
        System.out.print("The numbers are: ");
        for( int i = 0 ; i < size ; i++){
            System.out.print(numbers[i]+" ");
        }
        int sum = 0;
        
        for( int i = 0 ; i < size ; i++){
            sum += numbers[i];
        }
        System.out.println("The numbers sum is: "+sum);
        
       
    }
}