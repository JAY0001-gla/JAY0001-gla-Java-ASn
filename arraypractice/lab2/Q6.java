package lab2;

import java.util.Scanner;

public class Q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double[] w=new double[n];
        double[] h=new double[n];
        double[] bmi=new double[n];
        String[] st=new String[n];
        for(int i=0;i<n;i++){
            w[i]=sc.nextDouble();
            h[i]=sc.nextDouble();
            bmi[i]=w[i]/(h[i]*h[i]);
            if(bmi[i]<18.5) st[i]="Underweight";
            else if(bmi[i]<25) st[i]="Normal";
            else if(bmi[i]<30) st[i]="Overweight";
            else st[i]="Obese";
        }
        for(int i=0;i<n;i++){
            System.out.println(h[i]+" "+w[i]+" "+bmi[i]+" "+st[i]);
        }
    }
}