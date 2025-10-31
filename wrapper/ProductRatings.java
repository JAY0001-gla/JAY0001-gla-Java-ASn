import java.util.*;

public class ProductRatings {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> all = new ArrayList<>();
        for (int r : oldRatings) all.add(r);
        all.addAll(newRatings);

        double avg = all.stream()
                        .filter(Objects::nonNull)
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0);

        System.out.println("Average rating = " + avg);
    }
}
