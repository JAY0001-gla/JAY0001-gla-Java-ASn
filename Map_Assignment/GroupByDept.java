import java.util.*;
class Employee {
    String name, dept;
    Employee(String n, String d) { name=n; dept=d; }
}
public class GroupByDept {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee("Alice","HR"),
            new Employee("Bob","IT"),
            new Employee("Carol","HR")
        );
        Map<String,List<Employee>> map = new HashMap<>();
        for(Employee e : list) {
            map.putIfAbsent(e.dept, new ArrayList<>());
            map.get(e.dept).add(e);
        }
        for(String dept : map.keySet()) {
            System.out.print(dept + ": ");
            for(Employee e : map.get(dept)) System.out.print(e.name + " ");
            System.out.println();
        }
    }
}
