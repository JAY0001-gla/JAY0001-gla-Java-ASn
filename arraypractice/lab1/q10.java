import java.util.*;
public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];
        for (int i = 0 ; i < arr.length ; i++){
            if(i%3==0 && i%5!=0){
                arr[i] = "Fizz";
            }
            else if(i%3!=0 && i%5==0){
                arr[i] = "Buzz";
            }
            else if(i%3==0 && i%5==0){
                arr[i] = "FizzBuzz";
            }
            else{
                arr[i]=(i+"");
            }
        }
        System.out.print("The array is: ");
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
    
}
