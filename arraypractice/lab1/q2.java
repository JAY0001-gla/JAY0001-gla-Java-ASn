import java.util.*;
public class q2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enetr the size: ");
        // int size = sc.nextInt();
        int[] numbers = new int[5];
        for( int i = 0 ; i < numbers.length; i++){
            System.out.print("Enter the number "+(i+1)+": ");
            numbers[i] = sc.nextInt();
        }
        
      
       for( int i = 0 ; i < numbers.length; i++){
            if (numbers[i] < 0){
                System.out.println("The number on index "+i+" is "+numbers[i]+" that is negative.");
            }
            else if(numbers[i] == 0){
                 System.out.println("The number on index "+i+" is "+numbers[i]+" that is zero");

             }
            else if(numbers[i]>0){
                if(numbers[i]%2==0){
                    System.out.println("The number on index "+i+" is "+numbers[i]+" that is positive and even.");
                }
                else{
                    System.out.println("The number on index "+i+" is "+numbers[i]+" that is positive and odd.");

                }
            }
           
            
        }
         if(numbers[0] == numbers[4]){
                System.out.println("The first element "+numbers[0]+" and last element "+numbers[4]+" element is equal.");
            }
        else if(numbers[0] < numbers[4]){
                System.out.println("The first element "+numbers[0]+" is less than  "+numbers[4]+" element.");
            }
        else if(numbers[0]>numbers[4]){
            System.out.println("The first element "+numbers[0]+" is greater than  "+numbers[4]+" element.");

        }
        
        
       
    }
}