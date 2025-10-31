import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        String[] inputs = {"85", "95", "null", "abc"};
        ArrayList<Integer> marks = new ArrayList<>();

        for (String s : inputs) {
            try {
                if (!s.equals("null"))
                    marks.add(Integer.parseInt(s));
            } catch (Exception e) {

            }
        }

        double avg = marks.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average Marks = " + avg);
    }
}
