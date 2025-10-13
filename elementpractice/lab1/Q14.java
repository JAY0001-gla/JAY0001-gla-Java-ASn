package lab1;

import java.util.Scanner;

public class Q14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int feet = sc.nextInt();
        double yards = feet / 3.0;
        double miles = yards / 1760.0;
        System.out.println("The distance in feet is " + feet + " which is " + yards + " yards and " + miles + " miles");
    }
}