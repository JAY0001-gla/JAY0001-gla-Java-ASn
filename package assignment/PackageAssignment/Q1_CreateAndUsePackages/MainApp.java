import college.student.Student;
import college.faculty.Faculty;
public class MainApp {
    public static void main(String[] args){
        Student s = new Student("Ankush", 101);
        Faculty f = new Faculty("Dr. Sharma", "Data Structures");
        s.display();
        System.out.println();
        f.display();
    }
}
