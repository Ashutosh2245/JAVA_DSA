package TwoDimensionalArray;
import java.util.Scanner;
public class outputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grid = new int[3][3];
        //Taking input
        System.out.print("Enter elements of matrix: ");
        for(int i = 0; i<3; i++){ //rows
            for(int j = 0; j<3; j++){ //columns
                grid[i][j] = sc.nextInt();
            }
        }
        // Printing output
        System.out.println("Matrix: ");
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                System.out.print(grid[i][j]+" ");
            } 
            System.out.println();
        }
    }
}
// int m = arr.length; -->> Number of rows
// int n = arr[0].length; -->> Number of columns