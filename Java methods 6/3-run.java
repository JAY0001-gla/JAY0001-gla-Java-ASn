import java.util.*;
class runtraingle{
    public static double round(int n1,int  n2,int n3){
        int p = n1+n2+n3;
        int round = 5000/p;
        return round;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1 side-");
        int n1 = sc.nextInt();
        System.out.print("Enter 2 side-");
        int n2 = sc.nextInt();
        System.out.print("Enter 3 side-");
        int n3 = sc.nextInt();
        System.out.println(round(n1, n2, n3));

    }
}