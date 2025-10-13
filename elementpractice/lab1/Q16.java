package lab1;

import java.util.Scanner;

public class Q16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);
    }
}