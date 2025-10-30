package college.faculty;
public class Faculty {
    private String name;
    private String dept;
    public Faculty(String name,String dept){ this.name = name; this.dept = dept; }
    public void display(){ System.out.println("Faculty: " + name + " (" + dept + ")"); }
}
