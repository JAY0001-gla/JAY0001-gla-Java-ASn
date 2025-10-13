import java.util.*;
class sumofn{
    public static int sumofn(int n){
        int sum = 0;
        for(int i = 0 ; i <= n ; i++){
            sum  += i;
        }
         
        return sum;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number-");
        int n = sc.nextInt();
        System.out.println(sumofn(n));

    }
}