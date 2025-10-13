import java.util.*;
class handshake{
    public static int max_h(int n){
        int h = (n*(n-1)/2);
        return h;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n-");
        int n = sc.nextInt();
        System.out.println(max_h(n));

    }
}