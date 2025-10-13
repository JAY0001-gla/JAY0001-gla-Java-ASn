package lab1;

import java.util.Scanner;

public class Q12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        System.out.println("The area of triangle in square inches is " + areaInInches + " and in square centimeters is " + areaInCm);
    }
}