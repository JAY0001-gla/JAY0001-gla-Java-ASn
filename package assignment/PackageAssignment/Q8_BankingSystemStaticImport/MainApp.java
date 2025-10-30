import static java.lang.Math.*;
import com.bank.util.InterestCalculator;
public class MainApp {
    public static void main(String[] args){
        double p=10000;
        double r=5;
        double t=2;
        double si = InterestCalculator.calculateSimpleInterest(p,r,t);
        double ci = p * (pow(1 + r/100.0, t)) - p;
        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
    }
}
