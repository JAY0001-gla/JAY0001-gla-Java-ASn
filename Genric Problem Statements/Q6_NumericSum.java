import java.util.*;
class NumericSum {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) sum += n.doubleValue();
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        System.out.println(sumNumbers(intList));
    }
}