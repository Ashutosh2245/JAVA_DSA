package TwoDimensionalArray;
import java.util.*;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter c1: ");
        int c1 = sc.nextInt();
        System.out.print("Enter c1: ");
        int r2 = sc.nextInt();
        System.out.print("Enter c2: ");
        int c2 = sc.nextInt();

        if (c1!=r2) System.out.println("Matrix multiplication not possible.");

        int [][] arr = new int[r1][c1];
        int [][] brr = new int[r2][c2];
        System.out.print("Enter elements of first matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("First matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter elements of second matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Second matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }

        int [][] mul = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += arr[i][k]*brr[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
