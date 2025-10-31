import java.util.*;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int letters = 0, digits = 0, special = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) letters++;
            else if (Character.isDigit(ch)) digits++;
            else if (!Character.isWhitespace(ch)) special++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
}
