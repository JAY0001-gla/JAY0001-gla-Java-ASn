import java.util.Scanner;

public class q1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean issame = true;
        if (str1.length() == str2.length()){
        for(int i = 0 ; i < str1.length() ; i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                issame = false;
            }
        }
        if(issame == true){
            System.out.println("String is same with charAt.");
        }
        else{
             System.out.println("String is not same with charAt.");
        }
    }
    else{
        System.out.println("String is not same with charAt.");
    }
    if(str1.equals(str2)==true){
        System.out.println("String is same with Stringequals.");
    }
    

    
    else{
        System.out.println("String is not same with Stringequals.");
    }
    sc.close();
   
}
}
