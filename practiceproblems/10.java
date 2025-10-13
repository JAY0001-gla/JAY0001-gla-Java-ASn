import java.util.Scanner;

class ktom{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance: ");
        int d = sc.nextInt();
        double m = d * (0.621371);
        System.out.print("The distance in miles is: ");
        System.out.printf("%.2f",m);

    }
}