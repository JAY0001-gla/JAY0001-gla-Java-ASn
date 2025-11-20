import java.util.*;
public class MergeMaps {
    public static void main(String[] args) {
        Map<String,Integer> m1 = Map.of("A",1,"B",2);
        Map<String,Integer> m2 = Map.of("B",3,"C",4);
        Map<String,Integer> merged = new HashMap<>(m1);
        for(String k : m2.keySet())
            merged.put(k, merged.getOrDefault(k,0)+m2.get(k));
        System.out.println(merged);
    }
}
