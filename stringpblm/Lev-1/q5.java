import java.util.*;
class q5 {

    public static void generate_exception(String s){
       for(int i = 0 ; i < s.length()+1 ; i++){
        System.out.println(s.charAt(i));
       }
    }

    public static void handle_exception(String s){
        try {
            for(int i = 0 ; i < s.length()+1 ; i++){
            System.out.println(s.charAt(i));
       }
        } catch (StringIndexOutOfBoundsException  e) {
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
