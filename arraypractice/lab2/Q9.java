package lab2;

import java.util.Scanner;

public class Q9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] m=new int[n][3];
        double[] per=new double[n];
        String[] gr=new String[n];
        for(int i=0;i<n;i++){
            m[i][0]=sc.nextInt();
            m[i][1]=sc.nextInt();
            m[i][2]=sc.nextInt();
            if(m[i][0]<0||m[i][1]<0||m[i][2]<0){ i--; continue; }
            per[i]=(m[i][0]+m[i][1]+m[i][2])/3.0;
            if(per[i]>=90) gr[i]="A";
            else if(per[i]>=75) gr[i]="B";
            else if(per[i]>=50) gr[i]="C";
            else gr[i]="F";
        }
        for(int i=0;i<n;i++){
            System.out.println(m[i][0]+" "+m[i][1]+" "+m[i][2]+" "+per[i]+" "+gr[i]);
        }
    }
}