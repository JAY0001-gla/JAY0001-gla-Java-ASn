
abstract class Employee {
    private String employeeId;
    private String human; 
    private double baseSalary;

    public Employee(String employeeId, String human, double baseSalary) {
        this.employeeId = employeeId;
        this.human = human;
        this.baseSalary = baseSalary;
    }

   
    public String getEmployeeId() { return employeeId; }
    public void setEmployeeId(String employeeId) { this.employeeId = employeeId; }

    public String getHuman() { return human; }
    public void setHuman(String human) { this.human = human; }

    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }


    public abstract double calculateSalary();


    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + human);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Calculated Salary: " + calculateSalary());
    }
}

class FullTimeEmployee extends Employee {
    private double fixedAllowance;

    public FullTimeEmployee(String employeeId, String human, double baseSalary, double fixedAllowance) {
        super(employeeId, human, baseSalary);
        this.fixedAllowance = fixedAllowance;
    }

    public double getFixedAllowance() { return fixedAllowance; }
    public void setFixedAllowance(double fixedAllowance) { this.fixedAllowance = fixedAllowance; }

    @Override
    public double calculateSalary() {

        return getBaseSalary() + fixedAllowance;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String employeeId, String human, double baseSalary, int hoursWorked, double hourlyRate) {
        super(employeeId, human, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked() { return hoursWorked; }
    public void setHoursWorked(int hoursWorked) { this.hoursWorked = hoursWorked; }

    public double getHourlyRate() { return hourlyRate; }
    public void setHourlyRate(double hourlyRate) { this.hourlyRate = hourlyRate; }

    @Override
    public double calculateSalary() {

        return getBaseSalary() + (hoursWorked * hourlyRate);
    }
}

interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

class SimpleDepartment implements Department {
    private String departmentName;

    public void assignDepartment(String dept) {
        this.departmentName = dept;
    }

    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }
}

public class q1_EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("FT100", "humanAlice", 50000, 10000);
        Employee e2 = new PartTimeEmployee("PT200", "humanBob", 0, 80, 200); 

        Department d = new SimpleDepartment();
        d.assignDepartment("Engineering");


        Employee[] employees = { e1, e2 };
        for (Employee e : employees) {
            e.displayDetails();
            System.out.println(d.getDepartmentDetails());
            System.out.println("-----");
        }
    }
}
