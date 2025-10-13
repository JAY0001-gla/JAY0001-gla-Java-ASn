package lab2;

import java.util.Scanner;

public class Q4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maxDigit=10;
        int[] d = new int[maxDigit];
        int idx=0;
        while(num!=0){
            if(idx==maxDigit){
                maxDigit+=10;
                int[] temp = new int[maxDigit];
                for(int i=0;i<d.length;i++) temp[i]=d[i];
                d=temp;
            }
            d[idx++] = num%10;
            num/=10;
        }
        int l1=0,l2=0;
        for(int i=0;i<idx;i++){
            if(d[i]>l1){
                l2=l1;
                l1=d[i];
            } else if(d[i]>l2 && d[i]!=l1){
                l2=d[i];
            }
        }
        System.out.println("Largest: "+l1);
        System.out.println("Second Largest: "+l2);
    }
}