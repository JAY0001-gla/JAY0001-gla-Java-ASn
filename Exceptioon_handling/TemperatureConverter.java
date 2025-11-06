import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        sc.nextLine(); 

        System.out.print("Enter unit (C/F): ");
        String unit = sc.nextLine();

        try {
            if (unit.equalsIgnoreCase("C") && temp < -273.15) {
                throw new Exception("Temperature below absolute zero is not possible!");
            } else if (unit.equalsIgnoreCase("F") && temp < -459.67) {
                throw new Exception("Temperature below absolute zero is not possible!");
            }

            if (unit.equalsIgnoreCase("C")) {
                double fahrenheit = (temp * 9 / 5) + 32;
                System.out.println("Converted to Fahrenheit: " + fahrenheit + "ºF");
            } else if (unit.equalsIgnoreCase("F")) {
                double celsius = (temp - 32) * 5 / 9;
                System.out.println("Converted to Celsius: " + celsius + "℃");
            } else {
                System.out.println("Invalid unit entered.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}