import java.util.*;
public class q6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double[] team = new double[11];
        for(int i = 0 ; i < team.length ; i++){
            team[i] = sc.nextDouble();
        }
        System.out.println("the team player height is: ");
        double sum = 0;
        for(int i = 0 ; i < team.length ; i++){
            System.out.print(team[i]+" ");
            sum += team[i];
        }
        System.out.println();
        System.out.println("The mean height is: "+(sum/team.length));


    }
}
