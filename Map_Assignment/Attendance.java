import java.util.*;
public class Attendance {
    public static void main(String[] args) {
        Map<String,Integer> att = new HashMap<>();
        String[] st = {"A","B","C","D","E"};
        for(String s : st) att.put(s,0);
        String[][] days = { {"A","B","D"}, {"A","C","E"}, {"A","B"} };
        for(String[] day : days)
            for(String p : day)
                att.put(p, att.get(p)+1);
        for(String s : att.keySet())
            if(att.get(s) < 2) System.out.println("Low: "+s);
    }
}
