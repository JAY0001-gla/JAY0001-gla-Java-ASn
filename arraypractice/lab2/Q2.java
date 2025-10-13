package lab2;

import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] name = {"Amar","Akbar","Anthony"};
        int[] age = new int[3];
        int[] ht = new int[3];
        for(int i=0;i<3;i++){
            age[i] = sc.nextInt();
            ht[i] = sc.nextInt();
        }
        int min=0,max=0;
        for(int i=1;i<3;i++){
            if(age[i]<age[min]) min=i;
            if(ht[i]>ht[max]) max=i;
        }
        System.out.println("Youngest: "+name[min]);
        System.out.println("Tallest: "+name[max]);
    }
}