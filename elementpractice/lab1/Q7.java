package lab1;

public class Q7 {
    public static void main(String args[]){
        double rKm = 6378;
        double volumeKm = (4.0/3.0) * Math.PI * Math.pow(rKm, 3);
        double rMiles = rKm / 1.6;
        double volumeMiles = (4.0/3.0) * Math.PI * Math.pow(rMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}