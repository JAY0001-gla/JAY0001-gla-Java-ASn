import java.util.*;
class prt{
    public static double si(int p,int  r,int t){
        double si = (p*r*t)/100.0;
        return si;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p-");
        int p = sc.nextInt();
        System.out.print("Enter r-");
        int r = sc.nextInt();
        System.out.print("Enter t-");
        int t = sc.nextInt();
        System.out.println(si(p, r, t));

    }
}