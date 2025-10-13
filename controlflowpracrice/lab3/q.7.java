import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble()/100; 
        double bmi = weight/(height*height);
        String status="";
        if(bmi<18.5) status="Underweight";
        else if(bmi<24.9) status="Normal weight";
        else if(bmi<29.9) status="Overweight";
        else status="Obesity";
        System.out.println("BMI: " + bmi);
        System.out.println("Weight status: " + status);
    }
}