public class SafeParseInt {
    public static int safeParseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        String[] tests = {"123", "abc", "45.6", "0"};
        for (String t : tests) {
            System.out.println("Input: " + t + " → " + safeParseInt(t));
        }
    }
}
