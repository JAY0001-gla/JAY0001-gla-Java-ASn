package com.school.data;
public class Student {
    private String name;
    private int m1,m2,m3;
    public Student(String name,int m1,int m2,int m3){
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public String getName(){ return name; }
    public int getM1(){ return m1; }
    public int getM2(){ return m2; }
    public int getM3(){ return m3; }
    public String toString(){
        return "Name: " + name + ", Marks: [" + m1 + "," + m2 + "," + m3 + "]";
    }
}
