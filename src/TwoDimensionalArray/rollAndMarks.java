package TwoDimensionalArray;
import java.util.Scanner;
public class rollAndMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.print("Enter elements: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
