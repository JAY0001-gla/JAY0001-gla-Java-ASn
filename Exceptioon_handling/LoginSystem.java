import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUser = "admin";
        String correctPass = "1234";

        System.out.print("Username: ");
        String user = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();

        try {
            if (!user.equals(correctUser) || !pass.equals(correctPass)) {
                throw new Exception("Invalid credentials");
            }
            System.out.println("Login successful");
        } catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
        }
        sc.close();
    }
}