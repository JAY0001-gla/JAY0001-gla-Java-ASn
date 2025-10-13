import java.util.*;

class Patient {
    String id;

    public Patient(String id) {
        this.id = id;
    }

    public void printId() {
        System.out.println("Patient ID: " + id);
    }
}

public class HospitalAdmin {
    public static void main(String[] args) {
        List<Patient> patients = List.of(
            new Patient("P001"),
            new Patient("P002"),
            new Patient("P003"),
            new Patient("P004")
        );

        patients.forEach(Patient::printId);
    }
}