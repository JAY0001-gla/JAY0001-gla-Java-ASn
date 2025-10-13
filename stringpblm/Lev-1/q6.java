import java.util.*;
class q6 {

    public static void generate_exception(String s){
       System.out.println(s.substring(3,1));
    }

    public static void handle_exception(String s){
        try {
            s.substring(3,1);
       
        } catch (Exception  e) {
            System.out.println("The exception is: "+e);
        }
        
    }
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        generate_exception(str);
        // handle_exception(str);
        sc.close();

    }
}
