package college.student;
public class Student {
    private String name;
    private int id;
    public Student(int id,String name){ this.id = id; this.name = name; }
    public int getId(){ return id; }
    public String getName(){ return name; }
    public void display(){ System.out.println("Student: " + id + " - " + name); }
}
