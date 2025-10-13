import java.util.Scanner;

class si{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p: ");
        int p = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.print("Enter t: ");
        int t = sc.nextInt();
        double si = ((p*r*t))/100.0;
        System.out.print("The si is: ");
        System.out.printf("%.2f",si);

    }
}