
abstract class Patient {
    private String patientId;
    private String human; 
    private int age;
    private String diagnosis; 

    public Patient(String patientId, String human, int age, String diagnosis) {
        this.patientId = patientId;
        this.human = human;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getHuman() { return human; }
    public void setHuman(String human) { this.human = human; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    protected String getDiagnosis() { return diagnosis; }
    protected void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + " Name: " + human + " Age: " + age);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private java.util.List<String> records = new java.util.ArrayList<>();

    public InPatient(String patientId, String human, int age, String diagnosis, int daysAdmitted) {
        super(patientId, human, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        double perDay = 2000;
        return daysAdmitted * perDay + 5000; 
    }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { for (String r : records) System.out.println(r); }
}

class OutPatient extends Patient implements MedicalRecord {
    private int visits;
    private java.util.List<String> records = new java.util.ArrayList<>();

    public OutPatient(String patientId, String human, int age, String diagnosis, int visits) {
        super(patientId, human, age, diagnosis);
        this.visits = visits;
    }

    @Override
    public double calculateBill() {
        return visits * 500; 
    }

    @Override
    public void addRecord(String record) { records.add(record); }

    @Override
    public void viewRecords() { for (String r : records) System.out.println(r); }
}

public class q7_HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P100", "humanIvy", 30, "Appendicitis", 5);
        Patient p2 = new OutPatient("P200", "humanOmar", 40, "Flu", 2);

        MedicalRecord mr1 = (MedicalRecord) p1;
        mr1.addRecord("Surgery successful.");
        MedicalRecord mr2 = (MedicalRecord) p2;
        mr2.addRecord("Prescribed medication.");

        Patient[] patients = { p1, p2 };
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: " + p.calculateBill());
            if (p instanceof MedicalRecord) {
                System.out.println("Records:");
                ((MedicalRecord) p).viewRecords();
            }
            System.out.println("-----");
        }
    }
}
