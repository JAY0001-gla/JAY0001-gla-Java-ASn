import java.util.*;

public class HRLetter {
    public static void main(String[] args) {
        List<String> employeeNames = List.of("Amit", "Sneha", "Ravi", "Priya");

        employeeNames.stream()
                     .map(String::toUpperCase)
                     .forEach(System.out::println);
    }
}