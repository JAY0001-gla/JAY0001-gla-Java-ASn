package com.company.main;
import com.company.hr.Employee;
import com.company.payroll.Payroll;
public class MainApp {
    public static void main(String[] args){
        Employee e = new Employee(1,"Ankush","Engineering",50000);
        e.display();
        Payroll p = new Payroll();
        double newSalary = p.calculateBonus(e);
        System.out.println();
        System.out.println("Salary after 10% bonus: " + newSalary);
    }
}
