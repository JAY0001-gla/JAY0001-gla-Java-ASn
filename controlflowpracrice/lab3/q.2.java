import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year >= 1582: ");
        int year = sc.nextInt();
        if(year < 1582){ System.out.println("Invalid year"); return; }
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + (isLeap ? " is a Leap Year" : " is not a Leap Year"));
    }
}