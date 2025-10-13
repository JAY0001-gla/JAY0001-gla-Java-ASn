import java.util.*;
public class q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double[] arr= new double[10];
        int i = 0;
        double n =  sc.nextDouble();
        while(n > 0 && i < arr.length){
            arr[i] = n;
            i++;
            n =  sc.nextDouble();
        }
        int sum = 0;
        System.out.print("The numbers are: ");
        for (int j = 0 ; j < i ; j++){
            System.out.print(arr[j]+" ");
            sum += arr[j];
        }
        System.out.println();
        System.out.println("The sum of numberes these is: "+sum);

    }
}
