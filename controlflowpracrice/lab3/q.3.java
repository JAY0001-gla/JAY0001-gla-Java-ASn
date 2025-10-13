import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics, Chemistry, Maths: ");
        double p = sc.nextDouble();
        double c = sc.nextDouble();
        double m = sc.nextDouble();
        double avg = (p+c+m)/3;
        String grade="", remark="";
        if(avg>=90){ grade="A"; remark="Excellent"; }
        else if(avg>=75){ grade="B"; remark="Very Good"; }
        else if(avg>=60){ grade="C"; remark="Good"; }
        else if(avg>=50){ grade="D"; remark="Average"; }
        else{ grade="F"; remark="Fail"; }
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);
    }
}