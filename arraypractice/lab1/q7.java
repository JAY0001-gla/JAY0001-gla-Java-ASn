import java.util.*;
public class q7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int[] even = new int[num+1];
        int[] odd = new int[num+1];
        int ecount =0 ,ocount = 0;
        for(int i = 0 ; i <= num ; i++){
            if(i%2==0){
                even[ecount++] = i;
            }
            else{
                odd[ocount++] = i;
            }
        }
        System.out.println("The even array is: ");
        for(int i = 1 ; i < ecount ; i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();
        System.out.println("The odd array is: ");
        for(int i = 1 ; i < ocount ; i++){
            System.out.print(odd[i]+" ");
        }

    }
}
