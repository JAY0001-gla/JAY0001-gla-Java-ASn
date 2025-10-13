import java.util.*;
class q10 {
        public static String all_lower(String s){
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < s.length() ; i++){
                if((int)(s.charAt(i))<97){
                sb.append((char)(((int)s.charAt(i))+32));
            }
            else{
                sb.append(s.charAt(i));
            }    }
            String str = sb.toString();
            return str;
        }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println("by built in method: "+s);
        System.out.println("by user define method: "+all_lower(s));
        System.out.println(s.equals(all_lower(s)));
        sc.close();


    }
}
