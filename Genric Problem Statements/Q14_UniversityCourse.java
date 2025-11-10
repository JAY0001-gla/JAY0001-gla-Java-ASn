import java.util.*;
abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}
class Course<T extends CourseType> { private T type; Course(T t){type=t;} }
class University {
    public static void showCourses(List<? extends CourseType> c){ c.forEach(x->System.out.println(x.getClass().getSimpleName())); }
    public static void main(String[] args){ showCourses(Arrays.asList(new ExamCourse(),new AssignmentCourse())); }
}