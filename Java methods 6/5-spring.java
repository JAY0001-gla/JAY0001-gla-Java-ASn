import java.util.*;
class spring_season{
  
    public static boolean check(int month, int day){
        if((month == 3 && day >= 20) || (month == 6 && day < 20)) {
            return true;
        }
        else if((month > 3 && month < 6)){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month no-");
        int month = sc.nextInt();
        System.out.print("Enter day no-");
        int day = sc.nextInt();
        System.out.println(check(month,day));
        sc.close();

    }
}