import java.util.*;
public class q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enetr the size: ");
        // int size = sc.nextInt();
        int[] numbers = new int[10];
        for( int i = 0 ; i < numbers.length; i++){
            System.out.print("Enter the student "+(i+1)+": ");
            numbers[i] = sc.nextInt();
        }
        
      
       for( int i = 0 ; i < numbers.length; i++){
            if (numbers[i]<18){
                System.out.println("The student with the age "+numbers[i]+" cannot vote.");
            }
            else{
                 System.out.println("The student with the age "+numbers[i]+" can vote.");

             }
            
        }
        
        
       
    }
}