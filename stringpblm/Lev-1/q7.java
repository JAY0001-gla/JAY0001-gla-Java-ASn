import java.util.*;
class q7 {

    public static void generate_exception(String s){
       int a = Integer.parseInt(s);
    }

    public static void handle_exception(String s){
        try {
             int a = Integer.parseInt(s);
       
        } catch (NumberFormatException  e) {
            System.out.println("The exception is: "+e);
        }
        
    }
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // generate_exception(str);
        handle_exception(str);
        sc.close();
        

    }
}
