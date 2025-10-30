package com.company.hr;
public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    public Employee(int id, String name, String department, double salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public int getId(){ return id; }
    public String getName(){ return name; }
    public String getDepartment(){ return department; }
    public double getSalary(){ return salary; }
    public void setSalary(double s){ this.salary = s; }
    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
