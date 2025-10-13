package lab2;

import java.util.Scanner;

public class Q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] emp = new String[10];
        int[] sal = new int[10];
        for(int i = 0 ; i< emp.length; i++){
            System.out.print("Enter the employer name "+(i+1)+": ");
            emp[i] = sc.nextLine();
        }
        for(int i = 0 ; i< emp.length; i++){
            System.out.print("Enter the employer salary "+(i+1)+": ");
            sal[i] = sc.nextInt();
        }
        



    }
}
