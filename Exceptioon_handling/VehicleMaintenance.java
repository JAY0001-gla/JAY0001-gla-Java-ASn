import java.util.Scanner;

public class VehicleMaintenance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mileage reading: ");
        int mileage = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Is the service overdue? (yes/no): ");
        String overdueInput = sc.nextLine();

        try {
            if (mileage < 0) {
                throw new Exception("Invalid mileage");
            }

            if (overdueInput.equalsIgnoreCase("yes")) {
                throw new Exception("Service is overdue");
            }

            System.out.println("Vehicle is in good condition.");
        } catch (Exception e) {
            System.out.println("Maintenance alert: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}