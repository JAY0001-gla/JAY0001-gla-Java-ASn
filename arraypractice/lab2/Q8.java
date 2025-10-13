package lab2;

import java.util.Scanner;

public class Q8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] phy=new int[n];
        int[] che=new int[n];
        int[] mat=new int[n];
        double[] per=new double[n];
        String[] gr=new String[n];
        for(int i=0;i<n;i++){
            phy[i]=sc.nextInt();
            che[i]=sc.nextInt();
            mat[i]=sc.nextInt();
            if(phy[i]<0||che[i]<0||mat[i]<0){ i--; continue; }
            per[i]=(phy[i]+che[i]+mat[i])/3.0;
            if(per[i]>=90) gr[i]="A";
            else if(per[i]>=75) gr[i]="B";
            else if(per[i]>=50) gr[i]="C";
            else gr[i]="F";
        }
        for(int i=0;i<n;i++){
            System.out.println(phy[i]+" "+che[i]+" "+mat[i]+" "+per[i]+" "+gr[i]);
        }
    }
}