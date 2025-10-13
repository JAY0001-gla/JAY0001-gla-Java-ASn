import java.util.*;
public class q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = sc.nextInt();
        System.out.print("Enter the column: ");
        int col = sc.nextInt();
        int[][] two_d_array = new int[row][col];
        int[] one_d_array = new int[row*col];
        int count = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                two_d_array[i][j]= sc.nextInt();
                one_d_array[count++] = two_d_array[i][j];
            }
        }
        System.out.println("The 2D array is: ");
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print(two_d_array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("The 1D array is: ");
        for(int i = 0 ; i < one_d_array.length ; i++){
            System.out.print(one_d_array[i]+" ");
        }

        
    }
}