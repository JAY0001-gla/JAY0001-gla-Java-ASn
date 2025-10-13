import java.util.Scanner;

class perimeter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        int p = 2*(l+b);
        System.out.print("The perimeter is: ");
        System.out.println(p);

    }
}