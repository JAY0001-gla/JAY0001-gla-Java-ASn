import java.util.*;
public class Voting {
    public static void main(String[] args) {
        Map<String,Integer> votes = new HashMap<>();
        String[] arr = {"A","B","A","C","B","A","C","A","B","A"};
        for(String v : arr) votes.put(v, votes.getOrDefault(v,0)+1);
        System.out.println(votes);
        String win=null; int max=0;
        for(String c : votes.keySet())
            if(votes.get(c) > max) { max=votes.get(c); win=c; }
        System.out.println("Winner: "+win);
    }
}
