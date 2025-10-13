package lab2;

import java.util.Scanner;

public class Q5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n=num, c=0;
        while(n!=0){ c++; n/=10; }
        int[] d=new int[c];
        for(int i=0;i<c;i++){
            d[i]=num%10;
            num/=10;
        }
        for(int i=0;i<c;i++){
            System.out.print(d[i]);
        }
    }
}