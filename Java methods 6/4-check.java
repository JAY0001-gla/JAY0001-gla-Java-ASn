import java.util.*;
class check_number{
    public static int check(int n){
        if (n>0){
            return 1;
        }
        else if(n<0){

            return -1;
        }
        return 0;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number-");
        int n = sc.nextInt();
        if(check(n)==1){
            System.out.println("number is positive.");

        }
        else if(check(n)==-1){
            System.out.println("number is negative.");

        }
        else{
            System.out.println("number is zero.");
        }
        sc.close();


    }
}