package college.main;
import college.student.Student;
import college.faculty.Faculty;
import college.department.Department;
public class MainApp {
    public static void main(String[] args){
        Student s = new Student(101,"Ankush");
        Faculty f = new Faculty("Dr. Verma","CSE");
        Department d = new Department("Computer Science");
        s.display();
        f.display();
        d.display();
    }
}
