import java.util.*;
class q8 {

    public static void generate_exception(String[] s){
       s[6] = "ANKUSH";
    }

    public static void handle_exception(String[] s){
        try {
              s[6] = "ANKUSH";

        } catch (ArrayIndexOutOfBoundsException  e) {
            System.out.println("The exception is: "+e);
        }
        
    }
    public static  void main(String args[]){
        String[] arrayofnames = new String[5];

        // generate_exception(arrayofnames);
        handle_exception(arrayofnames);

    }
}
