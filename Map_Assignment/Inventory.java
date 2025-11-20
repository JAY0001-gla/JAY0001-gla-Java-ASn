import java.util.*;
public class Inventory {
    public static void main(String[] args) {
        Map<String,Integer> stock = new HashMap<>();
        stock.put("Pen",50); stock.put("Notebook",20);
        stock.put("Pen", stock.get("Pen") - 10);
        stock.put("Notebook", stock.get("Notebook") + 15);
        if(stock.get("Pen") <= 0) stock.put("Pen",0);
        System.out.println("Notebook: "+stock.get("Notebook"));
        System.out.println("Out of stock:");
        for(String p : stock.keySet())
            if(stock.get(p)==0) System.out.println(p);
    }
}
