import java.util.*;
abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}
class Resume<T extends JobRole> { private T role; Resume(T r){role=r;} }
class ResumeScreening {
    public static void processResumes(List<? extends JobRole> r){ r.forEach(x->System.out.println("Processing: "+x.getClass().getSimpleName())); }
    public static void main(String[] args){ processResumes(Arrays.asList(new SoftwareEngineer(),new DataScientist())); }
}