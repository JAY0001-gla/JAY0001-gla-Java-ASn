import java.util.*;
public class CountryCapital {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("India","New Delhi");
        map.put("Japan","Tokyo");
        map.put("USA","Washington");
        System.out.println(map.getOrDefault("India","Unknown"));
        for(String c : map.keySet())
            System.out.println(c+" -> "+map.get(c));
    }
}
