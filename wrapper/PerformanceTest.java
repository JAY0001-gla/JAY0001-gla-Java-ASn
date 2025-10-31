import java.util.*;

public class PerformanceTest {
    public static void main(String[] args) {
        final int SIZE = 1_000_000;

        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) arr[i] = i;

        long start = System.currentTimeMillis();
        long sum1 = 0;
        for (int n : arr) sum1 += n;
        long time1 = System.currentTimeMillis() - start;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) list.add(i);

        start = System.currentTimeMillis();
        long sum2 = 0;
        for (int n : list) sum2 += n;
        long time2 = System.currentTimeMillis() - start;

        System.out.println("int[] sum = " + sum1 + " | time = " + time1 + " ms");
        System.out.println("ArrayList<Integer> sum = " + sum2 + " | time = " + time2 + " ms");
    }
}
