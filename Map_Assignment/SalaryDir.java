import java.util.*;
public class SalaryDir {
    public static void main(String[] args) {
        Map<String,Double> emp = new HashMap<>();
        emp.put("Amit",50000.0);
        emp.put("Riya",60000.0);
        emp.put("John",45000.0);
        emp.put("Riya", emp.get("Riya")*1.10);
        double sum=0, max=0;
        for(String e : emp.keySet()) {
            sum+=emp.get(e);
            max=Math.max(max,emp.get(e));
        }
        System.out.println("Average = "+sum/emp.size());
        for(String e : emp.keySet())
            if(emp.get(e)==max) System.out.println("Highest: "+e);
    }
}
