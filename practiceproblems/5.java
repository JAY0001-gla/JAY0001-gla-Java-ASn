import java.util.Scanner;

class volume{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int r = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        double v = Math.PI*(Math.pow(r,2)*h);
        System.out.print("The volume of the cylinderis: ");
        System.out.printf("%.2f",v);

    }
}