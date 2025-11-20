import java.util.*;
public class GradeTracker {
    public static void main(String[] args) {
        Map<String,Double> g = new TreeMap<>();
        g.put("Amit",85.0); g.put("Riya",92.0); g.put("Sohan",76.0);
        g.put("Sohan",80.0);
        g.remove("Amit");
        for(String n : g.keySet()) System.out.println(n+" : "+g.get(n));
    }
}
