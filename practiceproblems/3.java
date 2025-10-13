import java.util.Scanner;

class ctof{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celcius: ");
        int c = sc.nextInt();
        double f = (c*(9.0/5))+32;
        System.out.print("The fahrenheit temperatur is: ");
        System.out.println(f);

    }
}