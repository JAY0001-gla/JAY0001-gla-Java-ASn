import java.util.*;
class q3 {
    public static char[] string_array(String text) {
       char[] cahracter = new char[text.length()];
       for (int i = 0 ; i < text.length() ; i++){
                cahracter[i] = text.charAt(i);
       }
       return cahracter;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] temparr=  text.toCharArray();
        if(Arrays.equals(temparr,string_array(text))){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println(Arrays.toString(temparr));
        System.out.println(Arrays.toString(string_array(text)));
        sc.close();
    }
}
