import java.util.*;
public class MaxValueKey {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",10,"B",20,"C",15);
        String maxKey = null; int max = Integer.MIN_VALUE;
        for(String k : map.keySet()) {
            if(map.get(k) > max) { max = map.get(k); maxKey = k; }
        }
        System.out.println(maxKey);
    }
}
