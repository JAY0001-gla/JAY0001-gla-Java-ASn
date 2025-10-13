import java.util.*;
public class q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int strt = sc.nextInt();
        int end = sc.nextInt();
        String sub = "";
        for(int i = strt ; i < end; i++){
            sub += str.charAt(i);
        }
        System.out.println(sub);
        System.out.println(str.substring(strt,end));;
        sc.close();

    }
}
