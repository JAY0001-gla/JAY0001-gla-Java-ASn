import java.util.*;
public class sumofdigits2d{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0 ; i < row ; i++ ){
            for (int j = 0 ; j < column ; j++){
                System.out.print("Enter the number"+i+j+": ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("The elements are: ");
        int sum = 0;
        for (int i = 0 ; i < row ; i++ ){
            for (int j = 0 ; j < column ; j++){
                sum += arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.print("The element sum is: "+sum);
    }
}

