import java.util.*;
public class q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int[] mul = new int[10];
        for(int i = 6 ; i < mul.length ; i++){
            mul[i] = num*(i);
        }
        System.out.println("The multiplaction table is: ");
        for(int i = 6 ; i < mul.length ; i++){
            System.out.println(num+" * "+(i)+" = "+mul[i]);
        }

    }
}
