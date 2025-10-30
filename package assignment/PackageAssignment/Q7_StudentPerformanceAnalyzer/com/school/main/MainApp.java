package com.school.main;
import com.school.data.*;
import com.school.util.*;
public class MainApp {
    public static void main(String[] args){
        Student s = new Student("Riya",92,85,78);
        Analyzer a = new Analyzer();
        double avg = a.calculateAverage(s);
        System.out.println(s.toString());
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + a.findGrade(avg));
    }
}
