import java.util.Scanner;

class circlearea{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int c = sc.nextInt();
        double f = 3.14 * Math.pow(c,2);
        System.out.print("The area of the circle is: ");
        System.out.println(f);

    }
}