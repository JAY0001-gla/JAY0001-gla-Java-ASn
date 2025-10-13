import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    public Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class HospitalNotificationSystem {
    public static void main(String[] args) {
        List<Alert> alerts = List.of(
            new Alert("Critical", "Patient heart rate abnormal."),
            new Alert("Info", "New appointment scheduled."),
            new Alert("Warning", "Medication delayed."),
            new Alert("Critical", "Oxygen level dropping."),
            new Alert("Info", "Lab results available.")
        );

        System.out.println("🔹 Showing only Critical alerts:");
        filterAlerts(alerts, alert -> alert.type.equals("Critical"));

        System.out.println("\n🔹 Showing only Info alerts:");
        filterAlerts(alerts, alert -> alert.type.equals("Info"));

        System.out.println("\n🔹 Showing alerts containing 'Medication':");
        filterAlerts(alerts, alert -> alert.message.contains("Medication"));
    }

    static void filterAlerts(List<Alert> alerts, Predicate<Alert> condition) {
        alerts.stream()
              .filter(condition)
              .forEach(System.out::println);
    }
}