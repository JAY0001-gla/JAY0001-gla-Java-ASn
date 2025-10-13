import java.util.Scanner;

class powerc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        System.out.print("Enter exponent: ");
        int e = sc.nextInt();
        double p = Math.pow(b,e);
        System.out.print("The power is: ");
        System.out.println(p);

    }
}