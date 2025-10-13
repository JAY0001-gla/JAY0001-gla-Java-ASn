import java.util.*;
public class q8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int[] arr = new int[(num/2)+1];
        int count = 0;
        for(int i = 1 ; i < (num/2)+1 ; i++){
            if(num%i==0){
                arr[count++] = i;
            }
        }
        System.out.print("The multiplaction factor are: ");
        arr[count] = num;
         for(int i = 0 ; i < count+1; i++){
           System.out.print(arr[i]+" ");
        }

    }
}
