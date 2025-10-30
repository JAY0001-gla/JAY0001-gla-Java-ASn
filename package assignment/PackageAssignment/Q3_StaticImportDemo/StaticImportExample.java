import static java.lang.Math.*;
public class StaticImportExample {
    public static void main(String[] args){
        double a = 16;
        double b = 2;
        System.out.println("sqrt(a) = " + sqrt(a));
        System.out.println("pow(a,b) = " + pow(a,b));
        System.out.println("max(a,b) = " + max(a,b));
        System.out.println("min(a,b) = " + min(a,b));
        System.out.println("abs(-a) = " + abs(-a));
    }
}
