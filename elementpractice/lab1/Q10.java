package lab1;

import java.util.Scanner;

public class Q10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        int feet = (int)(inches / 12);
        double inch = inches % 12;
        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + inch);
    }
}