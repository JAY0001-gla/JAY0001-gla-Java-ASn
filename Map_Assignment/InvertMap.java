import java.util.*;
public class InvertMap {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",1, "B",2, "C",1);
        Map<Integer, List<String>> inv = new HashMap<>();
        for(String k : map.keySet()) {
            int v = map.get(k);
            inv.putIfAbsent(v, new ArrayList<>());
            inv.get(v).add(k);
        }
        System.out.println(inv);
    }
}
