import java.util.*;
public class CourseReg {
    public static void main(String[] args) {
        Map<String,Integer> c = new HashMap<>();
        c.put("CS101",45);
        c.put("CS102",5);
        c.put("MATH101",52);
        c.put("CS101", c.get("CS101")+3);
        for(String k : c.keySet()) {
            int x = c.get(k);
            if(x>=50) System.out.println("Near full: "+k);
            if(x<5) System.out.println("Under: "+k);
        }
    }
}
