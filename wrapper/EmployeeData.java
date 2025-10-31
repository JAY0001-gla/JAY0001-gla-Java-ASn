import java.util.*;

public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {24, 32, 28, 45, 19};
        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) list.add(age); 

        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}
