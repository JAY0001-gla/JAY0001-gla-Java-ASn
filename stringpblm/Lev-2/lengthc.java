import java.util.*;
class lengthc {
    public static int count_length(String s){
        int count = 0;
        for (int i = 0 ; ;i++){
            try{
                s.charAt(i);
                count++;
            }catch(Exception e){
                System.out.println("This is the exception:"+e);
                return count;
            }
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length_str = str.length();
        System.out.println("length by user method: "+count_length(str));
        System.out.println("length by built in method: "+length_str);
        System.out.println(length_str==count_length(str));
        sc.close();
    }
}
