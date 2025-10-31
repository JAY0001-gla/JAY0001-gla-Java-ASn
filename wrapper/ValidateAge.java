public class ValidateAge {
    public static boolean isValidAge(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Age 17 → " + isValidAge("17"));
        System.out.println("Age 20 → " + isValidAge("20"));
        System.out.println("Age abc → " + isValidAge("abc"));
    }
}
