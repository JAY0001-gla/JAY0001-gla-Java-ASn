import java.util.*;
class split2 {
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

    public static String[] manualSplit(String s){
        int wordCount = 1;
        for(int i=0; i<count_length(s); i++){
            if(s.charAt(i) == ' '){
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        int start = 0, idx = 0;
        for(int i=0; i<count_length(s); i++){
            if(s.charAt(i) == ' '){
                words[idx++] = s.substring(start, i);
                start = i+1;
            }
        }
        words[idx] = s.substring(start, count_length(s));
        return words;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int length_str = str.length();
        System.out.println("length by user method: "+count_length(str));
        System.out.println("length by built in method: "+length_str);
        System.out.println(length_str==count_length(str));

        String[] userSplit = manualSplit(str);
        String[] builtinSplit = str.split(" ");

        System.out.println("User defined split: " + Arrays.toString(userSplit));
        System.out.println("Built-in split: " + Arrays.toString(builtinSplit));

        sc.close();
    }
}
