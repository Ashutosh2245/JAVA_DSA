package TwoDimensionalArray;
import java.util.Scanner;
public class sumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.print("Enter the no. of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        int[][] brr = new int[r][c];
        int[][] crr = new int[r][c];


        System.out.print("Enter elements of first array: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter elements of second array: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Addition Matrix: ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                crr[i][j] = arr[i][j]+brr[i][j];
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
